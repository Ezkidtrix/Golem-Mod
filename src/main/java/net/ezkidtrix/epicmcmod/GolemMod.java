package net.ezkidtrix.epicmcmod;

import net.ezkidtrix.epicmcmod.block.ModBlocks;
import net.ezkidtrix.epicmcmod.enchantment.EnchantmentListener;
import net.ezkidtrix.epicmcmod.entity.ModEntities;
import net.ezkidtrix.epicmcmod.entity.custom.IceMiniGolemEntity;
import net.ezkidtrix.epicmcmod.entity.custom.MiniCreeperEntity;
import net.ezkidtrix.epicmcmod.entity.custom.MiniGolemEntity;
import net.ezkidtrix.epicmcmod.item.ModItemGroups;
import net.ezkidtrix.epicmcmod.item.ModItems;
import net.ezkidtrix.epicmcmod.item.listener.GolemStaffListener;
import net.ezkidtrix.epicmcmod.sound.ModSounds;
import net.ezkidtrix.epicmcmod.util.ModCustomTrades;
import net.ezkidtrix.epicmcmod.villager.ModVillagers;
import net.ezkidtrix.epicmcmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GolemMod implements ModInitializer {
	public static final String MOD_ID = "golem-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModWorldGeneration.generateModWorldGen();
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModCustomTrades.registerCustomTrades();
		ModVillagers.registerVillagers();

		ModSounds.registerModSounds();

		FabricDefaultAttributeRegistry.register(ModEntities.MiniGolem, MiniGolemEntity.createMiniGolemAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.IceMiniGolem, IceMiniGolemEntity.createIceMiniGolemAttributes());

		FabricDefaultAttributeRegistry.register(ModEntities.MiniCreeper, MiniCreeperEntity.createMiniCreeperAttributes());

		AttackEntityCallback.EVENT.register(GolemStaffListener::executeLeftClickAction);
		EnchantmentListener.register();
	}
}