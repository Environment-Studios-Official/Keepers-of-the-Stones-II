package ru.power_umc.keepersofthestonestwo.network;

import ru.power_umc.keepersofthestonestwo.PowerMod;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModVariables {
	public static double dev_channel = 0.0;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		PowerMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.selected = original.selected;
			clone.attack = original.attack;
			clone.element_id_fist = original.element_id_fist;
			clone.element_id_second = original.element_id_second;
			clone.element_id_third = original.element_id_third;
			clone.battery = original.battery;
			clone.zeroing = original.zeroing;
			if (!event.isWasDeath()) {
				clone.active = original.active;
				clone.power = original.power;
				clone.powerTimer = original.powerTimer;
				clone.mergers = original.mergers;
				clone.armor_helmet = original.armor_helmet;
				clone.armor_chestplate = original.armor_chestplate;
				clone.armor_leggings = original.armor_leggings;
				clone.armor_boots = original.armor_boots;
				clone.ability_block = original.ability_block;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "power_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				PowerMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "power_mapvars";
		public boolean fire_stone = false;
		public boolean air_stone = false;
		public boolean earth_stone = false;
		public boolean water_stone = false;
		public boolean ether_stone = false;
		public boolean ice_stone = false;
		public boolean lightning_stone = false;
		public boolean sound_stone = false;
		public boolean crystal_stone = false;
		public boolean lava_stone = false;
		public boolean rain_stone = false;
		public boolean tornado_stone = false;
		public boolean ocean_stone = false;
		public boolean plants_stone = false;
		public boolean animals_stone = false;
		public boolean metal_stone = false;
		public boolean light_stone = false;
		public boolean shadow_stone = false;
		public boolean vacuum_stone = false;
		public boolean energy_stone = false;
		public boolean sun_stone = false;
		public boolean moon_stone = false;
		public boolean space_stone = false;
		public boolean time_stone = false;
		public boolean blood_stone = false;
		public boolean technology_stone = false;
		public boolean teleportation_stone = false;
		public boolean explosion_stone = false;
		public boolean amber_stone = false;
		public boolean creation_stone = false;
		public boolean destruction_stone = false;
		public boolean mist_stone = false;
		public boolean sand_stone = false;
		public boolean speed_stone = false;
		public boolean poison_stone = false;
		public boolean magnet_stone = false;
		public boolean mushrooms_stone = false;
		public boolean mercury_stone = false;
		public boolean music_stone = false;
		public boolean plague_stone = false;
		public boolean blue_fire_stone = false;
		public boolean gravity_stone = false;
		public boolean smoke_stone = false;
		public boolean spirit_stone = false;
		public boolean form_stone = false;
		public boolean mind_stone = false;
		public boolean golden_dust_stone = false;
		public boolean darkness_stone = false;
		public double cpapi_version = 2.0;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			fire_stone = nbt.getBoolean("fire_stone");
			air_stone = nbt.getBoolean("air_stone");
			earth_stone = nbt.getBoolean("earth_stone");
			water_stone = nbt.getBoolean("water_stone");
			ether_stone = nbt.getBoolean("ether_stone");
			ice_stone = nbt.getBoolean("ice_stone");
			lightning_stone = nbt.getBoolean("lightning_stone");
			sound_stone = nbt.getBoolean("sound_stone");
			crystal_stone = nbt.getBoolean("crystal_stone");
			lava_stone = nbt.getBoolean("lava_stone");
			rain_stone = nbt.getBoolean("rain_stone");
			tornado_stone = nbt.getBoolean("tornado_stone");
			ocean_stone = nbt.getBoolean("ocean_stone");
			plants_stone = nbt.getBoolean("plants_stone");
			animals_stone = nbt.getBoolean("animals_stone");
			metal_stone = nbt.getBoolean("metal_stone");
			light_stone = nbt.getBoolean("light_stone");
			shadow_stone = nbt.getBoolean("shadow_stone");
			vacuum_stone = nbt.getBoolean("vacuum_stone");
			energy_stone = nbt.getBoolean("energy_stone");
			sun_stone = nbt.getBoolean("sun_stone");
			moon_stone = nbt.getBoolean("moon_stone");
			space_stone = nbt.getBoolean("space_stone");
			time_stone = nbt.getBoolean("time_stone");
			blood_stone = nbt.getBoolean("blood_stone");
			technology_stone = nbt.getBoolean("technology_stone");
			teleportation_stone = nbt.getBoolean("teleportation_stone");
			explosion_stone = nbt.getBoolean("explosion_stone");
			amber_stone = nbt.getBoolean("amber_stone");
			creation_stone = nbt.getBoolean("creation_stone");
			destruction_stone = nbt.getBoolean("destruction_stone");
			mist_stone = nbt.getBoolean("mist_stone");
			sand_stone = nbt.getBoolean("sand_stone");
			speed_stone = nbt.getBoolean("speed_stone");
			poison_stone = nbt.getBoolean("poison_stone");
			magnet_stone = nbt.getBoolean("magnet_stone");
			mushrooms_stone = nbt.getBoolean("mushrooms_stone");
			mercury_stone = nbt.getBoolean("mercury_stone");
			music_stone = nbt.getBoolean("music_stone");
			plague_stone = nbt.getBoolean("plague_stone");
			blue_fire_stone = nbt.getBoolean("blue_fire_stone");
			gravity_stone = nbt.getBoolean("gravity_stone");
			smoke_stone = nbt.getBoolean("smoke_stone");
			spirit_stone = nbt.getBoolean("spirit_stone");
			form_stone = nbt.getBoolean("form_stone");
			mind_stone = nbt.getBoolean("mind_stone");
			golden_dust_stone = nbt.getBoolean("golden_dust_stone");
			darkness_stone = nbt.getBoolean("darkness_stone");
			cpapi_version = nbt.getDouble("cpapi_version");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("fire_stone", fire_stone);
			nbt.putBoolean("air_stone", air_stone);
			nbt.putBoolean("earth_stone", earth_stone);
			nbt.putBoolean("water_stone", water_stone);
			nbt.putBoolean("ether_stone", ether_stone);
			nbt.putBoolean("ice_stone", ice_stone);
			nbt.putBoolean("lightning_stone", lightning_stone);
			nbt.putBoolean("sound_stone", sound_stone);
			nbt.putBoolean("crystal_stone", crystal_stone);
			nbt.putBoolean("lava_stone", lava_stone);
			nbt.putBoolean("rain_stone", rain_stone);
			nbt.putBoolean("tornado_stone", tornado_stone);
			nbt.putBoolean("ocean_stone", ocean_stone);
			nbt.putBoolean("plants_stone", plants_stone);
			nbt.putBoolean("animals_stone", animals_stone);
			nbt.putBoolean("metal_stone", metal_stone);
			nbt.putBoolean("light_stone", light_stone);
			nbt.putBoolean("shadow_stone", shadow_stone);
			nbt.putBoolean("vacuum_stone", vacuum_stone);
			nbt.putBoolean("energy_stone", energy_stone);
			nbt.putBoolean("sun_stone", sun_stone);
			nbt.putBoolean("moon_stone", moon_stone);
			nbt.putBoolean("space_stone", space_stone);
			nbt.putBoolean("time_stone", time_stone);
			nbt.putBoolean("blood_stone", blood_stone);
			nbt.putBoolean("technology_stone", technology_stone);
			nbt.putBoolean("teleportation_stone", teleportation_stone);
			nbt.putBoolean("explosion_stone", explosion_stone);
			nbt.putBoolean("amber_stone", amber_stone);
			nbt.putBoolean("creation_stone", creation_stone);
			nbt.putBoolean("destruction_stone", destruction_stone);
			nbt.putBoolean("mist_stone", mist_stone);
			nbt.putBoolean("sand_stone", sand_stone);
			nbt.putBoolean("speed_stone", speed_stone);
			nbt.putBoolean("poison_stone", poison_stone);
			nbt.putBoolean("magnet_stone", magnet_stone);
			nbt.putBoolean("mushrooms_stone", mushrooms_stone);
			nbt.putBoolean("mercury_stone", mercury_stone);
			nbt.putBoolean("music_stone", music_stone);
			nbt.putBoolean("plague_stone", plague_stone);
			nbt.putBoolean("blue_fire_stone", blue_fire_stone);
			nbt.putBoolean("gravity_stone", gravity_stone);
			nbt.putBoolean("smoke_stone", smoke_stone);
			nbt.putBoolean("spirit_stone", spirit_stone);
			nbt.putBoolean("form_stone", form_stone);
			nbt.putBoolean("mind_stone", mind_stone);
			nbt.putBoolean("golden_dust_stone", golden_dust_stone);
			nbt.putBoolean("darkness_stone", darkness_stone);
			nbt.putDouble("cpapi_version", cpapi_version);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				PowerMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("power", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean active = false;
		public boolean selected = false;
		public double power = 0.0;
		public double powerTimer = 0.0;
		public String attack = "0";
		public double mergers = 0.0;
		public double element_id_fist = 0;
		public double element_id_second = 0;
		public double element_id_third = 0;
		public boolean battery = false;
		public ItemStack armor_helmet = ItemStack.EMPTY;
		public ItemStack armor_chestplate = ItemStack.EMPTY;
		public ItemStack armor_leggings = ItemStack.EMPTY;
		public ItemStack armor_boots = ItemStack.EMPTY;
		public boolean ability_block = false;
		public boolean zeroing = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("active", active);
			nbt.putBoolean("selected", selected);
			nbt.putDouble("power", power);
			nbt.putDouble("powerTimer", powerTimer);
			nbt.putString("attack", attack);
			nbt.putDouble("mergers", mergers);
			nbt.putDouble("element_id_fist", element_id_fist);
			nbt.putDouble("element_id_second", element_id_second);
			nbt.putDouble("element_id_third", element_id_third);
			nbt.putBoolean("battery", battery);
			nbt.put("armor_helmet", armor_helmet.save(new CompoundTag()));
			nbt.put("armor_chestplate", armor_chestplate.save(new CompoundTag()));
			nbt.put("armor_leggings", armor_leggings.save(new CompoundTag()));
			nbt.put("armor_boots", armor_boots.save(new CompoundTag()));
			nbt.putBoolean("ability_block", ability_block);
			nbt.putBoolean("zeroing", zeroing);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			active = nbt.getBoolean("active");
			selected = nbt.getBoolean("selected");
			power = nbt.getDouble("power");
			powerTimer = nbt.getDouble("powerTimer");
			attack = nbt.getString("attack");
			mergers = nbt.getDouble("mergers");
			element_id_fist = nbt.getDouble("element_id_fist");
			element_id_second = nbt.getDouble("element_id_second");
			element_id_third = nbt.getDouble("element_id_third");
			battery = nbt.getBoolean("battery");
			armor_helmet = ItemStack.of(nbt.getCompound("armor_helmet"));
			armor_chestplate = ItemStack.of(nbt.getCompound("armor_chestplate"));
			armor_leggings = ItemStack.of(nbt.getCompound("armor_leggings"));
			armor_boots = ItemStack.of(nbt.getCompound("armor_boots"));
			ability_block = nbt.getBoolean("ability_block");
			zeroing = nbt.getBoolean("zeroing");
		}
	}

	public static class PlayerVariablesSyncMessage {
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.active = message.data.active;
					variables.selected = message.data.selected;
					variables.power = message.data.power;
					variables.powerTimer = message.data.powerTimer;
					variables.attack = message.data.attack;
					variables.mergers = message.data.mergers;
					variables.element_id_fist = message.data.element_id_fist;
					variables.element_id_second = message.data.element_id_second;
					variables.element_id_third = message.data.element_id_third;
					variables.battery = message.data.battery;
					variables.armor_helmet = message.data.armor_helmet;
					variables.armor_chestplate = message.data.armor_chestplate;
					variables.armor_leggings = message.data.armor_leggings;
					variables.armor_boots = message.data.armor_boots;
					variables.ability_block = message.data.ability_block;
					variables.zeroing = message.data.zeroing;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
