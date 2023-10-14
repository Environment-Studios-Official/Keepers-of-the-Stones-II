
package ru.power_umc.keepersofthestones.two.potion;

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
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
