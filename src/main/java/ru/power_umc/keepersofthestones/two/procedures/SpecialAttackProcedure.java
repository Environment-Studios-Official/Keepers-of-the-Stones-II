package ru.power_umc.keepersofthestones.two.procedures;

import ru.power_umc.keepersofthestones.two.network.PowerModVariables;
import ru.power_umc.keepersofthestones.two.init.PowerModMobEffects;
import ru.power_umc.keepersofthestones.two.init.PowerModItems;
import ru.power_umc.keepersofthestones.two.init.PowerModEntities;
import ru.power_umc.keepersofthestones.two.entity.WaterAttackEntity;
import ru.power_umc.keepersofthestones.two.entity.StoneAttackEntity;
import ru.power_umc.keepersofthestones.two.entity.MagicFireballEntity;
import ru.power_umc.keepersofthestones.two.entity.GrassBlockAttackEntity;
import ru.power_umc.keepersofthestones.two.entity.EtherAttackEntity;
import ru.power_umc.keepersofthestones.two.entity.DirtBlockAttackEntity;
import ru.power_umc.keepersofthestones.two.entity.CobblestoneAttackEntity;
import ru.power_umc.keepersofthestones.two.entity.CobbledDeepslateAttackEntity;
import ru.power_umc.keepersofthestones.two.PowerMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.player.AbstractClientPlayer;

import java.util.List;
import java.util.Comparator;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

