package ru.power_umc.keepersofthestonestwo.procedures;

import ru.power_umc.keepersofthestonestwo.PowerMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;

public class RechargeStoneTickEventProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		PowerMod.queueServerWork(1, () -> {
			if (itemstack.getOrCreateTag().getDouble("rechargeStone") > 0) {
				itemstack.getOrCreateTag().putDouble("rechargeStone", (itemstack.getOrCreateTag().getDouble("rechargeStone") - 1));
			}
		});
	}
}
