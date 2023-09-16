package ru.power_umc.keepersofthestones.two.procedures;

import ru.power_umc.keepersofthestones.two.network.PowerModVariables;

import net.minecraft.world.entity.Entity;

public class GetWheelTwoProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).wheel_two > 0;
	}
}
