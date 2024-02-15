
package ru.power_umc.keepersofthestonestwo.potion;

import ru.power_umc.keepersofthestonestwo.procedures.LightningMasterStartProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class LightningMasterMobEffect extends MobEffect {
	public LightningMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3407668);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.lightning_master";
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		LightningMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
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
