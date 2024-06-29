package net.ezkidtrix.epicmcmod.world.gen;

import net.ezkidtrix.epicmcmod.entity.ModEntities;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnLocation;
import net.minecraft.entity.SpawnLocationTypes;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

import static net.minecraft.entity.SpawnLocationTypes.ON_GROUND;

public class ModEntityGeneration {
    public static void addSpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.FOREST), SpawnGroup.CREATURE, ModEntities.MiniGolem, 65, 1, 1);
        SpawnRestriction.register(ModEntities.MiniGolem, ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::canMobSpawn);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_TAIGA), SpawnGroup.CREATURE, ModEntities.IceMiniGolem, 45, 1, 1);
        SpawnRestriction.register(ModEntities.IceMiniGolem, ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::canMobSpawn);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.MUSHROOM_FIELDS), SpawnGroup.CREATURE, ModEntities.MiniCreeper, 100, 1, 2);
        SpawnRestriction.register(ModEntities.MiniCreeper, ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::canMobSpawn);
    }
}
