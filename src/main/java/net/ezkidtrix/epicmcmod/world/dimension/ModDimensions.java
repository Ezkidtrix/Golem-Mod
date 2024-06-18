package net.ezkidtrix.epicmcmod.world.dimension;

import net.ezkidtrix.epicmcmod.EpicMCMod;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

import java.util.OptionalLong;

public class ModDimensions {
    public static final RegistryKey<DimensionOptions> GOLEMDIM_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(EpicMCMod.MOD_ID, "golemdim"));
    public static final RegistryKey<World> GOLEMDIM_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(EpicMCMod.MOD_ID, "golemdim"));
    public static final RegistryKey<DimensionType> GOLEMDIM_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(EpicMCMod.MOD_ID, "golemdim_type"));

    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(GOLEMDIM_DIM_TYPE, new DimensionType(
                OptionalLong.of(1000), // fixedTime
                false, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                512, // height
                512, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD,
                DimensionTypes.OVERWORLD_ID,
                1.5f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));
    }
}
