package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

public class StarPotionInfinityPriZaviershieniiIspolzovaniiaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 300000000;
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.power = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
