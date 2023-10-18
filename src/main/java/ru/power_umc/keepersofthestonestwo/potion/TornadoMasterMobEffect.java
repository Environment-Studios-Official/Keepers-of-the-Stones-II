
package ru.power_umc.keepersofthestonestwo.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TornadoMasterMobEffect extends MobEffect {
	public TornadoMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6724096);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.tornado_master";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
