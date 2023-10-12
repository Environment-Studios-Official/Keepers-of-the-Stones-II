
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestones.two.init;

import ru.power_umc.keepersofthestones.two.potion.WaterMasterMobEffect;
import ru.power_umc.keepersofthestones.two.potion.SoundMasterMobEffect;
import ru.power_umc.keepersofthestones.two.potion.LightningMasterMobEffect;
import ru.power_umc.keepersofthestones.two.potion.LavaMasterMobEffect;
import ru.power_umc.keepersofthestones.two.potion.IceMasterMobEffect;
import ru.power_umc.keepersofthestones.two.potion.FireMasterMobEffect;
import ru.power_umc.keepersofthestones.two.potion.EtherMasterMobEffect;
import ru.power_umc.keepersofthestones.two.potion.EarthMasterMobEffect;
import ru.power_umc.keepersofthestones.two.potion.CystalMasterMobEffect;
import ru.power_umc.keepersofthestones.two.potion.AirMasterMobEffect;
import ru.power_umc.keepersofthestones.two.PowerMod;

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
	public static final RegistryObject<MobEffect> CYSTAL_MASTER = REGISTRY.register("cystal_master", () -> new CystalMasterMobEffect());
	public static final RegistryObject<MobEffect> LAVA_MASTER = REGISTRY.register("lava_master", () -> new LavaMasterMobEffect());
}
