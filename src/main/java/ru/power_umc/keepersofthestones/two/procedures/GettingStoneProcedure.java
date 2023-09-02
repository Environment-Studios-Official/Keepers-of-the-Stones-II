package ru.power_umc.keepersofthestones.two.procedures;

import ru.power_umc.keepersofthestones.two.network.PowerModVariables;
import ru.power_umc.keepersofthestones.two.init.PowerModItems;
import ru.power_umc.keepersofthestones.two.PowerMod;

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
		if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).active) {
			random = Mth.nextInt(RandomSource.create(), 1, 5);
			if (random == 1) {
				if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).fire_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.FIRE_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.fire_stone = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.active = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					GettingStoneProcedure.execute(world, entity);
				}
			}
			if (random == 2) {
				if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).air_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.AIR_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.air_stone = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.active = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					GettingStoneProcedure.execute(world, entity);
				}
			}
			if (random == 3) {
				if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).earth_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.EARTH_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.earth_stone = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.active = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					GettingStoneProcedure.execute(world, entity);
				}
			}
			if (random == 4) {
				if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).water_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.WATER_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.water_stone = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.active = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					GettingStoneProcedure.execute(world, entity);
				}
			}
			if (random == 5) {
				if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).ether_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.ETHER_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ether_stone = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.active = _setval;
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
