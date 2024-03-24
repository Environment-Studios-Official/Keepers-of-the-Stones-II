package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import com.esmods.keepersofthestonestwo.init.KeepersOfTheStones2ModMobEffects;
import com.esmods.keepersofthestonestwo.init.KeepersOfTheStones2ModEnchantments;

public class EnergiumItemsPowerLockedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!(EnchantmentHelper.getItemEnchantmentLevel(KeepersOfTheStones2ModEnchantments.ISOLATION.get(), itemstack) != 0)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(KeepersOfTheStones2ModMobEffects.POWER_LOCK.get(), 200, 0));
		}
	}
}
