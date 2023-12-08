package net.gecko95.oresmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.item.ModItemGroups;
import net.gecko95.oresmod.item.ModItems;
import net.gecko95.oresmod.util.ModCustomTrades;
import net.gecko95.oresmod.util.ModLootTableModifiers;
import net.gecko95.oresmod.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OresMod implements ModInitializer {
	public static final String MOD_ID = "oresmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();

		StrippableBlockRegistry.register(ModBlocks.STONEBARK_LOG, ModBlocks.STRIPPED_STONEBARK_LOG);
		StrippableBlockRegistry.register(ModBlocks.STONEBARK_WOOD, ModBlocks.STRIPPED_STONEBARK_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STONEBARK_LEAVES,30,60);

		StrippableBlockRegistry.register(ModBlocks.DEEPSLATE_LOG, ModBlocks.STRIPPED_DEEPSLATE_LOG);
		StrippableBlockRegistry.register(ModBlocks.DEEPSLATE_WOOD, ModBlocks.STRIPPED_DEEPSLATE_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DEEPSLATE_LEAVES,15,30);
		LOGGER.info("Generating Ores!");
	}
}