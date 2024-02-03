package ru.power_umc.keepersofthestonestwo.procedures;

import ru.power_umc.keepersofthestonestwo.init.PowerModParticleTypes;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

public class EnergyChargeTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (PowerModParticleTypes.ENERGY_SPARK.get()), x, y, z, 0, 1, 0);
	}
}
