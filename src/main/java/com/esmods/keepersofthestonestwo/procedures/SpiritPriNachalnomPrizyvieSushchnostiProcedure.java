package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.entity.Entity;

public class SpiritPriNachalnomPrizyvieSushchnostiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("time", 600);
	}
}
