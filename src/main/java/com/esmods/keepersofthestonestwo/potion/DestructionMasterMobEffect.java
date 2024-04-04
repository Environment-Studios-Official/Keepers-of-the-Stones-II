
package com.esmods.keepersofthestonestwo.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class DestructionMasterMobEffect extends MobEffect {
	public DestructionMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13421773);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.destruction_master";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
