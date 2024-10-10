
package com.esmods.keepersofthestonestwo.potion;

import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.Set;

import com.esmods.keepersofthestonestwo.procedures.MistMasterStartProcedure;

public class MistMasterMobEffect extends MobEffect {
	public MistMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13434727);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		MistMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}
