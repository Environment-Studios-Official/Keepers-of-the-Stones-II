
package com.esmods.keepersofthestonestwo.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import com.esmods.keepersofthestonestwo.procedures.StarRegenerationStartProcedure;

public class StarRegenerationMobEffect extends MobEffect {
	public StarRegenerationMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -5335961);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		StarRegenerationStartProcedure.execute(entity);
	}
}
