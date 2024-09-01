package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

public class GetWheelTwoOrFirstFakeProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !(entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("0")
				|| !(entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("0") && !(entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("0");
	}
}
