package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.level.LevelAccessor;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

public class AmberStoneCheckProcedure {
	public static boolean execute(LevelAccessor world) {
		return PowerModVariables.MapVariables.get(world).amber_stone == false;
	}
}
