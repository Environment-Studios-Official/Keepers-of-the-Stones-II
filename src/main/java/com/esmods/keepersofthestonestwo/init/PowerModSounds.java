
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import com.esmods.keepersofthestonestwo.PowerMod;

public class PowerModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, PowerMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> STONE_ACTIVATION = REGISTRY.register("stone_activation", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "stone_activation")));
	public static final DeferredHolder<SoundEvent, SoundEvent> STONE_DEACTIVATION = REGISTRY.register("stone_deactivation", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "stone_deactivation")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ELECTRIC_SPARK = REGISTRY.register("electric_spark", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "electric_spark")));
	public static final DeferredHolder<SoundEvent, SoundEvent> EAR_RINGING = REGISTRY.register("ear_ringing", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "ear_ringing")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BACKPORT_BLOCK_VAULT_STEP = REGISTRY.register("backport.block.vault.step",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "backport.block.vault.step")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BACKPORT_BLOCK_VAULT_PLACE = REGISTRY.register("backport.block.vault.place",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "backport.block.vault.place")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BACKPORT_BLOCK_VAULT_AMBIENT = REGISTRY.register("backport.block.vault.ambient",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "backport.block.vault.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BACKPORT_BLOCK_VAULT_BREAK = REGISTRY.register("backport.block.vault.break",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "backport.block.vault.break")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BACKPORT_BLOCK_VAULT_EJECT = REGISTRY.register("backport.block.vault.eject",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "backport.block.vault.eject")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BACKPORT_BLOCK_VAULT_ACTIVATE = REGISTRY.register("backport.block.vault.activate",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "backport.block.vault.activate")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BACKPORT_BLOCK_VAULT_DEACTIVATE = REGISTRY.register("backport.block.vault.deactivate",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "backport.block.vault.deactivate")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BACKPORT_BLOCK_VAULT_INSERT = REGISTRY.register("backport.block.vault.insert",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "backport.block.vault.insert")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BACKPORT_BLOCK_VAULT_INSERT_FAIL = REGISTRY.register("backport.block.vault.insert_fail",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "backport.block.vault.insert_fail")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BACKPORT_BLOCK_VAULT_OPEN_SHUTTER = REGISTRY.register("backport.block.vault.open_shutter",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "backport.block.vault.open_shutter")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MAGNETIC_WAVES = REGISTRY.register("magnetic_waves", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "magnetic_waves")));
	public static final DeferredHolder<SoundEvent, SoundEvent> RECORD_CALL_OF_THE_PAST = REGISTRY.register("record.call_of_the_past",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "record.call_of_the_past")));
	public static final DeferredHolder<SoundEvent, SoundEvent> RECORD_ANCIENT_MOOD = REGISTRY.register("record.ancient_mood", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "record.ancient_mood")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TIME_ABILITY_EFFECT = REGISTRY.register("time_ability_effect", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("power", "time_ability_effect")));
}
