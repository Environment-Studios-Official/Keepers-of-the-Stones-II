
package com.esmods.keepersofthestonestwo.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.List;

import com.esmods.keepersofthestonestwo.init.PowerModItems;
import com.esmods.keepersofthestonestwo.init.PowerModEnchantments;

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
		return this != ench && !List.of(PowerModEnchantments.ISOLATION.get()).contains(ench);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return Ingredient.of(new ItemStack(PowerModItems.ENERGIUM_PICKAXE.get()), new ItemStack(PowerModItems.ENERGIUM_AXE.get()), new ItemStack(PowerModItems.ENERGIUM_SWORD.get()), new ItemStack(PowerModItems.ENERGIUM_SHOVEL.get()),
				new ItemStack(PowerModItems.ENERGIUM_HOE.get())).test(itemstack);
	}
}
