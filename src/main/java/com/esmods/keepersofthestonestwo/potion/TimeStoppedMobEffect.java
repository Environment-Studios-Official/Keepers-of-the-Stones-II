
package com.esmods.keepersofthestonestwo.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import com.esmods.keepersofthestonestwo.procedures.TimeStoppedPriNalozhieniiEffiektaProcedure;
import com.esmods.keepersofthestonestwo.procedures.TimeStoppedKazhdyiTikVoVriemiaEffiektaProcedure;

public class TimeStoppedMobEffect extends MobEffect {
	public TimeStoppedMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3407821);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		TimeStoppedPriNalozhieniiEffiektaProcedure.execute(entity);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		TimeStoppedKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}
