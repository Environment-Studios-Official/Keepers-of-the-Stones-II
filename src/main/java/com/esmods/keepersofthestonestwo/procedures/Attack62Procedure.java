package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.network.KeepersOfTheStones2ModVariables;

public class Attack62Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "metal_attack_2";
			entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.attack = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
