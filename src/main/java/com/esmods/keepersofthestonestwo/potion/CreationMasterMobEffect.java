
package com.esmods.keepersofthestonestwo.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import com.esmods.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;
import com.esmods.keepersofthestonestwo.procedures.CreationMasterStartProcedure;

public class CreationMasterMobEffect extends MobEffect {
	public CreationMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		CreationMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		EnhancedAbilitiesProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}
