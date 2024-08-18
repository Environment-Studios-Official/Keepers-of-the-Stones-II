
package com.esmods.keepersofthestonestwo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.esmods.keepersofthestonestwo.entity.PlagueBombEntity;
import com.esmods.keepersofthestonestwo.client.model.Modelpoison_bomb;

public class PlagueBombRenderer extends MobRenderer<PlagueBombEntity, Modelpoison_bomb<PlagueBombEntity>> {
	public PlagueBombRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpoison_bomb(context.bakeLayer(Modelpoison_bomb.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(PlagueBombEntity entity) {
		return new ResourceLocation("power:textures/entities/plague_bomb.png");
	}
}
