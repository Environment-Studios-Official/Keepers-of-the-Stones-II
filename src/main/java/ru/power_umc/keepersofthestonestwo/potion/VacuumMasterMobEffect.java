
package ru.power_umc.keepersofthestonestwo.potion;

import ru.power_umc.keepersofthestonestwo.procedures.VacuumMasterStartProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.VacuumMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class VacuumMasterMobEffect extends MobEffect {
	public VacuumMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16764109);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.vacuum_master";
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
