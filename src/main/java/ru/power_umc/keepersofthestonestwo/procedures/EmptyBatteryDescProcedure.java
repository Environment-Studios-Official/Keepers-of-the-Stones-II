package ru.power_umc.keepersofthestonestwo.procedures;

import net.minecraft.network.chat.Component;

public class EmptyBatteryDescProcedure {
	public static String execute() {
		return Component.translatable("battery.desc.empty").getString();
	}
}
