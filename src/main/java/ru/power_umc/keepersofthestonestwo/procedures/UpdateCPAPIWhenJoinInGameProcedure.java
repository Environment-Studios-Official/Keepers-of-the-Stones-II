package ru.power_umc.keepersofthestonestwo.procedures;

import ru.power_umc.keepersofthestonestwo.network.PowerModVariables;
import ru.power_umc.keepersofthestonestwo.PowerMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class UpdateCPAPIWhenJoinInGameProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.minecraftforge.event.level.LevelEvent.Load event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (PowerModVariables.MapVariables.get(world).cpapi_version != 1) {
			PowerModVariables.MapVariables.get(world).cpapi_version = 1;
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerMod.LOGGER.warn((Component.translatable("power.modinfo.update_cpapi").getString() + "" + Math.round(PowerModVariables.MapVariables.get(world).cpapi_version)));
		}
	}
}
