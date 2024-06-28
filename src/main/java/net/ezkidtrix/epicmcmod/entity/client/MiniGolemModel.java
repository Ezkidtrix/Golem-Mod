package net.ezkidtrix.epicmcmod.entity.client;

import net.ezkidtrix.epicmcmod.entity.custom.MiniGolemEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class MiniGolemModel<T extends MiniGolemEntity> extends EntityModel<T> {
	private final ModelPart golem;

	public MiniGolemModel(ModelPart root) {
		this.golem = root.getChild("golem");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();

		ModelPartData golem = modelPartData.addChild("golem", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = golem.addChild("body", ModelPartBuilder.create().uv(0, 40).cuboid(-9.0F, 11.0F, -6.0F, 18.0F, 10.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -31.0F, 0.0F));

		ModelPartData head = golem.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, 1.0F, -5.5F, 8.0F, 10.0F, 8.0F, new Dilation(0.0F))
		.uv(24, 0).cuboid(-1.0F, 8.0F, -7.5F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -31.0F, -2.0F));

		ModelPartData right_arm = golem.addChild("right_arm", ModelPartBuilder.create().uv(60, 21).cuboid(-13.0F, 13.5F, -3.0F, 4.0F, 13.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -31.0F, 0.0F));

		ModelPartData left_arm = golem.addChild("left_arm", ModelPartBuilder.create().uv(60, 58).cuboid(9.0F, 13.5F, -3.0F, 4.0F, 13.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -31.0F, 0.0F));

		ModelPartData right_leg = golem.addChild("right_leg", ModelPartBuilder.create().uv(37, 0).cuboid(-3.5F, 3.0F, -3.0F, 6.0F, 10.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -13.0F, 0.0F));

		ModelPartData left_leg = golem.addChild("left_leg", ModelPartBuilder.create().uv(60, 0).cuboid(-3.5F, 3.0F, -3.0F, 6.0F, 10.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, -13.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
		golem.render(matrices, vertices, light, overlay, color);
	}
}