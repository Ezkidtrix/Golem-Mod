package net.ezkidtrix.epicmcmod.entity;

import net.ezkidtrix.epicmcmod.GolemMod;
import net.ezkidtrix.epicmcmod.entity.custom.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<MiniGolemEntity> MiniGolem = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(GolemMod.MOD_ID, "mini_golem"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MiniGolemEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());

    public static final EntityType<IceMiniGolemEntity> IceMiniGolem = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(GolemMod.MOD_ID, "ice_mini_golem"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, IceMiniGolemEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());

    public static final EntityType<MiniCreeperEntity> MiniCreeper = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(GolemMod.MOD_ID, "mini_creeper"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MiniCreeperEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());

    public static final EntityType<ThrowableAnvilEntity> THROWABLE_ANVIL = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(GolemMod.MOD_ID, "throwable_anvil"), FabricEntityTypeBuilder.<ThrowableAnvilEntity>create(SpawnGroup.MISC, ThrowableAnvilEntity::new)
                    .dimensions(EntityDimensions.fixed(1, 1)).build());
}