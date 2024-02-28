
package com.esmods.keepersofthestonestwo.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import com.esmods.keepersofthestonestwo.procedures.SpaceMasterStartProcedure;
import com.esmods.keepersofthestonestwo.procedures.SpaceMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;

public class SpaceMasterMobEffect extends MobEffect {
	public SpaceMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13434727);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.space_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		SpaceMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EnhancedAbilitiesProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SpaceMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
