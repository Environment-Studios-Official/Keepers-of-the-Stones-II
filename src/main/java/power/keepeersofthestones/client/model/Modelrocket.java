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
public class Modelrocket<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("power", "modelrocket"), "main");
	public final ModelPart Fuselage;
	public final ModelPart cabin;

	public Modelrocket(ModelPart root) {
		this.Fuselage = root.getChild("Fuselage");
		this.cabin = root.getChild("cabin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Fuselage = partdefinition.addOrReplaceChild("Fuselage",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, 23.5455F, -3.0F, 10.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.5F, 19.5455F, -3.0F, 10.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(150, 150)
						.addBox(-5.5F, 15.5455F, -4.0F, 12.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 21).addBox(-4.5F, 11.5455F, -3.0F, 10.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(150, 150)
						.addBox(-5.5F, 7.5455F, -4.0F, 12.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(18, 0).addBox(-4.5F, 3.5455F, -3.0F, 10.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(150, 150)
						.addBox(-5.5F, -0.4545F, -4.0F, 12.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, -13.5455F, -2.0F));
		PartDefinition engine = Fuselage.addOrReplaceChild("engine",
				CubeListBuilder.create().texOffs(150, 150).addBox(5.5F, 21.5455F, 0.0F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(150, 150).addBox(-1.5F, 21.5455F, 7.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(150, 150)
						.addBox(-6.5F, 21.5455F, 0.0F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(150, 150).addBox(-1.5F, 21.5455F, -5.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(150, 150)
						.addBox(-7.5F, 27.5455F, -1.0F, 3.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(150, 150).addBox(5.5F, 27.5455F, -1.0F, 3.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(150, 150)
						.addBox(-2.5F, 27.5455F, -6.0F, 6.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(150, 150).addBox(-2.5F, 27.5455F, 7.0F, 6.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cabin = partdefinition.addOrReplaceChild("cabin",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, 27.4063F, 6.125F, 10.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.5F, 23.4063F, 6.125F, 10.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.5F, 19.4063F, 6.125F, 10.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.5F, 15.4063F, 6.125F, 10.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.5F, 27.4063F, -3.875F, 10.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.5F, 15.4063F, -3.875F, 10.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.5F, 27.4063F, -3.875F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.5F, 23.4063F, -3.875F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.5F, 19.4063F, -3.875F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.5F, 15.4063F, -3.875F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.5F, 27.4063F, -3.875F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(4.5F, 23.4063F, -3.875F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.5F, 19.4063F, -3.875F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(4.5F, 15.4063F, -3.875F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(-4.5F, 31.4063F, -3.875F, 10.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(4, 51).addBox(-2.5F, 29.4063F, -0.875F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, -50.4063F, -1.125F));
		PartDefinition seat_back_r1 = cabin.addOrReplaceChild("seat_back_r1", CubeListBuilder.create().texOffs(2, 49).addBox(-3.0F, -2.5F, 3.25F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 20.1563F, 0.625F, -1.5708F, 0.0F, 0.0F));
		PartDefinition pik = cabin.addOrReplaceChild("pik",
				CubeListBuilder.create().texOffs(150, 150).addBox(-4.5F, -16.2857F, -3.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(150, 150).addBox(-3.5F, -18.2857F, -2.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(150, 150)
						.addBox(-2.5F, -20.2857F, -1.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(150, 150).addBox(-1.5F, -22.2857F, 0.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(150, 150)
						.addBox(-0.5F, -24.2857F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 29.692F, -0.875F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Fuselage.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cabin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
