package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import java.util.Random;
import java.util.List;
import java.util.Comparator;

public class CursedKeeperAttackDetectionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Xpar = 0;
		double Ypar = 0;
		double Random = 0;
		double Range = 0;
		double Zpar = 0;
		Range = 0.75;
		if (entity.getPersistentData().getDouble("IA") > 25) {
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
				for (int index0 = 0; index0 < 15; index0++) {
					Xpar = x + entity.getLookAngle().x * Range;
					Ypar = y + 1.75;
					Zpar = z + entity.getLookAngle().z * Range;
					{
						final Vec3 _center = new Vec3(Xpar, Ypar, Zpar);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.75 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator == (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) {
								Random = Mth.nextInt(RandomSource.create(), 0, 1);
								if (Range < 5) {
									if (Random == 0) {
										entity.getPersistentData().putString("State", "Bite");
									} else {
										entity.getPersistentData().putString("State", "Spin");
									}
								} else {
									entity.getPersistentData().putString("State", "Breath");
								}
								entity.getPersistentData().putDouble("IA", 0);
							}
						}
					}
					Range = Range + 0.85;
				}
			}
		} else {
			entity.getPersistentData().putDouble("IA", (entity.getPersistentData().getDouble("IA") + 1));
		}
	}
}
