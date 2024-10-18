
package com.esmods.keepersofthestonestwo.potion;

import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.Set;

import com.esmods.keepersofthestonestwo.procedures.ChaosDarkMasterStartProcedure;

public class ChaosDarkMasterMobEffect extends MobEffect {
	public ChaosDarkMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10092442);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		ChaosDarkMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}