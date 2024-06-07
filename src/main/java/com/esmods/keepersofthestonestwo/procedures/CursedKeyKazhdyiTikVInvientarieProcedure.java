package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;

import java.util.Map;

public class CursedKeyKazhdyiTikVInvientarieProcedure {
	public static void execute(ItemStack itemstack) {
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MENDING, itemstack) != 0) {
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.MENDING)) {
					_enchantments.remove(Enchantments.MENDING);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, itemstack) != 0) {
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.UNBREAKING)) {
					_enchantments.remove(Enchantments.UNBREAKING);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
		}
	}
}
