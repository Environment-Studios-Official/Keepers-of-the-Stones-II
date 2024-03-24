package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.network.KeepersOfTheStones2ModVariables;
import com.esmods.keepersofthestonestwo.init.KeepersOfTheStones2ModMobEffects;

public class DetransformationKeyUseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).active == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.FIRE_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.AIR_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.EARTH_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.WATER_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.ETHER_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.ICE_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.LIGHTNING_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.SOUND_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.CRYSTAL_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.LAVA_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.RAIN_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.TORNADO_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.OCEAN_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.PLANTS_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.ANIMALS_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.METAL_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.LIGHT_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.SHADOW_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.VACUUM_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.ENERGY_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.SUN_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.MOON_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.SPACE_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.TIME_MASTER.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(KeepersOfTheStones2ModMobEffects.CREATION_MASTER.get());
			{
				boolean _setval = false;
				entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.active = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.mergers = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
