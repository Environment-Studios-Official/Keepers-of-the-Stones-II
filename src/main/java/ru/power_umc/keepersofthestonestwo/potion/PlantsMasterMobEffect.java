
package ru.power_umc.keepersofthestonestwo.potion;

import ru.power_umc.keepersofthestonestwo.procedures.PlantsMasterStartProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class PlantsMasterMobEffect extends MobEffect {
	public PlantsMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13395712);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.plants_master";
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		PlantsMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
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
