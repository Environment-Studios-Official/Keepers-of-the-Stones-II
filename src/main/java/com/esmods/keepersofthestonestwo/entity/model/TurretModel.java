package com.esmods.keepersofthestonestwo.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import com.esmods.keepersofthestonestwo.entity.TurretEntity;

public class TurretModel extends GeoModel<TurretEntity> {
	@Override
	public ResourceLocation getAnimationResource(TurretEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("power", "animations/turret.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TurretEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("power", "geo/turret.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TurretEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("power", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(TurretEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("bone");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
