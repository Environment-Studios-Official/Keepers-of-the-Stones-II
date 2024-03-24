package com.esmods.keepersofthestonestwo.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.esmods.keepersofthestonestwo.entity.BlackHoleEntity;

public class BlackHoleModel extends GeoModel<BlackHoleEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlackHoleEntity entity) {
		return new ResourceLocation("keepers_of_the_stones_2", "animations/black_hole.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlackHoleEntity entity) {
		return new ResourceLocation("keepers_of_the_stones_2", "geo/black_hole.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlackHoleEntity entity) {
		return new ResourceLocation("keepers_of_the_stones_2", "textures/entities/" + entity.getTexture() + ".png");
	}

}
