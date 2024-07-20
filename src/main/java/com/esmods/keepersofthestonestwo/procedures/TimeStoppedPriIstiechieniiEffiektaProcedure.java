package com.esmods.keepersofthestonestwo.procedures;

import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

public class TimeStoppedPriIstiechieniiEffiektaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).setBaseValue(0.10000000149011612);
		((LivingEntity) entity).getAttribute(NeoForgeMod.ENTITY_GRAVITY.value()).setBaseValue(0.08);
		{
			PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
			_vars.ability_block = false;
			_vars.syncPlayerVariables(entity);
		}
	}
}
