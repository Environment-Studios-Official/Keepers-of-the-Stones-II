package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import com.auranite.abloom.AbloomModEffects;

public class SoundBombProjectileKoghdaSnariadPopadaietVSushchnostProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(AbloomModEffects.WINDSWEPT, 300, 0, false, false));
	}
}