
package com.esmods.keepersofthestonestwo.enchantment;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

import com.esmods.keepersofthestonestwo.init.PowerModEnchantments;

public class RevengeEnchantment extends Enchantment {
	public RevengeEnchantment(EquipmentSlot... slots) {
		super(Enchantment.definition(ItemTags.WEAPON_ENCHANTABLE, 5, 3, Enchantment.dynamicCost(1, 10), Enchantment.dynamicCost(6, 10), 2, EquipmentSlot.MAINHAND));
	}

	@Override
	protected boolean checkCompatibility(Enchantment enchantment) {
		return this != enchantment && !List.of(PowerModEnchantments.ISOLATION.get()).contains(enchantment);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return Ingredient.of(ItemTags.create(ResourceLocation.parse("minecraft:tools"))).test(itemstack);
	}
}
