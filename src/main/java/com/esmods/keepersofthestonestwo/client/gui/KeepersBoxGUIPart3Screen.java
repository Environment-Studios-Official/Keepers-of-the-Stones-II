package com.esmods.keepersofthestonestwo.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

import com.esmods.keepersofthestonestwo.world.inventory.KeepersBoxGUIPart3Menu;
import com.esmods.keepersofthestonestwo.procedures.VacuumStoneCheckProcedure;
import com.esmods.keepersofthestonestwo.procedures.SunStoneCheckProcedure;
import com.esmods.keepersofthestonestwo.procedures.SpaceStoneCheckProcedure;
import com.esmods.keepersofthestonestwo.procedures.ShadowStoneCheckProcedure;
import com.esmods.keepersofthestonestwo.procedures.MoonStoneCheckProcedure;
import com.esmods.keepersofthestonestwo.procedures.LightStoneCheckProcedure;
import com.esmods.keepersofthestonestwo.procedures.BloodStoneCheckProcedure;
import com.esmods.keepersofthestonestwo.network.KeepersBoxGUIPart3ButtonMessage;

public class KeepersBoxGUIPart3Screen extends AbstractContainerScreen<KeepersBoxGUIPart3Menu> {
	private final static HashMap<String, Object> guistate = KeepersBoxGUIPart3Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_keepers_box_button_up;
	ImageButton imagebutton_keepers_box_button_down;
	ImageButton imagebutton_light_element;
	ImageButton imagebutton_shadow_element;
	ImageButton imagebutton_sun_element;
	ImageButton imagebutton_space_element;
	ImageButton imagebutton_moon_element;
	ImageButton imagebutton_vacuum_element;
	ImageButton imagebutton_blood_element;

