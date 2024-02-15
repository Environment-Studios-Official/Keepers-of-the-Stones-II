
package ru.power_umc.keepersofthestonestwo.potion;

import ru.power_umc.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.EarthMasterStartProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class EarthMasterMobEffect extends MobEffect {
	public EarthMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10079488);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.earth_master";
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		EarthMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
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
