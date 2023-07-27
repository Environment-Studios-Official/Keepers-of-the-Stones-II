package ru.power_umc.keepersofthestones.two.network;

import ru.power_umc.keepersofthestones.two.PowerMod;

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
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.fire = original.fire;
			clone.air = original.air;
			clone.water = original.water;
			clone.earth = original.earth;
			clone.energy = original.energy;
			clone.ice = original.ice;
			clone.lightning = original.lightning;
			clone.sound = original.sound;
			clone.crystal = original.crystal;
			clone.lava = original.lava;
			clone.rain = original.rain;
			clone.tornado = original.tornado;
			clone.ocean = original.ocean;
			clone.greenery = original.greenery;
			clone.animals = original.animals;
			clone.metal = original.metal;
			clone.light = original.light;
			clone.shadow = original.shadow;
			clone.vacuum = original.vacuum;
			clone.moon = original.moon;
			clone.sun = original.sun;
			clone.creation = original.creation;
			clone.destruction = original.destruction;
			clone.space = original.space;
			clone.selected = original.selected;
			clone.blood = original.blood;
			clone.technology = original.technology;
			clone.time = original.time;
			clone.spawnx = original.spawnx;
			clone.spawny = original.spawny;
			clone.spawnz = original.spawnz;
			clone.battery = original.battery;
			clone.teleportation = original.teleportation;
			clone.explosion = original.explosion;
			clone.amber = original.amber;
			clone.magnet = original.magnet;
			clone.mist = original.mist;
			clone.power_level = original.power_level;
			clone.sand = original.sand;
			clone.speed = original.speed;
			clone.c1x = original.c1x;
			clone.c1y = original.c1y;
			clone.c1z = original.c1z;
			clone.c2x = original.c2x;
			clone.c2y = original.c2y;
			clone.c2z = original.c2z;
			clone.c3x = original.c3x;
			clone.c3y = original.c3y;
			clone.c3z = original.c3z;
			clone.poison = original.poison;
			clone.mushrooms = original.mushrooms;
			clone.mercury = original.mercury;
			clone.music = original.music;
			clone.keeper = original.keeper;
			clone.plague = original.plague;
			clone.gravity = original.gravity;
			clone.without_stone = original.without_stone;
			clone.blue_flame = original.blue_flame;
			clone.spirit = original.spirit;
			clone.aether = original.aether;
			clone.smoke = original.smoke;
			clone.form = original.form;
			clone.mind = original.mind;
			clone.golden_dust = original.golden_dust;
			clone.cursed_amethyst = original.cursed_amethyst;
			clone.reactive_flying = original.reactive_flying;
			clone.darkness = original.darkness;
			if (!event.isWasDeath()) {
				clone.active = original.active;
				clone.recharge_spell_sun = original.recharge_spell_sun;
				clone.recharge_spell_moon = original.recharge_spell_moon;
				clone.recharge_spell_blood = original.recharge_spell_blood;
				clone.recharge_spell_energy = original.recharge_spell_energy;
				clone.fog = original.fog;
				clone.recharge_spell_blue_flame = original.recharge_spell_blue_flame;
				clone.turbospeed = original.turbospeed;
				clone.recharge_spell_plague = original.recharge_spell_plague;
				clone.recharge_spell_gravity_boost = original.recharge_spell_gravity_boost;
				clone.recharge_spell_gravity_red = original.recharge_spell_gravity_red;
				clone.recharge_spell_time = original.recharge_spell_time;
				clone.ally = original.ally;
				clone.little = original.little;
				clone.big = original.big;
				clone.recharge_spell_ice = original.recharge_spell_ice;
				clone.rotate = original.rotate;
				clone.battle = original.battle;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level);
				SavedData worlddata = WorldVariables.get(event.getEntity().level);
				if (mapdata != null)
					PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level);
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
		public boolean water_stone = false;
		public boolean earth_stone = false;
		public boolean energy_stone = false;
		public boolean ice_stone = false;
		public boolean lightning_stone = false;
		public boolean sound_stone = false;
		public boolean crystal_stone = false;
		public boolean lava_stone = false;
		public boolean rain_stone = false;
		public boolean tornado_stone = false;
		public boolean ocean_stone = false;
		public boolean greenery_stone = false;
		public boolean animals_stone = false;
		public boolean metal_stone = false;
		public boolean light_stone = false;
		public boolean shadow_stone = false;
		public boolean vacuum_stone = false;
		public boolean sun_stone = false;
		public boolean moon_stone = false;
		public boolean creation_stone = false;
		public boolean destruction_stone = false;
		public boolean space_stone = false;
		public boolean blood_stone = false;
		public boolean technology_stone = false;
		public boolean time_stone = false;
		public boolean teleportation_stone = false;
		public boolean blue_portal = false;
		public boolean orange_portal = false;
		public double bposx = 0;
		public double bposy = 0;
		public double bposz = 0;
		public double oposx = 0;
		public double oposy = 0.0;
		public double oposz = 0;
		public boolean explosion_stone = false;
		public boolean amber_stone = false;
		public boolean cosmos_stone = false;
		public boolean magnet_stone = false;
		public boolean mist_stone = false;
		public boolean sand_stone = false;
		public boolean speed_stone = false;
		public boolean poison_stone = false;
		public boolean mushrooms_stone = false;
		public boolean mercury_stone = false;
		public boolean music_stone = false;
		public boolean plague_stone = false;
		public boolean gravity_stone = false;
		public boolean blue_flame_stone = false;
		public boolean spirit_stone = false;
		public boolean aether_stone = false;
		public boolean smoke_stone = false;
		public boolean form_stone = false;
		public boolean mind_stone = false;
		public boolean golden_dust_stone = false;
		public boolean darkness_stone = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			fire_stone = nbt.getBoolean("fire_stone");
			air_stone = nbt.getBoolean("air_stone");
			water_stone = nbt.getBoolean("water_stone");
			earth_stone = nbt.getBoolean("earth_stone");
			energy_stone = nbt.getBoolean("energy_stone");
			ice_stone = nbt.getBoolean("ice_stone");
			lightning_stone = nbt.getBoolean("lightning_stone");
			sound_stone = nbt.getBoolean("sound_stone");
			crystal_stone = nbt.getBoolean("crystal_stone");
			lava_stone = nbt.getBoolean("lava_stone");
			rain_stone = nbt.getBoolean("rain_stone");
			tornado_stone = nbt.getBoolean("tornado_stone");
			ocean_stone = nbt.getBoolean("ocean_stone");
			greenery_stone = nbt.getBoolean("greenery_stone");
			animals_stone = nbt.getBoolean("animals_stone");
			metal_stone = nbt.getBoolean("metal_stone");
			light_stone = nbt.getBoolean("light_stone");
			shadow_stone = nbt.getBoolean("shadow_stone");
			vacuum_stone = nbt.getBoolean("vacuum_stone");
			sun_stone = nbt.getBoolean("sun_stone");
			moon_stone = nbt.getBoolean("moon_stone");
			creation_stone = nbt.getBoolean("creation_stone");
			destruction_stone = nbt.getBoolean("destruction_stone");
			space_stone = nbt.getBoolean("space_stone");
			blood_stone = nbt.getBoolean("blood_stone");
			technology_stone = nbt.getBoolean("technology_stone");
			time_stone = nbt.getBoolean("time_stone");
			teleportation_stone = nbt.getBoolean("teleportation_stone");
			blue_portal = nbt.getBoolean("blue_portal");
			orange_portal = nbt.getBoolean("orange_portal");
			bposx = nbt.getDouble("bposx");
			bposy = nbt.getDouble("bposy");
			bposz = nbt.getDouble("bposz");
			oposx = nbt.getDouble("oposx");
			oposy = nbt.getDouble("oposy");
			oposz = nbt.getDouble("oposz");
			explosion_stone = nbt.getBoolean("explosion_stone");
			amber_stone = nbt.getBoolean("amber_stone");
			cosmos_stone = nbt.getBoolean("cosmos_stone");
			magnet_stone = nbt.getBoolean("magnet_stone");
			mist_stone = nbt.getBoolean("mist_stone");
			sand_stone = nbt.getBoolean("sand_stone");
			speed_stone = nbt.getBoolean("speed_stone");
			poison_stone = nbt.getBoolean("poison_stone");
			mushrooms_stone = nbt.getBoolean("mushrooms_stone");
			mercury_stone = nbt.getBoolean("mercury_stone");
			music_stone = nbt.getBoolean("music_stone");
			plague_stone = nbt.getBoolean("plague_stone");
			gravity_stone = nbt.getBoolean("gravity_stone");
			blue_flame_stone = nbt.getBoolean("blue_flame_stone");
			spirit_stone = nbt.getBoolean("spirit_stone");
			aether_stone = nbt.getBoolean("aether_stone");
			smoke_stone = nbt.getBoolean("smoke_stone");
			form_stone = nbt.getBoolean("form_stone");
			mind_stone = nbt.getBoolean("mind_stone");
			golden_dust_stone = nbt.getBoolean("golden_dust_stone");
			darkness_stone = nbt.getBoolean("darkness_stone");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("fire_stone", fire_stone);
			nbt.putBoolean("air_stone", air_stone);
			nbt.putBoolean("water_stone", water_stone);
			nbt.putBoolean("earth_stone", earth_stone);
			nbt.putBoolean("energy_stone", energy_stone);
			nbt.putBoolean("ice_stone", ice_stone);
			nbt.putBoolean("lightning_stone", lightning_stone);
			nbt.putBoolean("sound_stone", sound_stone);
			nbt.putBoolean("crystal_stone", crystal_stone);
			nbt.putBoolean("lava_stone", lava_stone);
			nbt.putBoolean("rain_stone", rain_stone);
			nbt.putBoolean("tornado_stone", tornado_stone);
			nbt.putBoolean("ocean_stone", ocean_stone);
			nbt.putBoolean("greenery_stone", greenery_stone);
			nbt.putBoolean("animals_stone", animals_stone);
			nbt.putBoolean("metal_stone", metal_stone);
			nbt.putBoolean("light_stone", light_stone);
			nbt.putBoolean("shadow_stone", shadow_stone);
			nbt.putBoolean("vacuum_stone", vacuum_stone);
			nbt.putBoolean("sun_stone", sun_stone);
			nbt.putBoolean("moon_stone", moon_stone);
			nbt.putBoolean("creation_stone", creation_stone);
			nbt.putBoolean("destruction_stone", destruction_stone);
			nbt.putBoolean("space_stone", space_stone);
			nbt.putBoolean("blood_stone", blood_stone);
			nbt.putBoolean("technology_stone", technology_stone);
			nbt.putBoolean("time_stone", time_stone);
			nbt.putBoolean("teleportation_stone", teleportation_stone);
			nbt.putBoolean("blue_portal", blue_portal);
			nbt.putBoolean("orange_portal", orange_portal);
			nbt.putDouble("bposx", bposx);
			nbt.putDouble("bposy", bposy);
			nbt.putDouble("bposz", bposz);
			nbt.putDouble("oposx", oposx);
			nbt.putDouble("oposy", oposy);
			nbt.putDouble("oposz", oposz);
			nbt.putBoolean("explosion_stone", explosion_stone);
			nbt.putBoolean("amber_stone", amber_stone);
			nbt.putBoolean("cosmos_stone", cosmos_stone);
			nbt.putBoolean("magnet_stone", magnet_stone);
			nbt.putBoolean("mist_stone", mist_stone);
			nbt.putBoolean("sand_stone", sand_stone);
			nbt.putBoolean("speed_stone", speed_stone);
			nbt.putBoolean("poison_stone", poison_stone);
			nbt.putBoolean("mushrooms_stone", mushrooms_stone);
			nbt.putBoolean("mercury_stone", mercury_stone);
			nbt.putBoolean("music_stone", music_stone);
			nbt.putBoolean("plague_stone", plague_stone);
			nbt.putBoolean("gravity_stone", gravity_stone);
			nbt.putBoolean("blue_flame_stone", blue_flame_stone);
			nbt.putBoolean("spirit_stone", spirit_stone);
			nbt.putBoolean("aether_stone", aether_stone);
			nbt.putBoolean("smoke_stone", smoke_stone);
			nbt.putBoolean("form_stone", form_stone);
			nbt.putBoolean("mind_stone", mind_stone);
			nbt.putBoolean("golden_dust_stone", golden_dust_stone);
			nbt.putBoolean("darkness_stone", darkness_stone);
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
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
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
		public boolean fire = false;
		public boolean air = false;
		public boolean water = false;
		public boolean earth = false;
		public boolean energy = false;
		public boolean ice = false;
		public boolean lightning = false;
		public boolean sound = false;
		public boolean crystal = false;
		public boolean lava = false;
		public boolean rain = false;
		public boolean tornado = false;
		public boolean ocean = false;
		public boolean active = false;
		public boolean greenery = false;
		public boolean animals = false;
		public boolean metal = false;
		public boolean light = false;
		public boolean shadow = false;
		public boolean vacuum = false;
		public boolean moon = false;
		public boolean sun = false;
		public boolean creation = false;
		public boolean destruction = false;
		public boolean space = false;
		public boolean selected = false;
		public boolean blood = false;
		public boolean technology = false;
		public boolean time = false;
		public double spawnx = 0.0;
		public double spawny = 80.0;
		public double spawnz = 0.0;
		public boolean battery = false;
		public boolean recharge_spell_sun = false;
		public boolean recharge_spell_moon = false;
		public boolean recharge_spell_blood = false;
		public boolean recharge_spell_energy = false;
		public boolean teleportation = false;
		public boolean explosion = false;
		public boolean amber = false;
		public boolean fog = false;
		public boolean magnet = false;
		public boolean mist = false;
		public double power_level = 1.0;
		public boolean recharge_spell_blue_flame = false;
		public boolean sand = false;
		public boolean speed = false;
		public boolean turbospeed = false;
		public double c1x = 0;
		public double c1y = 80.0;
		public double c1z = 0;
		public double c2x = 0;
		public double c2y = 80.0;
		public double c2z = 0.0;
		public double c3x = 0;
		public double c3y = 80.0;
		public double c3z = 0;
		public boolean poison = false;
		public boolean mushrooms = false;
		public boolean mercury = false;
		public boolean music = false;
		public boolean keeper = false;
		public boolean plague = false;
		public boolean recharge_spell_plague = false;
		public boolean gravity = false;
		public boolean without_stone = false;
		public boolean blue_flame = false;
		public boolean recharge_spell_gravity_boost = false;
		public boolean recharge_spell_gravity_red = false;
		public boolean spirit = false;
		public boolean aether = false;
		public boolean recharge_spell_time = false;
		public boolean smoke = false;
		public boolean form = false;
		public boolean mind = false;
		public boolean golden_dust = false;
		public boolean ally = false;
		public boolean little = false;
		public boolean big = false;
		public boolean cursed_amethyst = false;
		public boolean reactive_flying = false;
		public boolean recharge_spell_ice = false;
		public boolean darkness = false;
		public double rotate = 0;
		public double battle = 0.0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("fire", fire);
			nbt.putBoolean("air", air);
			nbt.putBoolean("water", water);
			nbt.putBoolean("earth", earth);
			nbt.putBoolean("energy", energy);
			nbt.putBoolean("ice", ice);
			nbt.putBoolean("lightning", lightning);
			nbt.putBoolean("sound", sound);
			nbt.putBoolean("crystal", crystal);
			nbt.putBoolean("lava", lava);
			nbt.putBoolean("rain", rain);
			nbt.putBoolean("tornado", tornado);
			nbt.putBoolean("ocean", ocean);
			nbt.putBoolean("active", active);
			nbt.putBoolean("greenery", greenery);
			nbt.putBoolean("animals", animals);
			nbt.putBoolean("metal", metal);
			nbt.putBoolean("light", light);
			nbt.putBoolean("shadow", shadow);
			nbt.putBoolean("vacuum", vacuum);
			nbt.putBoolean("moon", moon);
			nbt.putBoolean("sun", sun);
			nbt.putBoolean("creation", creation);
			nbt.putBoolean("destruction", destruction);
			nbt.putBoolean("space", space);
			nbt.putBoolean("selected", selected);
			nbt.putBoolean("blood", blood);
			nbt.putBoolean("technology", technology);
			nbt.putBoolean("time", time);
			nbt.putDouble("spawnx", spawnx);
			nbt.putDouble("spawny", spawny);
			nbt.putDouble("spawnz", spawnz);
			nbt.putBoolean("battery", battery);
			nbt.putBoolean("recharge_spell_sun", recharge_spell_sun);
			nbt.putBoolean("recharge_spell_moon", recharge_spell_moon);
			nbt.putBoolean("recharge_spell_blood", recharge_spell_blood);
			nbt.putBoolean("recharge_spell_energy", recharge_spell_energy);
			nbt.putBoolean("teleportation", teleportation);
			nbt.putBoolean("explosion", explosion);
			nbt.putBoolean("amber", amber);
			nbt.putBoolean("fog", fog);
			nbt.putBoolean("magnet", magnet);
			nbt.putBoolean("mist", mist);
			nbt.putDouble("power_level", power_level);
			nbt.putBoolean("recharge_spell_blue_flame", recharge_spell_blue_flame);
			nbt.putBoolean("sand", sand);
			nbt.putBoolean("speed", speed);
			nbt.putBoolean("turbospeed", turbospeed);
			nbt.putDouble("c1x", c1x);
			nbt.putDouble("c1y", c1y);
			nbt.putDouble("c1z", c1z);
			nbt.putDouble("c2x", c2x);
			nbt.putDouble("c2y", c2y);
			nbt.putDouble("c2z", c2z);
			nbt.putDouble("c3x", c3x);
			nbt.putDouble("c3y", c3y);
			nbt.putDouble("c3z", c3z);
			nbt.putBoolean("poison", poison);
			nbt.putBoolean("mushrooms", mushrooms);
			nbt.putBoolean("mercury", mercury);
			nbt.putBoolean("music", music);
			nbt.putBoolean("keeper", keeper);
			nbt.putBoolean("plague", plague);
			nbt.putBoolean("recharge_spell_plague", recharge_spell_plague);
			nbt.putBoolean("gravity", gravity);
			nbt.putBoolean("without_stone", without_stone);
			nbt.putBoolean("blue_flame", blue_flame);
			nbt.putBoolean("recharge_spell_gravity_boost", recharge_spell_gravity_boost);
			nbt.putBoolean("recharge_spell_gravity_red", recharge_spell_gravity_red);
			nbt.putBoolean("spirit", spirit);
			nbt.putBoolean("aether", aether);
			nbt.putBoolean("recharge_spell_time", recharge_spell_time);
			nbt.putBoolean("smoke", smoke);
			nbt.putBoolean("form", form);
			nbt.putBoolean("mind", mind);
			nbt.putBoolean("golden_dust", golden_dust);
			nbt.putBoolean("ally", ally);
			nbt.putBoolean("little", little);
			nbt.putBoolean("big", big);
			nbt.putBoolean("cursed_amethyst", cursed_amethyst);
			nbt.putBoolean("reactive_flying", reactive_flying);
			nbt.putBoolean("recharge_spell_ice", recharge_spell_ice);
			nbt.putBoolean("darkness", darkness);
			nbt.putDouble("rotate", rotate);
			nbt.putDouble("battle", battle);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			fire = nbt.getBoolean("fire");
			air = nbt.getBoolean("air");
			water = nbt.getBoolean("water");
			earth = nbt.getBoolean("earth");
			energy = nbt.getBoolean("energy");
			ice = nbt.getBoolean("ice");
			lightning = nbt.getBoolean("lightning");
			sound = nbt.getBoolean("sound");
			crystal = nbt.getBoolean("crystal");
			lava = nbt.getBoolean("lava");
			rain = nbt.getBoolean("rain");
			tornado = nbt.getBoolean("tornado");
			ocean = nbt.getBoolean("ocean");
			active = nbt.getBoolean("active");
			greenery = nbt.getBoolean("greenery");
			animals = nbt.getBoolean("animals");
			metal = nbt.getBoolean("metal");
			light = nbt.getBoolean("light");
			shadow = nbt.getBoolean("shadow");
			vacuum = nbt.getBoolean("vacuum");
			moon = nbt.getBoolean("moon");
			sun = nbt.getBoolean("sun");
			creation = nbt.getBoolean("creation");
			destruction = nbt.getBoolean("destruction");
			space = nbt.getBoolean("space");
			selected = nbt.getBoolean("selected");
			blood = nbt.getBoolean("blood");
			technology = nbt.getBoolean("technology");
			time = nbt.getBoolean("time");
			spawnx = nbt.getDouble("spawnx");
			spawny = nbt.getDouble("spawny");
			spawnz = nbt.getDouble("spawnz");
			battery = nbt.getBoolean("battery");
			recharge_spell_sun = nbt.getBoolean("recharge_spell_sun");
			recharge_spell_moon = nbt.getBoolean("recharge_spell_moon");
			recharge_spell_blood = nbt.getBoolean("recharge_spell_blood");
			recharge_spell_energy = nbt.getBoolean("recharge_spell_energy");
			teleportation = nbt.getBoolean("teleportation");
			explosion = nbt.getBoolean("explosion");
			amber = nbt.getBoolean("amber");
			fog = nbt.getBoolean("fog");
			magnet = nbt.getBoolean("magnet");
			mist = nbt.getBoolean("mist");
			power_level = nbt.getDouble("power_level");
			recharge_spell_blue_flame = nbt.getBoolean("recharge_spell_blue_flame");
			sand = nbt.getBoolean("sand");
			speed = nbt.getBoolean("speed");
			turbospeed = nbt.getBoolean("turbospeed");
			c1x = nbt.getDouble("c1x");
			c1y = nbt.getDouble("c1y");
			c1z = nbt.getDouble("c1z");
			c2x = nbt.getDouble("c2x");
			c2y = nbt.getDouble("c2y");
			c2z = nbt.getDouble("c2z");
			c3x = nbt.getDouble("c3x");
			c3y = nbt.getDouble("c3y");
			c3z = nbt.getDouble("c3z");
			poison = nbt.getBoolean("poison");
			mushrooms = nbt.getBoolean("mushrooms");
			mercury = nbt.getBoolean("mercury");
			music = nbt.getBoolean("music");
			keeper = nbt.getBoolean("keeper");
			plague = nbt.getBoolean("plague");
			recharge_spell_plague = nbt.getBoolean("recharge_spell_plague");
			gravity = nbt.getBoolean("gravity");
			without_stone = nbt.getBoolean("without_stone");
			blue_flame = nbt.getBoolean("blue_flame");
			recharge_spell_gravity_boost = nbt.getBoolean("recharge_spell_gravity_boost");
			recharge_spell_gravity_red = nbt.getBoolean("recharge_spell_gravity_red");
			spirit = nbt.getBoolean("spirit");
			aether = nbt.getBoolean("aether");
			recharge_spell_time = nbt.getBoolean("recharge_spell_time");
			smoke = nbt.getBoolean("smoke");
			form = nbt.getBoolean("form");
			mind = nbt.getBoolean("mind");
			golden_dust = nbt.getBoolean("golden_dust");
			ally = nbt.getBoolean("ally");
			little = nbt.getBoolean("little");
			big = nbt.getBoolean("big");
			cursed_amethyst = nbt.getBoolean("cursed_amethyst");
			reactive_flying = nbt.getBoolean("reactive_flying");
			recharge_spell_ice = nbt.getBoolean("recharge_spell_ice");
			darkness = nbt.getBoolean("darkness");
			rotate = nbt.getDouble("rotate");
			battle = nbt.getDouble("battle");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

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
					variables.fire = message.data.fire;
					variables.air = message.data.air;
					variables.water = message.data.water;
					variables.earth = message.data.earth;
					variables.energy = message.data.energy;
					variables.ice = message.data.ice;
					variables.lightning = message.data.lightning;
					variables.sound = message.data.sound;
					variables.crystal = message.data.crystal;
					variables.lava = message.data.lava;
					variables.rain = message.data.rain;
					variables.tornado = message.data.tornado;
					variables.ocean = message.data.ocean;
					variables.active = message.data.active;
					variables.greenery = message.data.greenery;
					variables.animals = message.data.animals;
					variables.metal = message.data.metal;
					variables.light = message.data.light;
					variables.shadow = message.data.shadow;
					variables.vacuum = message.data.vacuum;
					variables.moon = message.data.moon;
					variables.sun = message.data.sun;
					variables.creation = message.data.creation;
					variables.destruction = message.data.destruction;
					variables.space = message.data.space;
					variables.selected = message.data.selected;
					variables.blood = message.data.blood;
					variables.technology = message.data.technology;
					variables.time = message.data.time;
					variables.spawnx = message.data.spawnx;
					variables.spawny = message.data.spawny;
					variables.spawnz = message.data.spawnz;
					variables.battery = message.data.battery;
					variables.recharge_spell_sun = message.data.recharge_spell_sun;
					variables.recharge_spell_moon = message.data.recharge_spell_moon;
					variables.recharge_spell_blood = message.data.recharge_spell_blood;
					variables.recharge_spell_energy = message.data.recharge_spell_energy;
					variables.teleportation = message.data.teleportation;
					variables.explosion = message.data.explosion;
					variables.amber = message.data.amber;
					variables.fog = message.data.fog;
					variables.magnet = message.data.magnet;
					variables.mist = message.data.mist;
					variables.power_level = message.data.power_level;
					variables.recharge_spell_blue_flame = message.data.recharge_spell_blue_flame;
					variables.sand = message.data.sand;
					variables.speed = message.data.speed;
					variables.turbospeed = message.data.turbospeed;
					variables.c1x = message.data.c1x;
					variables.c1y = message.data.c1y;
					variables.c1z = message.data.c1z;
					variables.c2x = message.data.c2x;
					variables.c2y = message.data.c2y;
					variables.c2z = message.data.c2z;
					variables.c3x = message.data.c3x;
					variables.c3y = message.data.c3y;
					variables.c3z = message.data.c3z;
					variables.poison = message.data.poison;
					variables.mushrooms = message.data.mushrooms;
					variables.mercury = message.data.mercury;
					variables.music = message.data.music;
					variables.keeper = message.data.keeper;
					variables.plague = message.data.plague;
					variables.recharge_spell_plague = message.data.recharge_spell_plague;
					variables.gravity = message.data.gravity;
					variables.without_stone = message.data.without_stone;
					variables.blue_flame = message.data.blue_flame;
					variables.recharge_spell_gravity_boost = message.data.recharge_spell_gravity_boost;
					variables.recharge_spell_gravity_red = message.data.recharge_spell_gravity_red;
					variables.spirit = message.data.spirit;
					variables.aether = message.data.aether;
					variables.recharge_spell_time = message.data.recharge_spell_time;
					variables.smoke = message.data.smoke;
					variables.form = message.data.form;
					variables.mind = message.data.mind;
					variables.golden_dust = message.data.golden_dust;
					variables.ally = message.data.ally;
					variables.little = message.data.little;
					variables.big = message.data.big;
					variables.cursed_amethyst = message.data.cursed_amethyst;
					variables.reactive_flying = message.data.reactive_flying;
					variables.recharge_spell_ice = message.data.recharge_spell_ice;
					variables.darkness = message.data.darkness;
					variables.rotate = message.data.rotate;
					variables.battle = message.data.battle;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
