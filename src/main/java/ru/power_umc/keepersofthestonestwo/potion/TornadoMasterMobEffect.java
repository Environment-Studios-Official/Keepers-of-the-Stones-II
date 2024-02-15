
package ru.power_umc.keepersofthestonestwo.potion;

import ru.power_umc.keepersofthestonestwo.procedures.TornadoMasterStartProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TornadoMasterMobEffect extends MobEffect {
	public TornadoMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6724096);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.tornado_master";
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		TornadoMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
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
