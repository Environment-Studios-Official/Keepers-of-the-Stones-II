
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import ru.power_umc.keepersofthestonestwo.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class PowerModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PowerMod.MODID);
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
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ITEMS = REGISTRY.register("items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.power.items")).icon(() -> new ItemStack(PowerModItems.EMPTY_BATTERY.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PowerModItems.EMPTY_BATTERY.get());
			})

					.build());
}
