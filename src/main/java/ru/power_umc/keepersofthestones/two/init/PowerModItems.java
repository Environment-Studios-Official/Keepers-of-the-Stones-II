
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestones.two.init;

import ru.power_umc.keepersofthestones.two.item.FireStoneItem;
import ru.power_umc.keepersofthestones.two.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class PowerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PowerMod.MODID);
	public static final RegistryObject<Item> FIRE_STONE = REGISTRY.register("fire_stone", () -> new FireStoneItem());
}
