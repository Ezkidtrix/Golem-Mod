package net.ezkidtrix.epicmcmod.entity.client;

import net.ezkidtrix.epicmcmod.EpicMCMod;
import net.ezkidtrix.epicmcmod.entity.custom.MiniGolemEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class MiniGolemRenderer extends MobEntityRenderer<MiniGolemEntity, MiniGolemModel<MiniGolemEntity>> {
    private static final Identifier TEXTURE = new Identifier(EpicMCMod.MOD_ID, "textures/entity/mini_golem.png");

    public MiniGolemRenderer(EntityRendererFactory.Context context) {
        super(context, new MiniGolemModel<>(context.getPart(ModModelLayers.MiniGolem)), 0.6f);
    }

    @Override
    public Identifier getTexture(MiniGolemEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(MiniGolemEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
