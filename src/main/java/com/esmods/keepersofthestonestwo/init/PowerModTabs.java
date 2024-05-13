
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

import com.esmods.keepersofthestonestwo.PowerMod;

public class PowerModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PowerMod.MODID);
	public static final RegistryObject<CreativeModeTab> ITEMS = REGISTRY.register("items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.power.items")).icon(() -> new ItemStack(PowerModItems.EMPTY_BATTERY.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PowerModBlocks.AMPLIFIER_ORE.get().asItem());
				tabData.accept(PowerModBlocks.RAW_AMPLIFIER_BLOCK.get().asItem());
				tabData.accept(PowerModBlocks.AMPLIFIER_BLOCK.get().asItem());
				tabData.accept(PowerModItems.RAW_AMPLIFIER.get());
				tabData.accept(PowerModItems.AMPLIFIER_DROP.get());
				tabData.accept(PowerModItems.STAR_POTION_25.get());
				tabData.accept(PowerModItems.STAR_POTION_50.get());
				tabData.accept(PowerModItems.STAR_POTION_100.get());
				tabData.accept(PowerModItems.STAR_POTION_INFINITY.get());
				tabData.accept(PowerModBlocks.KEEPERS_BOX.get().asItem());
				tabData.accept(PowerModBlocks.DEPLETED_ENERGIUM_ORE.get().asItem());
				tabData.accept(PowerModBlocks.RAW_DEPLETED_ENERGIUM_BLOCK.get().asItem());
				tabData.accept(PowerModBlocks.DEPLETED_ENERGIUM_BLOCK.get().asItem());
				tabData.accept(PowerModBlocks.ENERGIUM_BLOCK.get().asItem());
				tabData.accept(PowerModBlocks.ENERGIUM_CONTROLLER.get().asItem());
				tabData.accept(PowerModItems.RAW_DEPLETED_ENERGIUM.get());
				tabData.accept(PowerModItems.DEPLETED_ENERGIUM_INGOT.get());
				tabData.accept(PowerModItems.ENERGIUM_INGOT.get());
				tabData.accept(PowerModBlocks.BATTERY_CHARGER.get().asItem());
				tabData.accept(PowerModItems.ENERGIUM_UPGRADE_SMITHING_TEMPLATE.get());
				tabData.accept(PowerModItems.ENERGIUM_PICKAXE.get());
				tabData.accept(PowerModItems.ENERGIUM_AXE.get());
				tabData.accept(PowerModItems.ENERGIUM_SWORD.get());
				tabData.accept(PowerModItems.ENERGIUM_SHOVEL.get());
				tabData.accept(PowerModItems.ENERGIUM_HOE.get());
				tabData.accept(PowerModItems.ENERGIUM_ARMOR_HELMET.get());
				tabData.accept(PowerModItems.ENERGIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(PowerModItems.ENERGIUM_ARMOR_LEGGINGS.get());
				tabData.accept(PowerModItems.ENERGIUM_ARMOR_BOOTS.get());
				tabData.accept(PowerModItems.ENERGIUM_CORE.get());
				tabData.accept(PowerModItems.EMPTY_BATTERY.get());
				tabData.accept(PowerModItems.FIRE_BATTERY.get());
				tabData.accept(PowerModItems.AIR_BATTERY.get());
				tabData.accept(PowerModItems.EARTH_BATTERY.get());
				tabData.accept(PowerModItems.WATER_BATTERY.get());
				tabData.accept(PowerModItems.ETHER_BATTERY.get());
				tabData.accept(PowerModItems.ICE_BATTERY.get());
				tabData.accept(PowerModItems.LIGHTNING_BATTERY.get());
				tabData.accept(PowerModItems.SOUND_BATTERY.get());
				tabData.accept(PowerModItems.CRYSTAL_BATTERY.get());
				tabData.accept(PowerModItems.LAVA_BATTERY.get());
				tabData.accept(PowerModItems.RAIN_BATTERY.get());
				tabData.accept(PowerModItems.TORNADO_BATTERY.get());
				tabData.accept(PowerModItems.OCEAN_BATTERY.get());
				tabData.accept(PowerModItems.PLANTS_BATTERY.get());
				tabData.accept(PowerModItems.ANIMALS_BATTERY.get());
				tabData.accept(PowerModItems.METAL_BATTERY.get());
				tabData.accept(PowerModItems.LIGHT_BATTERY.get());
				tabData.accept(PowerModItems.SHADOW_BATTERY.get());
				tabData.accept(PowerModItems.VACUUM_BATTERY.get());
				tabData.accept(PowerModItems.ENERGY_BATTERY.get());
				tabData.accept(PowerModItems.SUN_BATTERY.get());
				tabData.accept(PowerModItems.MOON_BATTERY.get());
				tabData.accept(PowerModItems.SPACE_BATTERY.get());
				tabData.accept(PowerModItems.TIME_BATTERY.get());
				tabData.accept(PowerModItems.CREATION_BATTERY.get());
				tabData.accept(PowerModItems.DESTRUCTION_BATTERY.get());
				tabData.accept(PowerModItems.BLOOD_BATTERY.get());
				tabData.accept(PowerModItems.TECHNOLOGY_BATTERY.get());
				tabData.accept(PowerModItems.TELEPORTATION_BATTERY.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> STONES = REGISTRY.register("stones",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.power.stones")).icon(() -> new ItemStack(PowerModItems.FIRE_STONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PowerModItems.FIRE_STONE.get());
				tabData.accept(PowerModItems.AIR_STONE.get());
				tabData.accept(PowerModItems.EARTH_STONE.get());
				tabData.accept(PowerModItems.WATER_STONE.get());
				tabData.accept(PowerModItems.ETHER_STONE.get());
				tabData.accept(PowerModItems.ICE_STONE.get());
				tabData.accept(PowerModItems.LIGHTNING_STONE.get());
				tabData.accept(PowerModItems.SOUND_STONE.get());
				tabData.accept(PowerModItems.CRYSTAL_STONE.get());
				tabData.accept(PowerModItems.LAVA_STONE.get());
				tabData.accept(PowerModItems.RAIN_STONE.get());
				tabData.accept(PowerModItems.TORNADO_STONE.get());
				tabData.accept(PowerModItems.OCEAN_STONE.get());
				tabData.accept(PowerModItems.PLANTS_STONE.get());
				tabData.accept(PowerModItems.ANIMALS_STONE.get());
				tabData.accept(PowerModItems.METAL_STONE.get());
				tabData.accept(PowerModItems.LIGHT_STONE.get());
				tabData.accept(PowerModItems.SHADOW_STONE.get());
				tabData.accept(PowerModItems.VACUUM_STONE.get());
				tabData.accept(PowerModItems.ENERGY_STONE.get());
				tabData.accept(PowerModItems.SUN_STONE.get());
				tabData.accept(PowerModItems.MOON_STONE.get());
				tabData.accept(PowerModItems.SPACE_STONE.get());
				tabData.accept(PowerModItems.TIME_STONE.get());
				tabData.accept(PowerModItems.CREATION_STONE.get());
				tabData.accept(PowerModItems.DESTRUCTION_STONE.get());
				tabData.accept(PowerModItems.BLOOD_STONE.get());
				tabData.accept(PowerModItems.TECHNOLOGY_STONE.get());
				tabData.accept(PowerModItems.TELEPORTATION_STONE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> MOBS = REGISTRY.register("mobs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.power.mobs")).icon(() -> new ItemStack(PowerModItems.ENERGIUM_GOLEM_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PowerModItems.ENERGIUM_GOLEM_SPAWN_EGG.get());
			})

					.build());
}
