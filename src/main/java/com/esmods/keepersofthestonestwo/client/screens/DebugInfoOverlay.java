
package com.esmods.keepersofthestonestwo.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import com.esmods.keepersofthestonestwo.procedures.StarPointsRecoveryMultiplierDebugProcedure;
import com.esmods.keepersofthestonestwo.procedures.PowerRecordedDubugProcedure;
import com.esmods.keepersofthestonestwo.procedures.ModVersionDebugProcedure;
import com.esmods.keepersofthestonestwo.procedures.MergersNumberDebugProcedure;
import com.esmods.keepersofthestonestwo.procedures.MaxStarPointsDebugProcedure;
import com.esmods.keepersofthestonestwo.procedures.FakeElementsTimerDebugProcedure;
import com.esmods.keepersofthestonestwo.procedures.FakeElementsActiveDebugProcedure;
import com.esmods.keepersofthestonestwo.procedures.ElementsActiveDebugProcedure;
import com.esmods.keepersofthestonestwo.procedures.DebugCheckProcedure;
import com.esmods.keepersofthestonestwo.procedures.ActivePowerDebugProcedure;
import com.esmods.keepersofthestonestwo.procedures.ActiveBatteryDebugProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class DebugInfoOverlay {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (DebugCheckProcedure.execute(entity)) {
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					StarPointsRecoveryMultiplierDebugProcedure.execute(entity), 6, 62, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					MaxStarPointsDebugProcedure.execute(entity), 6, 71, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					FakeElementsTimerDebugProcedure.execute(entity), 6, 125, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					PowerRecordedDubugProcedure.execute(entity), 6, 134, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					FakeElementsActiveDebugProcedure.execute(entity), 6, 116, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ElementsActiveDebugProcedure.execute(entity), 6, 107, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ActivePowerDebugProcedure.execute(entity), 6, 80, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ActiveBatteryDebugProcedure.execute(entity), 6, 89, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					MergersNumberDebugProcedure.execute(entity), 6, 98, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ModVersionDebugProcedure.execute(), 6, 53, -1, false);
		}
	}
}
