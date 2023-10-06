package ru.power_umc.keepersofthestones.two.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;

public class EarthShieldKazhdyiTikVInvientarieProcedure {
	public static void execute(ItemStack itemstack) {
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
