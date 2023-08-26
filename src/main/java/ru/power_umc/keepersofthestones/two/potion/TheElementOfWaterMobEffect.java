
package ru.power_umc.keepersofthestones.two.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TheElementOfWaterMobEffect extends MobEffect {
	public TheElementOfWaterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16750900);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.the_element_of_water";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
