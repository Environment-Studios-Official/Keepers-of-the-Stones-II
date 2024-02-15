
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import ru.power_umc.keepersofthestonestwo.block.KeepersBoxBlock;
import ru.power_umc.keepersofthestonestwo.block.EnergiumBlockBlock;
import ru.power_umc.keepersofthestonestwo.block.DepletedEnergiumOreBlock;
import ru.power_umc.keepersofthestonestwo.block.DepletedEnergiumBlockBlock;
import ru.power_umc.keepersofthestonestwo.block.BatteryChargerBlock;
import ru.power_umc.keepersofthestonestwo.PowerMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

public class PowerModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, PowerMod.MODID);
	public static final DeferredHolder<Block, Block> KEEPERS_BOX = REGISTRY.register("keepers_box", () -> new KeepersBoxBlock());
	public static final DeferredHolder<Block, Block> DEPLETED_ENERGIUM_ORE = REGISTRY.register("depleted_energium_ore", () -> new DepletedEnergiumOreBlock());
	public static final DeferredHolder<Block, Block> DEPLETED_ENERGIUM_BLOCK = REGISTRY.register("depleted_energium_block", () -> new DepletedEnergiumBlockBlock());
	public static final DeferredHolder<Block, Block> ENERGIUM_BLOCK = REGISTRY.register("energium_block", () -> new EnergiumBlockBlock());
	public static final DeferredHolder<Block, Block> BATTERY_CHARGER = REGISTRY.register("battery_charger", () -> new BatteryChargerBlock());
}
