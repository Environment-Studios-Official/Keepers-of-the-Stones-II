package com.esmods.keepersofthestonestwo.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import javax.annotation.Nullable;

import com.esmods.keepersofthestonestwo.network.KeepersOfTheStones2ModVariables;
import com.esmods.keepersofthestonestwo.init.KeepersOfTheStones2ModItems;
import com.esmods.keepersofthestonestwo.init.KeepersOfTheStones2ModGameRules;
import com.esmods.keepersofthestonestwo.KeepersOfTheStones2Mod;

@Mod.EventBusSubscriber
public class GettingStoneProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		if (world.getLevelData().getGameRules().getBoolean(KeepersOfTheStones2ModGameRules.STONE_DISTRIBUTION) == true) {
			if (!(entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).active) {
				if (!(entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new KeepersOfTheStones2ModVariables.PlayerVariables())).selected) {
					random = Mth.nextInt(RandomSource.create(), 1, 26);
					if (random == 1) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).fire_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.FIRE_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).fire_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 2) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).air_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.AIR_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).air_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 3) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).earth_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.EARTH_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).earth_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 4) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).water_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.WATER_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).water_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 5) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).ether_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.ETHER_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).ether_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 6) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).ice_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.ICE_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).ice_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 7) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).lightning_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.LIGHTNING_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).lightning_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 8) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).sound_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.SOUND_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).sound_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 9) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).crystal_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.CRYSTAL_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).crystal_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 10) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).lava_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.LAVA_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).lava_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 11) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).rain_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.RAIN_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).rain_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 12) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).tornado_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.TORNADO_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).tornado_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 13) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).ocean_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.OCEAN_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).tornado_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 14) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).plants_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.PLANTS_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).plants_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 15) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).animals_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.ANIMALS_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).animals_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 16) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).metal_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.METAL_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).metal_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 17) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).light_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.LIGHT_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).light_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 18) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).shadow_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.SHADOW_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).shadow_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 19) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).vacuum_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.VACUUM_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).vacuum_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 20) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).energy_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.ENERGY_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).energy_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 21) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).sun_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.SUN_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).sun_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 22) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).moon_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.MOON_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).moon_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 23) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).space_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.SPACE_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).space_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 24) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).space_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.TIME_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).space_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
					if (random == 25) {
						if (!KeepersOfTheStones2ModVariables.MapVariables.get(world).creation_stone) {
							KeepersOfTheStones2Mod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(KeepersOfTheStones2ModItems.CREATION_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								KeepersOfTheStones2ModVariables.MapVariables.get(world).creation_stone = true;
								KeepersOfTheStones2ModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(KeepersOfTheStones2ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.selected = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
						} else {
							GettingStoneProcedure.execute(world, entity);
						}
					}
				}
			}
		}
	}
}
