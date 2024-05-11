
package com.esmods.keepersofthestonestwo.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TeleportationMasterMobEffect extends MobEffect {
	public TeleportationMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16777012);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
