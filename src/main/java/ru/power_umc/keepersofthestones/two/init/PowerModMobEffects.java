
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestones.two.init;

import ru.power_umc.keepersofthestones.two.potion.TheElementOfWaterMobEffect;
import ru.power_umc.keepersofthestones.two.potion.TheElementOfTheEarthMobEffect;
import ru.power_umc.keepersofthestones.two.potion.TheElementOfFireMobEffect;
import ru.power_umc.keepersofthestones.two.potion.TheElementOfEtherMobEffect;
import ru.power_umc.keepersofthestones.two.potion.TheElementOfAirMobEffect;
import ru.power_umc.keepersofthestones.two.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class PowerModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PowerMod.MODID);
	public static final RegistryObject<MobEffect> THE_ELEMENT_OF_AIR = REGISTRY.register("the_element_of_air", () -> new TheElementOfAirMobEffect());
	public static final RegistryObject<MobEffect> THE_ELEMENT_OF_FIRE = REGISTRY.register("the_element_of_fire", () -> new TheElementOfFireMobEffect());
	public static final RegistryObject<MobEffect> THE_ELEMENT_OF_THE_EARTH = REGISTRY.register("the_element_of_the_earth", () -> new TheElementOfTheEarthMobEffect());
	public static final RegistryObject<MobEffect> THE_ELEMENT_OF_WATER = REGISTRY.register("the_element_of_water", () -> new TheElementOfWaterMobEffect());
	public static final RegistryObject<MobEffect> THE_ELEMENT_OF_ETHER = REGISTRY.register("the_element_of_ether", () -> new TheElementOfEtherMobEffect());
}
