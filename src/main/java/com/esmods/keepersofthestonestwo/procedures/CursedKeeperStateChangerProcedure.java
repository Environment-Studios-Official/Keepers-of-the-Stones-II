package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class CursedKeeperStateChangerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double StateSelector = 0;
		entity.getPersistentData().putString("PreviousPreviousState", (entity.getPersistentData().getString("PreviousState")));
		entity.getPersistentData().putString("PreviousState", (entity.getPersistentData().getString("State")));
		entity.getPersistentData().putDouble("IA", 0);
		if (!entity.getPersistentData().getBoolean("Phase")) {
			entity.getPersistentData().putString("State", "Summon");
		} else {
			StateSelector = Mth.nextInt(RandomSource.create(), 1, 4);
			if (StateSelector == 1) {
				entity.getPersistentData().putString("State", "Fire");
			}
			if (StateSelector == 2) {
				entity.getPersistentData().putString("State", "Air");
			}
			if (StateSelector == 3) {
				entity.getPersistentData().putString("State", "Earth");
			}
			if (StateSelector == 4) {
				entity.getPersistentData().putString("State", "Water");
			}
		}
		if ((entity.getPersistentData().getString("State")).equals(entity.getPersistentData().getString("PreviousState")) || (entity.getPersistentData().getString("State")).equals(entity.getPersistentData().getString("PreviousPreviousState"))) {
			CursedKeeperStateChangerProcedure.execute(entity);
		}
	}
}
