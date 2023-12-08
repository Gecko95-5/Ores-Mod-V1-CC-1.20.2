package net.gecko95.oresmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.gecko95.oresmod.world.ModPlacedFeatures;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;


public class ModOreGeneration {
    public static void generateOres(){
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SALT_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.FROSITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.SPAWNS_SNOW_FOXES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.FROSITE_ORE_ICY_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ALUMINUM_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ALUMINUM_ORE_SMALL_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NICKEL_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NICKEL_ORE_CHUNKS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TITANIUM_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TUNGSTEN_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COBALT_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.WHITE_SAND_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SUSPICIOUS_WHITE_SAND_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_BADLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TERRACOTTA_GOLD_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GRAVEL_COAL_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DRIPSTONE_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DRIPSTONE_COPPER_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TUFF_IRON_ORE_PLACED_KEY);
    }
}
