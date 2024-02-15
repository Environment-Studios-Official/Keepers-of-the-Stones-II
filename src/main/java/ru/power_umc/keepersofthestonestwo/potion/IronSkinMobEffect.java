
package ru.power_umc.keepersofthestonestwo.potion;

import ru.power_umc.keepersofthestonestwo.procedures.IronSkinEffectStartProcedure;

import net.minecraft.world.entity.LivingEntity;
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
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		IronSkinEffectStartProcedure.execute(entity);
	}
}
