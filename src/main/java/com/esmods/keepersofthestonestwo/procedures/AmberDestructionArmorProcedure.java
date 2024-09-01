package com.esmods.keepersofthestonestwo.procedures;

import net.neoforged.neoforge.event.entity.living.LivingAttackEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.ICancellableEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;
import com.esmods.keepersofthestonestwo.init.PowerModBlocks;
import com.esmods.keepersofthestonestwo.init.PowerModAttributes;

@Mod.EventBusSubscriber
public class AmberDestructionArmorProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((LivingEntity) entity).getAttribute(PowerModAttributes.SEALEDINAMBER.get()).getValue() == 1) {
			if (event instanceof ICancellableEvent _cancellable) {
				_cancellable.setCanceled(true);
			} else if (event != null && event.hasResult()) {
				event.setResult(Event.Result.DENY);
			}
			world.levelEvent(2001, BlockPos.containing(x, y + 1, z), Block.getId(PowerModBlocks.AMBER_BLOCK.get().defaultBlockState()));
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(PowerModBlocks.AMBER_BLOCK.get().defaultBlockState()));
			{
				PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
				_vars.ability_block = false;
				_vars.syncPlayerVariables(entity);
			}
			((LivingEntity) entity).getAttribute(PowerModAttributes.SEALEDINAMBER.get()).setBaseValue(0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.stone.break")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.stone.break")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
		}
	}
}
