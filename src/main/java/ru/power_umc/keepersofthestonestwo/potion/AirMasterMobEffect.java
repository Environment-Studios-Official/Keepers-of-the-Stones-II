
package ru.power_umc.keepersofthestonestwo.potion;

import ru.power_umc.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.AirMasterStartProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class AirMasterMobEffect extends MobEffect {
	public AirMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3342337);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.air_master";
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		AirMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
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
