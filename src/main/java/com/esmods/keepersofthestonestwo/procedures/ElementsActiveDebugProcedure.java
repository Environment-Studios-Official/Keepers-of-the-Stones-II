package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

public class ElementsActiveDebugProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "elements_active: " + (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).element_name_first + "/"
				+ (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).element_name_second + "/"
				+ (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).element_name_third;
	}
}