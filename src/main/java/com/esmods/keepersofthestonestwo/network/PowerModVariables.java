package com.esmods.keepersofthestonestwo.network;

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
import java.util.ArrayList;

import com.esmods.keepersofthestonestwo.PowerMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModVariables {
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
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.selected = original.selected;
			clone.attack = original.attack;
			clone.battery = original.battery;
			clone.element_name_first = original.element_name_first;
			clone.element_name_second = original.element_name_second;
			clone.element_name_third = original.element_name_third;
			clone.unlock_keepers_box = original.unlock_keepers_box;
			clone.max_power = original.max_power;
			clone.fake_element_name_first = original.fake_element_name_first;
			clone.fake_element_name_second = original.fake_element_name_second;
			clone.fake_element_name_third = original.fake_element_name_third;
			clone.debug = original.debug;
			clone.first_booster_slot = original.first_booster_slot;
			clone.second_booster_slot = original.second_booster_slot;
			clone.third_booster_slot = original.third_booster_slot;
			clone.evolution = original.evolution;
			if (!event.isWasDeath()) {
				clone.active = original.active;
				clone.power = original.power;
				clone.powerTimer = original.powerTimer;
				clone.mergers = original.mergers;
				clone.ability_block = original.ability_block;
				clone.use_ability_key_var = original.use_ability_key_var;
				clone.detransf_key_var = original.detransf_key_var;
				clone.wheel_open_key_var = original.wheel_open_key_var;
				clone.power_recovery_multiplier = original.power_recovery_multiplier;
				clone.teleporting_effect = original.teleporting_effect;
				clone.second_wheel_open_var = original.second_wheel_open_var;
				clone.third_wheel_open_var = original.third_wheel_open_var;
				clone.first_fake_wheel_open_var = original.first_fake_wheel_open_var;
				clone.second_fake_wheel_open_var = original.second_fake_wheel_open_var;
				clone.third_fake_wheel_open_var = original.third_fake_wheel_open_var;
				clone.helmet = original.helmet;
				clone.chestplate = original.chestplate;
				clone.leggings = original.leggings;
				clone.boots = original.boots;
				clone.abilities_timer = original.abilities_timer;
				clone.ability_using = original.ability_using;
				clone.power_recorded = original.power_recorded;
				clone.fake_element_name_first_timer = original.fake_element_name_first_timer;
				clone.fake_element_name_second_timer = original.fake_element_name_second_timer;
				clone.fake_element_name_third_timer = original.fake_element_name_third_timer;
				clone.check_activating_stone = original.check_activating_stone;
			}
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
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
		public boolean blue_portal_placed = false;
		public boolean orange_portal_placed = false;
		public double opX = 0;
		public double opY = 0;
		public double opZ = 0;
		public double bpX = 0;
		public double bpY = 0;
		public double bpZ = 0;
		public boolean get_limit_of_stones = true;

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
			blue_portal_placed = nbt.getBoolean("blue_portal_placed");
			orange_portal_placed = nbt.getBoolean("orange_portal_placed");
			opX = nbt.getDouble("opX");
			opY = nbt.getDouble("opY");
			opZ = nbt.getDouble("opZ");
			bpX = nbt.getDouble("bpX");
			bpY = nbt.getDouble("bpY");
			bpZ = nbt.getDouble("bpZ");
			get_limit_of_stones = nbt.getBoolean("get_limit_of_stones");
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
			nbt.putBoolean("blue_portal_placed", blue_portal_placed);
			nbt.putBoolean("orange_portal_placed", orange_portal_placed);
			nbt.putDouble("opX", opX);
			nbt.putDouble("opY", opY);
			nbt.putDouble("opZ", opZ);
			nbt.putDouble("bpX", bpX);
			nbt.putDouble("bpY", bpY);
			nbt.putDouble("bpZ", bpZ);
			nbt.putBoolean("get_limit_of_stones", get_limit_of_stones);
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
		public boolean battery = false;
		public boolean ability_block = false;
		public String element_name_first = "0";
		public String element_name_second = "0";
		public String element_name_third = "0";
		public boolean unlock_keepers_box = true;
		public boolean use_ability_key_var = false;
		public boolean detransf_key_var = false;
		public boolean wheel_open_key_var = false;
		public double max_power = 100.0;
		public double power_recovery_multiplier = 1.0;
		public double teleporting_effect = 0;
		public boolean second_wheel_open_var = false;
		public boolean third_wheel_open_var = false;
		public String fake_element_name_first = "0";
		public String fake_element_name_second = "0";
		public String fake_element_name_third = "0";
		public boolean first_fake_wheel_open_var = false;
		public boolean second_fake_wheel_open_var = false;
		public boolean third_fake_wheel_open_var = false;
		public String helmet = "\"\"";
		public String chestplate = "\"\"";
		public String leggings = "\"\"";
		public String boots = "\"\"";
		public double abilities_timer = 0;
		public boolean ability_using = false;
		public boolean power_recorded = false;
		public double fake_element_name_first_timer = 0;
		public double fake_element_name_second_timer = 0;
		public double fake_element_name_third_timer = 0;
		public boolean debug = false;
		public boolean check_activating_stone = false;
		public String first_booster_slot = "0";
		public String second_booster_slot = "0";
		public String third_booster_slot = "0";
		public String evolution = "basic";

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				PowerMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(entity.level()::dimension), new PlayerVariablesSyncMessage(this, entity.getId()));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("active", active);
			nbt.putBoolean("selected", selected);
			nbt.putDouble("power", power);
			nbt.putDouble("powerTimer", powerTimer);
			nbt.putString("attack", attack);
			nbt.putDouble("mergers", mergers);
			nbt.putBoolean("battery", battery);
			nbt.putBoolean("ability_block", ability_block);
			nbt.putString("element_name_first", element_name_first);
			nbt.putString("element_name_second", element_name_second);
			nbt.putString("element_name_third", element_name_third);
			nbt.putBoolean("unlock_keepers_box", unlock_keepers_box);
			nbt.putBoolean("use_ability_key_var", use_ability_key_var);
			nbt.putBoolean("detransf_key_var", detransf_key_var);
			nbt.putBoolean("wheel_open_key_var", wheel_open_key_var);
			nbt.putDouble("max_power", max_power);
			nbt.putDouble("power_recovery_multiplier", power_recovery_multiplier);
			nbt.putDouble("teleporting_effect", teleporting_effect);
			nbt.putBoolean("second_wheel_open_var", second_wheel_open_var);
			nbt.putBoolean("third_wheel_open_var", third_wheel_open_var);
			nbt.putString("fake_element_name_first", fake_element_name_first);
			nbt.putString("fake_element_name_second", fake_element_name_second);
			nbt.putString("fake_element_name_third", fake_element_name_third);
			nbt.putBoolean("first_fake_wheel_open_var", first_fake_wheel_open_var);
			nbt.putBoolean("second_fake_wheel_open_var", second_fake_wheel_open_var);
			nbt.putBoolean("third_fake_wheel_open_var", third_fake_wheel_open_var);
			nbt.putString("helmet", helmet);
			nbt.putString("chestplate", chestplate);
			nbt.putString("leggings", leggings);
			nbt.putString("boots", boots);
			nbt.putDouble("abilities_timer", abilities_timer);
			nbt.putBoolean("ability_using", ability_using);
			nbt.putBoolean("power_recorded", power_recorded);
			nbt.putDouble("fake_element_name_first_timer", fake_element_name_first_timer);
			nbt.putDouble("fake_element_name_second_timer", fake_element_name_second_timer);
			nbt.putDouble("fake_element_name_third_timer", fake_element_name_third_timer);
			nbt.putBoolean("debug", debug);
			nbt.putBoolean("check_activating_stone", check_activating_stone);
			nbt.putString("first_booster_slot", first_booster_slot);
			nbt.putString("second_booster_slot", second_booster_slot);
			nbt.putString("third_booster_slot", third_booster_slot);
			nbt.putString("evolution", evolution);
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
			battery = nbt.getBoolean("battery");
			ability_block = nbt.getBoolean("ability_block");
			element_name_first = nbt.getString("element_name_first");
			element_name_second = nbt.getString("element_name_second");
			element_name_third = nbt.getString("element_name_third");
			unlock_keepers_box = nbt.getBoolean("unlock_keepers_box");
			use_ability_key_var = nbt.getBoolean("use_ability_key_var");
			detransf_key_var = nbt.getBoolean("detransf_key_var");
			wheel_open_key_var = nbt.getBoolean("wheel_open_key_var");
			max_power = nbt.getDouble("max_power");
			power_recovery_multiplier = nbt.getDouble("power_recovery_multiplier");
			teleporting_effect = nbt.getDouble("teleporting_effect");
			second_wheel_open_var = nbt.getBoolean("second_wheel_open_var");
			third_wheel_open_var = nbt.getBoolean("third_wheel_open_var");
			fake_element_name_first = nbt.getString("fake_element_name_first");
			fake_element_name_second = nbt.getString("fake_element_name_second");
			fake_element_name_third = nbt.getString("fake_element_name_third");
			first_fake_wheel_open_var = nbt.getBoolean("first_fake_wheel_open_var");
			second_fake_wheel_open_var = nbt.getBoolean("second_fake_wheel_open_var");
			third_fake_wheel_open_var = nbt.getBoolean("third_fake_wheel_open_var");
			helmet = nbt.getString("helmet");
			chestplate = nbt.getString("chestplate");
			leggings = nbt.getString("leggings");
			boots = nbt.getString("boots");
			abilities_timer = nbt.getDouble("abilities_timer");
			ability_using = nbt.getBoolean("ability_using");
			power_recorded = nbt.getBoolean("power_recorded");
			fake_element_name_first_timer = nbt.getDouble("fake_element_name_first_timer");
			fake_element_name_second_timer = nbt.getDouble("fake_element_name_second_timer");
			fake_element_name_third_timer = nbt.getDouble("fake_element_name_third_timer");
			debug = nbt.getBoolean("debug");
			check_activating_stone = nbt.getBoolean("check_activating_stone");
			first_booster_slot = nbt.getString("first_booster_slot");
			second_booster_slot = nbt.getString("second_booster_slot");
			third_booster_slot = nbt.getString("third_booster_slot");
			evolution = nbt.getString("evolution");
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	public static class PlayerVariablesSyncMessage {
		private final int target;
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
			this.target = buffer.readInt();
		}

		public PlayerVariablesSyncMessage(PlayerVariables data, int entityid) {
			this.data = data;
			this.target = entityid;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
			buffer.writeInt(message.target);
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.level().getEntity(message.target).getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.active = message.data.active;
					variables.selected = message.data.selected;
					variables.power = message.data.power;
					variables.powerTimer = message.data.powerTimer;
					variables.attack = message.data.attack;
					variables.mergers = message.data.mergers;
					variables.battery = message.data.battery;
					variables.ability_block = message.data.ability_block;
					variables.element_name_first = message.data.element_name_first;
					variables.element_name_second = message.data.element_name_second;
					variables.element_name_third = message.data.element_name_third;
					variables.unlock_keepers_box = message.data.unlock_keepers_box;
					variables.use_ability_key_var = message.data.use_ability_key_var;
					variables.detransf_key_var = message.data.detransf_key_var;
					variables.wheel_open_key_var = message.data.wheel_open_key_var;
					variables.max_power = message.data.max_power;
					variables.power_recovery_multiplier = message.data.power_recovery_multiplier;
					variables.teleporting_effect = message.data.teleporting_effect;
					variables.second_wheel_open_var = message.data.second_wheel_open_var;
					variables.third_wheel_open_var = message.data.third_wheel_open_var;
					variables.fake_element_name_first = message.data.fake_element_name_first;
					variables.fake_element_name_second = message.data.fake_element_name_second;
					variables.fake_element_name_third = message.data.fake_element_name_third;
					variables.first_fake_wheel_open_var = message.data.first_fake_wheel_open_var;
					variables.second_fake_wheel_open_var = message.data.second_fake_wheel_open_var;
					variables.third_fake_wheel_open_var = message.data.third_fake_wheel_open_var;
					variables.helmet = message.data.helmet;
					variables.chestplate = message.data.chestplate;
					variables.leggings = message.data.leggings;
					variables.boots = message.data.boots;
					variables.abilities_timer = message.data.abilities_timer;
					variables.ability_using = message.data.ability_using;
					variables.power_recorded = message.data.power_recorded;
					variables.fake_element_name_first_timer = message.data.fake_element_name_first_timer;
					variables.fake_element_name_second_timer = message.data.fake_element_name_second_timer;
					variables.fake_element_name_third_timer = message.data.fake_element_name_third_timer;
					variables.debug = message.data.debug;
					variables.check_activating_stone = message.data.check_activating_stone;
					variables.first_booster_slot = message.data.first_booster_slot;
					variables.second_booster_slot = message.data.second_booster_slot;
					variables.third_booster_slot = message.data.third_booster_slot;
					variables.evolution = message.data.evolution;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
