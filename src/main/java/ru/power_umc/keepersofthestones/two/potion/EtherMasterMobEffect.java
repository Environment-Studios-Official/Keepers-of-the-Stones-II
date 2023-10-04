
package ru.power_umc.keepersofthestones.two.potion;

import ru.power_umc.keepersofthestones.two.procedures.EtherMasterStartProcedure;
import ru.power_umc.keepersofthestones.two.procedures.EtherMasterEndProcedure;
import ru.power_umc.keepersofthestones.two.procedures.EnhancedAbilitiesProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class EtherMasterMobEffect extends MobEffect {
	public EtherMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6710785);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.ether_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		EtherMasterStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EnhancedAbilitiesProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		EtherMasterEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
