package ru.power_umc.keepersofthestonestwo.client.gui;

import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesVacuumMenu;
import ru.power_umc.keepersofthestonestwo.network.WheelAbilitiesVacuumButtonMessage;
import ru.power_umc.keepersofthestonestwo.PowerMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class WheelAbilitiesVacuumScreen extends AbstractContainerScreen<WheelAbilitiesVacuumMenu> {
	private final static HashMap<String, Object> guistate = WheelAbilitiesVacuumMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_1;
	Button button_2;
	Button button_3;

	public WheelAbilitiesVacuumScreen(WheelAbilitiesVacuumMenu container, Inventory inventory, Component text) {
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
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_1 = Button.builder(Component.translatable("gui.power.wheel_abilities_vacuum.button_1"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesVacuumButtonMessage(0, x, y, z));
				WheelAbilitiesVacuumButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 80, this.topPos + 24, 30, 20).build();
		guistate.put("button:button_1", button_1);
		this.addRenderableWidget(button_1);
		button_2 = Button.builder(Component.translatable("gui.power.wheel_abilities_vacuum.button_2"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesVacuumButtonMessage(1, x, y, z));
				WheelAbilitiesVacuumButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 142, this.topPos + 86, 30, 20).build();
		guistate.put("button:button_2", button_2);
		this.addRenderableWidget(button_2);
		button_3 = Button.builder(Component.translatable("gui.power.wheel_abilities_vacuum.button_3"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesVacuumButtonMessage(2, x, y, z));
				WheelAbilitiesVacuumButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 78, this.topPos + 146, 30, 20).build();
		guistate.put("button:button_3", button_3);
		this.addRenderableWidget(button_3);
	}
}
