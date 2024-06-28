package net.ezkidtrix.epicmcmod.entity.client;

import net.ezkidtrix.epicmcmod.GolemMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer MiniGolem =
            new EntityModelLayer(Identifier.of(GolemMod.MOD_ID, "mini_golem"), "main");
    public static final EntityModelLayer IceMiniGolem =
            new EntityModelLayer(Identifier.of(GolemMod.MOD_ID, "ice_mini_golem"), "main");

    public static final EntityModelLayer MiniCreeper = new EntityModelLayer(Identifier.of(GolemMod.MOD_ID, "mini_creeper"), "main");
}
