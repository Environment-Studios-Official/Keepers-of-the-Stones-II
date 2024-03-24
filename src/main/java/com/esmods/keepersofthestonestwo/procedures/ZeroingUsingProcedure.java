package com.esmods.keepersofthestonestwo.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import com.esmods.keepersofthestonestwo.network.KeepersOfTheStones2ModVariables;

@Mod.EventBusSubscriber
public class ZeroingUsingProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).zeroing) {
			world.getLevelData().getGameRules().getRule(GameRules.RULE_KEEPINVENTORY).set(false, world.getServer());
			{
				boolean _setval = false;
				entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.zeroing = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
