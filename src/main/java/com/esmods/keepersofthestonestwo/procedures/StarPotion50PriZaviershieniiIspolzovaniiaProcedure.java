package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

public class StarPotion50PriZaviershieniiIspolzovaniiaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
			_vars.power = entity.getData(PowerModVariables.PLAYER_VARIABLES).power + 50;
			_vars.syncPlayerVariables(entity);
		}
	}
}
