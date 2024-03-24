
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import com.esmods.keepersofthestonestwo.enchantment.RevengeEnchantment;
import com.esmods.keepersofthestonestwo.enchantment.IsolationEnchantment;
import com.esmods.keepersofthestonestwo.KeepersOfTheStones2Mod;

public class KeepersOfTheStones2ModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, KeepersOfTheStones2Mod.MODID);
	public static final RegistryObject<Enchantment> REVENGE = REGISTRY.register("revenge", () -> new RevengeEnchantment());
	public static final RegistryObject<Enchantment> ISOLATION = REGISTRY.register("isolation", () -> new IsolationEnchantment());
}
