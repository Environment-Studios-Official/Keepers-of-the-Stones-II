
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> STONE_DISTRIBUTION;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		STONE_DISTRIBUTION = GameRules.register("stoneDistribution", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	}
}
