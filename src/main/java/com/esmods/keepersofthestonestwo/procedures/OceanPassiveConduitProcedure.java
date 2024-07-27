package com.esmods.keepersofthestonestwo.procedures;

import net.neoforged.neoforge.event.TickEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import javax.annotation.Nullable;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

@Mod.EventBusSubscriber
public class OceanPassiveConduitProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double particleRadius = 0;
		double particleAmount = 0;
		if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("ocean") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("ocean")
				|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("ocean") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("ocean")
				|| (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("ocean") || (entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_first).equals("ocean")) {
			if (entity.isInWater()) {
				particleAmount = 8;
				particleRadius = 2;
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 400, 0, false, false));
			}
		}
	}
}
