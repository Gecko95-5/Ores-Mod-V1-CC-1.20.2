package net.gecko95.oresmod.world;

import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> SALT_ORE_KEY = registerKey("salt_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FROSITE_ORE_KEY = registerKey("frosite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FROSITE_ORE_ICY_KEY = registerKey("frosite_ore_icy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ALUMINUM_ORE_KEY = registerKey("aluminum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ALUMINUM_ORE_SMALL_KEY = registerKey("aluminum_ore_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NICKEL_ORE_KEY = registerKey("nickel_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NICKEL_ORE_CHUNKS_KEY = registerKey("nickel_ore_chunks");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TITANIUM_ORE_KEY = registerKey("titanium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUNGSTEN_ORE_KEY = registerKey("tungsten_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBALT_ORE_KEY = registerKey("cobalt_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_SAND_KEY = registerKey("white_sand");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SUSPICIOUS_WHITE_SAND_KEY = registerKey("suspicious_white_sand");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TERRACOTTA_GOLD_ORE_KEY = registerKey("terracotta_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GRAVEL_COAL_ORE_KEY = registerKey("gravel_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DRIPSTONE_COPPER_ORE_KEY = registerKey("dripstone_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUFF_IRON_ORE_KEY = registerKey("tuff_iron_ore");

    public static final  RegistryKey<ConfiguredFeature<?, ?>> STONEBARK_KEY = registerKey("stonebark");
    public static final  RegistryKey<ConfiguredFeature<?, ?>> DEEPBARK_KEY = registerKey("deepbark");

    public static void boostrap(Registerable<ConfiguredFeature<?,?>> context){
        RuleTest stoneReplacebles = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacebles = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplacebles = new TagMatchRuleTest(BlockTags.NETHER_CARVER_REPLACEABLES);
        RuleTest packediceReplacebles = new BlockMatchRuleTest(Blocks.PACKED_ICE);
        RuleTest sandReplacebles = new BlockMatchRuleTest(Blocks.SAND);
        RuleTest terracottaReplacebles = new BlockMatchRuleTest(Blocks.TERRACOTTA);

        List<OreFeatureConfig.Target> overworldSaltOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.SALT_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldFrositeOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.FROSITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(packediceReplacebles, ModBlocks.ICE_FROSITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldFrositeOresIcy =
                List.of(OreFeatureConfig.createTarget(packediceReplacebles, ModBlocks.ICE_FROSITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldAluminumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.ALUMINUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacebles, ModBlocks.DEEPSLATE_ALUMINUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldAluminumOresSmall =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.ALUMINUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacebles, ModBlocks.DEEPSLATE_ALUMINUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldNickelOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.NICKEL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacebles, ModBlocks.DEEPSLATE_NICKEL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldNickelOresChunks =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.NICKEL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacebles, ModBlocks.DEEPSLATE_NICKEL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTitaniumOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplacebles, ModBlocks.DEEPSLATE_TITANIUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherTungstenOres =
                List.of(OreFeatureConfig.createTarget(netherReplacebles, ModBlocks.NETHER_TUNGSTEN_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherCobaltOres =
                List.of(OreFeatureConfig.createTarget(netherReplacebles, ModBlocks.NETHER_COBALT_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldWhiteSand =
                List.of(OreFeatureConfig.createTarget(sandReplacebles, ModBlocks.WHITE_SAND.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSuspiciousWhiteSand =
                List.of(OreFeatureConfig.createTarget(sandReplacebles, ModBlocks.SUSPICIOUS_WHITE_SAND.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTerracottaGoldOres =
                List.of(OreFeatureConfig.createTarget(terracottaReplacebles, ModBlocks.TERRACOTTA_GOLD_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldGravelCoalOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.GRAVEL_COAL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldDripstoneCopperOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.DRIPSTONE_COPPER_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTuffIronOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplacebles, ModBlocks.TUFF_IRON_ORE.getDefaultState()));

        register(context, SALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSaltOres, 12));

        register(context, FROSITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldFrositeOres, 4));

        register(context, FROSITE_ORE_ICY_KEY, Feature.ORE, new OreFeatureConfig(overworldFrositeOresIcy, 4));

        register(context, ALUMINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAluminumOres, 9));

        register(context, ALUMINUM_ORE_SMALL_KEY, Feature.ORE, new OreFeatureConfig(overworldAluminumOresSmall, 4));

        register(context, NICKEL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldNickelOres, 5));

        register(context, NICKEL_ORE_CHUNKS_KEY, Feature.ORE, new OreFeatureConfig(overworldNickelOresChunks, 10));

        register(context, TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTitaniumOres, 6));

        register(context, TUNGSTEN_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherTungstenOres, 7));

        register(context, COBALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherCobaltOres, 9));

        register(context, WHITE_SAND_KEY, Feature.ORE, new OreFeatureConfig(overworldWhiteSand, 16));

        register(context, SUSPICIOUS_WHITE_SAND_KEY, Feature.ORE, new OreFeatureConfig(overworldSuspiciousWhiteSand, 4));

        register(context, TERRACOTTA_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTerracottaGoldOres, 9));

        register(context, GRAVEL_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldGravelCoalOres, 8));

        register(context, DRIPSTONE_COPPER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDripstoneCopperOres, 7));

        register(context, TUFF_IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTuffIronOres, 4));

        register(context, STONEBARK_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.STONEBARK_LOG),
                new StraightTrunkPlacer(3,2,1),
                BlockStateProvider.of(ModBlocks.STONEBARK_LEAVES),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1)),

                new TwoLayersFeatureSize(1, 0, 2))
                .dirtProvider(BlockStateProvider.of(Blocks.COBBLESTONE)).forceDirt().build());


        register(context, DEEPBARK_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.DEEPSLATE_LOG),
                new ForkingTrunkPlacer(5,4,3),
                BlockStateProvider.of(ModBlocks.DEEPSLATE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1),2),

                new TwoLayersFeatureSize(1, 0, 2))
                .dirtProvider(BlockStateProvider.of(Blocks.COBBLED_DEEPSLATE)).forceDirt().build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(OresMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
