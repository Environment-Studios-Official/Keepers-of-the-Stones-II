
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestones.two.init;

import ru.power_umc.keepersofthestones.two.world.inventory.WheelAbilitiesWaterMenu;
import ru.power_umc.keepersofthestones.two.world.inventory.WheelAbilitiesFireMenu;
import ru.power_umc.keepersofthestones.two.world.inventory.WheelAbilitiesEarthMenu;
import ru.power_umc.keepersofthestones.two.world.inventory.WheelAbilitiesAirMenu;
import ru.power_umc.keepersofthestones.two.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class PowerModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PowerMod.MODID);
	public static final RegistryObject<MenuType<WheelAbilitiesFireMenu>> WHEEL_ABILITIES_FIRE = REGISTRY.register("wheel_abilities_fire", () -> IForgeMenuType.create(WheelAbilitiesFireMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesAirMenu>> WHEEL_ABILITIES_AIR = REGISTRY.register("wheel_abilities_air", () -> IForgeMenuType.create(WheelAbilitiesAirMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesEarthMenu>> WHEEL_ABILITIES_EARTH = REGISTRY.register("wheel_abilities_earth", () -> IForgeMenuType.create(WheelAbilitiesEarthMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesWaterMenu>> WHEEL_ABILITIES_WATER = REGISTRY.register("wheel_abilities_water", () -> IForgeMenuType.create(WheelAbilitiesWaterMenu::new));
}
