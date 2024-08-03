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

import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesTimeMenu;
import com.esmods.keepersofthestonestwo.procedures.GetWheelTwoProcedure;
import com.esmods.keepersofthestonestwo.procedures.GetWheelTwoOrFirstFakeProcedure;
import com.esmods.keepersofthestonestwo.procedures.GetWheelThreeProcedure;
import com.esmods.keepersofthestonestwo.procedures.GetFakeWheelTwoProcedure;
import com.esmods.keepersofthestonestwo.procedures.GetFakeWheelThirdProcedure;
import com.esmods.keepersofthestonestwo.procedures.GetFakeWheelOneProcedure;
import com.esmods.keepersofthestonestwo.network.WheelAbilitiesTimeButtonMessage;

public class WheelAbilitiesTimeScreen extends AbstractContainerScreen<WheelAbilitiesTimeMenu> {
	private final static HashMap<String, Object> guistate = WheelAbilitiesTimeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_wheel_button_1;
	ImageButton imagebutton_wheel_button_2;
	ImageButton imagebutton_wheel_button_3;
	ImageButton imagebutton_fake_wheel_button_1;
	ImageButton imagebutton_fake_wheel_button_2;
	ImageButton imagebutton_fake_wheel_button_3;
	ImageButton imagebutton_time_stopping;
	ImageButton imagebutton_time_dilation;
	ImageButton imagebutton_acceleration_time;

