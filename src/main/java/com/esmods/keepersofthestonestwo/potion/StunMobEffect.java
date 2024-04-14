
package com.esmods.keepersofthestonestwo.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import com.esmods.keepersofthestonestwo.procedures.StunPriNalozhieniiEffiektaProcedure;

public class StunMobEffect extends MobEffect {
	public StunMobEffect() {
		super(MobEffectCategory.HARMFUL, -10066330);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		StunPriNalozhieniiEffiektaProcedure.execute(entity);
	}
}
