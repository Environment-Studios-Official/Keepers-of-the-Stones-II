package ru.power_umc.keepersofthestonestwo.procedures;

import ru.power_umc.keepersofthestonestwo.network.PowerModVariables;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class Attack41Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 41;
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.attack = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
