package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.level.LevelAccessor;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

public class BlueFlameStoneCheckProcedure {
	public static boolean execute(LevelAccessor world) {
		if (PowerModVariables.MapVariables.get(world).get_limit_of_stones == true) {
			if (PowerModVariables.MapVariables.get(world).blue_flame_stone == false) {
				return true;
			}
		} else if (PowerModVariables.MapVariables.get(world).get_limit_of_stones == false) {
			return true;
		}
		return false;
	}
}
