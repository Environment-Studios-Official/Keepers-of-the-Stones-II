package ru.power_umc.keepersofthestonestwo.procedures;

import ru.power_umc.keepersofthestonestwo.network.PowerModVariables;
import ru.power_umc.keepersofthestonestwo.init.PowerModItems;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class AnimalsMasterEndProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("power:stone_deactivation")), SoundSource.PLAYERS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("power:stone_deactivation")), SoundSource.PLAYERS, 1, 1, false);
			}
		}
		{
			PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
			_vars.active = false;
			_vars.syncPlayerVariables(entity);
		}
		{
			PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
			_vars.mergers = 0;
			_vars.syncPlayerVariables(entity);
		}
		if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_second == 15) {
			{
				PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
				_vars.element_id_second = 0;
				_vars.syncPlayerVariables(entity);
			}
		} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_third == 15) {
			{
				PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
				_vars.element_id_third = 0;
				_vars.syncPlayerVariables(entity);
			}
		} else if (entity.getData(PowerModVariables.PLAYER_VARIABLES).element_id_fist == 15) {
			{
				PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
				_vars.element_id_fist = 0;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(PowerModVariables.PLAYER_VARIABLES).battery == false) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.ANIMALS_STONE.get());
				_setstack.setCount(1);
				_setstack.getOrCreateTag().putDouble("rechargeStone", (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) ? 6000 : 0));
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			{
				PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
				_vars.battery = false;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
