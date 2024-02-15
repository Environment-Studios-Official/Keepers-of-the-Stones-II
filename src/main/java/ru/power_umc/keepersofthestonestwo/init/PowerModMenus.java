
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesWaterMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesVacuumMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesTornadoMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesSunMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesSoundMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesShadowMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesRainMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesPlantsMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesOceanMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesMetalMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesLightningMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesLightMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesLavaMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesIceMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesFireMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesEtherMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesEnergyMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesEarthMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesCrystalMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesAnimalsMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesAirMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.BatteryChargerGUIMenu;
import ru.power_umc.keepersofthestonestwo.PowerMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

public class PowerModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, PowerMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesFireMenu>> WHEEL_ABILITIES_FIRE = REGISTRY.register("wheel_abilities_fire", () -> IMenuTypeExtension.create(WheelAbilitiesFireMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesAirMenu>> WHEEL_ABILITIES_AIR = REGISTRY.register("wheel_abilities_air", () -> IMenuTypeExtension.create(WheelAbilitiesAirMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesWaterMenu>> WHEEL_ABILITIES_WATER = REGISTRY.register("wheel_abilities_water", () -> IMenuTypeExtension.create(WheelAbilitiesWaterMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesEarthMenu>> WHEEL_ABILITIES_EARTH = REGISTRY.register("wheel_abilities_earth", () -> IMenuTypeExtension.create(WheelAbilitiesEarthMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesEtherMenu>> WHEEL_ABILITIES_ETHER = REGISTRY.register("wheel_abilities_ether", () -> IMenuTypeExtension.create(WheelAbilitiesEtherMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesLightningMenu>> WHEEL_ABILITIES_LIGHTNING = REGISTRY.register("wheel_abilities_lightning", () -> IMenuTypeExtension.create(WheelAbilitiesLightningMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesSoundMenu>> WHEEL_ABILITIES_SOUND = REGISTRY.register("wheel_abilities_sound", () -> IMenuTypeExtension.create(WheelAbilitiesSoundMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesCrystalMenu>> WHEEL_ABILITIES_CRYSTAL = REGISTRY.register("wheel_abilities_crystal", () -> IMenuTypeExtension.create(WheelAbilitiesCrystalMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesLavaMenu>> WHEEL_ABILITIES_LAVA = REGISTRY.register("wheel_abilities_lava", () -> IMenuTypeExtension.create(WheelAbilitiesLavaMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesIceMenu>> WHEEL_ABILITIES_ICE = REGISTRY.register("wheel_abilities_ice", () -> IMenuTypeExtension.create(WheelAbilitiesIceMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesRainMenu>> WHEEL_ABILITIES_RAIN = REGISTRY.register("wheel_abilities_rain", () -> IMenuTypeExtension.create(WheelAbilitiesRainMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesTornadoMenu>> WHEEL_ABILITIES_TORNADO = REGISTRY.register("wheel_abilities_tornado", () -> IMenuTypeExtension.create(WheelAbilitiesTornadoMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesOceanMenu>> WHEEL_ABILITIES_OCEAN = REGISTRY.register("wheel_abilities_ocean", () -> IMenuTypeExtension.create(WheelAbilitiesOceanMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesPlantsMenu>> WHEEL_ABILITIES_PLANTS = REGISTRY.register("wheel_abilities_plants", () -> IMenuTypeExtension.create(WheelAbilitiesPlantsMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesAnimalsMenu>> WHEEL_ABILITIES_ANIMALS = REGISTRY.register("wheel_abilities_animals", () -> IMenuTypeExtension.create(WheelAbilitiesAnimalsMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesMetalMenu>> WHEEL_ABILITIES_METAL = REGISTRY.register("wheel_abilities_metal", () -> IMenuTypeExtension.create(WheelAbilitiesMetalMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesLightMenu>> WHEEL_ABILITIES_LIGHT = REGISTRY.register("wheel_abilities_light", () -> IMenuTypeExtension.create(WheelAbilitiesLightMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesShadowMenu>> WHEEL_ABILITIES_SHADOW = REGISTRY.register("wheel_abilities_shadow", () -> IMenuTypeExtension.create(WheelAbilitiesShadowMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesVacuumMenu>> WHEEL_ABILITIES_VACUUM = REGISTRY.register("wheel_abilities_vacuum", () -> IMenuTypeExtension.create(WheelAbilitiesVacuumMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BatteryChargerGUIMenu>> BATTERY_CHARGER_GUI = REGISTRY.register("battery_charger_gui", () -> IMenuTypeExtension.create(BatteryChargerGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesEnergyMenu>> WHEEL_ABILITIES_ENERGY = REGISTRY.register("wheel_abilities_energy", () -> IMenuTypeExtension.create(WheelAbilitiesEnergyMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesSunMenu>> WHEEL_ABILITIES_SUN = REGISTRY.register("wheel_abilities_sun", () -> IMenuTypeExtension.create(WheelAbilitiesSunMenu::new));
}
