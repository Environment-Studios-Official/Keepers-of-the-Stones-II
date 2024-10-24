
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import com.esmods.keepersofthestonestwo.world.inventory.WheelAbiltiesGoldenDustMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilityDarknessMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesWaterMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesVacuumMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesTornadoMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesTimeMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesTeleportationMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesTechnologyMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesSunMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesSpiritMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesSpeedMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesSpaceMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesSoundMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesSmokeMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesShadowMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesSandMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesRainMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesPoisonMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesPlantsMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesPlagueMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesOceanMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesMusicMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesMushroomsMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesMoonMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesMistMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesMindMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesMetalMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesMercuryMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesMagnetMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesLightningMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesLightMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesLavaMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesIceMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesGravityMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesFormMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesFireMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesExplosionMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesEtherMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesEnergyMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesEarthMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesDestructionMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesCrystalMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesCreationMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesBlueFlameMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesBloodMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesAnimalsMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesAmberMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesAirMenu;
import com.esmods.keepersofthestonestwo.world.inventory.KeepersBoxGUIPart4Menu;
import com.esmods.keepersofthestonestwo.world.inventory.KeepersBoxGUIPart3Menu;
import com.esmods.keepersofthestonestwo.world.inventory.KeepersBoxGUIPart2Menu;
import com.esmods.keepersofthestonestwo.world.inventory.KeepersBoxGUIPart1Menu;
import com.esmods.keepersofthestonestwo.world.inventory.BatteryChargerGUIMenu;
import com.esmods.keepersofthestonestwo.PowerMod;

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
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesEnergyMenu>> WHEEL_ABILITIES_ENERGY = REGISTRY.register("wheel_abilities_energy", () -> IMenuTypeExtension.create(WheelAbilitiesEnergyMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesSunMenu>> WHEEL_ABILITIES_SUN = REGISTRY.register("wheel_abilities_sun", () -> IMenuTypeExtension.create(WheelAbilitiesSunMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesMoonMenu>> WHEEL_ABILITIES_MOON = REGISTRY.register("wheel_abilities_moon", () -> IMenuTypeExtension.create(WheelAbilitiesMoonMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesSpaceMenu>> WHEEL_ABILITIES_SPACE = REGISTRY.register("wheel_abilities_space", () -> IMenuTypeExtension.create(WheelAbilitiesSpaceMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesTimeMenu>> WHEEL_ABILITIES_TIME = REGISTRY.register("wheel_abilities_time", () -> IMenuTypeExtension.create(WheelAbilitiesTimeMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesCreationMenu>> WHEEL_ABILITIES_CREATION = REGISTRY.register("wheel_abilities_creation", () -> IMenuTypeExtension.create(WheelAbilitiesCreationMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<KeepersBoxGUIPart1Menu>> KEEPERS_BOX_GUI_PART_1 = REGISTRY.register("keepers_box_gui_part_1", () -> IMenuTypeExtension.create(KeepersBoxGUIPart1Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<KeepersBoxGUIPart2Menu>> KEEPERS_BOX_GUI_PART_2 = REGISTRY.register("keepers_box_gui_part_2", () -> IMenuTypeExtension.create(KeepersBoxGUIPart2Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<KeepersBoxGUIPart3Menu>> KEEPERS_BOX_GUI_PART_3 = REGISTRY.register("keepers_box_gui_part_3", () -> IMenuTypeExtension.create(KeepersBoxGUIPart3Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<KeepersBoxGUIPart4Menu>> KEEPERS_BOX_GUI_PART_4 = REGISTRY.register("keepers_box_gui_part_4", () -> IMenuTypeExtension.create(KeepersBoxGUIPart4Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesDestructionMenu>> WHEEL_ABILITIES_DESTRUCTION = REGISTRY.register("wheel_abilities_destruction", () -> IMenuTypeExtension.create(WheelAbilitiesDestructionMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesBloodMenu>> WHEEL_ABILITIES_BLOOD = REGISTRY.register("wheel_abilities_blood", () -> IMenuTypeExtension.create(WheelAbilitiesBloodMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesTechnologyMenu>> WHEEL_ABILITIES_TECHNOLOGY = REGISTRY.register("wheel_abilities_technology", () -> IMenuTypeExtension.create(WheelAbilitiesTechnologyMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesTeleportationMenu>> WHEEL_ABILITIES_TELEPORTATION = REGISTRY.register("wheel_abilities_teleportation", () -> IMenuTypeExtension.create(WheelAbilitiesTeleportationMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesExplosionMenu>> WHEEL_ABILITIES_EXPLOSION = REGISTRY.register("wheel_abilities_explosion", () -> IMenuTypeExtension.create(WheelAbilitiesExplosionMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesAmberMenu>> WHEEL_ABILITIES_AMBER = REGISTRY.register("wheel_abilities_amber", () -> IMenuTypeExtension.create(WheelAbilitiesAmberMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesMistMenu>> WHEEL_ABILITIES_MIST = REGISTRY.register("wheel_abilities_mist", () -> IMenuTypeExtension.create(WheelAbilitiesMistMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesSandMenu>> WHEEL_ABILITIES_SAND = REGISTRY.register("wheel_abilities_sand", () -> IMenuTypeExtension.create(WheelAbilitiesSandMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesSpeedMenu>> WHEEL_ABILITIES_SPEED = REGISTRY.register("wheel_abilities_speed", () -> IMenuTypeExtension.create(WheelAbilitiesSpeedMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesPoisonMenu>> WHEEL_ABILITIES_POISON = REGISTRY.register("wheel_abilities_poison", () -> IMenuTypeExtension.create(WheelAbilitiesPoisonMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesMagnetMenu>> WHEEL_ABILITIES_MAGNET = REGISTRY.register("wheel_abilities_magnet", () -> IMenuTypeExtension.create(WheelAbilitiesMagnetMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesMushroomsMenu>> WHEEL_ABILITIES_MUSHROOMS = REGISTRY.register("wheel_abilities_mushrooms", () -> IMenuTypeExtension.create(WheelAbilitiesMushroomsMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesMercuryMenu>> WHEEL_ABILITIES_MERCURY = REGISTRY.register("wheel_abilities_mercury", () -> IMenuTypeExtension.create(WheelAbilitiesMercuryMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesMusicMenu>> WHEEL_ABILITIES_MUSIC = REGISTRY.register("wheel_abilities_music", () -> IMenuTypeExtension.create(WheelAbilitiesMusicMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesPlagueMenu>> WHEEL_ABILITIES_PLAGUE = REGISTRY.register("wheel_abilities_plague", () -> IMenuTypeExtension.create(WheelAbilitiesPlagueMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesBlueFlameMenu>> WHEEL_ABILITIES_BLUE_FLAME = REGISTRY.register("wheel_abilities_blue_flame", () -> IMenuTypeExtension.create(WheelAbilitiesBlueFlameMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesGravityMenu>> WHEEL_ABILITIES_GRAVITY = REGISTRY.register("wheel_abilities_gravity", () -> IMenuTypeExtension.create(WheelAbilitiesGravityMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesSmokeMenu>> WHEEL_ABILITIES_SMOKE = REGISTRY.register("wheel_abilities_smoke", () -> IMenuTypeExtension.create(WheelAbilitiesSmokeMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesSpiritMenu>> WHEEL_ABILITIES_SPIRIT = REGISTRY.register("wheel_abilities_spirit", () -> IMenuTypeExtension.create(WheelAbilitiesSpiritMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesFormMenu>> WHEEL_ABILITIES_FORM = REGISTRY.register("wheel_abilities_form", () -> IMenuTypeExtension.create(WheelAbilitiesFormMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilitiesMindMenu>> WHEEL_ABILITIES_MIND = REGISTRY.register("wheel_abilities_mind", () -> IMenuTypeExtension.create(WheelAbilitiesMindMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BatteryChargerGUIMenu>> BATTERY_CHARGER_GUI = REGISTRY.register("battery_charger_gui", () -> IMenuTypeExtension.create(BatteryChargerGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbiltiesGoldenDustMenu>> WHEEL_ABILTIES_GOLDEN_DUST = REGISTRY.register("wheel_abilties_golden_dust", () -> IMenuTypeExtension.create(WheelAbiltiesGoldenDustMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WheelAbilityDarknessMenu>> WHEEL_ABILITY_DARKNESS = REGISTRY.register("wheel_ability_darkness", () -> IMenuTypeExtension.create(WheelAbilityDarknessMenu::new));
}
