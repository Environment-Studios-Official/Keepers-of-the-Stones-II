
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestones.two.init;

import ru.power_umc.keepersofthestones.two.item.WaterStoneItem;
import ru.power_umc.keepersofthestones.two.item.FireStoneItem;
import ru.power_umc.keepersofthestones.two.item.EtherStoneItem;
import ru.power_umc.keepersofthestones.two.item.EarthStoneItem;
import ru.power_umc.keepersofthestones.two.item.AirStoneItem;
import ru.power_umc.keepersofthestones.two.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class PowerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PowerMod.MODID);
	public static final RegistryObject<Item> FIRE_STONE = REGISTRY.register("fire_stone", () -> new FireStoneItem());
	public static final RegistryObject<Item> AIR_STONE = REGISTRY.register("air_stone", () -> new AirStoneItem());
	public static final RegistryObject<Item> EARTH_STONE = REGISTRY.register("earth_stone", () -> new EarthStoneItem());
	public static final RegistryObject<Item> WATER_STONE = REGISTRY.register("water_stone", () -> new WaterStoneItem());
	public static final RegistryObject<Item> ETHER_STONE = REGISTRY.register("ether_stone", () -> new EtherStoneItem());
}
