
package com.esmods.keepersofthestonestwo.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.esmods.keepersofthestonestwo.procedures.EnergiumRevengeAttackProcedure;
import com.esmods.keepersofthestonestwo.procedures.EnergiumItemsPowerLockedProcedure;
import com.esmods.keepersofthestonestwo.init.KeepersOfTheStones2ModItems;

public class EnergiumAxeItem extends AxeItem {
	public EnergiumAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 778;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(KeepersOfTheStones2ModItems.ENERGIUM_INGOT.get()));
			}
		}, 1, -3.2f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		EnergiumRevengeAttackProcedure.execute(entity, itemstack);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		EnergiumItemsPowerLockedProcedure.execute(entity, itemstack);
	}
}
