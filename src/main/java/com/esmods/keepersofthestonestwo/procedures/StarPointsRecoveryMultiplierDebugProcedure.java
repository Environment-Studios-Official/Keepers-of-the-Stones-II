package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

public class StarPointsRecoveryMultiplierDebugProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "global_star_points_recovery_multiplier: " + new java.text.DecimalFormat("##.#").format(entity.getData(PowerModVariables.PLAYER_VARIABLES).power_recovery_multiplier);
	}
}
