package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.item.ItemStack;

public class RechargeStoneTickEventProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putString("rechargeStone", "Placeholder");
		itemstack.getOrCreateTag().putDouble("rechargeStone", (itemstack.getOrCreateTag().getDouble("rechargeStone") - 1));
	}
}
