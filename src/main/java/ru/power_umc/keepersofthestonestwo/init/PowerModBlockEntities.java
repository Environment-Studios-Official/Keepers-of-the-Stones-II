
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import ru.power_umc.keepersofthestonestwo.block.entity.KeepersBoxBlockEntity;
import ru.power_umc.keepersofthestonestwo.block.entity.BatteryChargerBlockEntity;
import ru.power_umc.keepersofthestonestwo.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class PowerModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, PowerMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> KEEPERS_BOX = register("keepers_box", PowerModBlocks.KEEPERS_BOX, KeepersBoxBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BATTERY_CHARGER = register("battery_charger", PowerModBlocks.BATTERY_CHARGER, BatteryChargerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
