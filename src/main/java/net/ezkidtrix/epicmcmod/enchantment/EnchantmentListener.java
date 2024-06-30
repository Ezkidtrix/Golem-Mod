package net.ezkidtrix.epicmcmod.enchantment;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static net.minecraft.component.DataComponentTypes.ENCHANTMENTS;

public class EnchantmentListener {
    public static void register() {
        PlayerBlockBreakEvents.BEFORE.register(((world, player, pos, state, blockEntity) -> {
            ItemStack itemStack = player.getMainHandStack();

            if (hasCustomEnchantment(itemStack, "golem-mod:spherer_enchantment")) {
                final int radius = getLevel(itemStack, "golem-mod:spherer_enchantment");

                for (int x = -radius; x <= radius; x++) {
                    for (int y = -radius; y <= radius; y++) {
                        for (int z = -radius; z <= radius; z++) {
                            if (Math.sqrt(x * x + y * y + z * z) <= radius) {
                                BlockPos targetPos = pos.add(x, y, z);
                                BlockState blockState = world.getBlockState(targetPos);

                                if (!blockState.isAir()) {
                                    player.giveItemStack(new ItemStack(blockState.getBlock()));
                                    world.setBlockState(targetPos, Blocks.AIR.getDefaultState());
                                }
                            }
                        }
                    }
                }

                return false;
            }

            return true;
        }));

        ServerTickEvents.START_SERVER_TICK.register(new ServerTickEvents.StartTick() {
            @Override
            public void onStartTick(MinecraftServer server) {
                server.getPlayerManager().getPlayerList().forEach(EnchantmentListener::checkFlying);
            }
        });
    }

    public static void checkFlying(PlayerEntity player) {
        if (hasCustomEnchantment(player.getEquippedStack(EquipmentSlot.CHEST), "golem-mod:clearer_enchantment") && player.isFallFlying() && player.getEquippedStack(EquipmentSlot.CHEST).getItem() == Items.ELYTRA) {
            int radius = 8;

            BlockPos pos = player.getBlockPos();
            World world = player.getWorld();

            for (int x = -radius; x <= radius; x++) {
                for (int y = -radius; y <= radius; y++) {
                    for (int z = -radius; z <= radius; z++) {
                        if (Math.sqrt(x * x + y * y + z * z) <= radius) {
                            BlockPos targetPos = pos.add(x, y, z);
                            BlockState blockState = world.getBlockState(targetPos);

                            if (!blockState.isAir()) {
                                world.setBlockState(targetPos, Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean hasCustomEnchantment(ItemStack stack, String enchantKey) {
        final var enchantments = stack.getOrDefault(ENCHANTMENTS, ItemEnchantmentsComponent.DEFAULT).getEnchantmentEntries();

        for (final var entry : enchantments) {
            String enchant = entry.getKey().getIdAsString();

            if (enchant.contains(enchantKey)) {
                return true;
            }
        }

        return false;
    }

    private static int getLevel(ItemStack stack, String enchantKey) {
        final var enchantments = stack.getOrDefault(ENCHANTMENTS, ItemEnchantmentsComponent.DEFAULT).getEnchantmentEntries();

        for (final var entry : enchantments) {
            String enchant = entry.getKey().getIdAsString();

            if (enchant.contains(enchantKey)) {
                return entry.getIntValue();
            }
        }

        return 1;
    }

    private static String getEnchantment(ItemStack stack, String enchantKey, PlayerEntity player) {
        final var enchantments = stack.getOrDefault(ENCHANTMENTS, ItemEnchantmentsComponent.DEFAULT).getEnchantmentEntries();

        for (final var entry : enchantments) {
            String enchant = entry.getKey().getIdAsString();

            if (enchant.contains(enchantKey)) {
                return enchant;
            }
        }

        return "That item doesn't have that enchantment!";
    }
}
