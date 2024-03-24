package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.network.KeepersOfTheStones2ModVariables;

public class GetWheelThreeProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("0");
	}
}
