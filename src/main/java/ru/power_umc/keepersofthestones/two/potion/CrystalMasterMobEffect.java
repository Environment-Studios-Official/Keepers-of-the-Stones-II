
package ru.power_umc.keepersofthestones.two.potion;

import ru.power_umc.keepersofthestones.two.procedures.EnhancedAbilitiesProcedure;
import ru.power_umc.keepersofthestones.two.procedures.CrystalMasterStartProcedure;
import ru.power_umc.keepersofthestones.two.procedures.CrystalMasterEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class CrystalMasterMobEffect extends MobEffect {
	public CrystalMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6749953);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.crystal_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		CrystalMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EnhancedAbilitiesProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		CrystalMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
