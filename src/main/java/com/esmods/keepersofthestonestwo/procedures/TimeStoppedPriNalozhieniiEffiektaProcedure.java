package com.esmods.keepersofthestonestwo.procedures;

import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

public class TimeStoppedPriNalozhieniiEffiektaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).setBaseValue(0);
		((LivingEntity) entity).getAttribute(NeoForgeMod.ENTITY_GRAVITY.value()).setBaseValue(1000000);
		{
			PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
			_vars.ability_block = true;
			_vars.syncPlayerVariables(entity);
		}
	}
}
