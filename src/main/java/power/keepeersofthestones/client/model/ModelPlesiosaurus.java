package power.keepeersofthestones.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelPlesiosaurus<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("power", "model_plesiosaurus"), "main");
	public final ModelPart neck;
	public final ModelPart lower_jaw;
	public final ModelPart head;
	public final ModelPart fins0;
	public final ModelPart fins1;
	public final ModelPart body;
	public final ModelPart tail;

	public ModelPlesiosaurus(ModelPart root) {
		this.neck = root.getChild("neck");
		this.lower_jaw = root.getChild("lower_jaw");
		this.head = root.getChild("head");
		this.fins0 = root.getChild("fins0");
		this.fins1 = root.getChild("fins1");
		this.body = root.getChild("body");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition neck = partdefinition.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, -5.1603F, -48.866F));
		PartDefinition neck_r1 = neck.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(0, 300).addBox(-4.5F, -58.5119F, -4.8895F, 10.0F, 64.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 1.1603F, 0.9847F, -1.0472F, 3.1416F, 0.0F));
		PartDefinition lower_jaw = partdefinition.addOrReplaceChild("lower_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, -27.0F, -96.0F));
		PartDefinition lower_jaw_r1 = lower_jaw.addOrReplaceChild("lower_jaw_r1", CubeListBuilder.create().texOffs(64, 484).addBox(-6.5F, -1.0F, -0.1187F, 14.0F, 4.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, 0.1187F, 0.0F, 3.1416F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -5.0F, 35.0F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(436, 476).addBox(-6.5F, -7.0F, -0.1187F, 14.0F, 12.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -28.0F, -130.8813F, 0.0F, 3.1416F, 0.0F));
		PartDefinition fins0 = partdefinition.addOrReplaceChild("fins0", CubeListBuilder.create(), PartPose.offset(16.5F, 15.0F, -9.0F));
		PartDefinition fin0_r1 = fins0.addOrReplaceChild("fin0_r1", CubeListBuilder.create().texOffs(346, 280).addBox(-1.4418F, -0.7598F, -8.0F, 32.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -4.0F, 25.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition fin2_r1 = fins0.addOrReplaceChild("fin2_r1", CubeListBuilder.create().texOffs(346, 280).addBox(0.4901F, -1.2774F, -8.0F, 32.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -4.0F, -25.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition fins1 = partdefinition.addOrReplaceChild("fins1", CubeListBuilder.create(), PartPose.offset(-19.0F, 15.0F, -9.0F));
		PartDefinition fin1_r1 = fins1.addOrReplaceChild("fin1_r1", CubeListBuilder.create().texOffs(323, 345).addBox(-33.456F, -1.5362F, -8.0F, 32.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -4.0F, 25.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition fin3_r1 = fins1.addOrReplaceChild("fin3_r1", CubeListBuilder.create().texOffs(323, 345).addBox(-32.7489F, -0.3115F, -8.0F, 32.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -5.0F, -25.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-1.0F, 4.0F, -8.5F));
		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(1, 395).addBox(-17.5F, -10.0F, -43.1187F, 34.0F, 32.0F, 85.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -6.0F, 1.6187F, 0.0F, 3.1416F, 0.0F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(-1.0F, -5.3129F, -51.7626F));
		PartDefinition tail_r1 = tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(472, 0).addBox(-5.5F, -3.4467F, -4.5829F, 10.0F, 40.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -0.6871F, 87.8813F, -1.309F, 3.1416F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lower_jaw.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		fins0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		fins1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
