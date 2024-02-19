
package ru.power_umc.keepersofthestonestwo.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class MoonMasterMobEffect extends MobEffect {
	public MoonMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13369396);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.moon_master";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
