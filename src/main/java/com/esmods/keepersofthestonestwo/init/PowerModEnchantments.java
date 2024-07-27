
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.core.registries.Registries;

import com.esmods.keepersofthestonestwo.enchantment.RevengeEnchantment;
import com.esmods.keepersofthestonestwo.enchantment.IsolationEnchantment;
import com.esmods.keepersofthestonestwo.PowerMod;

public class PowerModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(Registries.ENCHANTMENT, PowerMod.MODID);
	public static final DeferredHolder<Enchantment, Enchantment> REVENGE = REGISTRY.register("revenge", () -> new RevengeEnchantment());
	public static final DeferredHolder<Enchantment, Enchantment> ISOLATION = REGISTRY.register("isolation", () -> new IsolationEnchantment());
}
