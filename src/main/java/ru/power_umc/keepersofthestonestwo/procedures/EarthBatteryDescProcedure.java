package ru.power_umc.keepersofthestonestwo.procedures;

import net.minecraft.network.chat.Component;

public class EarthBatteryDescProcedure {
	public static String execute() {
		return "\u00A70\u00A7o" + Component.translatable("battery.desc.earth").getString();
	}
}
