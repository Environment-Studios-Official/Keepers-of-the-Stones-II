package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

public class SelectedElementTrueProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		try {
			for (Entity entityiterator : EntityArgument.getEntities(arguments, "players")) {
				{
					boolean _setval = !BoolArgumentType.getBool(arguments, "boolean");
					entityiterator.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.unlock_keepers_box = _setval;
						capability.syncPlayerVariables(entityiterator);
					});
				}
				{
					boolean _setval = BoolArgumentType.getBool(arguments, "boolean");
					entityiterator.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entityiterator);
					});
				}
			}
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
		}
	}
}
