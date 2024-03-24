package com.esmods.keepersofthestonestwo.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

import com.esmods.keepersofthestonestwo.world.inventory.BatteryChargerGUIMenu;
import com.esmods.keepersofthestonestwo.procedures.BatteryChargerProgress5Procedure;
import com.esmods.keepersofthestonestwo.procedures.BatteryChargerProgress4Procedure;
import com.esmods.keepersofthestonestwo.procedures.BatteryChargerProgress3Procedure;
import com.esmods.keepersofthestonestwo.procedures.BatteryChargerProgress2Procedure;
import com.esmods.keepersofthestonestwo.procedures.BatteryChargerProgress1Procedure;

public class BatteryChargerGUIScreen extends AbstractContainerScreen<BatteryChargerGUIMenu> {
	private final static HashMap<String, Object> guistate = BatteryChargerGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BatteryChargerGUIScreen(BatteryChargerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("keepers_of_the_stones_2:textures/screens/battery_charger_gui.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		if (BatteryChargerProgress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("keepers_of_the_stones_2:textures/screens/battery_charger_progress_1.png"), this.leftPos + 37, this.topPos + 14, 0, 0, 102, 10, 102, 10);
		}
		if (BatteryChargerProgress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("keepers_of_the_stones_2:textures/screens/battery_charger_progress_2.png"), this.leftPos + 37, this.topPos + 14, 0, 0, 102, 10, 102, 10);
		}
		if (BatteryChargerProgress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("keepers_of_the_stones_2:textures/screens/battery_charger_progress_3.png"), this.leftPos + 37, this.topPos + 14, 0, 0, 102, 10, 102, 10);
		}
		if (BatteryChargerProgress4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("keepers_of_the_stones_2:textures/screens/battery_charger_progress_4.png"), this.leftPos + 37, this.topPos + 14, 0, 0, 102, 10, 102, 10);
		}
		if (BatteryChargerProgress5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("keepers_of_the_stones_2:textures/screens/battery_charger_progress_5.png"), this.leftPos + 37, this.topPos + 14, 0, 0, 102, 10, 102, 10);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
