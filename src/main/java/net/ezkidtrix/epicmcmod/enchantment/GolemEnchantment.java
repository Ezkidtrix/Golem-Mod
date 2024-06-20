package net.ezkidtrix.epicmcmod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

public class GolemEnchantment extends Enchantment {
    public static int MIN_LEVEL = 1;
    public static int MAX_LEVEL = 3;

    public GolemEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMaxLevel() {
        return MAX_LEVEL;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        target.addVelocity(0, level * 0.2, 0);
        super.onTargetDamaged(user, target, level);
    }
}
