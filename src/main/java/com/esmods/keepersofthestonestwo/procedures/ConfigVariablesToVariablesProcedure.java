package com.esmods.keepersofthestonestwo.procedures;

import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;
import com.esmods.keepersofthestonestwo.configuration.PowerConfigConfiguration;

@Mod.EventBusSubscriber
public class ConfigVariablesToVariablesProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.neoforged.neoforge.event.level.LevelEvent.Load event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		PowerModVariables.MapVariables.get(world).master_effect_duration = (double) PowerConfigConfiguration.MASTER_EFFECT_DURATION.get();
		PowerModVariables.MapVariables.get(world).syncData(world);
		PowerModVariables.MapVariables.get(world).recharge_timer = (double) PowerConfigConfiguration.RECHARGE_TIMER.get();
		PowerModVariables.MapVariables.get(world).syncData(world);
	}
}
