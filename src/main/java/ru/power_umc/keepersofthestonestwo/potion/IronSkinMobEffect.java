
package ru.power_umc.keepersofthestonestwo.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class IronSkinMobEffect extends MobEffect {
	public IronSkinMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6710887);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.iron_skin";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
