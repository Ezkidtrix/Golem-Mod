package net.ezkidtrix.epicmcmod.item;

import net.ezkidtrix.epicmcmod.EpicMCMod;
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
                    .icon(() -> new ItemStack(ModItems.MINI_GOLEM_SPAWN_EGG)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MINI_GOLEM_SPAWN_EGG);
                    }).build());

    public static void registerItemGroups() {
        EpicMCMod.LOGGER.info("Registering Mod Groups for " + EpicMCMod.MOD_ID);
    }
}
