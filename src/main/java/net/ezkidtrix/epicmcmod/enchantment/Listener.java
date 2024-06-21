package net.ezkidtrix.epicmcmod.enchantment;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.BlockTags;
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
                                BlockState type = world.getBlockState(currentPos).getBlock().getDefaultState();

                                if (type.isIn(BlockTags.DIAMOND_ORES) || type.isIn(BlockTags.IRON_ORES) || type.isIn(BlockTags.GOLD_ORES) || type.isIn(BlockTags.EMERALD_ORES)) {
                                    player.giveItemStack(new ItemStack(world.getBlockState(currentPos).getBlock()));
                                }

                                world.setBlockState(currentPos, Blocks.AIR.getDefaultState());
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
}
