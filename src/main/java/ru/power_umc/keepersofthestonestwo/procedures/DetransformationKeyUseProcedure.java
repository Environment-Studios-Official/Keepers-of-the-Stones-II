package ru.power_umc.keepersofthestonestwo.procedures;

import ru.power_umc.keepersofthestonestwo.network.PowerModVariables;
import ru.power_umc.keepersofthestonestwo.init.PowerModMobEffects;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.player.AbstractClientPlayer;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

public class DetransformationKeyUseProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(PowerModVariables.PLAYER_VARIABLES).active == true) {
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("power", "player_animation"));
					if (animation != null && !animation.isActive()) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("power", "animation.player.detransformation"))));
					}
				}
			}
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
		}
	}
}
