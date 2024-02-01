
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import ru.power_umc.keepersofthestonestwo.potion.WhirlwindMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.WaterMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.VacuumMasterMobEffect;
import ru.power_umc.keepersofthestonestwo.potion.TornadoMasterMobEffect;
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

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class PowerModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PowerMod.MODID);
	public static final RegistryObject<MobEffect> FIRE_MASTER = REGISTRY.register("fire_master", () -> new FireMasterMobEffect());
	public static final RegistryObject<MobEffect> AIR_MASTER = REGISTRY.register("air_master", () -> new AirMasterMobEffect());
	public static final RegistryObject<MobEffect> EARTH_MASTER = REGISTRY.register("earth_master", () -> new EarthMasterMobEffect());
	public static final RegistryObject<MobEffect> WATER_MASTER = REGISTRY.register("water_master", () -> new WaterMasterMobEffect());
	public static final RegistryObject<MobEffect> ETHER_MASTER = REGISTRY.register("ether_master", () -> new EtherMasterMobEffect());
	public static final RegistryObject<MobEffect> ICE_MASTER = REGISTRY.register("ice_master", () -> new IceMasterMobEffect());
	public static final RegistryObject<MobEffect> LIGHTNING_MASTER = REGISTRY.register("lightning_master", () -> new LightningMasterMobEffect());
	public static final RegistryObject<MobEffect> SOUND_MASTER = REGISTRY.register("sound_master", () -> new SoundMasterMobEffect());
	public static final RegistryObject<MobEffect> LAVA_MASTER = REGISTRY.register("lava_master", () -> new LavaMasterMobEffect());
	public static final RegistryObject<MobEffect> CRYSTAL_MASTER = REGISTRY.register("crystal_master", () -> new CrystalMasterMobEffect());
	public static final RegistryObject<MobEffect> RAIN_MASTER = REGISTRY.register("rain_master", () -> new RainMasterMobEffect());
	public static final RegistryObject<MobEffect> TORNADO_MASTER = REGISTRY.register("tornado_master", () -> new TornadoMasterMobEffect());
	public static final RegistryObject<MobEffect> OCEAN_MASTER = REGISTRY.register("ocean_master", () -> new OceanMasterMobEffect());
	public static final RegistryObject<MobEffect> PLANTS_MASTER = REGISTRY.register("plants_master", () -> new PlantsMasterMobEffect());
	public static final RegistryObject<MobEffect> ANIMALS_MASTER = REGISTRY.register("animals_master", () -> new AnimalsMasterMobEffect());
	public static final RegistryObject<MobEffect> METAL_MASTER = REGISTRY.register("metal_master", () -> new MetalMasterMobEffect());
	public static final RegistryObject<MobEffect> STUN = REGISTRY.register("stun", () -> new StunMobEffect());
	public static final RegistryObject<MobEffect> WHIRLWIND = REGISTRY.register("whirlwind", () -> new WhirlwindMobEffect());
	public static final RegistryObject<MobEffect> IRON_SKIN = REGISTRY.register("iron_skin", () -> new IronSkinMobEffect());
	public static final RegistryObject<MobEffect> LIGHT_MASTER = REGISTRY.register("light_master", () -> new LightMasterMobEffect());
	public static final RegistryObject<MobEffect> SHADOW_MASTER = REGISTRY.register("shadow_master", () -> new ShadowMasterMobEffect());
	public static final RegistryObject<MobEffect> VACUUM_MASTER = REGISTRY.register("vacuum_master", () -> new VacuumMasterMobEffect());
	public static final RegistryObject<MobEffect> POWER_LOCK = REGISTRY.register("power_lock", () -> new PowerLockMobEffect());
	public static final RegistryObject<MobEffect> ENERGY_MASTER = REGISTRY.register("energy_master", () -> new EnergyMasterMobEffect());
}
