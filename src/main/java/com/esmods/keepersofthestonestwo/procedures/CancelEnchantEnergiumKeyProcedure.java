package com.esmods.keepersofthestonestwo.procedures;

import net.neoforged.neoforge.event.AnvilUpdateEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.ICancellableEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;

import javax.annotation.Nullable;

import com.esmods.keepersofthestonestwo.init.PowerModItems;

@Mod.EventBusSubscriber(modid = "power", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CancelEnchantEnergiumKeyProcedure {
	@SubscribeEvent
	public static void onEventTriggered(AnvilUpdateEvent event) {
		execute(event, event.getLeft());
	}

	public static void execute(ItemStack leftItem) {
		execute(null, leftItem);
	}

	private static void execute(@Nullable Event event, ItemStack leftItem) {
		if (leftItem.getItem() == PowerModItems.ENERGIUM_KEY.get()) {
			if (event instanceof ICancellableEvent _cancellable) {
				_cancellable.setCanceled(true);
			}
		}
	}
}
