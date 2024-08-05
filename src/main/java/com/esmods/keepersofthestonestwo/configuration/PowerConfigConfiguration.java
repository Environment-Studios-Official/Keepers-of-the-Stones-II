package com.esmods.keepersofthestonestwo.configuration;

import net.neoforged.neoforge.common.ModConfigSpec;

public class PowerConfigConfiguration {
	public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
	public static final ModConfigSpec SPEC;
	public static final ModConfigSpec.ConfigValue<Boolean> MANAGE_VALUES_WHEN_USING_THE_CONFIG;
	public static final ModConfigSpec.ConfigValue<Double> THE_DURATION_OF_THE_STONE_POWER;
	public static final ModConfigSpec.ConfigValue<Double> RECHARGE_TIME_OF_THE_STONE;
	static {
		BUILDER.push("basic_settings");
		MANAGE_VALUES_WHEN_USING_THE_CONFIG = BUILDER.comment("Allows the configuration file to record static values").define("manage_values_when_using_the_config", false);
		THE_DURATION_OF_THE_STONE_POWER = BUILDER.comment("Allows you to change the duration of the master effect").define("master_effect_duration", (double) 6000);
		RECHARGE_TIME_OF_THE_STONE = BUILDER.comment("Sets the recharge time of the stone").define("recharge_time_of_the_stone", (double) 3000);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
