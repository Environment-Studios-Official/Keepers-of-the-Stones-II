
package com.esmods.keepersofthestonestwo.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import com.esmods.keepersofthestonestwo.procedures.TeleportationMasterStartProcedure;
import com.esmods.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;

public class TeleportationMasterMobEffect extends MobEffect {
	public TeleportationMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16777012);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		TeleportationMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
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
