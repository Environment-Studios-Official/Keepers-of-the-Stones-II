
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.esmods.keepersofthestonestwo.KeepersOfTheStones2Mod;

public class KeepersOfTheStones2ModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, KeepersOfTheStones2Mod.MODID);
	public static final RegistryObject<SoundEvent> STONE_ACTIVATION = REGISTRY.register("stone_activation", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("keepers_of_the_stones_2", "stone_activation")));
	public static final RegistryObject<SoundEvent> STONE_DEACTIVATION = REGISTRY.register("stone_deactivation", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("keepers_of_the_stones_2", "stone_deactivation")));
	public static final RegistryObject<SoundEvent> ELECTRIC_SPARK = REGISTRY.register("electric_spark", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("keepers_of_the_stones_2", "electric_spark")));
	public static final RegistryObject<SoundEvent> EAR_RINGING = REGISTRY.register("ear_ringing", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("keepers_of_the_stones_2", "ear_ringing")));
}
