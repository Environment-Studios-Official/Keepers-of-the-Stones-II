
package ru.power_umc.keepersofthestones.two.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TheElementOfTheEarthMobEffect extends MobEffect {
	public TheElementOfTheEarthMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10079488);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.the_element_of_the_earth";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
