package ru.power_umc.keepersofthestones.two.procedures;

import ru.power_umc.keepersofthestones.two.network.PowerModVariables;
import ru.power_umc.keepersofthestones.two.init.PowerModMobEffects;

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
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.active = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("power", "player_animation"));
					if (animation != null && !animation.isActive()) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("power", "animation.player.detransformation"))));
					}
				}
			}
		}
	}
}
