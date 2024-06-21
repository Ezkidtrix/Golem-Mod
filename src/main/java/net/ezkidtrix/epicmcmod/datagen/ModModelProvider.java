package net.ezkidtrix.epicmcmod.datagen;

import net.ezkidtrix.epicmcmod.block.ModBlocks;
import net.ezkidtrix.epicmcmod.block.custom.GolemCropBlock;
import net.ezkidtrix.epicmcmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool golemPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GOLEM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GOLEM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_GOLEM_ORE);

        golemPool.stairs(ModBlocks.GOLEM_STAIRS);
        golemPool.slab(ModBlocks.GOLEM_SLAB);
        golemPool.button(ModBlocks.GOLEM_BUTTON);
        golemPool.pressurePlate(ModBlocks.GOLEM_PRESSURE_PLATE);
        golemPool.fence(ModBlocks.GOLEM_FENCE);
        golemPool.fenceGate(ModBlocks.GOLEM_FENCE_GATE);
        golemPool.wall(ModBlocks.GOLEM_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.GOLEM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.GOLEM_TRAPDOOR);

        blockStateModelGenerator.registerCrop(ModBlocks.GOLEM_CROP, GolemCropBlock.AGE, 0, 1, 2);
    }

    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MINI_GOLEM_SPAWN_EGG, new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));
        itemModelGenerator.register(ModItems.ICE_MINI_GOLEM_SPAWN_EGG, new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.register(ModItems.MINI_CREEPER_SPAWN_EGG, new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.register(ModItems.GOLEM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLEM_MUSIC_DISC, Models.GENERATED);

        itemModelGenerator.register(ModItems.GOLEM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLEM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLEM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLEM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLEM_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.GOLEM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.GOLEM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.GOLEM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.GOLEM_BOOTS);
    }
}
