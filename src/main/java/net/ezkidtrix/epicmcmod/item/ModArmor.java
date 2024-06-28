package net.ezkidtrix.epicmcmod.item;

import net.ezkidtrix.epicmcmod.GolemMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmor {
    public static ArmorMaterial GOLEM_ARMOR = register("golem", new EnumMap<>(ArmorItem.Type.class), 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, () -> Ingredient.ofItems(ModItems.GOLEM_INGOT), List.of(new ArmorMaterial.Layer(Identifier.of(GolemMod.MOD_ID, "golem"))), 50, 3);

    public static ArmorMaterial register(String name, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, Supplier<Ingredient> repairIngredient, List<ArmorMaterial.Layer> layers, float toughness, float knockbackResistance) {
        return Registry.register(Registries.ARMOR_MATERIAL, Identifier.of(GolemMod.MOD_ID, name), new ArmorMaterial(defense, enchantability, equipSound, repairIngredient, layers, toughness, knockbackResistance));
    }
}
