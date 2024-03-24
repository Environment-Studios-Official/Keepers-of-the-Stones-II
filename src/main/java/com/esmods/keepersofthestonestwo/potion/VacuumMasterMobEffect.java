
package com.esmods.keepersofthestonestwo.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import com.esmods.keepersofthestonestwo.procedures.VacuumMasterStartProcedure;
import com.esmods.keepersofthestonestwo.procedures.VacuumMasterEndProcedure;
import com.esmods.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;

public class VacuumMasterMobEffect extends MobEffect {
	public VacuumMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16764109);
	}

	@Override
	public String getDescriptionId() {
		return "effect.keepers_of_the_stones_2.vacuum_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		VacuumMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EnhancedAbilitiesProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		VacuumMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
