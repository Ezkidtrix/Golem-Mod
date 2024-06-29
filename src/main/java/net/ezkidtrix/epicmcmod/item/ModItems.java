package net.ezkidtrix.epicmcmod.item;

import net.ezkidtrix.epicmcmod.GolemMod;
import net.ezkidtrix.epicmcmod.block.ModBlocks;
import net.ezkidtrix.epicmcmod.entity.ModEntities;
import net.ezkidtrix.epicmcmod.item.custom.ThrowableAnvilItem;
import net.ezkidtrix.epicmcmod.sounds.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.component.type.JukeboxPlayableComponent;
import net.minecraft.item.*;
import net.minecraft.predicate.item.ItemSubPredicate;
import net.minecraft.predicate.item.JukeboxPlayablePredicate;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item GOLEM_INGOT = registerItem("golem_ingot", new Item(new Item.Settings()));

    public static final Item MINI_GOLEM_SPAWN_EGG = registerItem("mini_golem_spawn_egg", new SpawnEggItem(ModEntities.MiniGolem, 0x757575, 0x839c83, new Item.Settings()));
    public static final Item ICE_MINI_GOLEM_SPAWN_EGG = registerItem("ice_mini_golem_spawn_egg", new SpawnEggItem(ModEntities.IceMiniGolem, 0xffffff, 0x8ffff0, new Item.Settings()));

    public static final Item MINI_CREEPER_SPAWN_EGG = registerItem("mini_creeper_spawn_egg", new SpawnEggItem(ModEntities.MiniCreeper, 0x9EFF93, 0x34672E, new Item.Settings()));

    public static final Item GOLEM_SWORD = registerItem("golem_sword", new SwordItem(ModToolMaterial.GOLEM, new Item.Settings()));
    public static final Item GOLEM_PICKAXE = registerItem("golem_pickaxe", new PickaxeItem(ModToolMaterial.GOLEM, new Item.Settings()));
    public static final Item GOLEM_AXE = registerItem("golem_axe", new AxeItem(ModToolMaterial.GOLEM, new Item.Settings()));
    public static final Item GOLEM_SHOVEL = registerItem("golem_shovel", new ShovelItem(ModToolMaterial.GOLEM, new Item.Settings()));
    public static final Item GOLEM_HOE = registerItem("golem_hoe", new HoeItem(ModToolMaterial.GOLEM, new Item.Settings()));

    public static final Item GOLEM_HELMET = registerItem("golem_helmet", new ArmorItem(new RegistryEntry.Direct<>(ModArmor.GOLEM_ARMOR), ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item GOLEM_CHESTPLATE = registerItem("golem_chestplate", new ArmorItem(new RegistryEntry.Direct<>(ModArmor.GOLEM_ARMOR), ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item GOLEM_LEGGINGS = registerItem("golem_leggings", new ArmorItem(new RegistryEntry.Direct<>(ModArmor.GOLEM_ARMOR), ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item GOLEM_BOOTS = registerItem("golem_boots", new ArmorItem(new RegistryEntry.Direct<>(ModArmor.GOLEM_ARMOR), ArmorItem.Type.BOOTS, new Item.Settings()));

    public static final Item GOLEM_SEEDS = registerItem("golem_seeds", new AliasedBlockItem(ModBlocks.GOLEM_CROP, new Item.Settings()));
    public static final Item THROWABLE_ANVIL = registerItem("throwable_anvil", new ThrowableAnvilItem(new Item.Settings()));

    public static final Item GOLEM_STAFF = registerItem("golem_staff", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).fireproof()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GolemMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GolemMod.LOGGER.info("Registering Mod Items for " + GolemMod.MOD_ID);
    }
}
