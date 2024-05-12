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

import com.esmods.keepersofthestonestwo.entity.TeleportationGunProjectileEntity;
import com.esmods.keepersofthestonestwo.client.model.Modelturret_projectile;

public class TeleportationGunProjectileRenderer extends EntityRenderer<TeleportationGunProjectileEntity> {
	private static final ResourceLocation texture = new ResourceLocation("power:textures/entities/tp_gun_projectile.png");
	private final Modelturret_projectile model;

	public TeleportationGunProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelturret_projectile(context.bakeLayer(Modelturret_projectile.LAYER_LOCATION));
	}

	@Override
	public void render(TeleportationGunProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(TeleportationGunProjectileEntity entity) {
		return texture;
	}
}
