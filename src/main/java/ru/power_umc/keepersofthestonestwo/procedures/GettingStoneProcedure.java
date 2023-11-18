package ru.power_umc.keepersofthestonestwo.procedures;

import ru.power_umc.keepersofthestonestwo.network.PowerModVariables;
import ru.power_umc.keepersofthestonestwo.init.PowerModItems;
import ru.power_umc.keepersofthestonestwo.init.PowerModGameRules;
import ru.power_umc.keepersofthestonestwo.PowerMod;

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
		if (world.getLevelData().getGameRules().getBoolean(PowerModGameRules.STONE_DISTRIBUTION) == true) {
			if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).active) {
				if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).selected) {
					random = Mth.nextInt(RandomSource.create(), 1, 13);
					if (random == 1) {
						if (!PowerModVariables.MapVariables.get(world).fire_stone) {
							PowerMod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(PowerModItems.FIRE_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								PowerModVariables.MapVariables.get(world).fire_stone = true;
								PowerModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
						if (!PowerModVariables.MapVariables.get(world).air_stone) {
							PowerMod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(PowerModItems.AIR_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								PowerModVariables.MapVariables.get(world).air_stone = true;
								PowerModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
						if (!PowerModVariables.MapVariables.get(world).earth_stone) {
							PowerMod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(PowerModItems.EARTH_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								PowerModVariables.MapVariables.get(world).earth_stone = true;
								PowerModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
						if (!PowerModVariables.MapVariables.get(world).water_stone) {
							PowerMod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(PowerModItems.WATER_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								PowerModVariables.MapVariables.get(world).water_stone = true;
								PowerModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
						if (!PowerModVariables.MapVariables.get(world).ether_stone) {
							PowerMod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(PowerModItems.ETHER_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								PowerModVariables.MapVariables.get(world).ether_stone = true;
								PowerModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
						if (!PowerModVariables.MapVariables.get(world).ice_stone) {
							PowerMod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(PowerModItems.ICE_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								PowerModVariables.MapVariables.get(world).ice_stone = true;
								PowerModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
						if (!PowerModVariables.MapVariables.get(world).lightning_stone) {
							PowerMod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(PowerModItems.LIGHTNING_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								PowerModVariables.MapVariables.get(world).lightning_stone = true;
								PowerModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
						if (!PowerModVariables.MapVariables.get(world).sound_stone) {
							PowerMod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(PowerModItems.SOUND_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								PowerModVariables.MapVariables.get(world).sound_stone = true;
								PowerModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
						if (!PowerModVariables.MapVariables.get(world).crystal_stone) {
							PowerMod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(PowerModItems.CRYSTAL_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								PowerModVariables.MapVariables.get(world).crystal_stone = true;
								PowerModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
						if (!PowerModVariables.MapVariables.get(world).lava_stone) {
							PowerMod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(PowerModItems.LAVA_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								PowerModVariables.MapVariables.get(world).lava_stone = true;
								PowerModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
						if (!PowerModVariables.MapVariables.get(world).rain_stone) {
							PowerMod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(PowerModItems.RAIN_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								PowerModVariables.MapVariables.get(world).rain_stone = true;
								PowerModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
						if (!PowerModVariables.MapVariables.get(world).tornado_stone) {
							PowerMod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(PowerModItems.TORNADO_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								PowerModVariables.MapVariables.get(world).tornado_stone = true;
								PowerModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
						if (!PowerModVariables.MapVariables.get(world).ocean_stone) {
							PowerMod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(PowerModItems.OCEAN_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								PowerModVariables.MapVariables.get(world).tornado_stone = true;
								PowerModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
						if (!PowerModVariables.MapVariables.get(world).plants_stone) {
							PowerMod.queueServerWork(1, () -> {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(PowerModItems.PLANTS_STONE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								PowerModVariables.MapVariables.get(world).plants_stone = true;
								PowerModVariables.MapVariables.get(world).syncData(world);
								{
									boolean _setval = true;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
