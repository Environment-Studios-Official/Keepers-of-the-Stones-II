package ru.power_umc.keepersofthestonestwo.client.gui;

import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesIceMenu;
import ru.power_umc.keepersofthestonestwo.procedures.GetWheelTwoProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.GetWheelThreeProcedure;
import ru.power_umc.keepersofthestonestwo.network.WheelAbilitiesIceButtonMessage;

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

public class WheelAbilitiesIceScreen extends AbstractContainerScreen<WheelAbilitiesIceMenu> {
	private final static HashMap<String, Object> guistate = WheelAbilitiesIceMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_wheel_button_1;
	ImageButton imagebutton_wheel_button_2;
	ImageButton imagebutton_wheel_button_3;
	ImageButton imagebutton_freezing_ray;
	ImageButton imagebutton_ice_attack;
	ImageButton imagebutton_ice_trap;

	public WheelAbilitiesIceScreen(WheelAbilitiesIceMenu container, Inventory inventory, Component text) {
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
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.wheel_abilities_ice.tooltip_freezing_ray_uses_10"), mouseX, mouseY);
		if (mouseX > leftPos + 143 && mouseX < leftPos + 167 && mouseY > topPos + 84 && mouseY < topPos + 108)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.wheel_abilities_ice.tooltip_ice_attack_uses_30"), mouseX, mouseY);
		if (mouseX > leftPos + 82 && mouseX < leftPos + 106 && mouseY > topPos + 146 && mouseY < topPos + 170)
			guiGraphics.renderTooltip(font, Component.translatable("gui.power.wheel_abilities_ice.tooltip_ice_trap_uses_60"), mouseX, mouseY);
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
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_wheel_button_1 = new ImageButton(this.leftPos + 140, this.topPos + 154, 10, 7,
				new WidgetSprites(new ResourceLocation("power:textures/screens/wheel_button_1.png"), new ResourceLocation("power:textures/screens/wheel_button_1_highlight.png")), e -> {
					if (GetWheelTwoProcedure.execute(entity)) {
						PacketDistributor.SERVER.noArg().send(new WheelAbilitiesIceButtonMessage(0, x, y, z));
						WheelAbilitiesIceButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (GetWheelTwoProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_wheel_button_1", imagebutton_wheel_button_1);
		this.addRenderableWidget(imagebutton_wheel_button_1);
		imagebutton_wheel_button_2 = new ImageButton(this.leftPos + 152, this.topPos + 154, 10, 7,
				new WidgetSprites(new ResourceLocation("power:textures/screens/wheel_button_2.png"), new ResourceLocation("power:textures/screens/wheel_button_2_highlight.png")), e -> {
					if (GetWheelTwoProcedure.execute(entity)) {
						PacketDistributor.SERVER.noArg().send(new WheelAbilitiesIceButtonMessage(1, x, y, z));
						WheelAbilitiesIceButtonMessage.handleButtonAction(entity, 1, x, y, z);
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
						PacketDistributor.SERVER.noArg().send(new WheelAbilitiesIceButtonMessage(2, x, y, z));
						WheelAbilitiesIceButtonMessage.handleButtonAction(entity, 2, x, y, z);
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
		imagebutton_freezing_ray = new ImageButton(this.leftPos + 72, this.topPos + 12, 46, 46,
				new WidgetSprites(new ResourceLocation("power:textures/screens/freezing_ray.png"), new ResourceLocation("power:textures/screens/freezing_ray_highlight.png")), e -> {
					if (true) {
						PacketDistributor.SERVER.noArg().send(new WheelAbilitiesIceButtonMessage(3, x, y, z));
						WheelAbilitiesIceButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_freezing_ray", imagebutton_freezing_ray);
		this.addRenderableWidget(imagebutton_freezing_ray);
		imagebutton_ice_attack = new ImageButton(this.leftPos + 133, this.topPos + 73, 46, 46, new WidgetSprites(new ResourceLocation("power:textures/screens/ice_attack.png"), new ResourceLocation("power:textures/screens/ice_attack_highlight.png")),
				e -> {
					if (true) {
						PacketDistributor.SERVER.noArg().send(new WheelAbilitiesIceButtonMessage(4, x, y, z));
						WheelAbilitiesIceButtonMessage.handleButtonAction(entity, 4, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_ice_attack", imagebutton_ice_attack);
		this.addRenderableWidget(imagebutton_ice_attack);
		imagebutton_ice_trap = new ImageButton(this.leftPos + 72, this.topPos + 134, 46, 46, new WidgetSprites(new ResourceLocation("power:textures/screens/ice_trap.png"), new ResourceLocation("power:textures/screens/ice_trap_highlight.png")), e -> {
			if (true) {
				PacketDistributor.SERVER.noArg().send(new WheelAbilitiesIceButtonMessage(5, x, y, z));
				WheelAbilitiesIceButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_ice_trap", imagebutton_ice_trap);
		this.addRenderableWidget(imagebutton_ice_trap);
	}
}
