package ru.power_umc.keepersofthestonestwo.procedures;

import net.minecraft.network.chat.Component;

public class LightningBatteryDescProcedure {
	public static String execute() {
		return "\u00A7b\u00A7o" + Component.translatable("battery.desc.ice").getString();
	}
}
