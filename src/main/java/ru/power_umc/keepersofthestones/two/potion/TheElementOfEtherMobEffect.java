
package ru.power_umc.keepersofthestones.two.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TheElementOfEtherMobEffect extends MobEffect {
	public TheElementOfEtherMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3355393);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.the_element_of_ether";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
