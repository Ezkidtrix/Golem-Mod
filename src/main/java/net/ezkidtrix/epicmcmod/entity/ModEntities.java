package net.ezkidtrix.epicmcmod.entity;

import net.ezkidtrix.epicmcmod.EpicMCMod;
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
            new Identifier(EpicMCMod.MOD_ID, "small_golem"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MiniGolemEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());
}