package net.ezkidtrix.epicmcmod.entity.client;

import net.ezkidtrix.epicmcmod.EpicMCMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer MiniGolem =
            new EntityModelLayer(new Identifier(EpicMCMod.MOD_ID, "mini_golem"), "main");
    public static final EntityModelLayer IceMiniGolem =
            new EntityModelLayer(new Identifier(EpicMCMod.MOD_ID, "ice_mini_golem"), "main");
}
