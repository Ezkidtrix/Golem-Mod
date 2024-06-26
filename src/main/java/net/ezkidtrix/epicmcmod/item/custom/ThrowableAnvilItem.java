package net.ezkidtrix.epicmcmod.item.custom;

import net.ezkidtrix.epicmcmod.entity.custom.ThrowableAnvilEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ThrowableAnvilItem extends Item {
    public ThrowableAnvilItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_ANVIL_BREAK, SoundCategory.NEUTRAL, 1f, 0.5f / (world.getRandom().nextFloat() * 0.4f + 0.8f));

        if (!world.isClient) {
            ThrowableAnvilEntity throwableAnvilEntity = new ThrowableAnvilEntity(user, world);
            throwableAnvilEntity.setItem(itemStack);

            throwableAnvilEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0f, 1.0f, 1.0f);
            world.spawnEntity(throwableAnvilEntity);
        }
        user.incrementStat(Stats.USED.getOrCreateStat(this));

        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }
        return TypedActionResult.success(itemStack, world.isClient());
    }
}
