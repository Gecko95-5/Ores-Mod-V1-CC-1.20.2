package net.gecko95.oresmod.world;

import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> SALT_ORE_PLACED_KEY = registerKey("salt_ore_placed");
    public static final RegistryKey<PlacedFeature> FROSITE_ORE_PLACED_KEY = registerKey("frosite_ore_placed");
    public static final RegistryKey<PlacedFeature> FROSITE_ORE_ICY_PLACED_KEY = registerKey("frosite_ore_icy_placed");
    public static final RegistryKey<PlacedFeature> ALUMINUM_ORE_PLACED_KEY = registerKey("aluminum_ore_placed");
    public static final RegistryKey<PlacedFeature> ALUMINUM_ORE_SMALL_PLACED_KEY = registerKey("aluminum_ore_small_placed");
    public static final RegistryKey<PlacedFeature> NICKEL_ORE_PLACED_KEY = registerKey("nickel_ore_placed");
    public static final RegistryKey<PlacedFeature> NICKEL_ORE_CHUNKS_PLACED_KEY = registerKey("nickel_ore_chunks_placed");
    public static final RegistryKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY = registerKey("titanium_ore_placed");
    public static final RegistryKey<PlacedFeature> TUNGSTEN_ORE_PLACED_KEY = registerKey("tungsten_ore_placed");
    public static final RegistryKey<PlacedFeature> COBALT_ORE_PLACED_KEY = registerKey("cobalt_ore_placed");
    public static final RegistryKey<PlacedFeature> WHITE_SAND_PLACED_KEY = registerKey("white_sand_placed");
    public static final RegistryKey<PlacedFeature> SUSPICIOUS_WHITE_SAND_PLACED_KEY = registerKey("suspicious_white_sand_placed");
    public static final RegistryKey<PlacedFeature> TERRACOTTA_GOLD_ORE_PLACED_KEY = registerKey("terracotta_gold_ore_placed");
    public static final RegistryKey<PlacedFeature> GRAVEL_COAL_ORE_PLACED_KEY = registerKey("gravel_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> DRIPSTONE_COPPER_ORE_PLACED_KEY = registerKey("dripstone_copper_ore_placed");
    public static final RegistryKey<PlacedFeature> TUFF_IRON_ORE_PLACED_KEY = registerKey("tuff_iron_ore_placed");

    public static void boostrap(Registerable<PlacedFeature> context){
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, SALT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SALT_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(80))));

        register(context, FROSITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FROSITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(81), YOffset.fixed(223))));

        register(context, FROSITE_ORE_ICY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FROSITE_ORE_ICY_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(29), YOffset.fixed(108))));

        register(context, ALUMINUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ALUMINUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-24), YOffset.fixed(56))));

        register(context, ALUMINUM_ORE_SMALL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ALUMINUM_ORE_SMALL_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(72))));

        register(context, NICKEL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NICKEL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(112))));

        register(context, NICKEL_ORE_CHUNKS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NICKEL_ORE_CHUNKS_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(112))));

        register(context, TITANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TITANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(-2))));

        register(context, TUNGSTEN_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TUNGSTEN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(3), YOffset.fixed(30))));

        register(context, COBALT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COBALT_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(7), YOffset.fixed(113))));

        register(context, WHITE_SAND_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_SAND_KEY),
                ModOrePlacement.modifiersWithCount(1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(54), YOffset.fixed(88))));

        register(context, SUSPICIOUS_WHITE_SAND_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SUSPICIOUS_WHITE_SAND_KEY),
                ModOrePlacement.modifiersWithCount(1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(54), YOffset.fixed(88))));

        register(context, TERRACOTTA_GOLD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TERRACOTTA_GOLD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(42), YOffset.fixed(117))));

        register(context, GRAVEL_COAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GRAVEL_COAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(192))));

        register(context, DRIPSTONE_COPPER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DRIPSTONE_COPPER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(112))));

        register(context, TUFF_IRON_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TUFF_IRON_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-24), YOffset.fixed(56))));
    }


    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(OresMod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
