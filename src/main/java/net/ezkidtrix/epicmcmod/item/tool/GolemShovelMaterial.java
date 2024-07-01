package net.ezkidtrix.epicmcmod.item.tool;

import net.ezkidtrix.epicmcmod.GolemMod;
import net.ezkidtrix.epicmcmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public enum GolemShovelMaterial implements ToolMaterial {
    GOLEM_SHOVEL(200000, 100f, 6f, 50, () -> Ingredient.ofItems(ModItems.GOLEM_INGOT));

    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantAbility;
    private final Supplier<Ingredient> repairIngredient;

    GolemShovelMaterial(int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantAbility = enchantability;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(GolemMod.MOD_ID, "golem_block"));
    }

    @Override
    public int getEnchantability() {
        return this.enchantAbility;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
