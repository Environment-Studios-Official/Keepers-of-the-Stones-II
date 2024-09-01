
package com.esmods.keepersofthestonestwo.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import com.esmods.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;
import com.esmods.keepersofthestonestwo.procedures.DestructionMasterStartProcedure;

public class DestructionMasterMobEffect extends MobEffect {
	public DestructionMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13421773);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		DestructionMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EnhancedAbilitiesProcedure.execute(entity);
	}
}
