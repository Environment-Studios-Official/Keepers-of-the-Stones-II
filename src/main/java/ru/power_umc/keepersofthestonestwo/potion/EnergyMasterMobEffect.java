
package ru.power_umc.keepersofthestonestwo.potion;

import ru.power_umc.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.EnergyMasterStartProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class EnergyMasterMobEffect extends MobEffect {
	public EnergyMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13312);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.energy_master";
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		EnergyMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
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
