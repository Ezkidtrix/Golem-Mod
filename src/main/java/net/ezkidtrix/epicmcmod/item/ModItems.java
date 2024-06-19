package net.ezkidtrix.epicmcmod.item;

import net.ezkidtrix.epicmcmod.EpicMCMod;
import net.ezkidtrix.epicmcmod.block.ModBlocks;
import net.ezkidtrix.epicmcmod.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GOLEM_INGOT = registerItem("golem_ingot", new Item(new FabricItemSettings()));
    public static final Item MINI_GOLEM_SPAWN_EGG = registerItem("mini_golem_spawn_egg", new SpawnEggItem(ModEntities.MiniGolem, 0x757575, 0x839c83, new FabricItemSettings()));

    public static final Item GOLEM_SWORD = registerItem("golem_sword", new SwordItem(ModToolMaterial.GOLEM, 12, 10, new FabricItemSettings()));
    public static final Item GOLEM_PICKAXE = registerItem("golem_pickaxe", new PickaxeItem(ModToolMaterial.GOLEM, 5, 3, new FabricItemSettings()));
    public static final Item GOLEM_AXE = registerItem("golem_axe", new AxeItem(ModToolMaterial.GOLEM, 20, 5, new FabricItemSettings()));
    public static final Item GOLEM_SHOVEL = registerItem("golem_shovel", new ShovelItem(ModToolMaterial.GOLEM, 2, 2, new FabricItemSettings()));
    public static final Item GOLEM_HOE = registerItem("golem_hoe", new HoeItem(ModToolMaterial.GOLEM, 0, 0, new FabricItemSettings()));

    public static final Item GOLEM_HELMET = registerItem("golem_helmet", new ArmorItem(ModArmorMaterials.GOLEM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GOLEM_CHESTPLATE = registerItem("golem_chestplate", new ArmorItem(ModArmorMaterials.GOLEM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item GOLEM_LEGGINGS = registerItem("golem_leggings", new ArmorItem(ModArmorMaterials.GOLEM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item GOLEM_BOOTS = registerItem("golem_boots", new ArmorItem(ModArmorMaterials.GOLEM, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item GOLEM_SEEDS = registerItem("golem_seeds", new AliasedBlockItem(ModBlocks.GOLEM_CROP, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EpicMCMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EpicMCMod.LOGGER.info("Registering Mod Items for " + EpicMCMod.MOD_ID);
    }
}
