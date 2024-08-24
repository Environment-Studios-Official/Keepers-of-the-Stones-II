
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class PowerModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> LIMITED_NUMBER_OF_STONES;
	public static GameRules.Key<GameRules.BooleanValue> LIMIT_OF_STONES_FOR_ONE_PLAYER;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		LIMITED_NUMBER_OF_STONES = GameRules.register("limitedNumberOfStones", GameRules.Category.DROPS, GameRules.BooleanValue.create(true));
		LIMIT_OF_STONES_FOR_ONE_PLAYER = GameRules.register("limitOfStonesForOnePlayer", GameRules.Category.DROPS, GameRules.BooleanValue.create(true));
	}
}
