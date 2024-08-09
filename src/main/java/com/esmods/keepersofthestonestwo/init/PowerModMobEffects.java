
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import com.esmods.keepersofthestonestwo.procedures.WaterMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.VacuumMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.TornadoMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.TimeStoppedPriIstiechieniiEffiektaProcedure;
import com.esmods.keepersofthestonestwo.procedures.TimeMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.TeleportationMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.TechnologyMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.SunMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.StarRegenerationEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.SpeedMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.SpaceMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.SoundMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.ShadowMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.SandMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.RainMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.PowerLockEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.PoisonMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.PlantsMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.OceanMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.MushroomsMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.MoonMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.MistMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.MetalMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.MercuryMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.MagnetMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.LightningMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.LightMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.LethalityPriIstiechieniiEffiektaProcedure;
import com.esmods.keepersofthestonestwo.procedures.LavaMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.IronSkinEffectEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.IceMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.FireMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.ExplosionMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.EtherMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.EnergyMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.EarthMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.DestructionMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.CrystalMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.CreationMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.BloodMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.AnimalsMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.AmberMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.AirMasterEndProcedure;
import com.esmods.keepersofthestonestwo.potion.WhirlwindMobEffect;
import com.esmods.keepersofthestonestwo.potion.WaterMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.VacuumMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.TornadoMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.TimeStoppedMobEffect;
import com.esmods.keepersofthestonestwo.potion.TimeSlowingMobEffect;
import com.esmods.keepersofthestonestwo.potion.TimeMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.TeleportationMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.TechnologyMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.TechnobarrierMobEffect;
import com.esmods.keepersofthestonestwo.potion.SunMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.StunMobEffect;
import com.esmods.keepersofthestonestwo.potion.StarRegenerationMobEffect;
import com.esmods.keepersofthestonestwo.potion.SpeedMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.SpaceMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.SoundMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.ShadowMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.SandMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.RedMagnetPowerMobEffect;
import com.esmods.keepersofthestonestwo.potion.RainMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.PowerLockMobEffect;
import com.esmods.keepersofthestonestwo.potion.PoisonMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.PlantsMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.OceanMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.MusicMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.MushroomsMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.MoonMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.MistMobEffect;
import com.esmods.keepersofthestonestwo.potion.MistMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.MetalMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.MercuryMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.MagnetMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.LightningMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.LightMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.LethalityMobEffect;
import com.esmods.keepersofthestonestwo.potion.LavaMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.IronSkinMobEffect;
import com.esmods.keepersofthestonestwo.potion.ImmortalityMobEffect;
import com.esmods.keepersofthestonestwo.potion.IceMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.FireMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.ExplosionMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.EtherMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.EnergyMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.EarthMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.DestructionMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.CrystalMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.CreationMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.BlueMagnetPowerMobEffect;
import com.esmods.keepersofthestonestwo.potion.BloodMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.AnimalsMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.AmberMasterMobEffect;
import com.esmods.keepersofthestonestwo.potion.AirMasterMobEffect;
import com.esmods.keepersofthestonestwo.PowerMod;

