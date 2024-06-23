package net.ezkidtrix.epicmcmod.util;

import net.ezkidtrix.epicmcmod.block.ModBlocks;
import net.ezkidtrix.epicmcmod.item.ModItems;
import net.ezkidtrix.epicmcmod.villager.ModVillagers;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.NETHERITE_BLOCK, 48),
                    new ItemStack(ModItems.GOLEM_HELMET, 1),
                    2, 5, 0.5f));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.NETHERITE_BLOCK, 48),
                    new ItemStack(ModItems.GOLEM_BOOTS, 1),
                    2, 5, 0.5f));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.NETHERITE_BLOCK, 64),
                    new ItemStack(ModItems.GOLEM_LEGGINGS, 1),
                    2, 5, 0.5f));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.NETHERITE_BLOCK, 64),
                    new ItemStack(ModItems.GOLEM_CHESTPLATE, 1),
                    1, 5, 0.5f));
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.GOLEM_MASTER, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModBlocks.GOLEM_BLOCK, 64),
                    new ItemStack(ModItems.MINI_CREEPER_SPAWN_EGG, 1),
                    1, 3, 2f
            ));
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.GOLEM_MASTER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModBlocks.GOLEM_BLOCK, 32),
                    new ItemStack(ModItems.ICE_MINI_GOLEM_SPAWN_EGG, 1),
                    1, 3, 2f
            ));
        });
    }
}
