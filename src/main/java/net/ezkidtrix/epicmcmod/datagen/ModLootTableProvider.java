package net.ezkidtrix.epicmcmod.datagen;

import net.ezkidtrix.epicmcmod.block.ModBlocks;
import net.ezkidtrix.epicmcmod.block.custom.GolemCropBlock;
import net.ezkidtrix.epicmcmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.BlockState;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> future) {
        super(dataOutput, future);
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

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.GOLEM_CROP).properties(StatePredicate.Builder.create().exactMatch(GolemCropBlock.AGE, 2));
        addDrop(ModBlocks.GOLEM_CROP, cropDrops(ModBlocks.GOLEM_CROP, ModItems.GOLEM_INGOT, ModItems.GOLEM_SEEDS, builder));
    }
}
