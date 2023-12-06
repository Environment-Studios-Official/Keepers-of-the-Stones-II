package ru.power_umc.keepersofthestonestwo.procedures;

import net.minecraft.network.chat.Component;

public class FireBatteryDescProcedure {
	public static String execute() {
		return "\u00A74\u00A7o" + Component.translatable("battery.desc.fire").getString();
	}
}
