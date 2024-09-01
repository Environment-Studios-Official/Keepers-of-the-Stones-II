package com.esmods.keepersofthestonestwo.procedures;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.player.AbstractClientPlayer;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;
import com.esmods.keepersofthestonestwo.init.PowerModMobEffects;
import com.esmods.keepersofthestonestwo.init.PowerModItems;
import com.esmods.keepersofthestonestwo.configuration.PowerConfigConfiguration;
import com.esmods.keepersofthestonestwo.PowerMod;

public class IceBatteryUseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("power:passing_armor")))
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("power:passing_armor")))
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("power:passing_armor")))
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("power:passing_armor"))) && entity instanceof Player
				&& entity.getData(PowerModVariables.PLAYER_VARIABLES).active_power == false) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PowerModItems.ICE_BATTERY.get()) {
				PowerMod.queueServerWork(1, () -> {
					itemstack.shrink(1);
				});
				{
					PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
					_vars.active_battery = true;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.ICE_MASTER.get(), (int) (((double) PowerConfigConfiguration.THE_DURATION_OF_THE_STONE_POWER.get() / 2) * 20), 0, false, false));
				{
					PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
					_vars.mergers = entity.getData(PowerModVariables.PLAYER_VARIABLES).mergers + 1;
					_vars.syncPlayerVariables(entity);
				}
				{
					PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
					_vars.power = 500;
					_vars.syncPlayerVariables(entity);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("power:stone_activation")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("power:stone_activation")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("power", "player_animation"));
						if (animation != null) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("power", "animation.player.transformation"))));
						}
					}
				}
				if (!world.isClientSide()) {
					if (entity instanceof Player)
						PacketDistributor.ALL.noArg().send(new AnimationsModuleSetupProcedure.PowerModAnimationMessage(Component.literal("animation.player.transformation"), entity.getId(), true));
				}
			}
		}
	}
}
