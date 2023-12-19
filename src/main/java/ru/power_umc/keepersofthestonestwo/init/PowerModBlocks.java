
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import ru.power_umc.keepersofthestonestwo.block.EnergiumBlockBlock;
import ru.power_umc.keepersofthestonestwo.block.DepletedEnergiumOreBlock;
import ru.power_umc.keepersofthestonestwo.block.DepletedEnergiumBlockBlock;
import ru.power_umc.keepersofthestonestwo.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class PowerModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PowerMod.MODID);
	public static final RegistryObject<Block> DEPLETED_ENERGIUM_ORE = REGISTRY.register("depleted_energium_ore", () -> new DepletedEnergiumOreBlock());
	public static final RegistryObject<Block> DEPLETED_ENERGIUM_BLOCK = REGISTRY.register("depleted_energium_block", () -> new DepletedEnergiumBlockBlock());
	public static final RegistryObject<Block> ENERGIUM_BLOCK = REGISTRY.register("energium_block", () -> new EnergiumBlockBlock());
}
