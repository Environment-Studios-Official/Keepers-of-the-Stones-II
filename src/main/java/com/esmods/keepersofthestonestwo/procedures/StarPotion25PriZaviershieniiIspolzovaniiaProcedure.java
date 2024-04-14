package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

public class StarPotion25PriZaviershieniiIspolzovaniiaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
			_vars.power = entity.getData(PowerModVariables.PLAYER_VARIABLES).power + 25;
			_vars.syncPlayerVariables(entity);
		}
	}
}
