
package com.esmods.keepersofthestonestwo.potion;

import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.Set;

import com.esmods.keepersofthestonestwo.procedures.MagnetMasterStartProcedure;

public class MagnetMasterMobEffect extends MobEffect {
	public MagnetMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -39169);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		MagnetMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}
