
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.esmods.keepersofthestonestwo.KeepersOfTheStones2Mod;

public class KeepersOfTheStones2ModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KeepersOfTheStones2Mod.MODID);
	public static final RegistryObject<CreativeModeTab> STONES = REGISTRY.register("stones",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.keepers_of_the_stones_2.stones")).icon(() -> new ItemStack(KeepersOfTheStones2ModItems.FIRE_STONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KeepersOfTheStones2ModItems.FIRE_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.AIR_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.EARTH_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.WATER_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.ETHER_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.ICE_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.LIGHTNING_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.SOUND_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.CRYSTAL_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.LAVA_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.RAIN_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.TORNADO_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.OCEAN_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.PLANTS_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.ANIMALS_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.METAL_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.LIGHT_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.SHADOW_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.VACUUM_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.ENERGY_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.SUN_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.MOON_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.SPACE_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.TIME_STONE.get());
				tabData.accept(KeepersOfTheStones2ModItems.CREATION_STONE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ITEMS = REGISTRY.register("items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.keepers_of_the_stones_2.items")).icon(() -> new ItemStack(KeepersOfTheStones2ModItems.EMPTY_BATTERY.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KeepersOfTheStones2ModItems.STAR_POTION_100.get());
				tabData.accept(KeepersOfTheStones2ModItems.STAR_POTION_200.get());
				tabData.accept(KeepersOfTheStones2ModItems.STAR_POTION_500.get());
				tabData.accept(KeepersOfTheStones2ModItems.STAR_POTION_INFINITY.get());
				tabData.accept(KeepersOfTheStones2ModBlocks.KEEPERS_BOX.get().asItem());
				tabData.accept(KeepersOfTheStones2ModBlocks.DEPLETED_ENERGIUM_ORE.get().asItem());
				tabData.accept(KeepersOfTheStones2ModBlocks.DEPLETED_ENERGIUM_BLOCK.get().asItem());
				tabData.accept(KeepersOfTheStones2ModBlocks.ENERGIUM_BLOCK.get().asItem());
				tabData.accept(KeepersOfTheStones2ModBlocks.ENERGIUM_CONTROLLER.get().asItem());
				tabData.accept(KeepersOfTheStones2ModItems.RAW_DEPLETED_ENERGIUM.get());
				tabData.accept(KeepersOfTheStones2ModItems.DEPLETED_ENERGIUM_INGOT.get());
				tabData.accept(KeepersOfTheStones2ModItems.ENERGIUM_INGOT.get());
				tabData.accept(KeepersOfTheStones2ModBlocks.BATTERY_CHARGER.get().asItem());
				tabData.accept(KeepersOfTheStones2ModItems.ENERGIUM_UPGRADE_SMITHING_TEMPLATE.get());
				tabData.accept(KeepersOfTheStones2ModItems.ENERGIUM_PICKAXE.get());
				tabData.accept(KeepersOfTheStones2ModItems.ENERGIUM_AXE.get());
				tabData.accept(KeepersOfTheStones2ModItems.ENERGIUM_SWORD.get());
				tabData.accept(KeepersOfTheStones2ModItems.ENERGIUM_SHOVEL.get());
				tabData.accept(KeepersOfTheStones2ModItems.ENERGIUM_HOE.get());
				tabData.accept(KeepersOfTheStones2ModItems.ENERGIUM_ARMOR_HELMET.get());
				tabData.accept(KeepersOfTheStones2ModItems.ENERGIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(KeepersOfTheStones2ModItems.ENERGIUM_ARMOR_LEGGINGS.get());
				tabData.accept(KeepersOfTheStones2ModItems.ENERGIUM_ARMOR_BOOTS.get());
				tabData.accept(KeepersOfTheStones2ModItems.ENERGIUM_CORE.get());
				tabData.accept(KeepersOfTheStones2ModItems.EMPTY_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.FIRE_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.AIR_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.EARTH_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.WATER_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.ETHER_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.ICE_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.LIGHTNING_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.SOUND_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.CRYSTAL_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.LAVA_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.RAIN_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.TORNADO_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.OCEAN_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.PLANTS_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.ANIMALS_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.METAL_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.LIGHT_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.SHADOW_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.VACUUM_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.ENERGY_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.SUN_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.MOON_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.SPACE_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.TIME_BATTERY.get());
				tabData.accept(KeepersOfTheStones2ModItems.CREATION_BATTERY.get());
			})

					.build());
}
