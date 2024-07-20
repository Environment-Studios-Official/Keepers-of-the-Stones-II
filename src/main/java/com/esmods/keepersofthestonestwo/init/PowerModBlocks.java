
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import com.esmods.keepersofthestonestwo.block.RawEnergiumBlockBlock;
import com.esmods.keepersofthestonestwo.block.RawDepletedEnergiumBlockBlock;
import com.esmods.keepersofthestonestwo.block.RawCopyriumBlockBlock;
import com.esmods.keepersofthestonestwo.block.RawAmplifierBlockBlock;
import com.esmods.keepersofthestonestwo.block.PurpleMushroomBlock;
import com.esmods.keepersofthestonestwo.block.PolishedCursedStoneWallBlock;
import com.esmods.keepersofthestonestwo.block.PolishedCursedStoneStairsBlock;
import com.esmods.keepersofthestonestwo.block.PolishedCursedStoneSlabBlock;
import com.esmods.keepersofthestonestwo.block.PolishedCursedStoneBlock;
import com.esmods.keepersofthestonestwo.block.OrangePortalBlock;
import com.esmods.keepersofthestonestwo.block.MoonBlockBlock;
import com.esmods.keepersofthestonestwo.block.KeepersBoxBlock;
import com.esmods.keepersofthestonestwo.block.EnergiumVaultBlock;
import com.esmods.keepersofthestonestwo.block.EnergiumOreBlock;
import com.esmods.keepersofthestonestwo.block.EnergiumControllerBlock;
import com.esmods.keepersofthestonestwo.block.EnergiumBlockBlock;
import com.esmods.keepersofthestonestwo.block.ElementalPowerGeneratorBlock;
import com.esmods.keepersofthestonestwo.block.DepletedEnergiumOreBlock;
import com.esmods.keepersofthestonestwo.block.DepletedEnergiumBlockBlock;
import com.esmods.keepersofthestonestwo.block.DeepslateEnergiumOreBlock;
import com.esmods.keepersofthestonestwo.block.DeepslateDepletedEnergiumOreBlock;
import com.esmods.keepersofthestonestwo.block.DeepslateCopyriumOreBlock;
import com.esmods.keepersofthestonestwo.block.DeepslateAmplifierOreBlock;
import com.esmods.keepersofthestonestwo.block.CursedVaultBlock;
import com.esmods.keepersofthestonestwo.block.CursedStoneWallBlock;
import com.esmods.keepersofthestonestwo.block.CursedStoneStairsBlock;
import com.esmods.keepersofthestonestwo.block.CursedStoneSlabBlock;
import com.esmods.keepersofthestonestwo.block.CursedStonePillarBlock;
import com.esmods.keepersofthestonestwo.block.CursedStoneBricksWallBlock;
import com.esmods.keepersofthestonestwo.block.CursedStoneBricksStairsBlock;
import com.esmods.keepersofthestonestwo.block.CursedStoneBricksSlabBlock;
import com.esmods.keepersofthestonestwo.block.CursedStoneBricksBlock;
import com.esmods.keepersofthestonestwo.block.CursedStoneBlock;
import com.esmods.keepersofthestonestwo.block.CursedLanternBlock;
import com.esmods.keepersofthestonestwo.block.CursedLampBlock;
import com.esmods.keepersofthestonestwo.block.CursedLadderBlock;
import com.esmods.keepersofthestonestwo.block.CopyriumOreBlock;
import com.esmods.keepersofthestonestwo.block.CopyriumBlockBlock;
import com.esmods.keepersofthestonestwo.block.BluePortalBlock;
import com.esmods.keepersofthestonestwo.block.BatteryChargerBlock;
import com.esmods.keepersofthestonestwo.block.AmplifierOreBlock;
import com.esmods.keepersofthestonestwo.block.AmplifierBlockBlock;
import com.esmods.keepersofthestonestwo.block.AmberBlockBlock;
import com.esmods.keepersofthestonestwo.PowerMod;

