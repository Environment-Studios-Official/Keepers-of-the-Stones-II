package com.esmods.keepersofthestonestwo.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import java.util.List;
import java.util.Comparator;

import com.esmods.keepersofthestonestwo.entity.EnergiumGolemEntity;

public class EnergiumGolemHandsAttackProcedure {
	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		double XPar = 0;
		double YPar = 0;
		double Range = 0;
		double ZPar = 0;
		Range = 0.25;
		if (entity.getPersistentData().getDouble("IA") == 0) {
			if (entity instanceof EnergiumGolemEntity) {
				((EnergiumGolemEntity) entity).setAnimation("energium_golem.animation.attack");
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
		if (entity.getPersistentData().getDouble("IA") < 10) {
			for (int index0 = 0; index0 < 4; index0++) {
				Range = Range + 1;
				XPar = x + entity.getLookAngle().x * Range;
				YPar = entity.getLookAngle().y + 2;
				ZPar = z + entity.getLookAngle().z * Range;
				Range = Range + 1;
			}
		}
		if (entity.getPersistentData().getDouble("IA") > 7 && entity.getPersistentData().getDouble("IA") < 20) {
			for (int index1 = 0; index1 < 4; index1++) {
				XPar = x + entity.getLookAngle().x * Range;
				YPar = entity.getLookAngle().y + 2;
				ZPar = z + entity.getLookAngle().z * Range;
				{
					final Vec3 _center = new Vec3(XPar, YPar, ZPar);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity)) {
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), 16);
							entityiterator.setDeltaMovement(new Vec3((entity.getLookAngle().x * 0.35), 0.25, (entity.getLookAngle().z * 0.35)));
						}
					}
				}
				Range = Range + 1;
			}
		}
		if (entity.getPersistentData().getDouble("IA") == 27) {
			entity.getPersistentData().putDouble("IA", 0);
			entity.getPersistentData().putString("State", "Idle");
		}
	}
}
