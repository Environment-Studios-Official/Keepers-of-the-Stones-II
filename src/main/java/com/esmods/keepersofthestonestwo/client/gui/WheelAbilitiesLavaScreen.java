package com.esmods.keepersofthestonestwo.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesLavaMenu;
import com.esmods.keepersofthestonestwo.procedures.GetWheelTwoProcedure;
import com.esmods.keepersofthestonestwo.procedures.GetWheelThreeProcedure;
import com.esmods.keepersofthestonestwo.network.WheelAbilitiesLavaButtonMessage;
import com.esmods.keepersofthestonestwo.PowerMod;

public class WheelAbilitiesLavaScreen extends AbstractContainerScreen<WheelAbilitiesLavaMenu> {
	private final static HashMap<String, Object> guistate = WheelAbilitiesLavaMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_wheel_button_1;
	ImageButton imagebutton_wheel_button_2;
	ImageButton imagebutton_wheel_button_3;
	ImageButton imagebutton_lava_outburst;
	ImageButton imagebutton_lava_attack;
	ImageButton imagebutton_melting;

	public WheelAbilitiesLavaScreen(WheelAbilitiesLavaMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 192;
		this.imageHeight = 192;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 82 && mouseX < leftPos + 106 && mouseY > topPos + 23 && mouseY < topPos + 47)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.wheel_abilities_lava.tooltip_lava_outburst_uses_10"), mouseX, mouseY);
		if (mouseX > leftPos + 144 && mouseX < leftPos + 168 && mouseY > topPos + 83 && mouseY < topPos + 107)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.wheel_abilities_lava.tooltip_lava_attack_uses_35"), mouseX, mouseY);
		if (mouseX > leftPos + 82 && mouseX < leftPos + 106 && mouseY > topPos + 144 && mouseY < topPos + 168)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.wheel_abilities_lava.tooltip_melting_uses_50"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("power:textures/screens/wheel_of_abilities.png"), this.leftPos + -1, this.topPos + 0, 0, 0, 192, 192, 192, 192);

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
	public void init() {
		super.init();
		imagebutton_wheel_button_1 = new ImageButton(this.leftPos + 140, this.topPos + 154, 10, 7, 0, 0, 7, new ResourceLocation("power:textures/screens/atlas/imagebutton_wheel_button_1.png"), 10, 14, e -> {
			if (GetWheelTwoProcedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesLavaButtonMessage(0, x, y, z));
				WheelAbilitiesLavaButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (GetWheelTwoProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_wheel_button_1", imagebutton_wheel_button_1);
		this.addRenderableWidget(imagebutton_wheel_button_1);
		imagebutton_wheel_button_2 = new ImageButton(this.leftPos + 152, this.topPos + 154, 10, 7, 0, 0, 7, new ResourceLocation("power:textures/screens/atlas/imagebutton_wheel_button_2.png"), 10, 14, e -> {
			if (GetWheelTwoProcedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesLavaButtonMessage(1, x, y, z));
				WheelAbilitiesLavaButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (GetWheelTwoProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_wheel_button_2", imagebutton_wheel_button_2);
		this.addRenderableWidget(imagebutton_wheel_button_2);
		imagebutton_wheel_button_3 = new ImageButton(this.leftPos + 164, this.topPos + 154, 10, 7, 0, 0, 7, new ResourceLocation("power:textures/screens/atlas/imagebutton_wheel_button_3.png"), 10, 14, e -> {
			if (GetWheelThreeProcedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesLavaButtonMessage(2, x, y, z));
				WheelAbilitiesLavaButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (GetWheelThreeProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_wheel_button_3", imagebutton_wheel_button_3);
		this.addRenderableWidget(imagebutton_wheel_button_3);
		imagebutton_lava_outburst = new ImageButton(this.leftPos + 72, this.topPos + 12, 46, 46, 0, 0, 46, new ResourceLocation("power:textures/screens/atlas/imagebutton_lava_outburst.png"), 46, 92, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesLavaButtonMessage(3, x, y, z));
				WheelAbilitiesLavaButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_lava_outburst", imagebutton_lava_outburst);
		this.addRenderableWidget(imagebutton_lava_outburst);
		imagebutton_lava_attack = new ImageButton(this.leftPos + 133, this.topPos + 73, 46, 46, 0, 0, 46, new ResourceLocation("power:textures/screens/atlas/imagebutton_lava_attack.png"), 46, 92, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesLavaButtonMessage(4, x, y, z));
				WheelAbilitiesLavaButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_lava_attack", imagebutton_lava_attack);
		this.addRenderableWidget(imagebutton_lava_attack);
		imagebutton_melting = new ImageButton(this.leftPos + 72, this.topPos + 134, 46, 46, 0, 0, 46, new ResourceLocation("power:textures/screens/atlas/imagebutton_melting.png"), 46, 92, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesLavaButtonMessage(5, x, y, z));
				WheelAbilitiesLavaButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_melting", imagebutton_melting);
		this.addRenderableWidget(imagebutton_melting);
	}
}
