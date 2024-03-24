
package com.esmods.keepersofthestonestwo.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.List;

import com.esmods.keepersofthestonestwo.init.KeepersOfTheStones2ModItems;
import com.esmods.keepersofthestonestwo.init.KeepersOfTheStones2ModEnchantments;

public class RevengeEnchantment extends Enchantment {
	public RevengeEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return this != ench && !List.of(KeepersOfTheStones2ModEnchantments.ISOLATION.get()).contains(ench);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return Ingredient.of(new ItemStack(KeepersOfTheStones2ModItems.ENERGIUM_PICKAXE.get()), new ItemStack(KeepersOfTheStones2ModItems.ENERGIUM_AXE.get()), new ItemStack(KeepersOfTheStones2ModItems.ENERGIUM_SWORD.get()),
				new ItemStack(KeepersOfTheStones2ModItems.ENERGIUM_SHOVEL.get()), new ItemStack(KeepersOfTheStones2ModItems.ENERGIUM_HOE.get())).test(itemstack);
	}
}
