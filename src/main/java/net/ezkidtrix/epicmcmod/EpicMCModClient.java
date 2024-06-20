package net.ezkidtrix.epicmcmod;

import net.ezkidtrix.epicmcmod.entity.ModEntities;
import net.ezkidtrix.epicmcmod.entity.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class EpicMCModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.MiniGolem, MiniGolemRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MiniGolem, MiniGolemModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.IceMiniGolem, IceMiniGolemRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.IceMiniGolem, IceMiniGolemModel::getTexturedModelData);
    }
}
