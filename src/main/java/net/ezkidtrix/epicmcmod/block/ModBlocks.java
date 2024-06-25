package net.ezkidtrix.epicmcmod.block;

import net.ezkidtrix.epicmcmod.EpicMCMod;
import net.ezkidtrix.epicmcmod.block.custom.GolemChestBlock;
import net.ezkidtrix.epicmcmod.block.custom.GolemCropBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block GOLEM_BLOCK = registerBlock("golem_block", new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

    public static final Block GOLEM_ORE = registerBlock("golem_ore", new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)));
    public static final Block DEEPSLATE_GOLEM_ORE = registerBlock("deepslate_golem_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE)));

    public static final Block GOLEM_STAIRS = registerBlock("golem_stairs", new StairsBlock(ModBlocks.GOLEM_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLEM_SLAB = registerBlock("golem_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block GOLEM_BUTTON = registerBlock("golem_button", new ButtonBlock(BlockSetType.IRON, 20, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLEM_PRESSURE_PLATE = registerBlock("golem_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block GOLEM_FENCE = registerBlock("golem_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLEM_FENCE_GATE = registerBlock("golem_fence_gate", new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLEM_WALL = registerBlock("golem_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block GOLEM_DOOR = registerBlock("golem_door", new DoorBlock(BlockSetType.IRON, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLEM_TRAPDOOR = registerBlock("golem_trapdoor", new TrapdoorBlock(BlockSetType.IRON, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block GOLEM_CROP = Registry.register(Registries.BLOCK, new Identifier(EpicMCMod.MOD_ID, "golem_crop"), new GolemCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block GOLEM_CHEST = registerBlock("golem_chest", new GolemChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(EpicMCMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(EpicMCMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        EpicMCMod.LOGGER.info("Registering blocks for " + EpicMCMod.MOD_ID);
    }
}
