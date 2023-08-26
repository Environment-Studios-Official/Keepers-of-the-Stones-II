
package ru.power_umc.keepersofthestones.two.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TheElementOfAirMobEffect extends MobEffect {
	public TheElementOfAirMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6684673);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.the_element_of_air";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
