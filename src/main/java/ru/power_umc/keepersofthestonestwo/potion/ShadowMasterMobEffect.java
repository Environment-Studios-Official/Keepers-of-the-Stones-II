
package ru.power_umc.keepersofthestonestwo.potion;

import ru.power_umc.keepersofthestonestwo.procedures.ShadowMasterStartProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.ShadowMasterEndProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.EnhancedAbilitiesProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ShadowMasterMobEffect extends MobEffect {
	public ShadowMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10066177);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.shadow_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		ShadowMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EnhancedAbilitiesProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		ShadowMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
