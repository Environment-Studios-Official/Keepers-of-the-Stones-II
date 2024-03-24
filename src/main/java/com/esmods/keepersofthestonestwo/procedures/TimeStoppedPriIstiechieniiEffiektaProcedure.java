package com.esmods.keepersofthestonestwo.procedures;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.network.KeepersOfTheStones2ModVariables;

public class TimeStoppedPriIstiechieniiEffiektaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).setBaseValue(0.10000000149011612);
		((LivingEntity) entity).getAttribute(ForgeMod.ENTITY_GRAVITY.get()).setBaseValue(0.08);
		{
			boolean _setval = false;
			entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ability_block = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
