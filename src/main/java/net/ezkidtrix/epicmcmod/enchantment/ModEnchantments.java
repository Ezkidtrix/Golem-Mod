package net.ezkidtrix.epicmcmod.enchantment;

import net.ezkidtrix.epicmcmod.EpicMCMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {
    public static Enchantment GOLEM_ENCHANTMENT = registerEnchantment("golem_enchantment", new GolemEnchantment());
    public static Enchantment CHUNKER_ENCHANTMENT = registerEnchantment("chunker_enchantment", new ChunkerEnchantment());

    public static Enchantment registerEnchantment(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(EpicMCMod.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        EpicMCMod.LOGGER.info("Registering enchantments for " + EpicMCMod.MOD_ID);
    }
}
