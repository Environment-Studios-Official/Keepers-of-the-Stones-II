package com.esmods.keepersofthestonestwo.procedures;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;
import com.esmods.keepersofthestonestwo.init.PowerModMobEffects;

@EventBusSubscriber
public class PowerScaleRegenProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(PowerModVariables.PLAYER_VARIABLES).battery == false && entity.getData(PowerModVariables.PLAYER_VARIABLES).active == true) {
			if (entity.getData(PowerModVariables.PLAYER_VARIABLES).powerTimer > 0) {
				{
					PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
					_vars.powerTimer = entity.getData(PowerModVariables.PLAYER_VARIABLES).powerTimer - entity.getData(PowerModVariables.PLAYER_VARIABLES).power_recovery_multiplier;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
					_vars.powerTimer = 50;
					_vars.syncPlayerVariables(entity);
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).power < entity.getData(PowerModVariables.PLAYER_VARIABLES).max_power) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.power = entity.getData(PowerModVariables.PLAYER_VARIABLES).power + 5;
						_vars.syncPlayerVariables(entity);
					}
				}
			}
		} else if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(PowerModMobEffects.STAR_REGENERATION)) {
			if (entity.getData(PowerModVariables.PLAYER_VARIABLES).powerTimer > 0) {
				{
					PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
					_vars.powerTimer = entity.getData(PowerModVariables.PLAYER_VARIABLES).powerTimer - entity.getData(PowerModVariables.PLAYER_VARIABLES).power_recovery_multiplier;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
					_vars.powerTimer = 50;
					_vars.syncPlayerVariables(entity);
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).power < entity.getData(PowerModVariables.PLAYER_VARIABLES).max_power) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.power = entity.getData(PowerModVariables.PLAYER_VARIABLES).power + 5;
						_vars.syncPlayerVariables(entity);
					}
				}
			}
		}
	}
}
