package com.esmods.keepersofthestonestwo.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

import com.esmods.keepersofthestonestwo.entity.SphereNothingProjectileEntity;
import com.esmods.keepersofthestonestwo.client.model.Modellightball;

public class SphereNothingProjectileRenderer extends EntityRenderer<SphereNothingProjectileEntity> {
	private static final ResourceLocation texture = ResourceLocation.parse("power:textures/entities/sphere_nothing.png");
	private final Modellightball model;

	public SphereNothingProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modellightball(context.bakeLayer(Modellightball.LAYER_LOCATION));
	}

	@Override
	public void render(SphereNothingProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(SphereNothingProjectileEntity entity) {
		return texture;
	}
}
