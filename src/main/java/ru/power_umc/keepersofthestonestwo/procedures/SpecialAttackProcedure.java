package ru.power_umc.keepersofthestonestwo.procedures;

import ru.power_umc.keepersofthestonestwo.network.PowerModVariables;
import ru.power_umc.keepersofthestonestwo.init.PowerModParticleTypes;
import ru.power_umc.keepersofthestonestwo.init.PowerModMobEffects;
import ru.power_umc.keepersofthestonestwo.init.PowerModItems;
import ru.power_umc.keepersofthestonestwo.init.PowerModEntities;
import ru.power_umc.keepersofthestonestwo.entity.WaterAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.StoneAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.SoundBombProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.MagicFireballProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.LavaAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.IceAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.GrassBlockAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.EtherAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.DirtBlockAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.CobblestoneAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.CobbledDeepslateAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.BallLightningProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.AmethystClusterAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.AmethystAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.PowerMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Comparator;

public class SpecialAttackProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean success = false;
		double Scaling = 0;
		double particleRadius = 0;
		double particleAmount = 0;
		double xr = 0;
		double yr = 0;
		double zr = 0;
		if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).ability_block == false) {
			if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(PowerModMobEffects.FIRE_MASTER.get())) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 1) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 10) {
						for (int index0 = 0; index0 < 15; index0++) {
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
						}
						if (world
								.getBlockState(
										new BlockPos(
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getX(),
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getY(),
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
														entity)).getBlockPos().getZ()))
								.canOcclude()
								&& (world.getBlockState(BlockPos.containing(
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY() + 2,
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ())))
										.getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY() + 1,
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()),
									Blocks.FIRE.defaultBlockState(), 3);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1, false);
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
											AbstractArrow entityToSpawn = new MagicFireballProjectileEntity(PowerModEntities.MAGIC_FIREBALL_PROJECTILE.get(), level);
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
												AbstractArrow entityToSpawn = new MagicFireballProjectileEntity(PowerModEntities.MAGIC_FIREBALL_PROJECTILE.get(), level);
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
													AbstractArrow entityToSpawn = new MagicFireballProjectileEntity(PowerModEntities.MAGIC_FIREBALL_PROJECTILE.get(), level);
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
			if (entity instanceof LivingEntity _livEnt48 && _livEnt48.hasEffect(PowerModMobEffects.AIR_MASTER.get())) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 5) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 10) {
						for (int index1 = 0; index1 < 15; index1++) {
							if (!world.getBlockState(new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()))
									.canOcclude()) {
								Scaling = Scaling + 1.3;
							} else {
								break;
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.CLOUD,
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
												entityiterator.setDeltaMovement(new Vec3(0, 1, 0));
											}
											if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, (y + 3), z), 6, 6, 6), e -> true).isEmpty()) {
												entityiterator.setDeltaMovement(new Vec3(0, 1, 0));
											}
										} else if ((entity.getDirection()).getAxis() == Direction.Axis.Y) {
											if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, (y - 3), z), 6, 6, 6), e -> true).isEmpty()) {
												entityiterator.setDeltaMovement(new Vec3(0, (-1), 0));
											}
											if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, (y - 3), z), 6, 6, 6), e -> true).isEmpty()) {
												entityiterator.setDeltaMovement(new Vec3(0, (-1), 0));
											}
										} else if ((entity.getDirection()).getAxis() == Direction.Axis.Z) {
											if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, y, (z - 3)), 6, 6, 6), e -> true).isEmpty()) {
												entityiterator.setDeltaMovement(new Vec3(0, 0, (-1)));
											}
											if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, (z - 3)), 6, 6, 6), e -> true).isEmpty()) {
												entityiterator.setDeltaMovement(new Vec3(0, 0, (-1)));
											}
										} else if ((entity.getDirection()).getAxis() == Direction.Axis.Z) {
											if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, y, (z + 3)), 6, 6, 6), e -> true).isEmpty()) {
												entityiterator.setDeltaMovement(new Vec3(0, 0, 1));
											}
											if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, (z + 3)), 6, 6, 6), e -> true).isEmpty()) {
												entityiterator.setDeltaMovement(new Vec3(0, 0, 1));
											}
										} else if ((entity.getDirection()).getAxis() == Direction.Axis.Y) {
											if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3((x - 3), y, z), 6, 6, 6), e -> true).isEmpty()) {
												entityiterator.setDeltaMovement(new Vec3((-1), 0, 0));
											}
											if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x - 3), y, z), 6, 6, 6), e -> true).isEmpty()) {
												entityiterator.setDeltaMovement(new Vec3((-1), 0, 0));
											}
										} else if ((entity.getDirection()).getAxis() == Direction.Axis.X) {
											if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3((x + 3), y, z), 6, 6, 6), e -> true).isEmpty()) {
												entityiterator.setDeltaMovement(new Vec3(1, 0, 0));
											}
											if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x + 3), y, z), 6, 6, 6), e -> true).isEmpty()) {
												entityiterator.setDeltaMovement(new Vec3(1, 0, 0));
											}
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
						{
							double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 10;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.power = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 6) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 35) {
						particleAmount = 25;
						particleRadius = 2;
						for (int index2 = 0; index2 < (int) particleAmount; index2++) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.SWEEP_ATTACK, (x + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (y + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius),
										(z + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), 1, (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)),
										(Mth.nextDouble(RandomSource.create(), -0.001, 0.001)), 0.25);
						}
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 15);
								}
							}
						}
						{
							double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 35;
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
			if (entity instanceof LivingEntity _livEnt117 && _livEnt117.hasEffect(PowerModMobEffects.EARTH_MASTER.get())) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 9) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 15) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STONE.asItem()) {
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, float damage, int knockback) {
											AbstractArrow entityToSpawn = new StoneAttackProjectileEntity(PowerModEntities.STONE_ATTACK_PROJECTILE.get(), level);
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
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, float damage, int knockback) {
											AbstractArrow entityToSpawn = new DirtBlockAttackProjectileEntity(PowerModEntities.DIRT_BLOCK_ATTACK_PROJECTILE.get(), level);
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
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, float damage, int knockback) {
											AbstractArrow entityToSpawn = new CobblestoneAttackProjectileEntity(PowerModEntities.COBBLESTONE_ATTACK_PROJECTILE.get(), level);
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
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, float damage, int knockback) {
											AbstractArrow entityToSpawn = new CobbledDeepslateAttackProjectileEntity(PowerModEntities.COBBLED_DEEPSLATE_ATTACK_PROJECTILE.get(), level);
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
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, float damage, int knockback) {
											AbstractArrow entityToSpawn = new GrassBlockAttackProjectileEntity(PowerModEntities.GRASS_BLOCK_ATTACK_PROJECTILE.get(), level);
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
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					}
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 10) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 40) {
						for (int index3 = 0; index3 < 10; index3++) {
							if (!world.getBlockState(new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()))
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
											success = true;
										}
									}
								}
							}
						}
						if (success == true) {
							{
								double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 40;
								entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.power = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							success = false;
						}
					}
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 11) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 45) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.EARTH_SHIELD.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
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
			if (entity instanceof LivingEntity _livEnt173 && _livEnt173.hasEffect(PowerModMobEffects.WATER_MASTER.get())) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 13) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 10) {
						if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 10) {
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
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.SPLASH,
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getX()),
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getY()),
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getZ()),
											50, 1, 1, 1, 0.25);
								{
									final Vec3 _center = new Vec3(
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getX()),
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getY()),
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getZ()));
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if (!(entityiterator == entity)) {
											entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 9);
										}
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
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new WaterAttackProjectileEntity(PowerModEntities.WATER_ATTACK_PROJECTILE.get(), level);
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
			if (entity instanceof LivingEntity _livEnt197 && _livEnt197.hasEffect(PowerModMobEffects.ETHER_MASTER.get())) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 17) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 10) {
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
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.NEUTRAL, (float) 0.1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.NEUTRAL, (float) 0.1, 1, false);
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
									AbstractArrow entityToSpawn = new EtherAttackProjectileEntity(PowerModEntities.ETHER_ATTACK_PROJECTILE.get(), level);
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
									AbstractArrow entityToSpawn = new EtherAttackProjectileEntity(PowerModEntities.ETHER_ATTACK_PROJECTILE.get(), level);
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
									AbstractArrow entityToSpawn = new EtherAttackProjectileEntity(PowerModEntities.ETHER_ATTACK_PROJECTILE.get(), level);
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
									AbstractArrow entityToSpawn = new EtherAttackProjectileEntity(PowerModEntities.ETHER_ATTACK_PROJECTILE.get(), level);
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
									AbstractArrow entityToSpawn = new EtherAttackProjectileEntity(PowerModEntities.ETHER_ATTACK_PROJECTILE.get(), level);
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
									AbstractArrow entityToSpawn = new EtherAttackProjectileEntity(PowerModEntities.ETHER_ATTACK_PROJECTILE.get(), level);
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
									AbstractArrow entityToSpawn = new EtherAttackProjectileEntity(PowerModEntities.ETHER_ATTACK_PROJECTILE.get(), level);
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
									AbstractArrow entityToSpawn = new EtherAttackProjectileEntity(PowerModEntities.ETHER_ATTACK_PROJECTILE.get(), level);
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
							_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 200, 3, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 3, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 3, false, false));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						particleAmount = 8;
						particleRadius = 2;
						for (int index6 = 0; index6 < 60; index6++) {
							for (int index7 = 0; index7 < (int) particleAmount; index7++) {
								world.addParticle(ParticleTypes.ENCHANTED_HIT, (x + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (y + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius),
										(z + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)),
										(Mth.nextDouble(RandomSource.create(), -0.001, 0.001)));
							}
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
			if (entity instanceof LivingEntity _livEnt250 && _livEnt250.hasEffect(PowerModMobEffects.ICE_MASTER.get())) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 21) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 10) {
						for (int index8 = 0; index8 < 15; index8++) {
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
								_level.sendParticles(ParticleTypes.SNOWFLAKE,
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
										entityiterator.setTicksFrozen(140);
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 9);
									}
								}
							}
							if ((world
									.getBlockState(
											new BlockPos(
													entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getX(),
													entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getY(),
													entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getZ())))
									.getBlock() == Blocks.WATER
									|| (world.getBlockState(new BlockPos(
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getX(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getY(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getZ())))
											.getBlock() == Blocks.WATER) {
								world.setBlock(new BlockPos(
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										Blocks.FROSTED_ICE.defaultBlockState(), 3);
							} else if ((world
									.getBlockState(
											new BlockPos(
													entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getX(),
													entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getY(),
													entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getZ())))
									.getBlock() == Blocks.LAVA
									|| (world.getBlockState(new BlockPos(
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getX(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getY(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getBlockPos().getZ())))
											.getBlock() == Blocks.LAVA) {
								world.setBlock(new BlockPos(
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										Blocks.OBSIDIAN.defaultBlockState(), 3);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt_freeze")), SoundSource.NEUTRAL, (float) 0.1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt_freeze")), SoundSource.NEUTRAL, (float) 0.1, 1, false);
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
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 22) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 20) {
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new IceAttackProjectileEntity(PowerModEntities.ICE_ATTACK_PROJECTILE.get(), level);
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
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.fall")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.fall")), SoundSource.PLAYERS, 1, 1, false);
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
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 23) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 80) {
						if (!world.getBlockState(new BlockPos(
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()))
								.canOcclude()) {
							Scaling = Scaling + 1.3;
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
										if (!((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == PowerModItems.FROZEN_HELMET.get())) {
											if (!((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == PowerModItems.FROZEN_CHESTPLATE.get())) {
												if (!((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == PowerModItems.FROZEN_LEGGINGS.get())) {
													if (!((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == PowerModItems.FROZEN_BOOTS.get())) {
														{
															ItemStack _setval = (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY);
															entityiterator.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																capability.armor_helmet = _setval;
																capability.syncPlayerVariables(entityiterator);
															});
														}
														{
															ItemStack _setval = (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY);
															entityiterator.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																capability.armor_chestplate = _setval;
																capability.syncPlayerVariables(entityiterator);
															});
														}
														{
															ItemStack _setval = (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY);
															entityiterator.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																capability.armor_leggings = _setval;
																capability.syncPlayerVariables(entityiterator);
															});
														}
														{
															ItemStack _setval = (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY);
															entityiterator.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																capability.armor_boots = _setval;
																capability.syncPlayerVariables(entityiterator);
															});
														}
														{
															Entity _entity = entityiterator;
															if (_entity instanceof Player _player) {
																_player.getInventory().armor.set(3, new ItemStack(PowerModItems.FROZEN_HELMET.get()));
																_player.getInventory().setChanged();
															} else if (_entity instanceof LivingEntity _living) {
																_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(PowerModItems.FROZEN_HELMET.get()));
															}
														}
														{
															Entity _entity = entityiterator;
															if (_entity instanceof Player _player) {
																_player.getInventory().armor.set(2, new ItemStack(PowerModItems.FROZEN_CHESTPLATE.get()));
																_player.getInventory().setChanged();
															} else if (_entity instanceof LivingEntity _living) {
																_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(PowerModItems.FROZEN_CHESTPLATE.get()));
															}
														}
														{
															Entity _entity = entityiterator;
															if (_entity instanceof Player _player) {
																_player.getInventory().armor.set(1, new ItemStack(PowerModItems.FROZEN_LEGGINGS.get()));
																_player.getInventory().setChanged();
															} else if (_entity instanceof LivingEntity _living) {
																_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(PowerModItems.FROZEN_LEGGINGS.get()));
															}
														}
														{
															Entity _entity = entityiterator;
															if (_entity instanceof Player _player) {
																_player.getInventory().armor.set(0, new ItemStack(PowerModItems.FROZEN_BOOTS.get()));
																_player.getInventory().setChanged();
															} else if (_entity instanceof LivingEntity _living) {
																_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(PowerModItems.FROZEN_BOOTS.get()));
															}
														}
														(entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
														(entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
														(entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
														(entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
														(entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
														(entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
														(entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
														(entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
														{
															boolean _setval = true;
															entityiterator.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																capability.ability_block = _setval;
																capability.syncPlayerVariables(entityiterator);
															});
														}
														if (world instanceof Level _level) {
															if (!_level.isClientSide()) {
																_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt_freeze")), SoundSource.PLAYERS, 1, 1);
															} else {
																_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt_freeze")), SoundSource.PLAYERS, 1, 1, false);
															}
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
								}
							}
						}
					}
				}
			}
			if (entity instanceof LivingEntity _livEnt342 && _livEnt342.hasEffect(PowerModMobEffects.LIGHTNING_MASTER.get())) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 25) {
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
								_level.sendParticles(ParticleTypes.ELECTRIC_SPARK,
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
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("power:electric_spark")), SoundSource.NEUTRAL, (float) 0.1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("power:electric_spark")), SoundSource.NEUTRAL, (float) 0.1, 1, false);
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
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 26) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 35) {
						for (int index10 = 0; index10 < 15; index10++) {
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
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 15);
										success = true;
									}
								}
							}
						}
						if (success == true) {
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn
										.moveTo(Vec3
												.atBottomCenterOf(
														new BlockPos(
																entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																				entity))
																		.getBlockPos().getX(),
																entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																				entity))
																		.getBlockPos().getY(),
																entity.level().clip(
																		new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getZ())));
								entityToSpawn.setVisualOnly(true);
								_level.addFreshEntity(entityToSpawn);
							}
							{
								double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 35;
								entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.power = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							success = false;
						}
					}
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 27) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 80) {
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback) {
										AbstractArrow entityToSpawn = new BallLightningProjectileEntity(PowerModEntities.BALL_LIGHTNING_PROJECTILE.get(), level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 23, 0);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("power:electric_spark")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("power:electric_spark")), SoundSource.PLAYERS, 1, 1, false);
							}
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
			if (entity instanceof LivingEntity _livEnt377 && _livEnt377.hasEffect(PowerModMobEffects.SOUND_MASTER.get())) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 29) {
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
								_level.sendParticles((SimpleParticleType) (PowerModParticleTypes.BASS_BOOM.get()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										1, 0, 0, 0, 0.25);
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
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS, 1, 1, false);
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
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 30) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 30) {
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback) {
										AbstractArrow entityToSpawn = new SoundBombProjectileEntity(PowerModEntities.SOUND_BOMB_PROJECTILE.get(), level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 13, 0);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS, 1, 1, false);
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
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 31) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 80) {
						particleAmount = 125;
						particleRadius = 5;
						for (int index12 = 0; index12 < (int) particleAmount; index12++) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (PowerModParticleTypes.BASS_BOOM.get()), (x + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius),
										(y + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (z + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), 1, (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)),
										(Mth.nextDouble(RandomSource.create(), -0.001, 0.001)), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)), 0.25);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 21);
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(PowerModMobEffects.STUN.get(), 300, 0, false, false));
								}
							}
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
			if (entity instanceof LivingEntity _livEnt410 && _livEnt410.hasEffect(PowerModMobEffects.CRYSTAL_MASTER.get())) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 33) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 10) {
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback) {
										AbstractArrow entityToSpawn = new AmethystAttackProjectileEntity(PowerModEntities.AMETHYST_ATTACK_PROJECTILE.get(), level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 9, 2);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.fall")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.fall")), SoundSource.PLAYERS, 1, 1, false);
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
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 34) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 40) {
						for (int index13 = 0; index13 < 10; index13++) {
							if (!world.getBlockState(new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()))
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
											world.setBlock(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), Blocks.AMETHYST_CLUSTER.defaultBlockState(), 3);
											world.levelEvent(2001, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), Block.getId(Blocks.AMETHYST_CLUSTER.defaultBlockState()));
											entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 21);
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.fall")), SoundSource.PLAYERS, 1, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.fall")), SoundSource.PLAYERS, 1, 1, false);
												}
											}
											success = true;
										}
									}
								}
							}
						}
						if (success == true) {
							{
								double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 40;
								entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.power = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							success = false;
						}
					}
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 35) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 45) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.fall")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.fall")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new AmethystClusterAttackProjectileEntity(PowerModEntities.AMETHYST_CLUSTER_ATTACK_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 15, 0, (byte) 3);
							_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 2), z);
							_entityToSpawn.shoot((-1), 0, (-1), 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new AmethystClusterAttackProjectileEntity(PowerModEntities.AMETHYST_CLUSTER_ATTACK_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 15, 0, (byte) 3);
							_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 2), z);
							_entityToSpawn.shoot(1, 0, 1, 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new AmethystClusterAttackProjectileEntity(PowerModEntities.AMETHYST_CLUSTER_ATTACK_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 15, 0, (byte) 3);
							_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 2), z);
							_entityToSpawn.shoot((-1), 0, 1, 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new AmethystClusterAttackProjectileEntity(PowerModEntities.AMETHYST_CLUSTER_ATTACK_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 15, 0, (byte) 3);
							_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 2), z);
							_entityToSpawn.shoot(1, 0, (-1), 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new AmethystClusterAttackProjectileEntity(PowerModEntities.AMETHYST_CLUSTER_ATTACK_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 15, 0, (byte) 3);
							_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 2), z);
							_entityToSpawn.shoot(0, 0, (-1), 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new AmethystClusterAttackProjectileEntity(PowerModEntities.AMETHYST_CLUSTER_ATTACK_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 15, 0, (byte) 3);
							_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 2), z);
							_entityToSpawn.shoot(0, 0, 1, 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new AmethystClusterAttackProjectileEntity(PowerModEntities.AMETHYST_CLUSTER_ATTACK_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 15, 0, (byte) 3);
							_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 2), z);
							_entityToSpawn.shoot((-1), 0, 0, 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new AmethystClusterAttackProjectileEntity(PowerModEntities.AMETHYST_CLUSTER_ATTACK_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 15, 0, (byte) 3);
							_entityToSpawn.setPos(x, (y + entity.getBbHeight() / 2), z);
							_entityToSpawn.shoot(1, 0, 0, 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
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
			if (entity instanceof LivingEntity _livEnt460 && _livEnt460.hasEffect(PowerModMobEffects.LAVA_MASTER.get())) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 37) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 10) {
						for (int index14 = 0; index14 < 15; index14++) {
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
								_level.sendParticles(ParticleTypes.LAVA,
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
						}
						if (world
								.getBlockState(
										new BlockPos(
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getX(),
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getY(),
												entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
														entity)).getBlockPos().getZ()))
								.canOcclude()
								&& (world.getBlockState(BlockPos.containing(
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY() + 2,
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ())))
										.getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY() + 1,
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()),
									Blocks.FIRE.defaultBlockState(), 3);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.pop")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.pop")), SoundSource.PLAYERS, 1, 1, false);
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
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 38) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 35) {
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new LavaAttackProjectileEntity(PowerModEntities.LAVA_ATTACK_PROJECTILE.get(), level);
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
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.pop")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.pop")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						{
							double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 35;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.power = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 39) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 50) {
						for (int index15 = 0; index15 < 15; index15++) {
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
								_level.sendParticles(ParticleTypes.SMOKE,
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										5, 0, 1, 0, 0.25);
							if ((world.getBlockState(new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ())))
									.getBlock() == Blocks.RAW_IRON_BLOCK) {
								world.setBlock(new BlockPos(
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										Blocks.IRON_BLOCK.defaultBlockState(), 3);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.pop")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.pop")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								{
									double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 50;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.power = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else if ((world.getBlockState(new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ())))
									.getBlock() == Blocks.RAW_GOLD_BLOCK) {
								world.setBlock(new BlockPos(
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										Blocks.GOLD_BLOCK.defaultBlockState(), 3);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.pop")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.pop")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								{
									double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 50;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.power = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else if ((world.getBlockState(new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ())))
									.getBlock() == Blocks.RAW_COPPER_BLOCK) {
								world.setBlock(new BlockPos(
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										Blocks.COPPER_BLOCK.defaultBlockState(), 3);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.pop")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.pop")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								{
									double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 50;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.power = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else if ((world.getBlockState(new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ())))
									.getBlock() == Blocks.COBBLESTONE) {
								world.setBlock(new BlockPos(
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										Blocks.STONE.defaultBlockState(), 3);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.pop")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.pop")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								{
									double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 50;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.power = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else if ((world.getBlockState(new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ())))
									.getBlock() == ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft:dirt"))) {
								world.setBlock(new BlockPos(
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										Blocks.MAGMA_BLOCK.defaultBlockState(), 3);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.pop")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.pop")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								{
									double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 50;
									entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.power = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else if ((world.getBlockState(new BlockPos(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getY(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ())))
									.getBlock() == Blocks.GRASS_BLOCK) {
								world.setBlock(new BlockPos(
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(Scaling)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										Blocks.MAGMA_BLOCK.defaultBlockState(), 3);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.pop")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.pop")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								{
									double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 50;
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
			if (entity instanceof LivingEntity _livEnt564 && _livEnt564.hasEffect(PowerModMobEffects.RAIN_MASTER.get())) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 41) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 10) {
						for (int index16 = 0; index16 < 15; index16++) {
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
								_level.sendParticles(ParticleTypes.RAIN,
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
									}
								}
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("weather.rain.above")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("weather.rain.above")), SoundSource.PLAYERS, 1, 1, false);
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
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 42) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 45) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									particleAmount = 50;
									particleRadius = 10;
									for (int index17 = 0; index17 < (int) particleAmount; index17++) {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.RAIN, (entityiterator.getX() + Mth.nextDouble(RandomSource.create(), -0.1, 0.1) * particleRadius),
													(entityiterator.getY() + 0 + Mth.nextDouble(RandomSource.create(), 0, 5) * particleRadius), (entityiterator.getZ() + 0 + Mth.nextDouble(RandomSource.create(), -0.1, 0.1) * particleRadius), 10, 1, 1,
													1, 1);
									}
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 12);
								}
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("weather.rain.above")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("weather.rain.above")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						{
							double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 45;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.power = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 43) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 5) {
						if (world.getLevelData().isRaining()) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("weather.rain.above")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("weather.rain.above")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.RAIN, x, y, z, 30, 0, (-1), 0, 1);
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 10, 4, false, false));
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 0, false, false));
							{
								double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 5;
								entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.power = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("weather.rain.above")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("weather.rain.above")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.RAIN, x, y, z, 30, 0, (-1), 0, 1);
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 10, 2, false, false));
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 0, false, false));
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
			if (entity instanceof LivingEntity _livEnt602 && _livEnt602.hasEffect(PowerModMobEffects.TORNADO_MASTER.get())) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 45) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 10) {
						{
							double _setval = (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power - 10;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.power = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 46) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 30) {
						for (int index18 = 0; index18 < 15; index18++) {
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
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 100, 3, false, false));
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(PowerModMobEffects.WHIRLWIND.get(), 100, 0, false, false));
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
			if (entity instanceof LivingEntity _livEnt615 && _livEnt615.hasEffect(PowerModMobEffects.OCEAN_MASTER.get())) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).attack == 49) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power >= 10) {
						for (int index19 = 0; index19 < 15; index19++) {
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
								_level.sendParticles(ParticleTypes.RAIN,
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
									}
								}
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("weather.rain.above")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("weather.rain.above")), SoundSource.PLAYERS, 1, 1, false);
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
			}
		}
	}
}
