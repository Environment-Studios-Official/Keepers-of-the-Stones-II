
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import com.esmods.keepersofthestonestwo.block.RawDepletedEnergiumBlockBlock;
import com.esmods.keepersofthestonestwo.block.RawAmplifierBlockBlock;
import com.esmods.keepersofthestonestwo.block.OrangePortalBlock;
import com.esmods.keepersofthestonestwo.block.MoonBlockBlock;
import com.esmods.keepersofthestonestwo.block.KeepersBoxBlock;
import com.esmods.keepersofthestonestwo.block.EnergiumControllerBlock;
import com.esmods.keepersofthestonestwo.block.EnergiumBlockBlock;
import com.esmods.keepersofthestonestwo.block.DepletedEnergiumOreBlock;
import com.esmods.keepersofthestonestwo.block.DepletedEnergiumBlockBlock;
import com.esmods.keepersofthestonestwo.block.BluePortalBlock;
import com.esmods.keepersofthestonestwo.block.BatteryChargerBlock;
import com.esmods.keepersofthestonestwo.block.AmplifierOreBlock;
import com.esmods.keepersofthestonestwo.block.AmplifierBlockBlock;
import com.esmods.keepersofthestonestwo.block.AmberBlockBlock;
import com.esmods.keepersofthestonestwo.PowerMod;

public class PowerModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, PowerMod.MODID);
	public static final DeferredHolder<Block, Block> DEPLETED_ENERGIUM_ORE = REGISTRY.register("depleted_energium_ore", () -> new DepletedEnergiumOreBlock());
	public static final DeferredHolder<Block, Block> DEPLETED_ENERGIUM_BLOCK = REGISTRY.register("depleted_energium_block", () -> new DepletedEnergiumBlockBlock());
	public static final DeferredHolder<Block, Block> ENERGIUM_BLOCK = REGISTRY.register("energium_block", () -> new EnergiumBlockBlock());
	public static final DeferredHolder<Block, Block> BATTERY_CHARGER = REGISTRY.register("battery_charger", () -> new BatteryChargerBlock());
	public static final DeferredHolder<Block, Block> KEEPERS_BOX = REGISTRY.register("keepers_box", () -> new KeepersBoxBlock());
	public static final DeferredHolder<Block, Block> MOON_BLOCK = REGISTRY.register("moon_block", () -> new MoonBlockBlock());
	public static final DeferredHolder<Block, Block> ENERGIUM_CONTROLLER = REGISTRY.register("energium_controller", () -> new EnergiumControllerBlock());
	public static final DeferredHolder<Block, Block> AMPLIFIER_ORE = REGISTRY.register("amplifier_ore", () -> new AmplifierOreBlock());
	public static final DeferredHolder<Block, Block> AMPLIFIER_BLOCK = REGISTRY.register("amplifier_block", () -> new AmplifierBlockBlock());
	public static final DeferredHolder<Block, Block> RAW_DEPLETED_ENERGIUM_BLOCK = REGISTRY.register("raw_depleted_energium_block", () -> new RawDepletedEnergiumBlockBlock());
	public static final DeferredHolder<Block, Block> RAW_AMPLIFIER_BLOCK = REGISTRY.register("raw_amplifier_block", () -> new RawAmplifierBlockBlock());
	public static final DeferredHolder<Block, Block> BLUE_PORTAL = REGISTRY.register("blue_portal", () -> new BluePortalBlock());
	public static final DeferredHolder<Block, Block> ORANGE_PORTAL = REGISTRY.register("orange_portal", () -> new OrangePortalBlock());
	public static final DeferredHolder<Block, Block> AMBER_BLOCK = REGISTRY.register("amber_block", () -> new AmberBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
