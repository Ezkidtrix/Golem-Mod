package net.ezkidtrix.epicmcmod.datagen;

import net.ezkidtrix.epicmcmod.block.ModBlocks;
import net.ezkidtrix.epicmcmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> future) {
        super(output, future);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.GOLEM_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLEM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLEM_SWORD, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" S ")
                .input('#', ModItems.GOLEM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GOLEM_INGOT), conditionsFromItem(ModItems.GOLEM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.GOLEM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLEM_PICKAXE, 1)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.GOLEM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GOLEM_INGOT), conditionsFromItem(ModItems.GOLEM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.GOLEM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLEM_AXE, 1)
                .pattern(" ##")
                .pattern(" S#")
                .pattern(" S ")
                .input('#', ModItems.GOLEM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GOLEM_INGOT), conditionsFromItem(ModItems.GOLEM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.GOLEM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLEM_SHOVEL, 1)
                .pattern(" # ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.GOLEM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GOLEM_INGOT), conditionsFromItem(ModItems.GOLEM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.GOLEM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLEM_HOE, 1)
                .pattern(" ##")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.GOLEM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.GOLEM_INGOT), conditionsFromItem(ModItems.GOLEM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.GOLEM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLEM_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .input('#', ModItems.GOLEM_INGOT)
                .criterion(hasItem(ModItems.GOLEM_INGOT), conditionsFromItem(ModItems.GOLEM_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.GOLEM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLEM_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.GOLEM_INGOT)
                .criterion(hasItem(ModItems.GOLEM_INGOT), conditionsFromItem(ModItems.GOLEM_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.GOLEM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLEM_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.GOLEM_INGOT)
                .criterion(hasItem(ModItems.GOLEM_INGOT), conditionsFromItem(ModItems.GOLEM_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.GOLEM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLEM_BOOTS, 1)
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.GOLEM_INGOT)
                .criterion(hasItem(ModItems.GOLEM_INGOT), conditionsFromItem(ModItems.GOLEM_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.GOLEM_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLEM_STAIRS, 1)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ModBlocks.GOLEM_BLOCK)
                .criterion(hasItem(ModBlocks.GOLEM_BLOCK), conditionsFromItem(ModBlocks.GOLEM_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.GOLEM_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLEM_SLAB, 1)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ModBlocks.GOLEM_BLOCK)
                .criterion(hasItem(ModBlocks.GOLEM_BLOCK), conditionsFromItem(ModBlocks.GOLEM_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.GOLEM_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GOLEM_PRESSURE_PLATE, 1)
                .pattern("   ")
                .pattern("## ")
                .pattern("   ")
                .input('#', ModBlocks.GOLEM_BLOCK)
                .criterion(hasItem(ModBlocks.GOLEM_BLOCK), conditionsFromItem(ModBlocks.GOLEM_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.GOLEM_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLEM_FENCE, 1)
                .pattern("#S#")
                .pattern("#S#")
                .pattern("   ")
                .input('#', ModBlocks.GOLEM_BLOCK)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.GOLEM_BLOCK), conditionsFromItem(ModBlocks.GOLEM_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.GOLEM_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLEM_FENCE_GATE, 1)
                .pattern("S#S")
                .pattern("S#S")
                .pattern("   ")
                .input('#', ModBlocks.GOLEM_BLOCK)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.GOLEM_BLOCK), conditionsFromItem(ModBlocks.GOLEM_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.GOLEM_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLEM_DOOR, 1)
                .pattern(" ##")
                .pattern(" ##")
                .pattern(" ##")
                .input('#', ModBlocks.GOLEM_BLOCK)
                .criterion(hasItem(ModBlocks.GOLEM_BLOCK), conditionsFromItem(ModBlocks.GOLEM_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.GOLEM_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLEM_TRAPDOOR, 1)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ModBlocks.GOLEM_BLOCK)
                .criterion(hasItem(ModBlocks.GOLEM_BLOCK), conditionsFromItem(ModBlocks.GOLEM_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.GOLEM_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GOLEM_BUTTON, 1)
                .pattern("   ")
                .pattern(" # ")
                .pattern("   ")
                .input('#', ModBlocks.GOLEM_BLOCK)
                .criterion(hasItem(ModBlocks.GOLEM_BLOCK), conditionsFromItem(ModBlocks.GOLEM_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.GOLEM_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLEM_WALL, 1)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ModBlocks.GOLEM_BLOCK)
                .criterion(hasItem(ModBlocks.GOLEM_BLOCK), conditionsFromItem(ModBlocks.GOLEM_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.GOLEM_WALL)));
    }
}
