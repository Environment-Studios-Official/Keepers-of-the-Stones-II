package com.esmods.keepersofthestonestwo.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;
import com.esmods.keepersofthestonestwo.init.PowerModItems;

@Mod.EventBusSubscriber
public class ReturnStoneAfterDeadProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getData(PowerModVariables.PLAYER_VARIABLES).active) {
			if (!entity.getData(PowerModVariables.PLAYER_VARIABLES).battery) {
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("fire")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.FIRE_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("fire")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.FIRE_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("fire")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.FIRE_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("air")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.AIR_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("air")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.AIR_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("air")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.AIR_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("earth")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.EARTH_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("earth")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.EARTH_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("earth")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.EARTH_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("water")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.WATER_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("water")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.WATER_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("water")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.WATER_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("ether")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ETHER_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("ether")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ETHER_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("ether")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ETHER_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("ice")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ICE_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("ice")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ICE_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("ice")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ICE_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("lightning")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LIGHTNING_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("lightning")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LIGHTNING_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("lightning")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LIGHTNING_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("sound")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SOUND_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("sound")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SOUND_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("sound")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SOUND_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("crystal")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.CRYSTAL_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("crystal")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.CRYSTAL_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("crystal")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.CRYSTAL_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("lava")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LAVA_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("lava")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LAVA_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("lava")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LAVA_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("rain")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.RAIN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("rain")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.RAIN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("rain")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.RAIN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("tornado")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.TORNADO_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("tornado")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.TORNADO_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("tornado")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.TORNADO_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("ocean")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.OCEAN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("ocean")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.OCEAN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("ocean")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.OCEAN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("plants")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.PLANTS_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("plants")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.PLANTS_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("plants")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.PLANTS_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("animals")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ANIMALS_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("animals")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ANIMALS_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("animals")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ANIMALS_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("metal")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.METAL_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("metal")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.METAL_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("metal")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.METAL_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("light")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LIGHT_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("light")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LIGHT_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("light")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LIGHT_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("shadow")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SHADOW_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("shadow")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SHADOW_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("shadow")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SHADOW_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("vacuum")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.VACUUM_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("vacuum")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.VACUUM_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("vacuum")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.VACUUM_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("energy")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ENERGY_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("energy")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ENERGY_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("energy")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ENERGY_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("sun")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SUN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("sun")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SUN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("sun")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SUN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("moon")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.MOON_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("moon")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.MOON_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("moon")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.MOON_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("space")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SPACE_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("space")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SPACE_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("space")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SPACE_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("time")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.TIME_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("time")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.TIME_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("time")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.TIME_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("creation")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.CREATION_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("creation")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.CREATION_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("creation")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.CREATION_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_first).equals("destruction")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_first = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.DESTRUCTION_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_second).equals("destruction")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_second = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.DESTRUCTION_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).element_name_third).equals("destruction")) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_name_third = "0";
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.DESTRUCTION_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).element_name_first).equals("blood")) {
					{
						String _setval = "0";
						entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.BLOOD_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).element_name_second).equals("blood")) {
					{
						String _setval = "0";
						entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.BLOOD_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).element_name_third).equals("blood")) {
					{
						String _setval = "0";
						entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.BLOOD_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		}
	}
}
