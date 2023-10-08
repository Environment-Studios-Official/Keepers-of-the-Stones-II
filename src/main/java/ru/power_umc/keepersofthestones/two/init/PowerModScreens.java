
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestones.two.init;

import ru.power_umc.keepersofthestones.two.client.gui.WheelAbilitiesWaterScreen;
import ru.power_umc.keepersofthestones.two.client.gui.WheelAbilitiesLightningScreen;
import ru.power_umc.keepersofthestones.two.client.gui.WheelAbilitiesIceScreen;
import ru.power_umc.keepersofthestones.two.client.gui.WheelAbilitiesFireScreen;
import ru.power_umc.keepersofthestones.two.client.gui.WheelAbilitiesEtherScreen;
import ru.power_umc.keepersofthestones.two.client.gui.WheelAbilitiesEarthScreen;
import ru.power_umc.keepersofthestones.two.client.gui.WheelAbilitiesAirScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PowerModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PowerModMenus.WHEEL_ABILITIES_FIRE.get(), WheelAbilitiesFireScreen::new);
			MenuScreens.register(PowerModMenus.WHEEL_ABILITIES_AIR.get(), WheelAbilitiesAirScreen::new);
			MenuScreens.register(PowerModMenus.WHEEL_ABILITIES_WATER.get(), WheelAbilitiesWaterScreen::new);
			MenuScreens.register(PowerModMenus.WHEEL_ABILITIES_EARTH.get(), WheelAbilitiesEarthScreen::new);
			MenuScreens.register(PowerModMenus.WHEEL_ABILITIES_ETHER.get(), WheelAbilitiesEtherScreen::new);
			MenuScreens.register(PowerModMenus.WHEEL_ABILITIES_ICE.get(), WheelAbilitiesIceScreen::new);
			MenuScreens.register(PowerModMenus.WHEEL_ABILITIES_LIGHTNING.get(), WheelAbilitiesLightningScreen::new);
		});
	}
}