public class SpecialAttackProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Scaling = 0;
		double particleRadius = 0;
		double particleAmount = 0;
		double xr = 0;
		double yr = 0;
		double zr = 0;
		double Grow = 0;
		double TrackZ = 0;
		double TrackY = 0;
		double TrackX = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(PowerModMobEffects.FIRE_MASTER.get())) {
			if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 1) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 10) {
					for (int index0 = 0; index0 < 15; index0++) {
						if (!world.getBlockState(new BlockPos(
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()))
								.canOcclude()) {
							Scaling = Scaling + 0.5;
						} else {
							break;
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.FLAME,
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()),
									25, 1, 1, 1, 0.25);
						{
							final Vec3 _center = new Vec3(
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									if (entity.isInWater()) {
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 9);
									} else {
										entityiterator.setSecondsOnFire(7);
									}
								}
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
					}
					if ((world.getBlockState(BlockPos.containing(
							entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
							entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY() + 2,
							entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
							.getBlock() == Blocks.AIR) {
						world.setBlock(BlockPos.containing(
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()
										+ 1,
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
								Blocks.FIRE.defaultBlockState(), 3);
					}
					if (world.isClientSide()) {
						if (entity instanceof AbstractClientPlayer player) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("power", "player_animation"));
							if (animation != null) {
								animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("power", "animation.player.beam"))));
							}
						}
					}
					{
						double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 10;
						entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.power = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 2) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 25) {
					PowerMod.queueServerWork(10, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback) {
										AbstractArrow entityToSpawn = new MagicFireballEntity(PowerModEntities.MAGIC_FIREBALL.get(), level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.setSecondsOnFire(100);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 9, 1);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 1.5, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						PowerMod.queueServerWork(10, () -> {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, float damage, int knockback) {
											AbstractArrow entityToSpawn = new MagicFireballEntity(PowerModEntities.MAGIC_FIREBALL.get(), level);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setSecondsOnFire(100);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, 9, 1);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 1.5, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
							PowerMod.queueServerWork(10, () -> {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								{
									Entity _shootFrom = entity;
									Level projectileLevel = _shootFrom.level();
									if (!projectileLevel.isClientSide()) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, float damage, int knockback) {
												AbstractArrow entityToSpawn = new MagicFireballEntity(PowerModEntities.MAGIC_FIREBALL.get(), level);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.setSecondsOnFire(100);
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, 9, 1);
										_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
										_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 1.5, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
								}
							});
						});
					});
					{
						double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 25;
						entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.power = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 3) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, x, y, z, 30, 0, (-1), 0, 1);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 10, 3, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 0, false, false));
					if (world.isClientSide()) {
						if (entity instanceof AbstractClientPlayer player) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("power", "player_animation"));
							if (animation != null) {
								animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("power", "animation.player.flight"))));
							}
						}
					}
					{
						double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 5;
						entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.power = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
		if (entity instanceof LivingEntity _livEnt46 && _livEnt46.hasEffect(PowerModMobEffects.AIR_MASTER.get())) {
			if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 5) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 10) {
					for (int index1 = 0; index1 < 15; index1++) {
						if (!world.getBlockState(new BlockPos(
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()))
								.canOcclude()) {
							Scaling = Scaling + 1.3;
						} else {
							break;
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.FIREWORK,
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()),
									25, 1, 1, 1, 0.25);
						{
							final Vec3 _center = new Vec3(
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 9);
									if ((entity.getDirection()).getAxis() == Direction.Axis.Y) {
										if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, (y + 3), z), 6, 6, 6), e -> true).isEmpty()) {
											entityiterator.setDeltaMovement(new Vec3(0, 2.5, 0));
										}
										if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, (y + 3), z), 6, 6, 6), e -> true).isEmpty()) {
											entityiterator.setDeltaMovement(new Vec3(0, 2.5, 0));
										}
									} else if ((entity.getDirection()).getAxis() == Direction.Axis.Y) {
										if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, (y - 3), z), 6, 6, 6), e -> true).isEmpty()) {
											entityiterator.setDeltaMovement(new Vec3(0, (-2.5), 0));
										}
										if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, (y - 3), z), 6, 6, 6), e -> true).isEmpty()) {
											entityiterator.setDeltaMovement(new Vec3(0, (-2.5), 0));
										}
									} else if ((entity.getDirection()).getAxis() == Direction.Axis.Z) {
										if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, y, (z - 3)), 6, 6, 6), e -> true).isEmpty()) {
											entityiterator.setDeltaMovement(new Vec3(0, 0, (-2.5)));
										}
										if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, (z - 3)), 6, 6, 6), e -> true).isEmpty()) {
											entityiterator.setDeltaMovement(new Vec3(0, 0, (-2.5)));
										}
									} else if ((entity.getDirection()).getAxis() == Direction.Axis.Z) {
										if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, y, (z + 3)), 6, 6, 6), e -> true).isEmpty()) {
											entityiterator.setDeltaMovement(new Vec3(0, 0, 2.5));
										}
										if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, (z + 3)), 6, 6, 6), e -> true).isEmpty()) {
											entityiterator.setDeltaMovement(new Vec3(0, 0, 2.5));
										}
									} else if ((entity.getDirection()).getAxis() == Direction.Axis.Y) {
										if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3((x - 3), y, z), 6, 6, 6), e -> true).isEmpty()) {
											entityiterator.setDeltaMovement(new Vec3((-2.5), 0, 0));
										}
										if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x - 3), y, z), 6, 6, 6), e -> true).isEmpty()) {
											entityiterator.setDeltaMovement(new Vec3((-2.5), 0, 0));
										}
									} else if ((entity.getDirection()).getAxis() == Direction.Axis.X) {
										if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3((x + 3), y, z), 6, 6, 6), e -> true).isEmpty()) {
											entityiterator.setDeltaMovement(new Vec3(2.5, 0, 0));
										}
										if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x + 3), y, z), 6, 6, 6), e -> true).isEmpty()) {
											entityiterator.setDeltaMovement(new Vec3(2.5, 0, 0));
										}
									}
								}
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
					}
					if (world.isClientSide()) {
						if (entity instanceof AbstractClientPlayer player) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("power", "player_animation"));
							if (animation != null) {
								animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("power", "animation.player.beam"))));
							}
						}
					}
					{
						double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 10;
						entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.power = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 6) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 25) {
					if (world.isClientSide()) {
						if (entity instanceof AbstractClientPlayer player) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("power", "player_animation"));
							if (animation != null) {
								animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("power", "animation.player.spin"))));
							}
						}
					}
					particleAmount = 25;
					particleRadius = 2;
					for (int index2 = 0; index2 < (int) particleAmount; index2++) {
						world.addParticle(ParticleTypes.SWEEP_ATTACK, (x + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (y + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius),
								(z + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)),
								(Mth.nextDouble(RandomSource.create(), -0.001, 0.001)));
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator == entity)) {
								if ((entityiterator.getDirection()).getAxis() == Direction.Axis.Y) {
									if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, (y + 3), z), 6, 6, 6), e -> true).isEmpty()) {
										entityiterator.setDeltaMovement(new Vec3(0, (-2.5), 0));
									}
									if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, (y + 3), z), 6, 6, 6), e -> true).isEmpty()) {
										entityiterator.setDeltaMovement(new Vec3(0, (-2.5), 0));
									}
								} else if ((entityiterator.getDirection()).getAxis() == Direction.Axis.Y) {
									if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, (y - 3), z), 6, 6, 6), e -> true).isEmpty()) {
										entityiterator.setDeltaMovement(new Vec3(0, 2.5, 0));
									}
									if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, (y - 3), z), 6, 6, 6), e -> true).isEmpty()) {
										entityiterator.setDeltaMovement(new Vec3(0, 2.5, 0));
									}
								} else if ((entityiterator.getDirection()).getAxis() == Direction.Axis.Z) {
									if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, y, (z - 3)), 6, 6, 6), e -> true).isEmpty()) {
										entityiterator.setDeltaMovement(new Vec3(0, 0, 2.5));
									}
									if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, (z - 3)), 6, 6, 6), e -> true).isEmpty()) {
										entityiterator.setDeltaMovement(new Vec3(0, 0, 2.5));
									}
								} else if ((entityiterator.getDirection()).getAxis() == Direction.Axis.Z) {
									if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, y, (z + 3)), 6, 6, 6), e -> true).isEmpty()) {
										entityiterator.setDeltaMovement(new Vec3(0, 0, (-2.5)));
									}
									if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, (z + 3)), 6, 6, 6), e -> true).isEmpty()) {
										entityiterator.setDeltaMovement(new Vec3(0, 0, (-2.5)));
									}
								} else if ((entityiterator.getDirection()).getAxis() == Direction.Axis.X) {
									if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3((x - 3), y, z), 6, 6, 6), e -> true).isEmpty()) {
										entityiterator.setDeltaMovement(new Vec3(2.5, 0, 0));
									}
									if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x - 3), y, z), 6, 6, 6), e -> true).isEmpty()) {
										entityiterator.setDeltaMovement(new Vec3(2.5, 0, 0));
									}
								} else if ((entityiterator.getDirection()).getAxis() == Direction.Axis.X) {
									if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3((x + 3), y, z), 6, 6, 6), e -> true).isEmpty()) {
										entityiterator.setDeltaMovement(new Vec3((-2.5), 0, 0));
									}
									if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x + 3), y, z), 6, 6, 6), e -> true).isEmpty()) {
										entityiterator.setDeltaMovement(new Vec3((-2.5), 0, 0));
									}
								}
							}
						}
					}
					{
						double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 25;
						entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.power = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 7) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 5) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 5) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 30, 0, (-1), 0, 1);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 10, 7, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 0, false, false));
						if (world.isClientSide()) {
							if (entity instanceof AbstractClientPlayer player) {
								var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("power", "player_animation"));
								if (animation != null) {
									animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("power", "animation.player.flight"))));
								}
							}
						}
						{
							double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 5;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.power = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			}
		}
		if (entity instanceof LivingEntity _livEnt152 && _livEnt152.hasEffect(PowerModMobEffects.EARTH_MASTER.get())) {
			if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 9) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 15) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STONE.asItem()) {
						for (int index3 = 0; index3 < 15; index3++) {
							if (!world.getBlockState(new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()))
									.canOcclude()) {
								Scaling = Scaling + 0.5;
							} else {
								break;
							}
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, float damage, int knockback) {
											AbstractArrow entityToSpawn = new StoneAttackEntity(PowerModEntities.STONE_ATTACK.get(), level);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, 12, 4);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						}
						if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(Blocks.STONE);
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
						{
							double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 15;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.power = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DIRT.asItem()) {
						for (int index4 = 0; index4 < 15; index4++) {
							if (!world.getBlockState(new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()))
									.canOcclude()) {
								Scaling = Scaling + 0.5;
							} else {
								break;
							}
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, float damage, int knockback) {
											AbstractArrow entityToSpawn = new DirtBlockAttackEntity(PowerModEntities.DIRT_BLOCK_ATTACK.get(), level);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, (float) 7.5, 2);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						}
						if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(Blocks.DIRT);
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
						{
							double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 15;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.power = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.gravel.break")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.gravel.break")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLESTONE.asItem()) {
						for (int index5 = 0; index5 < 15; index5++) {
							if (!world.getBlockState(new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()))
									.canOcclude()) {
								Scaling = Scaling + 0.5;
							} else {
								break;
							}
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, float damage, int knockback) {
											AbstractArrow entityToSpawn = new CobblestoneAttackEntity(PowerModEntities.COBBLESTONE_ATTACK.get(), level);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, 12, 4);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						}
						if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(Blocks.COBBLESTONE);
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
						{
							double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 15;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.power = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.COBBLED_DEEPSLATE.asItem()) {
						for (int index6 = 0; index6 < 15; index6++) {
							if (!world.getBlockState(new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()))
									.canOcclude()) {
								Scaling = Scaling + 0.5;
							} else {
								break;
							}
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, float damage, int knockback) {
											AbstractArrow entityToSpawn = new CobbledDeepslateAttackEntity(PowerModEntities.COBBLED_DEEPSLATE_ATTACK.get(), level);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, 15, 5);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						}
						if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(Blocks.COBBLED_DEEPSLATE);
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
						{
							double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 15;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.power = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.deepslate_bricks.break")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.deepslate_bricks.break")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
					} else {
						for (int index7 = 0; index7 < 15; index7++) {
							if (!world.getBlockState(new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()))
									.canOcclude()) {
								Scaling = Scaling + 0.5;
							} else {
								break;
							}
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, float damage, int knockback) {
											AbstractArrow entityToSpawn = new GrassBlockAttackEntity(PowerModEntities.GRASS_BLOCK_ATTACK.get(), level);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, (float) 7.5, 3);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						}
						if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(Blocks.GRASS_BLOCK);
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
						{
							double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 15;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.power = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
					}
				}
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 10) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 40) {
					for (int index8 = 0; index8 < 15; index8++) {
						if (!world.getBlockState(new BlockPos(
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()))
								.canOcclude()) {
							Scaling = Scaling + 1.3;
						} else {
							break;
						}
						{
							final Vec3 _center = new Vec3(
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
										if ((world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()))).getBlock() == Blocks.AIR) {
											world.setBlock(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), Blocks.POINTED_DRIPSTONE.defaultBlockState(), 3);
											world.levelEvent(2001, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), Block.getId(Blocks.POINTED_DRIPSTONE.defaultBlockState()));
											entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 21);
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.dripstone_block.fall")), SoundSource.PLAYERS, 1, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.dripstone_block.fall")), SoundSource.PLAYERS, 1, 1, false);
												}
											}
										}
									}
								}
							}
						}
					}
					{
						double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 40;
						entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.power = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 11) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 45) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(PowerModItems.EARTH_SHIELD.get());
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
						{
							double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 45;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.power = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			}
		}
		if (entity instanceof LivingEntity _livEnt235 && _livEnt235.hasEffect(PowerModMobEffects.WATER_MASTER.get())) {
			if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 13) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 10) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 10) {
						for (int index9 = 0; index9 < 15; index9++) {
							if (!world.getBlockState(new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()))
									.canOcclude()) {
								Scaling = Scaling + 0.5;
							} else {
								break;
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.SPLASH,
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										50, 1, 1, 1, 0.25);
							{
								final Vec3 _center = new Vec3(
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()));
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (!(entityiterator == entity)) {
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 9);
									}
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dolphin.swim")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dolphin.swim")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
						}
						if (world.isClientSide()) {
							if (entity instanceof AbstractClientPlayer player) {
								var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("power", "player_animation"));
								if (animation != null) {
									animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("power", "animation.player.beam"))));
								}
							}
						}
						{
							double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 10;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.power = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					{
						double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 10;
						entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.power = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 14) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 20) {
					for (int index10 = 0; index10 < 15; index10++) {
						if (!world.getBlockState(new BlockPos(
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()))
								.canOcclude()) {
							Scaling = Scaling + 0.5;
						} else {
							break;
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new WaterAttackEntity(PowerModEntities.WATER_ATTACK.get(), level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.setPierceLevel(piercing);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 12, 2, (byte) 2);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fish.swim")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fish.swim")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					{
						double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 20;
						entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.power = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 15) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 30) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator.isInWater()) {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 20, 3, false, false));
								particleAmount = 8;
								particleRadius = 2;
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fish.swim")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fish.swim")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								{
									double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 30;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.power = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							}
						}
					}
				}
			}
		}
		if (entity instanceof LivingEntity _livEnt264 && _livEnt264.hasEffect(PowerModMobEffects.ETHER_MASTER.get())) {
			if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 17) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 10) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 10) {
						for (int index11 = 0; index11 < 15; index11++) {
							if (!world.getBlockState(new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()))
									.canOcclude()) {
								Scaling = Scaling + 0.5;
							} else {
								break;
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.ENCHANTED_HIT,
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										50, 1, 1, 1, 0.25);
							{
								final Vec3 _center = new Vec3(
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()));
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (!(entityiterator == entity)) {
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 9);
									}
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.PLAYERS, (float) 0.1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.PLAYERS, (float) 0.1, 1, false);
								}
							}
						}
						if (world.isClientSide()) {
							if (entity instanceof AbstractClientPlayer player) {
								var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("power", "player_animation"));
								if (animation != null) {
									animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("power", "animation.player.beam"))));
								}
							}
						}
						{
							double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 10;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.power = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 18) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 30) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.power_select")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.power_select")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new EtherAttackEntity(PowerModEntities.ETHER_ATTACK.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 9, 0);
						_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 2), z);
						_entityToSpawn.shoot((-1), 0, (-1), 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new EtherAttackEntity(PowerModEntities.ETHER_ATTACK.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 9, 0);
						_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 2), z);
						_entityToSpawn.shoot(1, 0, 1, 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new EtherAttackEntity(PowerModEntities.ETHER_ATTACK.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 9, 0);
						_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 2), z);
						_entityToSpawn.shoot((-1), 0, 1, 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new EtherAttackEntity(PowerModEntities.ETHER_ATTACK.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 9, 0);
						_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 2), z);
						_entityToSpawn.shoot(1, 0, (-1), 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new EtherAttackEntity(PowerModEntities.ETHER_ATTACK.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 9, 0);
						_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 2), z);
						_entityToSpawn.shoot(0, 0, (-1), 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new EtherAttackEntity(PowerModEntities.ETHER_ATTACK.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 9, 0);
						_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 2), z);
						_entityToSpawn.shoot(0, 0, 1, 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new EtherAttackEntity(PowerModEntities.ETHER_ATTACK.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 9, 0);
						_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 2), z);
						_entityToSpawn.shoot((-1), 0, 0, 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new EtherAttackEntity(PowerModEntities.ETHER_ATTACK.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 9, 0);
						_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 2), z);
						_entityToSpawn.shoot(1, 0, 0, 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					{
						double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 30;
						entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.power = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 19) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 80) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 60, 3, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 3, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 3, false, false));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					particleAmount = 8;
					particleRadius = 2;
					for (int index12 = 0; index12 < (int) particleAmount; index12++) {
						world.addParticle(ParticleTypes.ENCHANTED_HIT, (x + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (y + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius),
								(z + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)),
								(Mth.nextDouble(RandomSource.create(), -0.001, 0.001)));
					}
					{
						double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 80;
						entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.power = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}
