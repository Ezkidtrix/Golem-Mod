package net.ezkidtrix.epicmcmod.datagen;

import net.ezkidtrix.epicmcmod.block.ModBlocks;
import net.ezkidtrix.epicmcmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.GOLEM_BLOCK);
        addDrop(ModBlocks.GOLEM_ORE, ModItems.GOLEM_INGOT);
        addDrop(ModBlocks.DEEPSLATE_GOLEM_ORE, ModItems.GOLEM_INGOT);

        addDrop(ModBlocks.GOLEM_STAIRS);
        addDrop(ModBlocks.GOLEM_TRAPDOOR);
        addDrop(ModBlocks.GOLEM_WALL);
        addDrop(ModBlocks.GOLEM_FENCE);
        addDrop(ModBlocks.GOLEM_FENCE_GATE);
        addDrop(ModBlocks.GOLEM_BUTTON);
        addDrop(ModBlocks.GOLEM_PRESSURE_PLATE);

        addDrop(ModBlocks.GOLEM_DOOR, doorDrops(ModBlocks.GOLEM_DOOR));
        addDrop(ModBlocks.GOLEM_SLAB, slabDrops(ModBlocks.GOLEM_SLAB));
    }
}
