package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

public class FakeElementSetProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		try {
			for (Entity entityiterator : EntityArgument.getEntities(arguments, "players")) {
				if ((StringArgumentType.getString(arguments, "element_order")).equals("first")) {
					{
						String _setval = StringArgumentType.getString(arguments, "element_name");
						entityiterator.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fake_element_name_first = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
				} else if ((StringArgumentType.getString(arguments, "element_order")).equals("second")) {
					{
						String _setval = StringArgumentType.getString(arguments, "element_name");
						entityiterator.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fake_element_name_second = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
				} else if ((StringArgumentType.getString(arguments, "element_order")).equals("third")) {
					{
						String _setval = StringArgumentType.getString(arguments, "element_name");
						entityiterator.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fake_element_name_third = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
				}
			}
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
		}
	}
}
