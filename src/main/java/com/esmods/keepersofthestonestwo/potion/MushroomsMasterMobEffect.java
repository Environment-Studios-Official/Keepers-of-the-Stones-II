
package com.esmods.keepersofthestonestwo.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class MushroomsMasterMobEffect extends MobEffect {
	public MushroomsMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6750055);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
