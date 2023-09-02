
package ru.power_umc.keepersofthestones.two.potion;

import ru.power_umc.keepersofthestones.two.procedures.EnhancedAbilitiesProcedure;

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
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EnhancedAbilitiesProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
