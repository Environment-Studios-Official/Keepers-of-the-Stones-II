package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityAnchorArgument;

public class CursedKeeperPriObnovlieniiTikaSushchnostiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("OnBattle")) {
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
				entity.getPersistentData().putBoolean("OnBattle", true);
				entity.getPersistentData().putString("State", "Idle");
				entity.getPersistentData().putDouble("IA", (-25));
			}
		} else {
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
				entity.getPersistentData().putDouble("Patience", 0);
			} else {
				entity.getPersistentData().putDouble("Patience", (entity.getPersistentData().getDouble("Patience") + 1));
			}
			if ((entity.getPersistentData().getString("State")).equals("Idle")) {
				if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
					entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
							((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
				}
				CursedKeeperAttackDetectionProcedure.execute(world, x, y, z, entity);
			}
			if (!entity.getPersistentData().getBoolean("Phase")) {
				if ((entity.getPersistentData().getString("State")).equals("Summon")) {
					CursedKeeperSummonProcedure.execute(world, x, y, z, entity);
				}
			} else {
				if ((entity.getPersistentData().getString("State")).equals("Fire")) {
					CursedKeeperFireProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getPersistentData().getString("State")).equals("Air")) {
					CursedKeeperAirProcedure.execute(entity);
				}
				if ((entity.getPersistentData().getString("State")).equals("Earth")) {
					CursedKeeperEarthProcedure.execute(world, x, y, z, entity);
				}
				if ((entity.getPersistentData().getString("State")).equals("Water")) {
					CursedKeeperWaterProcedure.execute(entity);
				}
			}
		}
		if (entity.getPersistentData().getDouble("Patience") == 100) {
			entity.getPersistentData().putDouble("IA", 0);
			entity.getPersistentData().putDouble("Patience", 0);
			entity.getPersistentData().putBoolean("OnBattle", false);
		}
	}
}
