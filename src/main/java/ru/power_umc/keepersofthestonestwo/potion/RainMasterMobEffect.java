
package ru.power_umc.keepersofthestonestwo.potion;

import ru.power_umc.keepersofthestonestwo.procedures.RainMasterStartProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RainMasterMobEffect extends MobEffect {
	public RainMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16751002);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.rain_master";
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		RainMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
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