	public WheelAbilitiesTimeScreen(WheelAbilitiesTimeMenu container, Inventory inventory, Component text) {
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
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 82 && mouseX < leftPos + 106 && mouseY > topPos + 22 && mouseY < topPos + 46)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.wheel_abilities_time.tooltip_stopping_time_uses_30"), mouseX, mouseY);
		if (mouseX > leftPos + 144 && mouseX < leftPos + 168 && mouseY > topPos + 84 && mouseY < topPos + 108)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.wheel_abilities_time.tooltip_time_dilation_uses_30"), mouseX, mouseY);
		if (mouseX > leftPos + 82 && mouseX < leftPos + 106 && mouseY > topPos + 146 && mouseY < topPos + 170)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.wheel_abilities_time.tooltip_acceleration_of_time_uses_30"), mouseX, mouseY);
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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		imagebutton_wheel_button_1 = new ImageButton(this.leftPos + 140, this.topPos + 154, 10, 7,
				new WidgetSprites(new ResourceLocation("power:textures/screens/wheel_button_1.png"), new ResourceLocation("power:textures/screens/wheel_button_1_highlight.png")), e -> {
					if (GetWheelTwoOrFirstFakeProcedure.execute(entity)) {
						PacketDistributor.SERVER.noArg().send(new WheelAbilitiesTimeButtonMessage(0, x, y, z));
						WheelAbilitiesTimeButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (GetWheelTwoOrFirstFakeProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_wheel_button_1", imagebutton_wheel_button_1);
		this.addRenderableWidget(imagebutton_wheel_button_1);
		imagebutton_wheel_button_2 = new ImageButton(this.leftPos + 152, this.topPos + 154, 10, 7,
				new WidgetSprites(new ResourceLocation("power:textures/screens/wheel_button_2.png"), new ResourceLocation("power:textures/screens/wheel_button_2_highlight.png")), e -> {
					if (GetWheelTwoProcedure.execute(entity)) {
						PacketDistributor.SERVER.noArg().send(new WheelAbilitiesTimeButtonMessage(1, x, y, z));
						WheelAbilitiesTimeButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (GetWheelTwoProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_wheel_button_2", imagebutton_wheel_button_2);
		this.addRenderableWidget(imagebutton_wheel_button_2);
		imagebutton_wheel_button_3 = new ImageButton(this.leftPos + 164, this.topPos + 154, 10, 7,
				new WidgetSprites(new ResourceLocation("power:textures/screens/wheel_button_3.png"), new ResourceLocation("power:textures/screens/wheel_button_3_highlight.png")), e -> {
					if (GetWheelThreeProcedure.execute(entity)) {
						PacketDistributor.SERVER.noArg().send(new WheelAbilitiesTimeButtonMessage(2, x, y, z));
						WheelAbilitiesTimeButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (GetWheelThreeProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_wheel_button_3", imagebutton_wheel_button_3);
		this.addRenderableWidget(imagebutton_wheel_button_3);
		imagebutton_fake_wheel_button_1 = new ImageButton(this.leftPos + 140, this.topPos + 164, 10, 7,
				new WidgetSprites(new ResourceLocation("power:textures/screens/fake_wheel_button_1.png"), new ResourceLocation("power:textures/screens/fake_wheel_button_1_highlight.png")), e -> {
					if (GetFakeWheelOneProcedure.execute(entity)) {
						PacketDistributor.SERVER.noArg().send(new WheelAbilitiesTimeButtonMessage(3, x, y, z));
						WheelAbilitiesTimeButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (GetFakeWheelOneProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_fake_wheel_button_1", imagebutton_fake_wheel_button_1);
		this.addRenderableWidget(imagebutton_fake_wheel_button_1);
		imagebutton_fake_wheel_button_2 = new ImageButton(this.leftPos + 152, this.topPos + 164, 10, 7,
				new WidgetSprites(new ResourceLocation("power:textures/screens/fake_wheel_button_2.png"), new ResourceLocation("power:textures/screens/fake_wheel_button_2_highlight.png")), e -> {
					if (GetFakeWheelTwoProcedure.execute(entity)) {
						PacketDistributor.SERVER.noArg().send(new WheelAbilitiesTimeButtonMessage(4, x, y, z));
						WheelAbilitiesTimeButtonMessage.handleButtonAction(entity, 4, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (GetFakeWheelTwoProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_fake_wheel_button_2", imagebutton_fake_wheel_button_2);
		this.addRenderableWidget(imagebutton_fake_wheel_button_2);
		imagebutton_fake_wheel_button_3 = new ImageButton(this.leftPos + 164, this.topPos + 164, 10, 7,
				new WidgetSprites(new ResourceLocation("power:textures/screens/fake_wheel_button_3.png"), new ResourceLocation("power:textures/screens/fake_wheel_button_3_highlight.png")), e -> {
					if (GetFakeWheelThirdProcedure.execute(entity)) {
						PacketDistributor.SERVER.noArg().send(new WheelAbilitiesTimeButtonMessage(5, x, y, z));
						WheelAbilitiesTimeButtonMessage.handleButtonAction(entity, 5, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (GetFakeWheelThirdProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_fake_wheel_button_3", imagebutton_fake_wheel_button_3);
		this.addRenderableWidget(imagebutton_fake_wheel_button_3);
		imagebutton_time_stopping = new ImageButton(this.leftPos + 72, this.topPos + 12, 46, 46,
				new WidgetSprites(new ResourceLocation("power:textures/screens/time_stopping.png"), new ResourceLocation("power:textures/screens/time_stopping_highlight.png")), e -> {
					if (true) {
						PacketDistributor.SERVER.noArg().send(new WheelAbilitiesTimeButtonMessage(6, x, y, z));
						WheelAbilitiesTimeButtonMessage.handleButtonAction(entity, 6, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_time_stopping", imagebutton_time_stopping);
		this.addRenderableWidget(imagebutton_time_stopping);
		imagebutton_time_dilation = new ImageButton(this.leftPos + 133, this.topPos + 73, 46, 46,
				new WidgetSprites(new ResourceLocation("power:textures/screens/time_dilation.png"), new ResourceLocation("power:textures/screens/time_dilation_highlight.png")), e -> {
					if (true) {
						PacketDistributor.SERVER.noArg().send(new WheelAbilitiesTimeButtonMessage(7, x, y, z));
						WheelAbilitiesTimeButtonMessage.handleButtonAction(entity, 7, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_time_dilation", imagebutton_time_dilation);
		this.addRenderableWidget(imagebutton_time_dilation);
		imagebutton_acceleration_time = new ImageButton(this.leftPos + 72, this.topPos + 134, 46, 46,
				new WidgetSprites(new ResourceLocation("power:textures/screens/acceleration_time.png"), new ResourceLocation("power:textures/screens/acceleration_time_highlight.png")), e -> {
					if (true) {
						PacketDistributor.SERVER.noArg().send(new WheelAbilitiesTimeButtonMessage(8, x, y, z));
						WheelAbilitiesTimeButtonMessage.handleButtonAction(entity, 8, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_acceleration_time", imagebutton_acceleration_time);
		this.addRenderableWidget(imagebutton_acceleration_time);
	}
}
