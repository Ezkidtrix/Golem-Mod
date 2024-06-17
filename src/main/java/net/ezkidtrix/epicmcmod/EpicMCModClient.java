package net.ezkidtrix.epicmcmod;

import net.ezkidtrix.epicmcmod.entity.ModEntities;
import net.ezkidtrix.epicmcmod.entity.client.MiniGolemModel;
import net.ezkidtrix.epicmcmod.entity.client.MiniGolemRenderer;
import net.ezkidtrix.epicmcmod.entity.client.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class EpicMCModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.MiniGolem, MiniGolemRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MiniGolem, MiniGolemModel::getTexturedModelData);
    }
}
