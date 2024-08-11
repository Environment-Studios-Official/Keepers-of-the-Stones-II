package com.esmods.keepersofthestonestwo.configuration;

import net.neoforged.neoforge.common.ModConfigSpec;

public class PowerConfigConfiguration {
	public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
	public static final ModConfigSpec SPEC;
	public static final ModConfigSpec.ConfigValue<Double> THE_DURATION_OF_THE_STONE_POWER;
	public static final ModConfigSpec.ConfigValue<Double> RECHARGE_TIME_OF_THE_STONE;
	static {
		BUILDER.push("basic_settings");
		THE_DURATION_OF_THE_STONE_POWER = BUILDER.comment("Sets the base duration value for the master effect").define("master_effect_duration", (double) 600);
		RECHARGE_TIME_OF_THE_STONE = BUILDER.comment("Sets the recharge time of the stone").define("recharge_time_of_the_stone", (double) 300);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
