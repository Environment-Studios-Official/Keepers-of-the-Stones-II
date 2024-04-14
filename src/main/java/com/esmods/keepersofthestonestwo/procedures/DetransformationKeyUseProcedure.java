package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;
import com.esmods.keepersofthestonestwo.init.PowerModMobEffects;
import com.esmods.keepersofthestonestwo.PowerMod;

public class DetransformationKeyUseProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		PowerMod.queueServerWork(1, () -> {
			if (entity.getData(PowerModVariables.PLAYER_VARIABLES).active == true) {
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
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.ICE_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.LIGHTNING_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.SOUND_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.CRYSTAL_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.LAVA_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.RAIN_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.TORNADO_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.OCEAN_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.PLANTS_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.ANIMALS_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.METAL_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.LIGHT_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.SHADOW_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.VACUUM_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.ENERGY_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.SUN_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.MOON_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.SPACE_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.TIME_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.CREATION_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.DESTRUCTION_MASTER.get());
				{
					PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
					_vars.active = false;
					_vars.syncPlayerVariables(entity);
				}
				{
					PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
					_vars.mergers = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
		});
	}
}
