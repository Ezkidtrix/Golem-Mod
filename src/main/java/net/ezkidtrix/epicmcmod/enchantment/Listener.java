package net.ezkidtrix.epicmcmod.enchantment;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public class Listener {
    public static void register() {
        PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, blockEntity) -> {
            if (hasEnchantment(ModEnchantments.CHUNKER_ENCHANTMENT, player)) {

                Chunk chunk = world.getChunk(pos);

                int startX = chunk.getPos().getStartX();
                int startZ = chunk.getPos().getStartZ();
                int endX = chunk.getPos().getEndX();
                int endZ = chunk.getPos().getEndZ();

                for (int x = startX; x <= endX; x++) {
                    for (int y = world.getBottomY(); y < world.getTopY(); y++) {
                        for (int z = startZ; z <= endZ; z++) {
                            BlockPos currentPos = new BlockPos(x, y, z);
                            if (world.getBlockState(currentPos).getBlock() != Blocks.BEDROCK) {
                                world.setBlockState(currentPos, Blocks.AIR.getDefaultState());
                                player.giveItemStack(new ItemStack(getBlock(world, currentPos)));
                            }
                        }
                    }
                }

                return false;
            } else {
                return true;
            }
        });
    }

    public static boolean hasEnchantment(Enchantment enchant, PlayerEntity player) {
        return EnchantmentHelper.getLevel(enchant, player.getMainHandStack()) > 0;
    }

    public static Block getBlock(World world, BlockPos pos) {
        return world.getBlockState(pos).getBlock();
    }
}
