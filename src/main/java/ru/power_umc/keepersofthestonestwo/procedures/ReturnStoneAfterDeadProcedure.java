package ru.power_umc.keepersofthestonestwo.procedures;

import ru.power_umc.keepersofthestonestwo.network.PowerModVariables;
import ru.power_umc.keepersofthestonestwo.init.PowerModItems;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

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
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 1) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.FIRE_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 1) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.FIRE_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 1) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.FIRE_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 2) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.AIR_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 2) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.AIR_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 2) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.AIR_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 3) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.EARTH_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 3) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.EARTH_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 3) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.EARTH_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 4) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.WATER_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 4) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.WATER_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 4) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.WATER_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 5) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ETHER_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 5) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ETHER_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 5) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ETHER_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 6) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ICE_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 6) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ICE_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 6) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ICE_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 7) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LIGHTNING_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 7) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LIGHTNING_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 7) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LIGHTNING_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 8) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SOUND_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 8) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SOUND_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 8) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SOUND_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 9) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.CRYSTAL_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 9) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.CRYSTAL_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 9) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.CRYSTAL_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 10) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LAVA_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 10) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LAVA_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 10) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LAVA_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 11) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.RAIN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 11) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.RAIN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 11) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.RAIN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 12) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.TORNADO_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 12) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.TORNADO_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 12) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.TORNADO_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 13) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.OCEAN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 13) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.OCEAN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 13) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.OCEAN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 14) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.PLANTS_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 14) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.PLANTS_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 14) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.PLANTS_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 15) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ANIMALS_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 15) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ANIMALS_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 15) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ANIMALS_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 16) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.METAL_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 16) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.METAL_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 16) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.METAL_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 17) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LIGHT_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 17) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LIGHT_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 17) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.LIGHT_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 18) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SHADOW_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 18) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SHADOW_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 18) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SHADOW_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 19) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.VACUUM_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 19) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.VACUUM_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 19) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.VACUUM_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 20) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ENERGY_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 20) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ENERGY_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 20) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ENERGY_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 21) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_fist = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SUN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 21) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_second = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SUN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 21) {
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.element_id_third = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.SUN_STONE.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		}
	}
}
