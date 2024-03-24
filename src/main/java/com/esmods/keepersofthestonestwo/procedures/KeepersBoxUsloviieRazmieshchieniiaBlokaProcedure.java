package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import com.esmods.keepersofthestonestwo.init.KeepersOfTheStones2ModBlocks;

public class KeepersBoxUsloviieRazmieshchieniiaBlokaProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == KeepersOfTheStones2ModBlocks.KEEPERS_BOX.get());
	}
}
