package net.ezkidtrix.epicmcmod.item;

import net.ezkidtrix.epicmcmod.EpicMCMod;
import net.ezkidtrix.epicmcmod.block.ModBlocks;
import net.ezkidtrix.epicmcmod.enchantment.ModEnchantments;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GOLEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EpicMCMod.MOD_ID, "ezkidtrix"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.golemitems"))
                    .icon(() -> new ItemStack(ModItems.GOLEM_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.GOLEM_INGOT);
                        entries.add(ModItems.GOLEM_SEEDS);

                        entries.add(ModItems.GOLEM_SWORD);
                        entries.add(ModItems.GOLEM_PICKAXE);
                        entries.add(ModItems.GOLEM_AXE);
                        entries.add(ModItems.GOLEM_SHOVEL);
                        entries.add(ModItems.GOLEM_HOE);

                        entries.add(ModItems.GOLEM_HELMET);
                        entries.add(ModItems.GOLEM_CHESTPLATE);
                        entries.add(ModItems.GOLEM_LEGGINGS);
                        entries.add(ModItems.GOLEM_BOOTS);

                        entries.add(ModBlocks.GOLEM_BLOCK);
                        entries.add(ModBlocks.GOLEM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_GOLEM_ORE);

                        entries.add(ModBlocks.GOLEM_STAIRS);
                        entries.add(ModBlocks.GOLEM_SLAB);
                        entries.add(ModBlocks.GOLEM_BUTTON);
                        entries.add(ModBlocks.GOLEM_PRESSURE_PLATE);
                        entries.add(ModBlocks.GOLEM_FENCE);
                        entries.add(ModBlocks.GOLEM_FENCE_GATE);
                        entries.add(ModBlocks.GOLEM_WALL);
                        entries.add(ModBlocks.GOLEM_DOOR);
                        entries.add(ModBlocks.GOLEM_TRAPDOOR);

                        entries.add(ModItems.GOLEM_MUSIC_DISC);
                        entries.add(ModItems.MINI_GOLEM_SPAWN_EGG);

                        entries.add(ModItems.ICE_MINI_GOLEM_SPAWN_EGG);
                        entries.add(ModItems.MINI_CREEPER_SPAWN_EGG);

                        entries.add(ModItems.THROWABLE_ANVIL);
                    }).build());

    public static void registerItemGroups() {
        EpicMCMod.LOGGER.info("Registering Mod Groups for " + EpicMCMod.MOD_ID);
    }
}
