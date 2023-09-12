package ru.power_umc.keepersofthestones.two.client.gui;

import ru.power_umc.keepersofthestones.two.world.inventory.WheelAbilitiesAirMenu;
import ru.power_umc.keepersofthestones.two.procedures.GetPowerScaleProcedure;
import ru.power_umc.keepersofthestones.two.network.WheelAbilitiesAirButtonMessage;
import ru.power_umc.keepersofthestones.two.PowerMod;

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

public class WheelAbilitiesAirScreen extends AbstractContainerScreen<WheelAbilitiesAirMenu> {
	private final static HashMap<String, Object> guistate = WheelAbilitiesAirMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_air_flow;
	ImageButton imagebutton_wind_gust;
	ImageButton imagebutton_air_flight;

	public WheelAbilitiesAirScreen(WheelAbilitiesAirMenu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("power:textures/screens/wheel_of_abilities.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 192, 192, 192, 192);

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
		guiGraphics.drawString(this.font,

				GetPowerScaleProcedure.execute(entity), 86, 92, -3355444, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_air_flow = new ImageButton(this.leftPos + 72, this.topPos + 12, 46, 46, 0, 0, 46, new ResourceLocation("power:textures/screens/atlas/imagebutton_air_flow.png"), 46, 92, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesAirButtonMessage(0, x, y, z));
				WheelAbilitiesAirButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_air_flow", imagebutton_air_flow);
		this.addRenderableWidget(imagebutton_air_flow);
		imagebutton_wind_gust = new ImageButton(this.leftPos + 133, this.topPos + 73, 46, 46, 0, 0, 46, new ResourceLocation("power:textures/screens/atlas/imagebutton_wind_gust.png"), 46, 92, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesAirButtonMessage(1, x, y, z));
				WheelAbilitiesAirButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_wind_gust", imagebutton_wind_gust);
		this.addRenderableWidget(imagebutton_wind_gust);
		imagebutton_air_flight = new ImageButton(this.leftPos + 11, this.topPos + 73, 46, 46, 0, 0, 46, new ResourceLocation("power:textures/screens/atlas/imagebutton_air_flight.png"), 46, 92, e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new WheelAbilitiesAirButtonMessage(2, x, y, z));
				WheelAbilitiesAirButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_air_flight", imagebutton_air_flight);
		this.addRenderableWidget(imagebutton_air_flight);
	}
}
