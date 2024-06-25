package net.ezkidtrix.epicmcmod.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import net.ezkidtrix.epicmcmod.EpicMCMod;
import net.ezkidtrix.epicmcmod.enchantment.ModEnchantments;
import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.command.CommandSource;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;

import java.util.*;
import java.util.concurrent.CompletableFuture;

public class CustomEnchantCommand {
    private static final Map<String, Enchantment> CUSTOM_ENCHANTMENTS = new HashMap<>();

    public static void registerCustomEnchantments() {
        CUSTOM_ENCHANTMENTS.put("Chunker", ModEnchantments.CHUNKER_ENCHANTMENT);
        CUSTOM_ENCHANTMENTS.put("Clearer", ModEnchantments.CLEARER_ENCHANTMENT);
        CUSTOM_ENCHANTMENTS.put("Golem", ModEnchantments.GOLEM_ENCHANTMENT);
        CUSTOM_ENCHANTMENTS.put("Spherer", ModEnchantments.SPHERER_ENCHANTMENT);

    }

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess registryAccess) {
        registerCustomEnchantments();

        dispatcher.register(CommandManager.literal("customenchant")
                .then(CommandManager.argument("enchantment", StringArgumentType.string()).suggests(new SuggestionProvider<ServerCommandSource>() {
                            @Override
                            public CompletableFuture<Suggestions> getSuggestions(CommandContext<ServerCommandSource> context, SuggestionsBuilder builder) {
                                return CommandSource.suggestMatching(CUSTOM_ENCHANTMENTS.keySet(), builder);
                            }
                        }).then(CommandManager.argument("level", IntegerArgumentType.integer())
                                .executes(context -> execute(context, StringArgumentType.getString(context, "enchantment"), IntegerArgumentType.getInteger(context, "level"))))));

        dispatcher.register(CommandManager.literal("ce")
                .then(CommandManager.argument("enchantment", StringArgumentType.string()).suggests(new SuggestionProvider<ServerCommandSource>() {
                            @Override
                            public CompletableFuture<Suggestions> getSuggestions(CommandContext<ServerCommandSource> context, SuggestionsBuilder builder) {
                                return CommandSource.suggestMatching(CUSTOM_ENCHANTMENTS.keySet(), builder);
                            }
                        })
                        .then(CommandManager.argument("level", IntegerArgumentType.integer())
                                .executes(context -> execute(context, StringArgumentType.getString(context, "enchantment"), IntegerArgumentType.getInteger(context, "level"))))));
    }

    public static int execute(CommandContext<ServerCommandSource> context, String enchantmentId, int level) {
        ServerCommandSource source = context.getSource();
        Enchantment enchantment = Registries.ENCHANTMENT.get(new Identifier(EpicMCMod.MOD_ID, enchantmentId.toLowerCase() + "_enchantment"));

        if (enchantment == null) {
            source.sendFeedback(() -> Text.literal("Invalid enchantment ID!"), false);
            return 0;
        }

        ItemStack itemStack = Objects.requireNonNull(source.getPlayer()).getMainHandStack();

        if (itemStack.isEmpty()) {
            source.sendFeedback(() -> Text.literal("You must be holding an item to enchant!"), false);
            return 0;
        }

        if (!itemStack.canBeEnchantedWith(enchantment, EnchantingContext.ENCHANT_COMMAND)) {
            source.sendFeedback(() -> Text.literal("You must be holding an item compatible with that enchantment!"), false);
            return 0;
        }

        itemStack.addEnchantment(enchantment, level);
        source.sendFeedback(() -> Text.literal("Enchanted item with " + enchantment.getName(level).getString()), true);

        return 1;
    }
}
