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

import com.esmods.keepersofthestonestwo.world.inventory.KeepersBoxGUIPart1Menu;
import com.esmods.keepersofthestonestwo.network.KeepersBoxGUIPart1ButtonMessage;
import com.esmods.keepersofthestonestwo.PowerMod;

public class KeepersBoxGUIPart1Screen extends AbstractContainerScreen<KeepersBoxGUIPart1Menu> {
	private final static HashMap<String, Object> guistate = KeepersBoxGUIPart1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_keepers_box_button_down;
	ImageButton imagebutton_keepers_box_button_up_locked;
	ImageButton imagebutton_keepers_box_slot;
	ImageButton imagebutton_keepers_box_slot1;
	ImageButton imagebutton_keepers_box_slot2;
	ImageButton imagebutton_keepers_box_slot3;
	ImageButton imagebutton_keepers_box_slot4;
	ImageButton imagebutton_keepers_box_slot5;
	ImageButton imagebutton_keepers_box_slot6;
	ImageButton imagebutton_keepers_box_slot7;

	public KeepersBoxGUIPart1Screen(KeepersBoxGUIPart1Menu container, Inventory inventory, Component text) {
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
		if (mouseX > leftPos + 45 && mouseX < leftPos + 69 && mouseY > topPos + 65 && mouseY < topPos + 89)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_1.tooltip_fire"), mouseX, mouseY);
		if (mouseX > leftPos + 92 && mouseX < leftPos + 116 && mouseY > topPos + 65 && mouseY < topPos + 89)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_1.tooltip_lava"), mouseX, mouseY);
		if (mouseX > leftPos + 158 && mouseX < leftPos + 182 && mouseY > topPos + 65 && mouseY < topPos + 89)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_1.tooltip_energy"), mouseX, mouseY);
		if (mouseX > leftPos + 134 && mouseX < leftPos + 158 && mouseY > topPos + 102 && mouseY < topPos + 126)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_1.tooltip_rain"), mouseX, mouseY);
		if (mouseX > leftPos + 159 && mouseX < leftPos + 183 && mouseY > topPos + 102 && mouseY < topPos + 126)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_1.tooltip_lightning"), mouseX, mouseY);
		if (mouseX > leftPos + 44 && mouseX < leftPos + 68 && mouseY > topPos + 101 && mouseY < topPos + 125)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_1.tooltip_water"), mouseX, mouseY);
		if (mouseX > leftPos + 68 && mouseX < leftPos + 92 && mouseY > topPos + 102 && mouseY < topPos + 126)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_1.tooltip_ocean"), mouseX, mouseY);
		if (mouseX > leftPos + 92 && mouseX < leftPos + 116 && mouseY > topPos + 102 && mouseY < topPos + 126)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_1.tooltip_ice"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("power:textures/screens/keepers_box_gui_part_1.png"), this.leftPos + 5, this.topPos + -34, 0, 0, 240, 260, 240, 260);

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
		imagebutton_keepers_box_button_down = new ImageButton(this.leftPos + 209, this.topPos + 103, 18, 18, 0, 0, 18, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_button_down.png"), 18, 36, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new KeepersBoxGUIPart1ButtonMessage(0, x, y, z));
				KeepersBoxGUIPart1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_keepers_box_button_down", imagebutton_keepers_box_button_down);
		this.addRenderableWidget(imagebutton_keepers_box_button_down);
		imagebutton_keepers_box_button_up_locked = new ImageButton(this.leftPos + 209, this.topPos + 70, 18, 18, 0, 0, 18, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_button_up_locked.png"), 18, 36, e -> {
		});
		guistate.put("button:imagebutton_keepers_box_button_up_locked", imagebutton_keepers_box_button_up_locked);
		this.addRenderableWidget(imagebutton_keepers_box_button_up_locked);
		imagebutton_keepers_box_slot = new ImageButton(this.leftPos + 49, this.topPos + 69, 16, 16, 0, 0, 16, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_slot.png"), 16, 32, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new KeepersBoxGUIPart1ButtonMessage(2, x, y, z));
				KeepersBoxGUIPart1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_keepers_box_slot", imagebutton_keepers_box_slot);
		this.addRenderableWidget(imagebutton_keepers_box_slot);
		imagebutton_keepers_box_slot1 = new ImageButton(this.leftPos + 95, this.topPos + 69, 16, 16, 0, 0, 16, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_slot1.png"), 16, 32, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new KeepersBoxGUIPart1ButtonMessage(3, x, y, z));
				KeepersBoxGUIPart1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_keepers_box_slot1", imagebutton_keepers_box_slot1);
		this.addRenderableWidget(imagebutton_keepers_box_slot1);
		imagebutton_keepers_box_slot2 = new ImageButton(this.leftPos + 162, this.topPos + 69, 16, 16, 0, 0, 16, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_slot2.png"), 16, 32, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new KeepersBoxGUIPart1ButtonMessage(4, x, y, z));
				KeepersBoxGUIPart1ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_keepers_box_slot2", imagebutton_keepers_box_slot2);
		this.addRenderableWidget(imagebutton_keepers_box_slot2);
		imagebutton_keepers_box_slot3 = new ImageButton(this.leftPos + 138, this.topPos + 106, 16, 16, 0, 0, 16, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_slot3.png"), 16, 32, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new KeepersBoxGUIPart1ButtonMessage(5, x, y, z));
				KeepersBoxGUIPart1ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_keepers_box_slot3", imagebutton_keepers_box_slot3);
		this.addRenderableWidget(imagebutton_keepers_box_slot3);
		imagebutton_keepers_box_slot4 = new ImageButton(this.leftPos + 162, this.topPos + 106, 16, 16, 0, 0, 16, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_slot4.png"), 16, 32, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new KeepersBoxGUIPart1ButtonMessage(6, x, y, z));
				KeepersBoxGUIPart1ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_keepers_box_slot4", imagebutton_keepers_box_slot4);
		this.addRenderableWidget(imagebutton_keepers_box_slot4);
		imagebutton_keepers_box_slot5 = new ImageButton(this.leftPos + 49, this.topPos + 106, 16, 16, 0, 0, 16, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_slot5.png"), 16, 32, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new KeepersBoxGUIPart1ButtonMessage(7, x, y, z));
				KeepersBoxGUIPart1ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_keepers_box_slot5", imagebutton_keepers_box_slot5);
		this.addRenderableWidget(imagebutton_keepers_box_slot5);
		imagebutton_keepers_box_slot6 = new ImageButton(this.leftPos + 71, this.topPos + 106, 16, 16, 0, 0, 16, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_slot6.png"), 16, 32, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new KeepersBoxGUIPart1ButtonMessage(8, x, y, z));
				KeepersBoxGUIPart1ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_keepers_box_slot6", imagebutton_keepers_box_slot6);
		this.addRenderableWidget(imagebutton_keepers_box_slot6);
		imagebutton_keepers_box_slot7 = new ImageButton(this.leftPos + 95, this.topPos + 106, 16, 16, 0, 0, 16, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_slot7.png"), 16, 32, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new KeepersBoxGUIPart1ButtonMessage(9, x, y, z));
				KeepersBoxGUIPart1ButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_keepers_box_slot7", imagebutton_keepers_box_slot7);
		this.addRenderableWidget(imagebutton_keepers_box_slot7);
	}
}
