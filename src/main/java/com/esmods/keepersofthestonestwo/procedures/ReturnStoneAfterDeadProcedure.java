package com.esmods.keepersofthestonestwo.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import com.esmods.keepersofthestonestwo.network.KeepersOfTheStones2ModVariables;
import com.esmods.keepersofthestonestwo.init.KeepersOfTheStones2ModItems;

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
		if (!(entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).active) {
			if (!(entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).battery) {
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("fire")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.FIRE_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("fire")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.FIRE_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("fire")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.FIRE_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("air")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.AIR_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("air")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.AIR_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("air")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.AIR_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("earth")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.EARTH_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("earth")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.EARTH_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("earth")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.EARTH_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("water")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.WATER_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("water")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.WATER_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("water")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.WATER_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("ether")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.ETHER_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("ether")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.ETHER_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("ether")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.ETHER_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("ice")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.ICE_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("ice")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.ICE_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("ice")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.ICE_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("lightning")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.LIGHTNING_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("lightning")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.LIGHTNING_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("lightning")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.LIGHTNING_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("sound")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.SOUND_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("sound")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.SOUND_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("sound")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.SOUND_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("crystal")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.CRYSTAL_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("crystal")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.CRYSTAL_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("crystal")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.CRYSTAL_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("lava")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.LAVA_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("lava")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.LAVA_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("lava")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.LAVA_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("rain")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.RAIN_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("rain")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.RAIN_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("rain")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.RAIN_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("tornado")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.TORNADO_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("tornado")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.TORNADO_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("tornado")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.TORNADO_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("ocean")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.OCEAN_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("ocean")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.OCEAN_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("ocean")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.OCEAN_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("plants")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.PLANTS_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("plants")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.PLANTS_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("plants")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.PLANTS_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("animals")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.ANIMALS_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("animals")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.ANIMALS_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("animals")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.ANIMALS_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("metal")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.METAL_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("metal")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.METAL_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("metal")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.METAL_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("light")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.LIGHT_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("light")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.LIGHT_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("light")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.LIGHT_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("shadow")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.SHADOW_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("shadow")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.SHADOW_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("shadow")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.SHADOW_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("vacuum")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.VACUUM_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("vacuum")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.VACUUM_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("vacuum")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.VACUUM_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("energy")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.ENERGY_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("energy")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.ENERGY_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("energy")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.ENERGY_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("sun")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.SUN_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("sun")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.SUN_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("sun")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.SUN_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("moon")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.MOON_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("moon")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.MOON_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("moon")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.MOON_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("space")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.SPACE_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("space")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.SPACE_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("space")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.SPACE_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("time")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.TIME_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("time")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.TIME_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("time")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.TIME_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_first).equals("creation")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_first = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.CREATION_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_second).equals("creation")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.CREATION_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (((entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).element_name_third).equals("creation")) {
					{
						String _setval = "0";
						entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.element_name_third = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.CREATION_STONE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		}
	}
}
