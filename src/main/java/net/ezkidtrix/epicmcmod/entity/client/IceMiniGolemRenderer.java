package net.ezkidtrix.epicmcmod.entity.client;

import net.ezkidtrix.epicmcmod.GolemMod;
import net.ezkidtrix.epicmcmod.entity.custom.IceMiniGolemEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class IceMiniGolemRenderer extends MobEntityRenderer<IceMiniGolemEntity, IceMiniGolemModel<IceMiniGolemEntity>> {
    private static final Identifier TEXTURE = Identifier.of(GolemMod.MOD_ID, "textures/entity/ice_mini_golem.png");

    public IceMiniGolemRenderer(EntityRendererFactory.Context context) {
        super(context, new IceMiniGolemModel<>(context.getPart(ModModelLayers.IceMiniGolem)), 0.6f);

    }

    @Override
    public Identifier getTexture(IceMiniGolemEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(IceMiniGolemEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
