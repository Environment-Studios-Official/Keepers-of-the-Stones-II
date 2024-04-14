package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

public class AmplifierDropProjectileKoghdaSnariadPopadaietVIghrokaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 5) == 1) {
			{
				PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
				_vars.power = entity.getData(PowerModVariables.PLAYER_VARIABLES).power + 0;
				_vars.syncPlayerVariables(entity);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 2) {
			{
				PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
				_vars.power = entity.getData(PowerModVariables.PLAYER_VARIABLES).power + 5;
				_vars.syncPlayerVariables(entity);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 3) {
			{
				PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
				_vars.power = entity.getData(PowerModVariables.PLAYER_VARIABLES).power + 10;
				_vars.syncPlayerVariables(entity);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 4) {
			{
				PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
				_vars.power = entity.getData(PowerModVariables.PLAYER_VARIABLES).power + 15;
				_vars.syncPlayerVariables(entity);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 5) {
			{
				PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
				_vars.power = entity.getData(PowerModVariables.PLAYER_VARIABLES).power + 20;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
