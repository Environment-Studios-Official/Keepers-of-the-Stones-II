
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestones.two.init;

import ru.power_umc.keepersofthestones.two.item.WaterStoneItem;
import ru.power_umc.keepersofthestones.two.item.MagicFireballItem;
import ru.power_umc.keepersofthestones.two.item.FireSwordItem;
import ru.power_umc.keepersofthestones.two.item.FireStoneItem;
import ru.power_umc.keepersofthestones.two.item.FireArmorItem;
import ru.power_umc.keepersofthestones.two.item.EtherStoneItem;
import ru.power_umc.keepersofthestones.two.item.EarthStoneItem;
import ru.power_umc.keepersofthestones.two.item.EarthArmorItem;
import ru.power_umc.keepersofthestones.two.item.AirStoneItem;
import ru.power_umc.keepersofthestones.two.item.AirRapierItem;
import ru.power_umc.keepersofthestones.two.item.AirArmorItem;
import ru.power_umc.keepersofthestones.two.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class PowerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PowerMod.MODID);
	public static final RegistryObject<Item> FIRE_STONE = REGISTRY.register("fire_stone", () -> new FireStoneItem());
	public static final RegistryObject<Item> AIR_STONE = REGISTRY.register("air_stone", () -> new AirStoneItem());
	public static final RegistryObject<Item> EARTH_STONE = REGISTRY.register("earth_stone", () -> new EarthStoneItem());
	public static final RegistryObject<Item> WATER_STONE = REGISTRY.register("water_stone", () -> new WaterStoneItem());
	public static final RegistryObject<Item> ETHER_STONE = REGISTRY.register("ether_stone", () -> new EtherStoneItem());
	public static final RegistryObject<Item> BASIC_BOX = block(PowerModBlocks.BASIC_BOX);
	public static final RegistryObject<Item> FIRE_ARMOR_HELMET = REGISTRY.register("fire_armor_helmet", () -> new FireArmorItem.Helmet());
	public static final RegistryObject<Item> FIRE_ARMOR_CHESTPLATE = REGISTRY.register("fire_armor_chestplate", () -> new FireArmorItem.Chestplate());
	public static final RegistryObject<Item> FIRE_ARMOR_LEGGINGS = REGISTRY.register("fire_armor_leggings", () -> new FireArmorItem.Leggings());
	public static final RegistryObject<Item> FIRE_ARMOR_BOOTS = REGISTRY.register("fire_armor_boots", () -> new FireArmorItem.Boots());
	public static final RegistryObject<Item> FIRE_SWORD = REGISTRY.register("fire_sword", () -> new FireSwordItem());
	public static final RegistryObject<Item> MAGIC_FIREBALL = REGISTRY.register("magic_fireball", () -> new MagicFireballItem());
	public static final RegistryObject<Item> AIR_ARMOR_HELMET = REGISTRY.register("air_armor_helmet", () -> new AirArmorItem.Helmet());
	public static final RegistryObject<Item> AIR_ARMOR_CHESTPLATE = REGISTRY.register("air_armor_chestplate", () -> new AirArmorItem.Chestplate());
	public static final RegistryObject<Item> AIR_ARMOR_LEGGINGS = REGISTRY.register("air_armor_leggings", () -> new AirArmorItem.Leggings());
	public static final RegistryObject<Item> AIR_ARMOR_BOOTS = REGISTRY.register("air_armor_boots", () -> new AirArmorItem.Boots());
	public static final RegistryObject<Item> AIR_RAPIER = REGISTRY.register("air_rapier", () -> new AirRapierItem());
	public static final RegistryObject<Item> EARTH_ARMOR_HELMET = REGISTRY.register("earth_armor_helmet", () -> new EarthArmorItem.Helmet());
	public static final RegistryObject<Item> EARTH_ARMOR_CHESTPLATE = REGISTRY.register("earth_armor_chestplate", () -> new EarthArmorItem.Chestplate());
	public static final RegistryObject<Item> EARTH_ARMOR_LEGGINGS = REGISTRY.register("earth_armor_leggings", () -> new EarthArmorItem.Leggings());
	public static final RegistryObject<Item> EARTH_ARMOR_BOOTS = REGISTRY.register("earth_armor_boots", () -> new EarthArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
