package ru.power_umc.keepersofthestonestwo.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

public class GetRechargeInfoProcedure {
	public static String execute(ItemStack itemstack) {
		return "\u00A77" + Component.translatable("power.modinfo.recharge_stone").getString() + Math.round(itemstack.getOrCreateTag().getDouble("rechargeStone") / 20) + Component.translatable("power.modinfo.recharge_stone.seconds").getString();
	}
}