@Mod.EventBusSubscriber
public class PowerModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, PowerMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> FIRE_MASTER = REGISTRY.register("fire_master", () -> new FireMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> AIR_MASTER = REGISTRY.register("air_master", () -> new AirMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> EARTH_MASTER = REGISTRY.register("earth_master", () -> new EarthMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> WATER_MASTER = REGISTRY.register("water_master", () -> new WaterMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ETHER_MASTER = REGISTRY.register("ether_master", () -> new EtherMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ICE_MASTER = REGISTRY.register("ice_master", () -> new IceMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> LIGHTNING_MASTER = REGISTRY.register("lightning_master", () -> new LightningMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SOUND_MASTER = REGISTRY.register("sound_master", () -> new SoundMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> LAVA_MASTER = REGISTRY.register("lava_master", () -> new LavaMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> CRYSTAL_MASTER = REGISTRY.register("crystal_master", () -> new CrystalMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> RAIN_MASTER = REGISTRY.register("rain_master", () -> new RainMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TORNADO_MASTER = REGISTRY.register("tornado_master", () -> new TornadoMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> OCEAN_MASTER = REGISTRY.register("ocean_master", () -> new OceanMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PLANTS_MASTER = REGISTRY.register("plants_master", () -> new PlantsMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ANIMALS_MASTER = REGISTRY.register("animals_master", () -> new AnimalsMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> METAL_MASTER = REGISTRY.register("metal_master", () -> new MetalMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> STUN = REGISTRY.register("stun", () -> new StunMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> WHIRLWIND = REGISTRY.register("whirlwind", () -> new WhirlwindMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> IRON_SKIN = REGISTRY.register("iron_skin", () -> new IronSkinMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> LIGHT_MASTER = REGISTRY.register("light_master", () -> new LightMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SHADOW_MASTER = REGISTRY.register("shadow_master", () -> new ShadowMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> VACUUM_MASTER = REGISTRY.register("vacuum_master", () -> new VacuumMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> POWER_LOCK = REGISTRY.register("power_lock", () -> new PowerLockMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ENERGY_MASTER = REGISTRY.register("energy_master", () -> new EnergyMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SUN_MASTER = REGISTRY.register("sun_master", () -> new SunMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> MOON_MASTER = REGISTRY.register("moon_master", () -> new MoonMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SPACE_MASTER = REGISTRY.register("space_master", () -> new SpaceMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TIME_MASTER = REGISTRY.register("time_master", () -> new TimeMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TIME_SLOWING = REGISTRY.register("time_slowing", () -> new TimeSlowingMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TIME_STOPPED = REGISTRY.register("time_stopped", () -> new TimeStoppedMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> CREATION_MASTER = REGISTRY.register("creation_master", () -> new CreationMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> IMMORTALITY = REGISTRY.register("immortality", () -> new ImmortalityMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> DESTRUCTION_MASTER = REGISTRY.register("destruction_master", () -> new DestructionMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> LETHALITY = REGISTRY.register("lethality", () -> new LethalityMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> BLOOD_MASTER = REGISTRY.register("blood_master", () -> new BloodMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TECHNOLOGY_MASTER = REGISTRY.register("technology_master", () -> new TechnologyMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TECHNOBARRIER = REGISTRY.register("technobarrier", () -> new TechnobarrierMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TELEPORTATION_MASTER = REGISTRY.register("teleportation_master", () -> new TeleportationMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> EXPLOSION_MASTER = REGISTRY.register("explosion_master", () -> new ExplosionMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> AMBER_MASTER = REGISTRY.register("amber_master", () -> new AmberMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> STAR_REGENERATION = REGISTRY.register("star_regeneration", () -> new StarRegenerationMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> MIST_MASTER = REGISTRY.register("mist_master", () -> new MistMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> MIST = REGISTRY.register("mist", () -> new MistMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SAND_MASTER = REGISTRY.register("sand_master", () -> new SandMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SPEED_MASTER = REGISTRY.register("speed_master", () -> new SpeedMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> POISON_MASTER = REGISTRY.register("poison_master", () -> new PoisonMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> MAGNET_MASTER = REGISTRY.register("magnet_master", () -> new MagnetMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> RED_MAGNET_POWER = REGISTRY.register("red_magnet_power", () -> new RedMagnetPowerMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> BLUE_MAGNET_POWER = REGISTRY.register("blue_magnet_power", () -> new BlueMagnetPowerMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> MUSHROOMS_MASTER = REGISTRY.register("mushrooms_master", () -> new MushroomsMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> MERCURY_MASTER = REGISTRY.register("mercury_master", () -> new MercuryMasterMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> MUSIC_MASTER = REGISTRY.register("music_master", () -> new MusicMasterMobEffect());

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		MobEffect effect = effectInstance.getEffect();
		if (effect == FIRE_MASTER.get()) {
			FireMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == AIR_MASTER.get()) {
			AirMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == EARTH_MASTER.get()) {
			EarthMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == WATER_MASTER.get()) {
			WaterMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == ETHER_MASTER.get()) {
			EtherMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == ICE_MASTER.get()) {
			IceMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == LIGHTNING_MASTER.get()) {
			LightningMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == SOUND_MASTER.get()) {
			SoundMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == LAVA_MASTER.get()) {
			LavaMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == CRYSTAL_MASTER.get()) {
			CrystalMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == RAIN_MASTER.get()) {
			RainMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == TORNADO_MASTER.get()) {
			TornadoMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == OCEAN_MASTER.get()) {
			OceanMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == PLANTS_MASTER.get()) {
			PlantsMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == ANIMALS_MASTER.get()) {
			AnimalsMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == METAL_MASTER.get()) {
			MetalMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == IRON_SKIN.get()) {
			IronSkinEffectEndProcedure.execute(entity);
		} else if (effect == LIGHT_MASTER.get()) {
			LightMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == SHADOW_MASTER.get()) {
			ShadowMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == VACUUM_MASTER.get()) {
			VacuumMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == POWER_LOCK.get()) {
			PowerLockEndProcedure.execute(entity);
		} else if (effect == ENERGY_MASTER.get()) {
			EnergyMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == SUN_MASTER.get()) {
			SunMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == MOON_MASTER.get()) {
			MoonMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == SPACE_MASTER.get()) {
			SpaceMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == TIME_MASTER.get()) {
			TimeMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == TIME_STOPPED.get()) {
			TimeStoppedPriIstiechieniiEffiektaProcedure.execute(entity);
		} else if (effect == CREATION_MASTER.get()) {
			CreationMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == DESTRUCTION_MASTER.get()) {
			DestructionMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == LETHALITY.get()) {
			LethalityPriIstiechieniiEffiektaProcedure.execute(entity.level(), entity);
		} else if (effect == BLOOD_MASTER.get()) {
			BloodMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == TECHNOLOGY_MASTER.get()) {
			TechnologyMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == TELEPORTATION_MASTER.get()) {
			TeleportationMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == EXPLOSION_MASTER.get()) {
			ExplosionMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == AMBER_MASTER.get()) {
			AmberMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == STAR_REGENERATION.get()) {
			StarRegenerationEndProcedure.execute(entity);
		} else if (effect == MIST_MASTER.get()) {
			MistMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == SAND_MASTER.get()) {
			SandMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == SPEED_MASTER.get()) {
			SpeedMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == POISON_MASTER.get()) {
			PoisonMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == MAGNET_MASTER.get()) {
			MagnetMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == MUSHROOMS_MASTER.get()) {
			MushroomsMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effect == MERCURY_MASTER.get()) {
			MercuryMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}
}
