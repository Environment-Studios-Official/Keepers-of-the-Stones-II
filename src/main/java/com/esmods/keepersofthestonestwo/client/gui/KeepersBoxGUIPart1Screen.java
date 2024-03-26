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

public class KeepersBoxGUIPart1Screen extends AbstractContainerScreen<KeepersBoxGUIPart1Menu> {
	private final static HashMap<String, Object> guistate = KeepersBoxGUIPart1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_keepers_box_slot;

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
		imagebutton_keepers_box_slot = new ImageButton(this.leftPos + 49, this.topPos + 69, 16, 16, 0, 0, 16, new ResourceLocation("power:textures/screens/atlas/imagebutton_keepers_box_slot.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_keepers_box_slot", imagebutton_keepers_box_slot);
		this.addRenderableWidget(imagebutton_keepers_box_slot);
	}
}
