package net.ezkidtrix.epicmcmod.entity.client;

import net.ezkidtrix.epicmcmod.GolemMod;
import net.ezkidtrix.epicmcmod.entity.custom.MiniCreeperEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class MiniCreeperRenderer extends MobEntityRenderer<MiniCreeperEntity, MiniCreeperModel<MiniCreeperEntity>> {
    public static Identifier TEXTURE = Identifier.of(GolemMod.MOD_ID, "textures/entity/mini_creeper.png");

    public MiniCreeperRenderer(EntityRendererFactory.Context context) {
        super(context, new MiniCreeperModel<>(context.getPart(ModModelLayers.MiniCreeper)), 0.6f);
    }

    @Override
    public Identifier getTexture(MiniCreeperEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(MiniCreeperEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
