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

import com.esmods.keepersofthestonestwo.world.inventory.KeepersBoxGUIPart2Menu;
import com.esmods.keepersofthestonestwo.network.KeepersBoxGUIPart2ButtonMessage;
import com.esmods.keepersofthestonestwo.PowerMod;

public class KeepersBoxGUIPart2Screen extends AbstractContainerScreen<KeepersBoxGUIPart2Menu> {
	private final static HashMap<String, Object> guistate = KeepersBoxGUIPart2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_keepers_box_button_up;
	ImageButton imagebutton_keepers_box_button_down;
	ImageButton imagebutton_keepers_box_slot;
	ImageButton imagebutton_keepers_box_slot1;
	ImageButton imagebutton_keepers_box_slot2;
	ImageButton imagebutton_keepers_box_slot3;
	ImageButton imagebutton_keepers_box_slot4;

	public KeepersBoxGUIPart2Screen(KeepersBoxGUIPart2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 267;
		this.imageHeight = 188;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 44 && mouseX < leftPos + 68 && mouseY > topPos + 64 && mouseY < topPos + 88)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_2.tooltip_creation"), mouseX, mouseY);
		if (mouseX > leftPos + 91 && mouseX < leftPos + 115 && mouseY > topPos + 65 && mouseY < topPos + 89)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_2.tooltip_time"), mouseX, mouseY);
		if (mouseX > leftPos + 134 && mouseX < leftPos + 158 && mouseY > topPos + 65 && mouseY < topPos + 89)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_2.tooltip_sound"), mouseX, mouseY);
		if (mouseX > leftPos + 182 && mouseX < leftPos + 206 && mouseY > topPos + 64 && mouseY < topPos + 88)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_2.tooltip_air"), mouseX, mouseY);
		if (mouseX > leftPos + 181 && mouseX < leftPos + 205 && mouseY > topPos + 101 && mouseY < topPos + 125)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_2.tooltip_tornado"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("power:textures/screens/keepers_box_gui_part_2.png"), this.leftPos + 5, this.topPos + -34, 0, 0, 240, 260, 240, 260);

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
		imagebutton_keepers_box_button_up = new ImageButton(this.leftPos + 209, this.topPos + 70, 18, 18, 0, 0, 18, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_button_up.png"), 18, 36, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new KeepersBoxGUIPart2ButtonMessage(0, x, y, z));
				KeepersBoxGUIPart2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_keepers_box_button_up", imagebutton_keepers_box_button_up);
		this.addRenderableWidget(imagebutton_keepers_box_button_up);
		imagebutton_keepers_box_button_down = new ImageButton(this.leftPos + 209, this.topPos + 103, 18, 18, 0, 0, 18, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_button_down.png"), 18, 36, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new KeepersBoxGUIPart2ButtonMessage(1, x, y, z));
				KeepersBoxGUIPart2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_keepers_box_button_down", imagebutton_keepers_box_button_down);
		this.addRenderableWidget(imagebutton_keepers_box_button_down);
		imagebutton_keepers_box_slot = new ImageButton(this.leftPos + 49, this.topPos + 69, 16, 16, 0, 0, 16, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_slot.png"), 16, 32, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new KeepersBoxGUIPart2ButtonMessage(2, x, y, z));
				KeepersBoxGUIPart2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_keepers_box_slot", imagebutton_keepers_box_slot);
		this.addRenderableWidget(imagebutton_keepers_box_slot);
		imagebutton_keepers_box_slot1 = new ImageButton(this.leftPos + 95, this.topPos + 69, 16, 16, 0, 0, 16, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_slot1.png"), 16, 32, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new KeepersBoxGUIPart2ButtonMessage(3, x, y, z));
				KeepersBoxGUIPart2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_keepers_box_slot1", imagebutton_keepers_box_slot1);
		this.addRenderableWidget(imagebutton_keepers_box_slot1);
		imagebutton_keepers_box_slot2 = new ImageButton(this.leftPos + 138, this.topPos + 69, 16, 16, 0, 0, 16, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_slot2.png"), 16, 32, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new KeepersBoxGUIPart2ButtonMessage(4, x, y, z));
				KeepersBoxGUIPart2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_keepers_box_slot2", imagebutton_keepers_box_slot2);
		this.addRenderableWidget(imagebutton_keepers_box_slot2);
		imagebutton_keepers_box_slot3 = new ImageButton(this.leftPos + 184, this.topPos + 69, 16, 16, 0, 0, 16, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_slot3.png"), 16, 32, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new KeepersBoxGUIPart2ButtonMessage(5, x, y, z));
				KeepersBoxGUIPart2ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_keepers_box_slot3", imagebutton_keepers_box_slot3);
		this.addRenderableWidget(imagebutton_keepers_box_slot3);
		imagebutton_keepers_box_slot4 = new ImageButton(this.leftPos + 184, this.topPos + 106, 16, 16, 0, 0, 16, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_slot4.png"), 16, 32, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new KeepersBoxGUIPart2ButtonMessage(6, x, y, z));
				KeepersBoxGUIPart2ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_keepers_box_slot4", imagebutton_keepers_box_slot4);
		this.addRenderableWidget(imagebutton_keepers_box_slot4);
	}
}
