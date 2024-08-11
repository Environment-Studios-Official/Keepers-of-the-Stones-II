package com.esmods.keepersofthestonestwo.procedures;

import net.minecraftforge.network.NetworkDirection;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.Connection;
import net.minecraft.client.player.AbstractClientPlayer;

import java.util.List;
import java.util.Iterator;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;
import com.esmods.keepersofthestonestwo.init.PowerModMobEffects;
import com.esmods.keepersofthestonestwo.PowerMod;

public class DetransformationKeyUseProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		PowerMod.queueServerWork(1, () -> {
			if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).active == true) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.FIRE_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.AIR_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.EARTH_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.WATER_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.ETHER_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.ICE_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.LIGHTNING_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.SOUND_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.CRYSTAL_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.LAVA_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.RAIN_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.TORNADO_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.OCEAN_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.PLANTS_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.ANIMALS_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.METAL_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.LIGHT_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.SHADOW_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.VACUUM_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.ENERGY_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.SUN_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.MOON_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.SPACE_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.TIME_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.CREATION_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.DESTRUCTION_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.BLOOD_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.TECHNOLOGY_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.TELEPORTATION_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.EXPLOSION_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.AMBER_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.MIST_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.SAND_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.SPEED_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.POISON_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.MAGNET_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.MUSHROOMS_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.MERCURY_MASTER.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(PowerModMobEffects.MUSIC_MASTER.get());
				{
					boolean _setval = false;
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.active = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.mergers = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("power", "player_animation"));
						if (animation != null) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("power", "animation.player.detransformation"))));
						}
					}
				}
				if (!world.isClientSide()) {
					if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
						List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
						synchronized (connections) {
							Iterator<Connection> iterator = connections.iterator();
							while (iterator.hasNext()) {
								Connection connection = iterator.next();
								if (!connection.isConnecting() && connection.isConnected())
									PowerMod.PACKET_HANDLER.sendTo(new AnimationsModuleSetupProcedure.PowerModAnimationMessage(Component.literal("animation.player.detransformation"), entity.getId(), true), connection,
											NetworkDirection.PLAY_TO_CLIENT);
							}
						}
					}
				}
			}
			{
				double _setval = 0;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.power = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fake_element_name_first_timer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fake_element_name_second_timer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fake_element_name_third_timer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "0";
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fake_element_name_first = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "0";
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fake_element_name_second = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "0";
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fake_element_name_third = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "0";
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.attack = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		});
	}
}