	public KeepersBoxGUIPart3Screen(KeepersBoxGUIPart3Menu container, Inventory inventory, Component text) {
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
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (LightStoneCheckProcedure.execute(world))
			if (mouseX > leftPos + 91 && mouseX < leftPos + 115 && mouseY > topPos + 64 && mouseY < topPos + 88)
				guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_3.tooltip_light"), mouseX, mouseY);
		if (ShadowStoneCheckProcedure.execute(world))
			if (mouseX > leftPos + 134 && mouseX < leftPos + 158 && mouseY > topPos + 64 && mouseY < topPos + 88)
				guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_3.tooltip_shadow"), mouseX, mouseY);
		if (SunStoneCheckProcedure.execute(world))
			if (mouseX > leftPos + 158 && mouseX < leftPos + 182 && mouseY > topPos + 64 && mouseY < topPos + 88)
				guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_3.tooltip_sun"), mouseX, mouseY);
		if (SpaceStoneCheckProcedure.execute(world))
			if (mouseX > leftPos + 182 && mouseX < leftPos + 206 && mouseY > topPos + 65 && mouseY < topPos + 89)
				guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_3.tooltip_space"), mouseX, mouseY);
		if (MoonStoneCheckProcedure.execute(world))
			if (mouseX > leftPos + 158 && mouseX < leftPos + 182 && mouseY > topPos + 102 && mouseY < topPos + 126)
				guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_3.tooltip_moon"), mouseX, mouseY);
		if (VacuumStoneCheckProcedure.execute(world))
			if (mouseX > leftPos + 182 && mouseX < leftPos + 206 && mouseY > topPos + 102 && mouseY < topPos + 126)
				guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_3.tooltip_vacuum"), mouseX, mouseY);
		if (mouseX > leftPos + 45 && mouseX < leftPos + 69 && mouseY > topPos + 65 && mouseY < topPos + 89)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.keepers_box_gui_part_3.tooltip_blood"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("power:textures/screens/keepers_box_gui_part_3.png"), this.leftPos + 5, this.topPos + -34, 0, 0, 240, 260, 240, 260);

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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		imagebutton_keepers_box_button_up = new ImageButton(this.leftPos + 209, this.topPos + 70, 18, 18,
				new WidgetSprites(new ResourceLocation("power:textures/screens/keepers_box_button_up.png"), new ResourceLocation("power:textures/screens/keepers_box_button_up_active.png")), e -> {
					if (true) {
						PacketDistributor.SERVER.noArg().send(new KeepersBoxGUIPart3ButtonMessage(0, x, y, z));
						KeepersBoxGUIPart3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_keepers_box_button_up", imagebutton_keepers_box_button_up);
		this.addRenderableWidget(imagebutton_keepers_box_button_up);
		imagebutton_keepers_box_button_down = new ImageButton(this.leftPos + 209, this.topPos + 103, 18, 18,
				new WidgetSprites(new ResourceLocation("power:textures/screens/keepers_box_button_down.png"), new ResourceLocation("power:textures/screens/keepers_box_button_down_active.png")), e -> {
					if (true) {
						PacketDistributor.SERVER.noArg().send(new KeepersBoxGUIPart3ButtonMessage(1, x, y, z));
						KeepersBoxGUIPart3ButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_keepers_box_button_down", imagebutton_keepers_box_button_down);
		this.addRenderableWidget(imagebutton_keepers_box_button_down);
		imagebutton_light_element = new ImageButton(this.leftPos + 95, this.topPos + 69, 16, 16,
				new WidgetSprites(new ResourceLocation("power:textures/screens/light_element.png"), new ResourceLocation("power:textures/screens/light_element_highlighted.png")), e -> {
					if (LightStoneCheckProcedure.execute(world)) {
						PacketDistributor.SERVER.noArg().send(new KeepersBoxGUIPart3ButtonMessage(2, x, y, z));
						KeepersBoxGUIPart3ButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (LightStoneCheckProcedure.execute(world))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_light_element", imagebutton_light_element);
		this.addRenderableWidget(imagebutton_light_element);
		imagebutton_shadow_element = new ImageButton(this.leftPos + 138, this.topPos + 69, 16, 16,
				new WidgetSprites(new ResourceLocation("power:textures/screens/shadow_element.png"), new ResourceLocation("power:textures/screens/shadow_element_highlighted.png")), e -> {
					if (ShadowStoneCheckProcedure.execute(world)) {
						PacketDistributor.SERVER.noArg().send(new KeepersBoxGUIPart3ButtonMessage(3, x, y, z));
						KeepersBoxGUIPart3ButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (ShadowStoneCheckProcedure.execute(world))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_shadow_element", imagebutton_shadow_element);
		this.addRenderableWidget(imagebutton_shadow_element);
		imagebutton_sun_element = new ImageButton(this.leftPos + 162, this.topPos + 69, 16, 16,
				new WidgetSprites(new ResourceLocation("power:textures/screens/sun_element.png"), new ResourceLocation("power:textures/screens/sun_element_highlighted.png")), e -> {
					if (SunStoneCheckProcedure.execute(world)) {
						PacketDistributor.SERVER.noArg().send(new KeepersBoxGUIPart3ButtonMessage(4, x, y, z));
						KeepersBoxGUIPart3ButtonMessage.handleButtonAction(entity, 4, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SunStoneCheckProcedure.execute(world))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_sun_element", imagebutton_sun_element);
		this.addRenderableWidget(imagebutton_sun_element);
		imagebutton_space_element = new ImageButton(this.leftPos + 184, this.topPos + 69, 16, 16,
				new WidgetSprites(new ResourceLocation("power:textures/screens/space_element.png"), new ResourceLocation("power:textures/screens/space_element_highlighted.png")), e -> {
					if (SpaceStoneCheckProcedure.execute(world)) {
						PacketDistributor.SERVER.noArg().send(new KeepersBoxGUIPart3ButtonMessage(5, x, y, z));
						KeepersBoxGUIPart3ButtonMessage.handleButtonAction(entity, 5, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SpaceStoneCheckProcedure.execute(world))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_space_element", imagebutton_space_element);
		this.addRenderableWidget(imagebutton_space_element);
		imagebutton_moon_element = new ImageButton(this.leftPos + 162, this.topPos + 106, 16, 16,
				new WidgetSprites(new ResourceLocation("power:textures/screens/moon_element.png"), new ResourceLocation("power:textures/screens/moon_element_highlighted.png")), e -> {
					if (MoonStoneCheckProcedure.execute(world)) {
						PacketDistributor.SERVER.noArg().send(new KeepersBoxGUIPart3ButtonMessage(6, x, y, z));
						KeepersBoxGUIPart3ButtonMessage.handleButtonAction(entity, 6, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (MoonStoneCheckProcedure.execute(world))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_moon_element", imagebutton_moon_element);
		this.addRenderableWidget(imagebutton_moon_element);
		imagebutton_vacuum_element = new ImageButton(this.leftPos + 184, this.topPos + 106, 16, 16,
				new WidgetSprites(new ResourceLocation("power:textures/screens/vacuum_element.png"), new ResourceLocation("power:textures/screens/vacuum_element_highlighted.png")), e -> {
					if (VacuumStoneCheckProcedure.execute(world)) {
						PacketDistributor.SERVER.noArg().send(new KeepersBoxGUIPart3ButtonMessage(7, x, y, z));
						KeepersBoxGUIPart3ButtonMessage.handleButtonAction(entity, 7, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (VacuumStoneCheckProcedure.execute(world))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_vacuum_element", imagebutton_vacuum_element);
		this.addRenderableWidget(imagebutton_vacuum_element);
		imagebutton_blood_element = new ImageButton(this.leftPos + 49, this.topPos + 69, 16, 16,
				new WidgetSprites(new ResourceLocation("power:textures/screens/blood_element.png"), new ResourceLocation("power:textures/screens/blood_element_highlighted.png")), e -> {
					if (BloodStoneCheckProcedure.execute(world)) {
						PacketDistributor.SERVER.noArg().send(new KeepersBoxGUIPart3ButtonMessage(8, x, y, z));
						KeepersBoxGUIPart3ButtonMessage.handleButtonAction(entity, 8, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (BloodStoneCheckProcedure.execute(world))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_blood_element", imagebutton_blood_element);
		this.addRenderableWidget(imagebutton_blood_element);
	}
}
