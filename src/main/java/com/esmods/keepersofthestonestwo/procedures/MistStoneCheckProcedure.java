package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.level.LevelAccessor;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

public class MistStoneCheckProcedure {
	public static boolean execute(LevelAccessor world) {
		return PowerModVariables.MapVariables.get(world).mist_stone == false;
	}
}
