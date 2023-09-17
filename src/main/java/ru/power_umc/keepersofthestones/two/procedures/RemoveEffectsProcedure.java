package ru.power_umc.keepersofthestones.two.procedures;

import ru.power_umc.keepersofthestones.two.init.PowerModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class RemoveEffectsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.FIRE_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.AIR_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.EARTH_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.WATER_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.ETHER_MASTER.get());
	}
}
