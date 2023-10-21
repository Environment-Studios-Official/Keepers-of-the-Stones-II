
package ru.power_umc.keepersofthestonestwo.potion;

import ru.power_umc.keepersofthestonestwo.procedures.StunPriNalozhieniiEffiektaProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class StunMobEffect extends MobEffect {
	public StunMobEffect() {
		super(MobEffectCategory.HARMFUL, -10066330);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.stun";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		StunPriNalozhieniiEffiektaProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
