
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestones.two.init;

import ru.power_umc.keepersofthestones.two.item.WaterStoneItem;
import ru.power_umc.keepersofthestones.two.item.WaterKatanaItem;
import ru.power_umc.keepersofthestones.two.item.WaterAttackItem;
import ru.power_umc.keepersofthestones.two.item.WaterArmorItem;
import ru.power_umc.keepersofthestones.two.item.StoneAttackItem;
import ru.power_umc.keepersofthestones.two.item.MagicFireballItem;
import ru.power_umc.keepersofthestones.two.item.LightningStoneItem;
import ru.power_umc.keepersofthestones.two.item.LightningArmorItem;
import ru.power_umc.keepersofthestones.two.item.IceStoneItem;
import ru.power_umc.keepersofthestones.two.item.IceArmorItem;
import ru.power_umc.keepersofthestones.two.item.GrassBlockAttackItem;
import ru.power_umc.keepersofthestones.two.item.FireSwordItem;
import ru.power_umc.keepersofthestones.two.item.FireStoneItem;
import ru.power_umc.keepersofthestones.two.item.FireArmorItem;
import ru.power_umc.keepersofthestones.two.item.EtherStoneItem;
import ru.power_umc.keepersofthestones.two.item.EtherGlaiveItem;
import ru.power_umc.keepersofthestones.two.item.EtherAttackItem;
import ru.power_umc.keepersofthestones.two.item.EtherArmorItem;
import ru.power_umc.keepersofthestones.two.item.EarthStoneItem;
import ru.power_umc.keepersofthestones.two.item.EarthShieldItem;
import ru.power_umc.keepersofthestones.two.item.EarthHammerItem;
import ru.power_umc.keepersofthestones.two.item.EarthArmorItem;
import ru.power_umc.keepersofthestones.two.item.DirtBlockAttackItem;
import ru.power_umc.keepersofthestones.two.item.CobblestoneAttackItem;
import ru.power_umc.keepersofthestones.two.item.CobbledDeepslateAttackItem;
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
	public static final RegistryObject<Item> STONE_ATTACK = REGISTRY.register("stone_attack", () -> new StoneAttackItem());
	public static final RegistryObject<Item> GRASS_BLOCK_ATTACK = REGISTRY.register("grass_block_attack", () -> new GrassBlockAttackItem());
	public static final RegistryObject<Item> DIRT_BLOCK_ATTACK = REGISTRY.register("dirt_block_attack", () -> new DirtBlockAttackItem());
	public static final RegistryObject<Item> COBBLESTONE_ATTACK = REGISTRY.register("cobblestone_attack", () -> new CobblestoneAttackItem());
	public static final RegistryObject<Item> COBBLED_DEEPSLATE_ATTACK = REGISTRY.register("cobbled_deepslate_attack", () -> new CobbledDeepslateAttackItem());
	public static final RegistryObject<Item> EARTH_HAMMER = REGISTRY.register("earth_hammer", () -> new EarthHammerItem());
	public static final RegistryObject<Item> WATER_KATANA = REGISTRY.register("water_katana", () -> new WaterKatanaItem());
	public static final RegistryObject<Item> WATER_ARMOR_HELMET = REGISTRY.register("water_armor_helmet", () -> new WaterArmorItem.Helmet());
	public static final RegistryObject<Item> WATER_ARMOR_CHESTPLATE = REGISTRY.register("water_armor_chestplate", () -> new WaterArmorItem.Chestplate());
	public static final RegistryObject<Item> WATER_ARMOR_LEGGINGS = REGISTRY.register("water_armor_leggings", () -> new WaterArmorItem.Leggings());
	public static final RegistryObject<Item> WATER_ARMOR_BOOTS = REGISTRY.register("water_armor_boots", () -> new WaterArmorItem.Boots());
	public static final RegistryObject<Item> ETHER_GLAIVE = REGISTRY.register("ether_glaive", () -> new EtherGlaiveItem());
	public static final RegistryObject<Item> ETHER_ARMOR_HELMET = REGISTRY.register("ether_armor_helmet", () -> new EtherArmorItem.Helmet());
	public static final RegistryObject<Item> ETHER_ARMOR_CHESTPLATE = REGISTRY.register("ether_armor_chestplate", () -> new EtherArmorItem.Chestplate());
	public static final RegistryObject<Item> ETHER_ARMOR_LEGGINGS = REGISTRY.register("ether_armor_leggings", () -> new EtherArmorItem.Leggings());
	public static final RegistryObject<Item> ETHER_ARMOR_BOOTS = REGISTRY.register("ether_armor_boots", () -> new EtherArmorItem.Boots());
	public static final RegistryObject<Item> WATER_ATTACK = REGISTRY.register("water_attack", () -> new WaterAttackItem());
	public static final RegistryObject<Item> EARTH_SHIELD = REGISTRY.register("earth_shield", () -> new EarthShieldItem());
	public static final RegistryObject<Item> ETHER_ATTACK = REGISTRY.register("ether_attack", () -> new EtherAttackItem());
	public static final RegistryObject<Item> ICE_ARMOR_HELMET = REGISTRY.register("ice_armor_helmet", () -> new IceArmorItem.Helmet());
	public static final RegistryObject<Item> ICE_ARMOR_CHESTPLATE = REGISTRY.register("ice_armor_chestplate", () -> new IceArmorItem.Chestplate());
	public static final RegistryObject<Item> ICE_ARMOR_LEGGINGS = REGISTRY.register("ice_armor_leggings", () -> new IceArmorItem.Leggings());
	public static final RegistryObject<Item> ICE_ARMOR_BOOTS = REGISTRY.register("ice_armor_boots", () -> new IceArmorItem.Boots());
	public static final RegistryObject<Item> ICE_STONE = REGISTRY.register("ice_stone", () -> new IceStoneItem());
	public static final RegistryObject<Item> LIGHTNING_ARMOR_HELMET = REGISTRY.register("lightning_armor_helmet", () -> new LightningArmorItem.Helmet());
	public static final RegistryObject<Item> LIGHTNING_ARMOR_CHESTPLATE = REGISTRY.register("lightning_armor_chestplate", () -> new LightningArmorItem.Chestplate());
	public static final RegistryObject<Item> LIGHTNING_ARMOR_LEGGINGS = REGISTRY.register("lightning_armor_leggings", () -> new LightningArmorItem.Leggings());
	public static final RegistryObject<Item> LIGHTNING_ARMOR_BOOTS = REGISTRY.register("lightning_armor_boots", () -> new LightningArmorItem.Boots());
	public static final RegistryObject<Item> LIGHTNING_STONE = REGISTRY.register("lightning_stone", () -> new LightningStoneItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
