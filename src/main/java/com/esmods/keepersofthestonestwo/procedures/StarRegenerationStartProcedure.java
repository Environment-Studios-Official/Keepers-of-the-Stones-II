package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;
import com.esmods.keepersofthestonestwo.init.PowerModMobEffects;

public class StarRegenerationStartProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
			_vars.power_recovery_multiplier = ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PowerModMobEffects.STAR_REGENERATION.get()) ? _livEnt.getEffect(PowerModMobEffects.STAR_REGENERATION.get()).getAmplifier() : 0) + 1) * 2;
			_vars.syncPlayerVariables(entity);
		}
	}
}
