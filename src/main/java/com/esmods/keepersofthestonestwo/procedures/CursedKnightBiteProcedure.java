package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.core.registries.Registries;

import java.util.List;
import java.util.Comparator;

import com.esmods.keepersofthestonestwo.entity.CursedKnightEntity;

public class CursedKnightBiteProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double XPar = 0;
		double YPar = 0;
		double Range = 0;
		double ZPar = 0;
		Range = 0.25;
		if (entity.getPersistentData().getDouble("IA") == 0) {
			if (entity instanceof CursedKnightEntity) {
				((CursedKnightEntity) entity).setAnimation("cursed_knight.animation.attack");
			}
			entity.getPersistentData().putDouble("Look", (entity.getYRot()));
		}
		entity.getPersistentData().putDouble("IA", (entity.getPersistentData().getDouble("IA") + 1));
		{
			Entity _ent = entity;
			_ent.setYRot((float) entity.getPersistentData().getDouble("Look"));
			_ent.setXRot(0);
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
		if (entity.getPersistentData().getDouble("IA") < 25) {
			for (int index0 = 0; index0 < 4; index0++) {
				XPar = x + entity.getLookAngle().x * Range;
				YPar = y + 1.75;
				ZPar = z + entity.getLookAngle().z * Range;
				Range = Range + 1.25;
			}
		}
		if (entity.getPersistentData().getDouble("IA") > 25 && entity.getPersistentData().getDouble("IA") < 29) {
			for (int index1 = 0; index1 < 4; index1++) {
				XPar = x + entity.getLookAngle().x * Range;
				YPar = y + 1.75;
				ZPar = z + entity.getLookAngle().z * Range;
				{
					final Vec3 _center = new Vec3(XPar, YPar, ZPar);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity)) {
							if (!(entityiterator instanceof LivingEntity _livEnt16 && _livEnt16.isBlocking())) {
								entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), 6);
								entityiterator.setDeltaMovement(new Vec3((entity.getLookAngle().x * 0.5), 0.25, (entity.getLookAngle().z * 0.5)));
								{
									ItemStack _ist = new ItemStack(Items.SHIELD);
									if (_ist.hurt(1, RandomSource.create(), null)) {
										_ist.shrink(1);
										_ist.setDamageValue(0);
									}
								}
							}
						}
					}
				}
				Range = Range + 1.25;
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 73) {
			entity.getPersistentData().putDouble("IA", 0);
			entity.getPersistentData().putString("State", "Idle");
		}
	}
}
