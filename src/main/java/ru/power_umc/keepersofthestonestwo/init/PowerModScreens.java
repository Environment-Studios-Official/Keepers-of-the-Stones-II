
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesWaterScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesVacuumScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesTornadoScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesSunScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesSoundScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesShadowScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesRainScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesPlantsScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesOceanScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesMetalScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesLightningScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesLightScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesLavaScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesIceScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesFireScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesEtherScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesEnergyScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesEarthScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesCrystalScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesAnimalsScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.WheelAbilitiesAirScreen;
import ru.power_umc.keepersofthestonestwo.client.gui.BatteryChargerGUIScreen;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PowerModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(PowerModMenus.WHEEL_ABILITIES_FIRE.get(), WheelAbilitiesFireScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_AIR.get(), WheelAbilitiesAirScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_WATER.get(), WheelAbilitiesWaterScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_EARTH.get(), WheelAbilitiesEarthScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_ETHER.get(), WheelAbilitiesEtherScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_LIGHTNING.get(), WheelAbilitiesLightningScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_SOUND.get(), WheelAbilitiesSoundScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_CRYSTAL.get(), WheelAbilitiesCrystalScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_LAVA.get(), WheelAbilitiesLavaScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_ICE.get(), WheelAbilitiesIceScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_RAIN.get(), WheelAbilitiesRainScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_TORNADO.get(), WheelAbilitiesTornadoScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_OCEAN.get(), WheelAbilitiesOceanScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_PLANTS.get(), WheelAbilitiesPlantsScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_ANIMALS.get(), WheelAbilitiesAnimalsScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_METAL.get(), WheelAbilitiesMetalScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_LIGHT.get(), WheelAbilitiesLightScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_SHADOW.get(), WheelAbilitiesShadowScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_VACUUM.get(), WheelAbilitiesVacuumScreen::new);
		event.register(PowerModMenus.BATTERY_CHARGER_GUI.get(), BatteryChargerGUIScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_ENERGY.get(), WheelAbilitiesEnergyScreen::new);
		event.register(PowerModMenus.WHEEL_ABILITIES_SUN.get(), WheelAbilitiesSunScreen::new);
	}
}
