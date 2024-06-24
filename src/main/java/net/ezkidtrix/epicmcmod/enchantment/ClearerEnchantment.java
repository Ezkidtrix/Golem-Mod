package net.ezkidtrix.epicmcmod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class ClearerEnchantment extends Enchantment {
    public static final int MAX_LEVEL = 1;

    protected ClearerEnchantment() {
        super(Rarity.VERY_RARE, EnchantmentTarget.WEARABLE, new EquipmentSlot[] { EquipmentSlot.CHEST });
    }

    @Override
    public int getMaxLevel() {
        return MAX_LEVEL;
    }
}
