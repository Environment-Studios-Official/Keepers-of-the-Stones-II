
package ru.power_umc.keepersofthestonestwo.potion;

import ru.power_umc.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.CrystalMasterStartProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class CrystalMasterMobEffect extends MobEffect {
	public CrystalMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6749953);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.crystal_master";
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		CrystalMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
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
