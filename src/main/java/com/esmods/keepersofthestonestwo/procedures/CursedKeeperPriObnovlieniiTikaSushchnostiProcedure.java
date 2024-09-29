package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class CursedKeeperPriObnovlieniiTikaSushchnostiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			entity.getPersistentData().putDouble("IA", (entity.getPersistentData().getDouble("IA") + 1));
		} else {
			entity.getPersistentData().putString("State", "Idle");
			entity.getPersistentData().putDouble("IA", 0);
		}
		if ((entity.getPersistentData().getString("State")).equals("Idle")) {
			if (entity.getPersistentData().getDouble("IA") == 25) {
				CursedKeeperStateChangerProcedure.execute(entity);
			}
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
}
