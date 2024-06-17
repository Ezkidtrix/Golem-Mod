package net.ezkidtrix.epicmcmod.item;

import net.ezkidtrix.epicmcmod.EpicMCMod;
import net.ezkidtrix.epicmcmod.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MINI_GOLEM_SPAWN_EGG = registerItem("mini_golem_spawn_egg", new SpawnEggItem(ModEntities.MiniGolem, 0x009100, 0x839c83, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EpicMCMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EpicMCMod.LOGGER.info("Registering Mod Items for " + EpicMCMod.MOD_ID);
    }
}
