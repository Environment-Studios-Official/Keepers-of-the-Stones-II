
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> STONE_DISTRIBUTION = GameRules.register("stoneDistribution", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
}
