package com.esmods.keepersofthestonestwo.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import com.esmods.keepersofthestonestwo.entity.CursedKeeperEntity;

public class CursedKeeperModel extends GeoModel<CursedKeeperEntity> {
	@Override
	public ResourceLocation getAnimationResource(CursedKeeperEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("power", "animations/cursed_keeper.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CursedKeeperEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("power", "geo/cursed_keeper.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CursedKeeperEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("power", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(CursedKeeperEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
