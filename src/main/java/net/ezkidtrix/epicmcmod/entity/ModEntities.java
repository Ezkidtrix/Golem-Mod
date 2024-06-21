package net.ezkidtrix.epicmcmod.entity;

import net.ezkidtrix.epicmcmod.EpicMCMod;
import net.ezkidtrix.epicmcmod.entity.custom.IceMiniGolemEntity;
import net.ezkidtrix.epicmcmod.entity.custom.MiniCreeperEntity;
import net.ezkidtrix.epicmcmod.entity.custom.MiniGolemEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<MiniGolemEntity> MiniGolem = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(EpicMCMod.MOD_ID, "mini_golem"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MiniGolemEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());

    public static final EntityType<IceMiniGolemEntity> IceMiniGolem = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(EpicMCMod.MOD_ID, "ice_mini_golem"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, IceMiniGolemEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());

    public static final EntityType<MiniCreeperEntity> MiniCreeper = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(EpicMCMod.MOD_ID, "mini_creeper"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MiniCreeperEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());
}