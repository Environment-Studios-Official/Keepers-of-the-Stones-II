
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesWaterMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesTornadoMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesSoundMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesRainMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesOceanMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesLightningMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesLavaMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesIceMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesFireMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesEtherMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesEarthMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesCrystalMenu;
import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesAirMenu;
import ru.power_umc.keepersofthestonestwo.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class PowerModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PowerMod.MODID);
	public static final RegistryObject<MenuType<WheelAbilitiesFireMenu>> WHEEL_ABILITIES_FIRE = REGISTRY.register("wheel_abilities_fire", () -> IForgeMenuType.create(WheelAbilitiesFireMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesAirMenu>> WHEEL_ABILITIES_AIR = REGISTRY.register("wheel_abilities_air", () -> IForgeMenuType.create(WheelAbilitiesAirMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesWaterMenu>> WHEEL_ABILITIES_WATER = REGISTRY.register("wheel_abilities_water", () -> IForgeMenuType.create(WheelAbilitiesWaterMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesEarthMenu>> WHEEL_ABILITIES_EARTH = REGISTRY.register("wheel_abilities_earth", () -> IForgeMenuType.create(WheelAbilitiesEarthMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesEtherMenu>> WHEEL_ABILITIES_ETHER = REGISTRY.register("wheel_abilities_ether", () -> IForgeMenuType.create(WheelAbilitiesEtherMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesLightningMenu>> WHEEL_ABILITIES_LIGHTNING = REGISTRY.register("wheel_abilities_lightning", () -> IForgeMenuType.create(WheelAbilitiesLightningMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesSoundMenu>> WHEEL_ABILITIES_SOUND = REGISTRY.register("wheel_abilities_sound", () -> IForgeMenuType.create(WheelAbilitiesSoundMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesCrystalMenu>> WHEEL_ABILITIES_CRYSTAL = REGISTRY.register("wheel_abilities_crystal", () -> IForgeMenuType.create(WheelAbilitiesCrystalMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesLavaMenu>> WHEEL_ABILITIES_LAVA = REGISTRY.register("wheel_abilities_lava", () -> IForgeMenuType.create(WheelAbilitiesLavaMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesIceMenu>> WHEEL_ABILITIES_ICE = REGISTRY.register("wheel_abilities_ice", () -> IForgeMenuType.create(WheelAbilitiesIceMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesRainMenu>> WHEEL_ABILITIES_RAIN = REGISTRY.register("wheel_abilities_rain", () -> IForgeMenuType.create(WheelAbilitiesRainMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesTornadoMenu>> WHEEL_ABILITIES_TORNADO = REGISTRY.register("wheel_abilities_tornado", () -> IForgeMenuType.create(WheelAbilitiesTornadoMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesOceanMenu>> WHEEL_ABILITIES_OCEAN = REGISTRY.register("wheel_abilities_ocean", () -> IForgeMenuType.create(WheelAbilitiesOceanMenu::new));
}
