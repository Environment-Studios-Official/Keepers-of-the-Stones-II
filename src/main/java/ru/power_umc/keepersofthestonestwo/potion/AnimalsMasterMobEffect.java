
package ru.power_umc.keepersofthestonestwo.potion;

import ru.power_umc.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.AnimalsMasterStartProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class AnimalsMasterMobEffect extends MobEffect {
	public AnimalsMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6737152);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.animals_master";
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		AnimalsMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
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
