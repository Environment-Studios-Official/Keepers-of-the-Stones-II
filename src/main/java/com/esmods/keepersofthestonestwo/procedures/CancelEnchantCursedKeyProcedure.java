package com.esmods.keepersofthestonestwo.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;

import javax.annotation.Nullable;

import com.esmods.keepersofthestonestwo.init.PowerModItems;

@Mod.EventBusSubscriber
public class CancelEnchantCursedKeyProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onEventTriggered(AnvilUpdateEvent event) {
		execute(event, event.getLeft());
	}

	public static void execute(ItemStack leftItem) {
		execute(null, leftItem);
	}

	private static void execute(@Nullable Event event, ItemStack leftItem) {
		if (leftItem.getItem() == PowerModItems.CURSED_KEY.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
	}
}
