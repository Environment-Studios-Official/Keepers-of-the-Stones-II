
package ru.power_umc.keepersofthestones.two.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class MetalMasterMobEffect extends MobEffect {
	public MetalMasterMobEffect() {
		super(MobEffectCategory.NEUTRAL, -6710887);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.metal_master";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
