package net.ezkidtrix.epicmcmod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class ChunkerEnchantment extends Enchantment {
    private static final int MAX_LEVEL = 1;

    public ChunkerEnchantment() {
        super(Rarity.VERY_RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[] { EquipmentSlot.MAINHAND });
    }

    @Override
    public int getMaxLevel() {
        return MAX_LEVEL;
    }
}
