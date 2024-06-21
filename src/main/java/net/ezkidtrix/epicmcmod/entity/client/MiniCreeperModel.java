package net.ezkidtrix.epicmcmod.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.CreeperEntity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class MiniCreeperModel<T extends CreeperEntity> extends EntityModel<T> {
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart leg4;

	public MiniCreeperModel(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, 2.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 0.0F));

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, 10.0F, -2.0F, 8.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 0.0F));

		ModelPartData leg1 = modelPartData.addChild("leg1", ModelPartBuilder.create().uv(1, 17).cuboid(-2.0F, 3.0F, -2.0F, 4.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 18.0F, 4.0F));

		ModelPartData leg2 = modelPartData.addChild("leg2", ModelPartBuilder.create().uv(1, 17).cuboid(-2.0F, 3.0F, -2.0F, 4.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 18.0F, 4.0F));

		ModelPartData leg3 = modelPartData.addChild("leg3", ModelPartBuilder.create().uv(1, 17).cuboid(-2.0F, 3.0F, -1.0F, 4.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 18.0F, -4.0F));

		ModelPartData leg4 = modelPartData.addChild("leg4", ModelPartBuilder.create().uv(1, 17).cuboid(-2.0F, 3.0F, -1.0F, 4.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 18.0F, -4.0F));
		return TexturedModelData.of(modelData, 64, 32);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		head.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leg1.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leg2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leg3.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leg4.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
}