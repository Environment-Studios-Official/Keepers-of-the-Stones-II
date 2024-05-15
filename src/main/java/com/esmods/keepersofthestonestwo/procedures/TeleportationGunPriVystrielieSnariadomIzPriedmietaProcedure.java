package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import com.esmods.keepersofthestonestwo.init.PowerModItems;

public class TeleportationGunPriVystrielieSnariadomIzPriedmietaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(PowerModItems.TELEPORTATION_GUN.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
		}
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(PowerModItems.TELEPORTATION_GUN.get(), 45);
	}
}