public class PowerModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(PowerMod.MODID);
	public static final DeferredHolder<Block, Block> DEPLETED_ENERGIUM_ORE = REGISTRY.register("depleted_energium_ore", DepletedEnergiumOreBlock::new);
	public static final DeferredHolder<Block, Block> DEPLETED_ENERGIUM_BLOCK = REGISTRY.register("depleted_energium_block", DepletedEnergiumBlockBlock::new);
	public static final DeferredHolder<Block, Block> ENERGIUM_BLOCK = REGISTRY.register("energium_block", EnergiumBlockBlock::new);
	public static final DeferredHolder<Block, Block> BATTERY_CHARGER = REGISTRY.register("battery_charger", BatteryChargerBlock::new);
	public static final DeferredHolder<Block, Block> KEEPERS_BOX = REGISTRY.register("keepers_box", KeepersBoxBlock::new);
	public static final DeferredHolder<Block, Block> MOON_BLOCK = REGISTRY.register("moon_block", MoonBlockBlock::new);
	public static final DeferredHolder<Block, Block> ENERGIUM_CONTROLLER = REGISTRY.register("energium_controller", EnergiumControllerBlock::new);
	public static final DeferredHolder<Block, Block> AMPLIFIER_ORE = REGISTRY.register("amplifier_ore", AmplifierOreBlock::new);
	public static final DeferredHolder<Block, Block> AMPLIFIER_BLOCK = REGISTRY.register("amplifier_block", AmplifierBlockBlock::new);
	public static final DeferredHolder<Block, Block> RAW_DEPLETED_ENERGIUM_BLOCK = REGISTRY.register("raw_depleted_energium_block", RawDepletedEnergiumBlockBlock::new);
	public static final DeferredHolder<Block, Block> RAW_AMPLIFIER_BLOCK = REGISTRY.register("raw_amplifier_block", RawAmplifierBlockBlock::new);
	public static final DeferredHolder<Block, Block> BLUE_PORTAL = REGISTRY.register("blue_portal", BluePortalBlock::new);
	public static final DeferredHolder<Block, Block> ORANGE_PORTAL = REGISTRY.register("orange_portal", OrangePortalBlock::new);
	public static final DeferredHolder<Block, Block> AMBER_BLOCK = REGISTRY.register("amber_block", AmberBlockBlock::new);
	public static final DeferredHolder<Block, Block> CURSED_STONE = REGISTRY.register("cursed_stone", CursedStoneBlock::new);
	public static final DeferredHolder<Block, Block> CURSED_STONE_BRICKS = REGISTRY.register("cursed_stone_bricks", CursedStoneBricksBlock::new);
	public static final DeferredHolder<Block, Block> CURSED_STONE_STAIRS = REGISTRY.register("cursed_stone_stairs", CursedStoneStairsBlock::new);
	public static final DeferredHolder<Block, Block> CURSED_STONE_SLAB = REGISTRY.register("cursed_stone_slab", CursedStoneSlabBlock::new);
	public static final DeferredHolder<Block, Block> CURSED_STONE_BRICKS_STAIRS = REGISTRY.register("cursed_stone_bricks_stairs", CursedStoneBricksStairsBlock::new);
	public static final DeferredHolder<Block, Block> CURSED_STONE_BRICKS_SLAB = REGISTRY.register("cursed_stone_bricks_slab", CursedStoneBricksSlabBlock::new);
	public static final DeferredHolder<Block, Block> CURSED_STONE_WALL = REGISTRY.register("cursed_stone_wall", CursedStoneWallBlock::new);
	public static final DeferredHolder<Block, Block> CURSED_STONE_BRICKS_WALL = REGISTRY.register("cursed_stone_bricks_wall", CursedStoneBricksWallBlock::new);
	public static final DeferredHolder<Block, Block> POLISHED_CURSED_STONE = REGISTRY.register("polished_cursed_stone", PolishedCursedStoneBlock::new);
	public static final DeferredHolder<Block, Block> POLISHED_CURSED_STONE_STAIRS = REGISTRY.register("polished_cursed_stone_stairs", PolishedCursedStoneStairsBlock::new);
	public static final DeferredHolder<Block, Block> POLISHED_CURSED_STONE_SLAB = REGISTRY.register("polished_cursed_stone_slab", PolishedCursedStoneSlabBlock::new);
	public static final DeferredHolder<Block, Block> POLISHED_CURSED_STONE_WALL = REGISTRY.register("polished_cursed_stone_wall", PolishedCursedStoneWallBlock::new);
	public static final DeferredHolder<Block, Block> CURSED_STONE_PILLAR = REGISTRY.register("cursed_stone_pillar", CursedStonePillarBlock::new);
	public static final DeferredHolder<Block, Block> CURSED_LANTERN = REGISTRY.register("cursed_lantern", CursedLanternBlock::new);
	public static final DeferredHolder<Block, Block> COPYRIUM_ORE = REGISTRY.register("copyrium_ore", CopyriumOreBlock::new);
	public static final DeferredHolder<Block, Block> COPYRIUM_BLOCK = REGISTRY.register("copyrium_block", CopyriumBlockBlock::new);
	public static final DeferredHolder<Block, Block> RAW_COPYRIUM_BLOCK = REGISTRY.register("raw_copyrium_block", RawCopyriumBlockBlock::new);
	public static final DeferredHolder<Block, Block> ELEMENTAL_POWER_GENERATOR = REGISTRY.register("elemental_power_generator", ElementalPowerGeneratorBlock::new);
	public static final DeferredHolder<Block, Block> CURSED_VAULT = REGISTRY.register("cursed_vault", CursedVaultBlock::new);
	public static final DeferredHolder<Block, Block> CURSED_LADDER = REGISTRY.register("cursed_ladder", CursedLadderBlock::new);
	public static final DeferredHolder<Block, Block> CURSED_LAMP = REGISTRY.register("cursed_lamp", CursedLampBlock::new);
	public static final DeferredHolder<Block, Block> ENERGIUM_VAULT = REGISTRY.register("energium_vault", EnergiumVaultBlock::new);
	public static final DeferredHolder<Block, Block> PURPLE_MUSHROOM = REGISTRY.register("purple_mushroom", PurpleMushroomBlock::new);
	public static final DeferredHolder<Block, Block> ENERGIUM_ORE = REGISTRY.register("energium_ore", EnergiumOreBlock::new);
	public static final DeferredHolder<Block, Block> RAW_ENERGIUM_BLOCK = REGISTRY.register("raw_energium_block", RawEnergiumBlockBlock::new);
	public static final DeferredHolder<Block, Block> DEEPSLATE_DEPLETED_ENERGIUM_ORE = REGISTRY.register("deepslate_depleted_energium_ore", DeepslateDepletedEnergiumOreBlock::new);
	public static final DeferredHolder<Block, Block> DEEPSLATE_ENERGIUM_ORE = REGISTRY.register("deepslate_energium_ore", DeepslateEnergiumOreBlock::new);
	public static final DeferredHolder<Block, Block> DEEPSLATE_AMPLIFIER_ORE = REGISTRY.register("deepslate_amplifier_ore", DeepslateAmplifierOreBlock::new);
	public static final DeferredHolder<Block, Block> DEEPSLATE_COPYRIUM_ORE = REGISTRY.register("deepslate_copyrium_ore", DeepslateCopyriumOreBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
