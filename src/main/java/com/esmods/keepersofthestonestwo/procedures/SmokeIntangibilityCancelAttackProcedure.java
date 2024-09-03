package com.esmods.keepersofthestonestwo.procedures;

import net.neoforged.neoforge.event.entity.living.LivingAttackEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.ICancellableEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import com.esmods.keepersofthestonestwo.init.PowerModMobEffects;

@Mod.EventBusSubscriber
public class SmokeIntangibilityCancelAttackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(PowerModMobEffects.SMOKE_INTANGIBILITY.get()) && entity instanceof LivingEntity) {
			if (event instanceof ICancellableEvent _cancellable) {
				_cancellable.setCanceled(true);
			} else if (event != null && event.hasResult()) {
				event.setResult(Event.Result.DENY);
			}
		}
	}
}
