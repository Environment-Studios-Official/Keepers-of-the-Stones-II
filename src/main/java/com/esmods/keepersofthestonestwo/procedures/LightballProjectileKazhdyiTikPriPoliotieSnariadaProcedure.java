package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import com.esmods.keepersofthestonestwo.init.KeepersOfTheStones2ModParticleTypes;

public class LightballProjectileKazhdyiTikPriPoliotieSnariadaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (KeepersOfTheStones2ModParticleTypes.LIGHT_SPARKLE.get()), x, y, z, 0, 1, 0);
	}
}
