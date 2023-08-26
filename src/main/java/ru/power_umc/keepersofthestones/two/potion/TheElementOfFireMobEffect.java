
package ru.power_umc.keepersofthestones.two.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TheElementOfFireMobEffect extends MobEffect {
	public TheElementOfFireMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3407821);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.the_element_of_fire";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
