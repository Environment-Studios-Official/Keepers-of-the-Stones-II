
package com.esmods.keepersofthestonestwo.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;

import com.esmods.keepersofthestonestwo.procedures.CursedKeyOpenVaultProcedure;
import com.esmods.keepersofthestonestwo.procedures.CursedKeyKazhdyiTikVInvientarieProcedure;

public class CursedKeyItem extends Item {
	public CursedKeyItem() {
		super(new Item.Properties().durability(8).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		CursedKeyOpenVaultProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		CursedKeyKazhdyiTikVInvientarieProcedure.execute(itemstack);
	}
}
