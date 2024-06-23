package net.ezkidtrix.epicmcmod;

import net.ezkidtrix.epicmcmod.block.ModBlocks;
import net.ezkidtrix.epicmcmod.enchantment.Listener;
import net.ezkidtrix.epicmcmod.enchantment.ModEnchantments;
import net.ezkidtrix.epicmcmod.entity.ModEntities;
import net.ezkidtrix.epicmcmod.entity.custom.IceMiniGolemEntity;
import net.ezkidtrix.epicmcmod.entity.custom.MiniCreeperEntity;
import net.ezkidtrix.epicmcmod.entity.custom.MiniGolemEntity;
import net.ezkidtrix.epicmcmod.item.ModItemGroups;
import net.ezkidtrix.epicmcmod.item.ModItems;
import net.ezkidtrix.epicmcmod.sounds.ModSounds;
import net.ezkidtrix.epicmcmod.util.ModCustomTrades;
import net.ezkidtrix.epicmcmod.villager.ModVillagers;
import net.ezkidtrix.epicmcmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EpicMCMod implements ModInitializer {
	public static final String MOD_ID = "golem-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModWorldGeneration.generateModWorldGen();
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModCustomTrades.registerCustomTrades();
		ModSounds.registerSounds();

		ModEnchantments.registerModEnchantments();
		Listener.register();

		ModVillagers.registerVillagers();

		FabricDefaultAttributeRegistry.register(ModEntities.MiniGolem, MiniGolemEntity.createMiniGolemAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.IceMiniGolem, IceMiniGolemEntity.createIceMiniGolemAttributes());

		FabricDefaultAttributeRegistry.register(ModEntities.MiniCreeper, MiniCreeperEntity.createMiniCreeperAttributes());

		CustomPortalBuilder.beginPortal()
				.frameBlock(ModBlocks.GOLEM_BLOCK)
				.lightWithWater()
				.destDimID(new Identifier(EpicMCMod.MOD_ID, "golemdim"))
				.tintColor(200, 200, 200)
				.registerPortal();
	}
}