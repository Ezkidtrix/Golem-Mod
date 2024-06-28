package net.ezkidtrix.epicmcmod.block;

import net.ezkidtrix.epicmcmod.GolemMod;
import net.ezkidtrix.epicmcmod.block.custom.GolemCropBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block GOLEM_BLOCK = registerBlock("golem_block", new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));

    public static final Block GOLEM_ORE = registerBlock("golem_ore", new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
    public static final Block DEEPSLATE_GOLEM_ORE = registerBlock("deepslate_golem_ore", new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE)));

    public static final Block GOLEM_STAIRS = registerBlock("golem_stairs", new StairsBlock(ModBlocks.GOLEM_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block GOLEM_SLAB = registerBlock("golem_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static final Block GOLEM_BUTTON = registerBlock("golem_button", new ButtonBlock(BlockSetType.IRON, 20, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block GOLEM_PRESSURE_PLATE = registerBlock("golem_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static final Block GOLEM_FENCE = registerBlock("golem_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block GOLEM_FENCE_GATE = registerBlock("golem_fence_gate", new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block GOLEM_WALL = registerBlock("golem_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static final Block GOLEM_DOOR = registerBlock("golem_door", new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block GOLEM_TRAPDOOR = registerBlock("golem_trapdoor", new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static final Block GOLEM_CROP = Registry.register(Registries.BLOCK, Identifier.of(GolemMod.MOD_ID, "golem_crop"), new GolemCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GolemMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GolemMod.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        GolemMod.LOGGER.info("Registering blocks for " + GolemMod.MOD_ID);
    }
}
