
package com.esmods.keepersofthestonestwo.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import com.esmods.keepersofthestonestwo.procedures.OceanMasterStartProcedure;
import com.esmods.keepersofthestonestwo.procedures.OceanMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;

public class OceanMasterMobEffect extends MobEffect {
	public OceanMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16737895);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		OceanMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EnhancedAbilitiesProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		OceanMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
