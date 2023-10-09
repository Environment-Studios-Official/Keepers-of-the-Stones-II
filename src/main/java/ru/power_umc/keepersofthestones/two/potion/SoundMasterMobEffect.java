
package ru.power_umc.keepersofthestones.two.potion;

import ru.power_umc.keepersofthestones.two.procedures.SoundMasterStartProcedure;
import ru.power_umc.keepersofthestones.two.procedures.SoundMasterEndProcedure;
import ru.power_umc.keepersofthestones.two.procedures.EnhancedAbilitiesProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class SoundMasterMobEffect extends MobEffect {
	public SoundMasterMobEffect() {
		super(MobEffectCategory.NEUTRAL, -6750055);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.sound_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		SoundMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EnhancedAbilitiesProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SoundMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
