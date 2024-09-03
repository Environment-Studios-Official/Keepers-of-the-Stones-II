package com.esmods.keepersofthestonestwo.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.esmods.keepersofthestonestwo.entity.BlackHoleEntity;

public class BlackHoleModel extends GeoModel<BlackHoleEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlackHoleEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("power", "animations/black_hole.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlackHoleEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("power", "geo/black_hole.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlackHoleEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("power", "textures/entities/" + entity.getTexture() + ".png");
	}

}
