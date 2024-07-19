package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;
import com.esmods.keepersofthestonestwo.init.PowerModMobEffects;
import com.esmods.keepersofthestonestwo.init.PowerModEntities;
import com.esmods.keepersofthestonestwo.entity.KnifeAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.IronAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.GoldAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.CopperAttackProjectileEntity;

public class MetalSpecialAttackProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).attack).equals("metal_attack_1")) {
			if (entity.getData(PowerModVariables.PLAYER_VARIABLES).power >= 15) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.IRON_BLOCK.asItem()) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
									AbstractArrow entityToSpawn = new IronAttackProjectileEntity(PowerModEntities.IRON_ATTACK_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 21, 4);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Blocks.IRON_BLOCK);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.power = entity.getData(PowerModVariables.PLAYER_VARIABLES).power - 15;
						_vars.syncPlayerVariables(entity);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.metal.break")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.metal.break")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.GOLD_BLOCK.asItem()) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
									AbstractArrow entityToSpawn = new GoldAttackProjectileEntity(PowerModEntities.GOLD_ATTACK_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 15, 3);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Blocks.GOLD_BLOCK);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.power = entity.getData(PowerModVariables.PLAYER_VARIABLES).power - 15;
						_vars.syncPlayerVariables(entity);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.metal.break")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.metal.break")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				} else {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
									AbstractArrow entityToSpawn = new CopperAttackProjectileEntity(PowerModEntities.COPPER_ATTACK_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, (float) 13.5, 2);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Blocks.COPPER_BLOCK);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.power = entity.getData(PowerModVariables.PLAYER_VARIABLES).power - 15;
						_vars.syncPlayerVariables(entity);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.copper.break")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.copper.break")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			}
		} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).attack).equals("metal_attack_2")) {
			if (entity.getData(PowerModVariables.PLAYER_VARIABLES).power >= 30) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.trident.throw")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.trident.throw")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new KnifeAttackProjectileEntity(PowerModEntities.KNIFE_ATTACK_PROJECTILE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) 13.5, 0);
					_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 1.5), z);
					_entityToSpawn.shoot((-1), 0, (-1), (float) 1.5, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new KnifeAttackProjectileEntity(PowerModEntities.KNIFE_ATTACK_PROJECTILE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) 13.5, 0);
					_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 1.5), z);
					_entityToSpawn.shoot(1, 0, 1, (float) 1.5, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new KnifeAttackProjectileEntity(PowerModEntities.KNIFE_ATTACK_PROJECTILE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) 13.5, 0);
					_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 1.5), z);
					_entityToSpawn.shoot((-1), 0, 1, (float) 1.5, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new KnifeAttackProjectileEntity(PowerModEntities.KNIFE_ATTACK_PROJECTILE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) 13.5, 0);
					_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 1.5), z);
					_entityToSpawn.shoot(1, 0, (-1), (float) 1.5, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new KnifeAttackProjectileEntity(PowerModEntities.KNIFE_ATTACK_PROJECTILE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) 13.5, 0);
					_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 1.5), z);
					_entityToSpawn.shoot(0, 0, (-1), (float) 1.5, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new KnifeAttackProjectileEntity(PowerModEntities.KNIFE_ATTACK_PROJECTILE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) 13.5, 0);
					_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 1.5), z);
					_entityToSpawn.shoot(0, 0, 1, (float) 1.5, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new KnifeAttackProjectileEntity(PowerModEntities.KNIFE_ATTACK_PROJECTILE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) 13.5, 0);
					_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 1.5), z);
					_entityToSpawn.shoot((-1), 0, 0, (float) 1.5, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new KnifeAttackProjectileEntity(PowerModEntities.KNIFE_ATTACK_PROJECTILE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) 13.5, 0);
					_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 1.5), z);
					_entityToSpawn.shoot(1, 0, 0, (float) 1.5, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				{
					PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
					_vars.power = entity.getData(PowerModVariables.PLAYER_VARIABLES).power - 30;
					_vars.syncPlayerVariables(entity);
				}
			}
		} else if ((entity.getData(PowerModVariables.PLAYER_VARIABLES).attack).equals("metal_attack_3")) {
			if (entity.getData(PowerModVariables.PLAYER_VARIABLES).power >= 80) {
				if (entity.getData(PowerModVariables.PLAYER_VARIABLES).power >= 10) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.IRON_SKIN, 300, 0, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 2, false, false));
					{
						PowerModVariables.PlayerVariables _vars = entity.getData(PowerModVariables.PLAYER_VARIABLES);
						_vars.power = entity.getData(PowerModVariables.PLAYER_VARIABLES).power - 80;
						_vars.syncPlayerVariables(entity);
					}
				}
			}
		}
	}
}
