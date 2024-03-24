
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import com.esmods.keepersofthestonestwo.block.entity.KeepersBoxBlockEntity;
import com.esmods.keepersofthestonestwo.block.entity.BatteryChargerBlockEntity;
import com.esmods.keepersofthestonestwo.KeepersOfTheStones2Mod;

public class KeepersOfTheStones2ModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, KeepersOfTheStones2Mod.MODID);
	public static final RegistryObject<BlockEntityType<?>> KEEPERS_BOX = register("keepers_box", KeepersOfTheStones2ModBlocks.KEEPERS_BOX, KeepersBoxBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BATTERY_CHARGER = register("battery_charger", KeepersOfTheStones2ModBlocks.BATTERY_CHARGER, BatteryChargerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
