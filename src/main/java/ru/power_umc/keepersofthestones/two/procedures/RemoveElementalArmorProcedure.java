package ru.power_umc.keepersofthestones.two.procedures;

import ru.power_umc.keepersofthestones.two.network.PowerModVariables;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

public class RemoveElementalArmorProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).active == false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("power:elemental_armor")));
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
