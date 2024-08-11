package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;
import com.esmods.keepersofthestonestwo.init.PowerModBlocks;

public class TeleportationSpecialAttackProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean success = false;
		double Scaling = 0;
		double XPar = 0;
		double YPar = 0;
		double Range = 0;
		double ZPar = 0;
		double particleRadius = 0;
		double particleAmount = 0;
		if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).ability).equals("teleportation_attack_1")) {
			if (entity.getData(PowerModVariables.PLAYER_VARIABLES).power >= 40) {
				{
					PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
					_vars.teleporting_effect = 40;
					_vars.syncPlayerVariables(entity);
				}
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "spawnpoint @s ~ ~ ~");
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.chorus_fruit.teleport")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.chorus_fruit.teleport")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				{
					PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
					_vars.power = entity.getData(PowerModVariables.PLAYER_VARIABLES).power - 40;
					_vars.syncPlayerVariables(entity);
				}
			}
		} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).ability).equals("teleportation_attack_2")) {
			if (entity.getData(PowerModVariables.PLAYER_VARIABLES).power >= 40) {
				{
					PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
					_vars.teleporting_effect = 40;
					_vars.syncPlayerVariables(entity);
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(
							((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level().getLevelData().getXSpawn())
									: 0),
							((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level().getLevelData().getYSpawn())
									: 0),
							((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level().getLevelData().getZSpawn())
									: 0));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(
								((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level().getLevelData().getXSpawn())
										: 0),
								((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level().getLevelData().getYSpawn())
										: 0),
								((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level().getLevelData().getZSpawn())
										: 0),
								_ent.getYRot(), _ent.getXRot());
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.chorus_fruit.teleport")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.chorus_fruit.teleport")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				{
					PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
					_vars.power = entity.getData(PowerModVariables.PLAYER_VARIABLES).power - 40;
					_vars.syncPlayerVariables(entity);
				}
			}
		} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).ability).equals("teleportation_attack_3")) {
			if (entity.getData(PowerModVariables.PLAYER_VARIABLES).power >= 20) {
				if (!PowerModVariables.MapVariables.get(world).blue_portal_placed) {
					world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), PowerModBlocks.BLUE_PORTAL.get().defaultBlockState(), 3);
					PowerModVariables.MapVariables.get(world).blue_portal_placed = true;
					PowerModVariables.MapVariables.get(world).syncData(world);
					PowerModVariables.MapVariables.get(world).bpX = entity.getX();
					PowerModVariables.MapVariables.get(world).syncData(world);
					PowerModVariables.MapVariables.get(world).bpY = entity.getY();
					PowerModVariables.MapVariables.get(world).syncData(world);
					PowerModVariables.MapVariables.get(world).bpZ = entity.getZ();
					PowerModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.chorus_fruit.teleport")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.chorus_fruit.teleport")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				} else if (PowerModVariables.MapVariables.get(world).blue_portal_placed && !PowerModVariables.MapVariables.get(world).orange_portal_placed) {
					world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), PowerModBlocks.ORANGE_PORTAL.get().defaultBlockState(), 3);
					PowerModVariables.MapVariables.get(world).orange_portal_placed = true;
					PowerModVariables.MapVariables.get(world).syncData(world);
					PowerModVariables.MapVariables.get(world).opX = entity.getX();
					PowerModVariables.MapVariables.get(world).syncData(world);
					PowerModVariables.MapVariables.get(world).opY = entity.getY();
					PowerModVariables.MapVariables.get(world).syncData(world);
					PowerModVariables.MapVariables.get(world).opZ = entity.getZ();
					PowerModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.chorus_fruit.teleport")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.chorus_fruit.teleport")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				} else if (PowerModVariables.MapVariables.get(world).blue_portal_placed && PowerModVariables.MapVariables.get(world).orange_portal_placed) {
					world.setBlock(BlockPos.containing(PowerModVariables.MapVariables.get(world).bpX, PowerModVariables.MapVariables.get(world).bpY, PowerModVariables.MapVariables.get(world).bpZ), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(PowerModVariables.MapVariables.get(world).opX, PowerModVariables.MapVariables.get(world).opY, PowerModVariables.MapVariables.get(world).opZ), Blocks.AIR.defaultBlockState(), 3);
					PowerModVariables.MapVariables.get(world).blue_portal_placed = false;
					PowerModVariables.MapVariables.get(world).syncData(world);
					PowerModVariables.MapVariables.get(world).orange_portal_placed = false;
					PowerModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.chorus_fruit.teleport")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.chorus_fruit.teleport")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				{
					PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
					_vars.power = entity.getData(PowerModVariables.PLAYER_VARIABLES).power - 20;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
