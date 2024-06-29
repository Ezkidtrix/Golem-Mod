package net.ezkidtrix.epicmcmod.item.listener;

import net.ezkidtrix.epicmcmod.GolemMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public class GolemStaffListener {
    public static ActionResult executeLeftClickAction(PlayerEntity player, World world, Hand hand, Entity entity, EntityHitResult entityHitResult) {
        ItemStack itemStack = player.getStackInHand(hand);

        if (isCustomItem(itemStack)) {
            entity.addVelocity(0, 0.56, 0);
            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }

    private static boolean isCustomItem(ItemStack itemStack) {
        return Registries.ITEM.getId(itemStack.getItem()).equals(Identifier.of(GolemMod.MOD_ID, "golem_staff"));
    }
}
