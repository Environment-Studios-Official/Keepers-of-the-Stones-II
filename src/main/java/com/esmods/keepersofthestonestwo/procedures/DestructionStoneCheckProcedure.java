package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.level.LevelAccessor;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;
import com.esmods.keepersofthestonestwo.init.PowerModGameRules;

public class DestructionStoneCheckProcedure {
	public static boolean execute(LevelAccessor world) {
		return PowerModVariables.MapVariables.get(world).destruction_stone == false || world.getLevelData().getGameRules().getBoolean(PowerModGameRules.LIMITED_NUMBER_OF_STONES) == false;
	}
}
