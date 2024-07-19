
package com.esmods.keepersofthestonestwo.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import com.esmods.keepersofthestonestwo.procedures.SpaceMasterStartProcedure;
import com.esmods.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;

public class SpaceMasterMobEffect extends MobEffect {
	public SpaceMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13434727);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		SpaceMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
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
