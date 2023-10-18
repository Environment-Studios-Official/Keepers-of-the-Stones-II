
package ru.power_umc.keepersofthestonestwo.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class PlantsMasterMobEffect extends MobEffect {
	public PlantsMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13395712);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.plants_master";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
