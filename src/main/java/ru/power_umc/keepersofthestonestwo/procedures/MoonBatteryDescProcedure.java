package ru.power_umc.keepersofthestonestwo.procedures;

import net.minecraft.network.chat.Component;

public class MoonBatteryDescProcedure {
	public static String execute() {
		return "\u00A7e\u00A7o" + Component.translatable("battery.desc.moon").getString();
	}
}
