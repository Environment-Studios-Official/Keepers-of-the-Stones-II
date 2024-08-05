package com.esmods.keepersofthestonestwo.init;

import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.bus.api.SubscribeEvent;

import com.esmods.keepersofthestonestwo.configuration.PowerConfigConfiguration;
import com.esmods.keepersofthestonestwo.PowerMod;

@Mod.EventBusSubscriber(modid = PowerMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, PowerConfigConfiguration.SPEC, "power_config.toml");
		});
	}
}
