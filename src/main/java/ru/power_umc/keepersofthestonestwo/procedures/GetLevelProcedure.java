package ru.power_umc.keepersofthestonestwo.procedures;

import ru.power_umc.keepersofthestonestwo.network.PowerModVariables;

import net.minecraft.world.entity.Entity;

public class GetLevelProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "L: " + Math.round((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).level);
	}
}
