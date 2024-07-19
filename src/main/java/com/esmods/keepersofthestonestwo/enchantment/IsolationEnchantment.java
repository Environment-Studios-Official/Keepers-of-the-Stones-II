
package com.esmods.keepersofthestonestwo.enchantment;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.tags.ItemTags;

import java.util.List;

import com.esmods.keepersofthestonestwo.init.PowerModItems;
import com.esmods.keepersofthestonestwo.init.PowerModEnchantments;

public class IsolationEnchantment extends Enchantment {
	public IsolationEnchantment(EquipmentSlot... slots) {
		super(Enchantment.definition(ItemTags.WEAPON_ENCHANTABLE, 5, 1, Enchantment.dynamicCost(1, 10), Enchantment.dynamicCost(6, 10), 2, EquipmentSlot.MAINHAND));
	}

	@Override
	protected boolean checkCompatibility(Enchantment enchantment) {
		return this != enchantment && !List.of(PowerModEnchantments.REVENGE.get()).contains(enchantment);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return Ingredient.of(new ItemStack(PowerModItems.ENERGIUM_PICKAXE.get()), new ItemStack(PowerModItems.ENERGIUM_AXE.get()), new ItemStack(PowerModItems.ENERGIUM_SWORD.get()), new ItemStack(PowerModItems.ENERGIUM_SHOVEL.get()),
				new ItemStack(PowerModItems.ENERGIUM_HOE.get()), new ItemStack(PowerModItems.ENERGIUM_ARMOR_HELMET.get()), new ItemStack(PowerModItems.ENERGIUM_ARMOR_CHESTPLATE.get()), new ItemStack(PowerModItems.ENERGIUM_ARMOR_LEGGINGS.get()),
				new ItemStack(PowerModItems.ENERGIUM_ARMOR_BOOTS.get())).test(itemstack);
	}
}
