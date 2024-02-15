
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import ru.power_umc.keepersofthestonestwo.procedures.WaterMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.VacuumMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.TornadoMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.SunMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.SoundMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.ShadowMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.RainMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.PowerLockEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.PlantsMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.OceanMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.MetalMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.LightningMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.LightMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.LavaMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.IronSkinEffectEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.IceMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.FireMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.EtherMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.EnergyMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.EarthMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.CrystalMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.AnimalsMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.AirMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.potion.WhirlwindMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.WaterMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.VacuumMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.TornadoMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.SunMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.StunMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.SoundMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.ShadowMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.RainMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.PowerLockMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.PlantsMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.OceanMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.MetalMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.LightningMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.LightMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.LavaMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.IronSkinMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.IceMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.FireMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.EtherMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.EnergyMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.EarthMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.CrystalMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.AnimalsMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.AirMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.PowerMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

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
		}
	}
}
