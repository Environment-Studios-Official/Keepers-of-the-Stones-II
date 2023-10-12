
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestones.two.init;

import ru.power_umc.keepersofthestones.two.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
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
				tabData.accept(PowerModItems.LIGHT_STONE.get());
				tabData.accept(PowerModItems.SHADOW_STONE.get());
				tabData.accept(PowerModItems.VACUUM_STONE.get());
				tabData.accept(PowerModItems.ENERGY_STONE.get());
				tabData.accept(PowerModItems.SUN_STONE.get());
				tabData.accept(PowerModItems.MOON_STONE.get());
				tabData.accept(PowerModItems.SPACE_STONE.get());
				tabData.accept(PowerModItems.TIME_STONE.get());
				tabData.accept(PowerModItems.BLOOD_STONE.get());
				tabData.accept(PowerModItems.TECHNOLOGY_STONE.get());
				tabData.accept(PowerModItems.TELEPORTATION_STONE.get());
				tabData.accept(PowerModItems.EXPLOSION_STONE.get());
				tabData.accept(PowerModItems.AMBER_STONE.get());
				tabData.accept(PowerModItems.CREATION_STONE.get());
				tabData.accept(PowerModItems.DESTRUCTION_STONE.get());
				tabData.accept(PowerModItems.MIST_STONE.get());
				tabData.accept(PowerModItems.SAND_STONE.get());
				tabData.accept(PowerModItems.SPEED_STONE.get());
				tabData.accept(PowerModItems.POISON_STONE.get());
				tabData.accept(PowerModItems.MAGNET_STONE.get());
				tabData.accept(PowerModItems.MUSHROOMS_STONE.get());
				tabData.accept(PowerModItems.MERCURY_STONE.get());
				tabData.accept(PowerModItems.MUSIC_STONE.get());
				tabData.accept(PowerModItems.PLAGUE_STONE.get());
				tabData.accept(PowerModItems.BLUE_FLAME_STONE.get());
				tabData.accept(PowerModItems.GRAVITY_STONE.get());
				tabData.accept(PowerModItems.SMOKE_STONE.get());
				tabData.accept(PowerModItems.SPIRIT_STONE.get());
				tabData.accept(PowerModItems.FORM_STONE.get());
				tabData.accept(PowerModItems.MIND_STONE.get());
				tabData.accept(PowerModItems.GOLDEN_DUST_STONE.get());
				tabData.accept(PowerModItems.DARKNESS_STONE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> BOXES = REGISTRY.register("boxes",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.power.boxes")).icon(() -> new ItemStack(PowerModBlocks.BASIC_BOX.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PowerModBlocks.BASIC_BOX.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(PowerModItems.EARTH_SHIELD.get());
		}
	}
}
