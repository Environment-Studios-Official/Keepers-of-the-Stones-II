
package ru.power_umc.keepersofthestonestwo.potion;

import ru.power_umc.keepersofthestonestwo.procedures.LavaMasterStartProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class LavaMasterMobEffect extends MobEffect {
	public LavaMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -39424);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.lava_master";
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		LavaMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
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
