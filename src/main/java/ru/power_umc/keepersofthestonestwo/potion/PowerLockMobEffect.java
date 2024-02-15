
package ru.power_umc.keepersofthestonestwo.potion;

import ru.power_umc.keepersofthestonestwo.procedures.PowerLockStartProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class PowerLockMobEffect extends MobEffect {
	public PowerLockMobEffect() {
		super(MobEffectCategory.HARMFUL, -3368704);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.power_lock";
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		PowerLockStartProcedure.execute(entity);
	}
}
