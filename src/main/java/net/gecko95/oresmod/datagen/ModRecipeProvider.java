package net.gecko95.oresmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;


public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> FROSITE_SMELTABLES = List.of(ModBlocks.FROSITE_ORE, ModBlocks.ICE_FROSITE_ORE);

    private static final List<ItemConvertible> ALUMINUM_SMELTABLES = List.of(ModItems.RAW_ALUMINUM,ModBlocks.ALUMINUM_ORE,
            ModBlocks.DEEPSLATE_ALUMINUM_ORE);
    private static final List<ItemConvertible> ALUMINUM_NUGGET_SMELTABLES = List.of(ModItems.ALUMINUM_SWORD,
            ModItems.ALUMINUM_PICKAXE, ModItems.ALUMINUM_AXE,ModItems.ALUMINUM_SHOVEL, ModItems.ALUMINUM_HOE,
            ModItems.ALUMINUM_HELMET,ModItems.ALUMINUM_CHESTPLATE, ModItems.ALUMINUM_LEGGINGS, ModItems.ALUMINUM_BOOTS);

    private static final List<ItemConvertible> NICKEL_SMELTABLES = List.of(ModItems.RAW_NICKEL,ModBlocks.NICKEL_ORE,
            ModBlocks.DEEPSLATE_NICKEL_ORE);
    private static final List<ItemConvertible> NICKEL_NUGGET_SMELTABLES = List.of(ModItems.NICKEL_SWORD,
            ModItems.NICKEL_PICKAXE, ModItems.NICKEL_AXE,ModItems.NICKEL_SHOVEL, ModItems.NICKEL_HOE,
            ModItems.NICKEL_HELMET,ModItems.NICKEL_CHESTPLATE, ModItems.NICKEL_LEGGINGS, ModItems.NICKEL_BOOTS);

    private static final List<ItemConvertible> TITANIUM_SMELTABLES = List.of(ModItems.RAW_TITANIUM,ModBlocks.DEEPSLATE_TITANIUM_ORE);

    private static final List<ItemConvertible> TUNGSTEN_SMELTABLES = List.of(ModBlocks.NETHER_TUNGSTEN_ORE);

    private static final List<ItemConvertible> COBALT_SMELTABLES = List.of(ModBlocks.NETHER_COBALT_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, FROSITE_SMELTABLES, RecipeCategory.MISC, ModItems.FROSITE,
                0.7f, 200, "frosite");
        offerBlasting(exporter, FROSITE_SMELTABLES, RecipeCategory.MISC, ModItems.FROSITE,
                0.7f, 100, "frosite");

        offerSmelting(exporter, ALUMINUM_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINUM_INGOT,
                0.7f, 200, "aluminum");
        offerBlasting(exporter, ALUMINUM_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINUM_INGOT,
                0.7f, 100, "aluminum");

        offerSmelting(exporter, ALUMINUM_NUGGET_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINUM_NUGGET,
                0.7f, 200, "aluminum_nugget");
        offerBlasting(exporter, ALUMINUM_NUGGET_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINUM_NUGGET,
                0.7f, 100, "aluminum_nugget");

        offerSmelting(exporter, NICKEL_SMELTABLES, RecipeCategory.MISC, ModItems.NICKEL_INGOT,
                0.7f, 200, "nickel");
        offerBlasting(exporter, NICKEL_SMELTABLES, RecipeCategory.MISC, ModItems.NICKEL_INGOT,
                0.7f, 100, "nickel");

        offerSmelting(exporter, NICKEL_NUGGET_SMELTABLES, RecipeCategory.MISC, ModItems.NICKEL_NUGGET,
                0.7f, 200, "nickel_nugget");
        offerBlasting(exporter, NICKEL_NUGGET_SMELTABLES, RecipeCategory.MISC, ModItems.NICKEL_NUGGET,
                0.7f, 100, "nickel_nugget");

        offerSmelting(exporter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_INGOT,
                0.7f, 400, "titanium");
        offerBlasting(exporter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_INGOT,
                0.7f, 200, "titanium");

        offerSmelting(exporter, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT,
                0.7f, 200, "tungsten");
        offerBlasting(exporter, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT,
                0.7f, 100, "tungsten");

        offerSmelting(exporter, COBALT_SMELTABLES, RecipeCategory.MISC, ModItems.COBALT_INGOT,
                0.7f, 200, "cobalt");
        offerBlasting(exporter, COBALT_SMELTABLES, RecipeCategory.MISC, ModItems.COBALT_INGOT,
                0.7f, 100, "cobalt");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.POWDERED_SALT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_SALT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_SALT_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POWDERED_SALT,20)
                .input(ModBlocks.SALT_ORE)
                .criterion(hasItem(ModBlocks.SALT_ORE), conditionsFromItem(ModBlocks.SALT_ORE))
                .offerTo(exporter, new Identifier("powered_salt_from_salt_ore"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POWDERED_SALT,4)
                .input(ModItems.RAW_SALT)
                .criterion(hasItem(ModItems.RAW_SALT), conditionsFromItem(ModItems.RAW_SALT))
                .offerTo(exporter, new Identifier("powered_salt_from_raw_salt"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.WHITE_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.WHITE_TERRACOTTA), conditionsFromItem(Blocks.WHITE_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_white_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIGHT_GRAY_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIGHT_GRAY_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_GRAY_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_light_gray_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.GRAY_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.GRAY_TERRACOTTA), conditionsFromItem(Blocks.GRAY_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_gray_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BLACK_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BLACK_TERRACOTTA), conditionsFromItem(Blocks.BLACK_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_black_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BROWN_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BROWN_TERRACOTTA), conditionsFromItem(Blocks.BROWN_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_brown_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.RED_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.RED_TERRACOTTA), conditionsFromItem(Blocks.RED_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_red_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.ORANGE_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.ORANGE_TERRACOTTA), conditionsFromItem(Blocks.ORANGE_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_orange_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.YELLOW_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.YELLOW_TERRACOTTA), conditionsFromItem(Blocks.YELLOW_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_yellow_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIME_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIME_TERRACOTTA), conditionsFromItem(Blocks.LIME_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_lime_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.GREEN_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.GREEN_TERRACOTTA), conditionsFromItem(Blocks.GREEN_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_green_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.CYAN_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.CYAN_TERRACOTTA), conditionsFromItem(Blocks.CYAN_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_cyan_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIGHT_BLUE_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIGHT_BLUE_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_BLUE_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_light_blue_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BLUE_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BLUE_TERRACOTTA), conditionsFromItem(Blocks.BLUE_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_blue_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.PURPLE_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.PURPLE_TERRACOTTA), conditionsFromItem(Blocks.PURPLE_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_purple_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.MAGENTA_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.MAGENTA_TERRACOTTA), conditionsFromItem(Blocks.MAGENTA_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_magenta_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.PINK_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.PINK_TERRACOTTA), conditionsFromItem(Blocks.PINK_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_pink_terracotta"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.WHITE_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.WHITE_STAINED_GLASS), conditionsFromItem(Blocks.WHITE_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_white_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIGHT_GRAY_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS), conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_light_gray_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.GRAY_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.GRAY_STAINED_GLASS), conditionsFromItem(Blocks.GRAY_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_gray_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BLACK_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BLACK_STAINED_GLASS), conditionsFromItem(Blocks.BLACK_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_black_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BROWN_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BROWN_STAINED_GLASS), conditionsFromItem(Blocks.BROWN_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_brown_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.RED_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.RED_STAINED_GLASS), conditionsFromItem(Blocks.RED_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_red_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.ORANGE_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.ORANGE_STAINED_GLASS), conditionsFromItem(Blocks.ORANGE_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_orange_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.YELLOW_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.YELLOW_STAINED_GLASS), conditionsFromItem(Blocks.YELLOW_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_yellow_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIME_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIME_STAINED_GLASS), conditionsFromItem(Blocks.LIME_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_lime_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.GREEN_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.GREEN_STAINED_GLASS), conditionsFromItem(Blocks.GREEN_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_green_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.CYAN_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.CYAN_STAINED_GLASS), conditionsFromItem(Blocks.CYAN_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_cyan_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIGHT_BLUE_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS), conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_light_blue_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BLUE_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BLUE_STAINED_GLASS), conditionsFromItem(Blocks.BLUE_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_blue_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.PURPLE_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.PURPLE_STAINED_GLASS), conditionsFromItem(Blocks.PURPLE_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_purple_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.MAGENTA_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.MAGENTA_STAINED_GLASS), conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_magenta_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.PINK_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.PINK_STAINED_GLASS), conditionsFromItem(Blocks.PINK_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_pink_stained_glass"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.WHITE_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.WHITE_STAINED_GLASS_PANE), conditionsFromItem(Blocks.WHITE_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_white_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE), conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_light_gray_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.GRAY_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.GRAY_STAINED_GLASS_PANE), conditionsFromItem(Blocks.GRAY_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_gray_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BLACK_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BLACK_STAINED_GLASS_PANE), conditionsFromItem(Blocks.BLACK_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_black_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BROWN_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BROWN_STAINED_GLASS_PANE), conditionsFromItem(Blocks.BROWN_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_brown_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.RED_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.RED_STAINED_GLASS_PANE), conditionsFromItem(Blocks.RED_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_red_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.ORANGE_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.ORANGE_STAINED_GLASS_PANE), conditionsFromItem(Blocks.ORANGE_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_orange_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.YELLOW_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.YELLOW_STAINED_GLASS_PANE), conditionsFromItem(Blocks.YELLOW_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_yellow_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIME_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIME_STAINED_GLASS_PANE), conditionsFromItem(Blocks.LIME_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_lime_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.GREEN_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.GREEN_STAINED_GLASS_PANE), conditionsFromItem(Blocks.GREEN_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_green_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.CYAN_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.CYAN_STAINED_GLASS_PANE), conditionsFromItem(Blocks.CYAN_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_cyan_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE), conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_light_blue_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BLUE_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BLUE_STAINED_GLASS_PANE), conditionsFromItem(Blocks.BLUE_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_blue_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.PURPLE_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.PURPLE_STAINED_GLASS_PANE), conditionsFromItem(Blocks.PURPLE_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_purple_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.MAGENTA_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.MAGENTA_STAINED_GLASS_PANE), conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_magenta_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.PINK_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.PINK_STAINED_GLASS_PANE), conditionsFromItem(Blocks.PINK_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_pink_stained_glass_pane"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_FLESH,1)
                .input(ModItems.POWDERED_SALT)
                .input(Items.ROTTEN_FLESH)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Items.ROTTEN_FLESH), conditionsFromItem(Items.ROTTEN_FLESH))
                .offerTo(exporter, new Identifier("raw_flesh_from_rotten_flesh"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModItems.RAW_FLESH), RecipeCategory.FOOD, ModItems.COOKED_FLESH, 0.35f, 200)
                .criterion(hasItem(ModItems.RAW_FLESH), conditionsFromItem(ModItems.RAW_FLESH))
                .offerTo(exporter, new Identifier("cooked_flesh_from_smelting"));
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems
                        (ModItems.RAW_FLESH), RecipeCategory.FOOD, ModItems.COOKED_FLESH, 0.35f, 100)
                .criterion(hasItem(ModItems.RAW_FLESH), conditionsFromItem(ModItems.RAW_FLESH))
                .offerTo(exporter, new Identifier("cooked_flesh_from_smoking"));
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems
                        (ModItems.RAW_FLESH), RecipeCategory.FOOD, ModItems.COOKED_FLESH, 0.35f, 600)
                .criterion(hasItem(ModItems.RAW_FLESH), conditionsFromItem(ModItems.RAW_FLESH))
                .offerTo(exporter, new Identifier("cooked_flesh_from_campfire_cooking"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.FROSITE,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.BLUE_ICE,1)
                .pattern(" F ")
                .pattern("FIF")
                .pattern(" F ")
                .input('F', ModItems.FROSITE)
                .input('I', Blocks.ICE)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(Blocks.ICE), conditionsFromItem(Blocks.ICE))
                .offerTo(exporter, new Identifier("blue_ice_from_ice_with_frosite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.BLUE_ICE,4)
                .pattern(" F ")
                .pattern("FIF")
                .pattern(" F ")
                .input('F', ModItems.FROSITE)
                .input('I', Blocks.PACKED_ICE)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(Blocks.PACKED_ICE), conditionsFromItem(Blocks.PACKED_ICE))
                .offerTo(exporter, new Identifier("blue_ice_from_packed_with_frosite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.BLUE_ICE,8)
                .pattern(" F ")
                .pattern("FIF")
                .pattern(" F ")
                .input('F', ModItems.FROSITE)
                .input('I', Blocks.BLUE_ICE)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(Blocks.BLUE_ICE), conditionsFromItem(Blocks.BLUE_ICE))
                .offerTo(exporter, new Identifier("blue_ice_from_frosite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_BRICKS,4)
                .pattern("IF")
                .pattern("FI")
                .input('F', ModBlocks.FROSITE_BLOCK)
                .input('I', Blocks.BLUE_ICE)
                .criterion(hasItem(ModBlocks.FROSITE_BLOCK), conditionsFromItem(ModBlocks.FROSITE_BLOCK))
                .criterion(hasItem(Blocks.BLUE_ICE), conditionsFromItem(Blocks.BLUE_ICE))
                .offerTo(exporter, new Identifier("frosite_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_BRICKS, ModBlocks.FROSITE_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_TILES,4)
                .pattern("FF")
                .pattern("FF")
                .input('F', ModBlocks.FROSITE_BLOCK)
                .criterion(hasItem(ModBlocks.FROSITE_BLOCK), conditionsFromItem(ModBlocks.FROSITE_BLOCK))
                .offerTo(exporter, new Identifier("frosite_tiles"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_TILES, ModBlocks.FROSITE_BLOCK);

        createStairsRecipe(ModBlocks.FROSITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.FROSITE_BRICKS))
                .criterion(hasItem(ModBlocks.FROSITE_BRICKS),conditionsFromItem(ModBlocks.FROSITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FROSITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_BRICK_STAIRS, ModBlocks.FROSITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_BRICK_SLAB, ModBlocks.FROSITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_BRICK_SLAB, ModBlocks.FROSITE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.FROSITE_BRICK_WALL, ModBlocks.FROSITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.FROSITE_BRICK_WALL, ModBlocks.FROSITE_BRICKS);

        createStairsRecipe(ModBlocks.FROSITE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.FROSITE_TILES))
                .criterion(hasItem(ModBlocks.FROSITE_TILES),conditionsFromItem(ModBlocks.FROSITE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FROSITE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_TILE_STAIRS, ModBlocks.FROSITE_TILES);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_TILE_SLAB, ModBlocks.FROSITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_TILE_SLAB, ModBlocks.FROSITE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.FROSITE_TILE_WALL, ModBlocks.FROSITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.FROSITE_TILE_WALL, ModBlocks.FROSITE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FROSITE,4)
                .pattern("BBB")
                .pattern("BFB")
                .pattern("BBB")
                .input('B', ModBlocks.FROSITE_BLOCK)
                .input('F', ModItems.FROSITE)
                .criterion(hasItem(ModBlocks.FROSITE_BLOCK), conditionsFromItem(ModBlocks.FROSITE_BLOCK))
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .offerTo(exporter, new Identifier("chiseled_frosite"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FROSITE, ModBlocks.FROSITE_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FROSITE,18)
                .input(ModBlocks.CHISELED_FROSITE)
                .criterion(hasItem(ModBlocks.CHISELED_FROSITE), conditionsFromItem(ModBlocks.CHISELED_FROSITE))
                .offerTo(exporter, new Identifier("frosite_from_chiseled_frosite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_SWORD)
                .pattern("F")
                .pattern("F")
                .pattern("S")
                .input('F', ModItems.FROSITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("frosite_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_PICKAXE)
                .pattern("FFF")
                .pattern(" S ")
                .pattern(" S ")
                .input('F', ModItems.FROSITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("frosite_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_AXE)
                .pattern("FF")
                .pattern("FS")
                .pattern(" S")
                .input('F', ModItems.FROSITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("frosite_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_SHOVEL)
                .pattern("F")
                .pattern("S")
                .pattern("S")
                .input('F', ModItems.FROSITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("frosite_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_HOE)
                .pattern("FF")
                .pattern(" S")
                .pattern(" S")
                .input('F', ModItems.FROSITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("frosite_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_HELMET)
                .pattern("FFF")
                .pattern("F F")
                .pattern(" F ")
                .input('F', ModItems.FROSITE)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .offerTo(exporter, new Identifier("frosite_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_CHESTPLATE)
                .pattern("F F")
                .pattern("FFF")
                .pattern("FFF")
                .input('F', ModItems.FROSITE)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .offerTo(exporter, new Identifier("frosite_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_LEGGINGS)
                .pattern("FFF")
                .pattern("F F")
                .pattern("F F")
                .input('F', ModItems.FROSITE)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .offerTo(exporter, new Identifier("frosite_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_BOOTS)
                .pattern("F F")
                .pattern("F F")
                .input('F', ModItems.FROSITE)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .offerTo(exporter, new Identifier("frosite_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_HANDLE)
                .pattern(" C ")
                .pattern("C C")
                .pattern("CIC")
                .input('C', Items.COPPER_INGOT)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("copper_handle"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_DRIVE)
                .pattern("CIC")
                .pattern("IRI")
                .pattern("CIC")
                .input('C', Items.COPPER_INGOT)
                .input('I', Items.IRON_INGOT)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier("copper_drive"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POWER_DRIVE)
                .pattern(" I ")
                .pattern("ICI")
                .pattern(" I ")
                .input('C', ModItems.COPPER_DRIVE)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.COPPER_DRIVE), conditionsFromItem(ModItems.COPPER_DRIVE))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("power_drive"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HANDLED_POWER_DRIVE)
                .input(ModItems.POWER_DRIVE)
                .input(ModItems.COPPER_HANDLE)
                .criterion(hasItem(ModItems.POWER_DRIVE), conditionsFromItem(ModItems.POWER_DRIVE))
                .criterion(hasItem(ModItems.COPPER_HANDLE), conditionsFromItem(ModItems.COPPER_HANDLE))
                .offerTo(exporter, new Identifier("handled_power_drive"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_DRILL)
                .pattern(" I ")
                .pattern("IBP")
                .pattern(" I ")
                .input('I', Items.IRON_INGOT)
                .input('B', Items.IRON_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("iron_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_CHAINSAW)
                .pattern("  P")
                .pattern("IIB")
                .input('I', Items.IRON_INGOT)
                .input('B', Items.IRON_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("iron_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_DRILL)
                .pattern(" D ")
                .pattern("DBP")
                .pattern(" D ")
                .input('D', Items.DIAMOND)
                .input('B', Items.DIAMOND_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.DIAMOND_BLOCK), conditionsFromItem(Items.DIAMOND_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("diamond_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_CHAINSAW)
                .pattern("  P")
                .pattern("DDB")
                .input('D', Items.DIAMOND)
                .input('B', Items.DIAMOND_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.DIAMOND_BLOCK), conditionsFromItem(Items.DIAMOND_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("diamond_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLDEN_DRILL)
                .pattern(" G ")
                .pattern("GBP")
                .pattern(" G ")
                .input('G', Items.GOLD_INGOT)
                .input('B', Items.GOLD_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("golden_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLDEN_CHAINSAW)
                .pattern("  P")
                .pattern("GGB")
                .input('G', Items.GOLD_INGOT)
                .input('B', Items.GOLD_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("golden_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_DRILL)
                .pattern(" F ")
                .pattern("FBP")
                .pattern(" F ")
                .input('F', ModItems.FROSITE)
                .input('B', ModBlocks.FROSITE_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(ModBlocks.FROSITE_BLOCK), conditionsFromItem(ModBlocks.FROSITE_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("frosite_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_CHAINSAW)
                .pattern("  P")
                .pattern("FFB")
                .input('F', ModItems.FROSITE)
                .input('B', ModBlocks.FROSITE_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(ModBlocks.FROSITE_BLOCK), conditionsFromItem(ModBlocks.FROSITE_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("frosite_chainsaw"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ALUMINUM_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALUMINUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_ALUMINUM,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_ALUMINUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ALUMINUM_INGOT)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModItems.ALUMINUM_NUGGET)
                .criterion(hasItem(ModItems.ALUMINUM_NUGGET), conditionsFromItem(ModItems.ALUMINUM_NUGGET))
                .offerTo(exporter, new Identifier("aluminum_ingot_from_aluminum_nugget"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ALUMINUM_NUGGET,9)
                .input(ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_nugget_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINUM_SWORD)
                .pattern("A")
                .pattern("A")
                .pattern("S")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("aluminum_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINUM_PICKAXE)
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("aluminum_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINUM_AXE)
                .pattern("AA")
                .pattern("AS")
                .pattern(" S")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("aluminum_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINUM_SHOVEL)
                .pattern("A")
                .pattern("S")
                .pattern("S")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("aluminum_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINUM_HOE)
                .pattern("AA")
                .pattern(" S")
                .pattern(" S")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("aluminum_hoe"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FLINT_AND_ALUMINUM)
                .input(ModItems.ALUMINUM_INGOT)
                .input(Items.FLINT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier("flint_and_aluminum"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINUM_HELMET)
                .pattern("AAA")
                .pattern("A A")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINUM_CHESTPLATE)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINUM_LEGGINGS)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINUM_BOOTS)
                .pattern("A A")
                .pattern("A A")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ALUMINUM_DOOR,3)
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_door"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ALUMINUM_TRAPDOOR)
                .pattern("AA")
                .pattern("AA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_trapdoor"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ALUMINUM_BARS,16)
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_bars"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Blocks.ACTIVATOR_RAIL,6)
                .pattern("ASA")
                .pattern("ARA")
                .pattern("ASA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Items.STICK)
                .input('R', Items.REDSTONE_TORCH)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.REDSTONE_TORCH), conditionsFromItem(Items.REDSTONE_TORCH))
                .offerTo(exporter, new Identifier("activator_rail_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Blocks.ANVIL)
                .pattern("BBB")
                .pattern(" A ")
                .pattern("AAA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('B', ModBlocks.ALUMINUM_BLOCK)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(ModBlocks.ALUMINUM_BLOCK), conditionsFromItem(ModBlocks.ALUMINUM_BLOCK))
                .offerTo(exporter, new Identifier("anvil_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Blocks.BLAST_FURNACE)
                .pattern("AAA")
                .pattern("AFA")
                .pattern("SSS")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('F', Blocks.FURNACE)
                .input('S', Blocks.SMOOTH_STONE)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Blocks.FURNACE), conditionsFromItem(Blocks.FURNACE))
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter, new Identifier("blast_furnace_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.BUCKET)
                .pattern("A A")
                .pattern(" A ")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("bucket_from_aluminum_ingot"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Blocks.CAULDRON)
                .pattern("A A")
                .pattern("A A")
                .pattern("AAA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("cauldron_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Blocks.CHAIN)
                .pattern("N")
                .pattern("A")
                .pattern("N")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('N', ModItems.ALUMINUM_NUGGET)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(ModBlocks.ALUMINUM_BLOCK), conditionsFromItem(ModBlocks.ALUMINUM_BLOCK))
                .offerTo(exporter, new Identifier("chain_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.COMPASS)
                .pattern(" A ")
                .pattern("ARA")
                .pattern(" A ")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier("compass_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CROSSBOW)
                .pattern("SAS")
                .pattern("THT")
                .pattern(" S ")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Items.STICK)
                .input('T', Items.STRING)
                .input('H', Items.TRIPWIRE_HOOK)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                .criterion(hasItem(Items.TRIPWIRE_HOOK), conditionsFromItem(Items.TRIPWIRE_HOOK))
                .offerTo(exporter, new Identifier("crossbow_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Blocks.DETECTOR_RAIL,6)
                .pattern("A A")
                .pattern("ASA")
                .pattern("ARA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Blocks.STONE_PRESSURE_PLATE)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Blocks.STONE_PRESSURE_PLATE), conditionsFromItem(Blocks.STONE_PRESSURE_PLATE))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier("detector_rail_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Blocks.HOPPER)
                .pattern("A A")
                .pattern("ACA")
                .pattern(" A ")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('C', Blocks.CHEST)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Blocks.CHEST), conditionsFromItem(Blocks.CHEST))
                .offerTo(exporter, new Identifier("hopper_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.MINECART)
                .pattern("A A")
                .pattern("AAA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("minecart_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.RAIL,16)
                .pattern("A A")
                .pattern("ASA")
                .pattern("A A")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("rail_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.SHEARS)
                .pattern(" A")
                .pattern("A ")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("shears_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.STONECUTTER)
                .pattern(" A ")
                .pattern("SSS")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Blocks.STONE)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(exporter, new Identifier("stonecutter_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_HANDLE)
                .pattern(" C ")
                .pattern("C C")
                .pattern("CAC")
                .input('C', Items.COPPER_INGOT)
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("copper_handle_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_DRIVE)
                .pattern("CAC")
                .pattern("ARA")
                .pattern("CAC")
                .input('C', Items.COPPER_INGOT)
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier("copper_drive_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POWER_DRIVE)
                .pattern(" A ")
                .pattern("ACA")
                .pattern(" A ")
                .input('C', ModItems.COPPER_DRIVE)
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.COPPER_DRIVE), conditionsFromItem(ModItems.COPPER_DRIVE))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("power_drive_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINUM_DRILL)
                .pattern(" A ")
                .pattern("ABP")
                .pattern(" A ")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('B', ModBlocks.ALUMINUM_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(ModBlocks.ALUMINUM_BLOCK), conditionsFromItem(ModBlocks.ALUMINUM_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("aluminum_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINUM_CHAINSAW)
                .pattern("  P")
                .pattern("AAB")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('B', ModBlocks.ALUMINUM_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(ModBlocks.ALUMINUM_BLOCK), conditionsFromItem(ModBlocks.ALUMINUM_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("aluminum_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.LANTERN)
                .pattern("AAA")
                .pattern("ATA")
                .pattern("AAA")
                .input('T', Items.TORCH)
                .input('A', ModItems.ALUMINUM_NUGGET)
                .criterion(hasItem(Items.TORCH), conditionsFromItem(Items.TORCH))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("lantern_from_aluminum_nugget"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.SOUL_LANTERN)
                .pattern("AAA")
                .pattern("ATA")
                .pattern("AAA")
                .input('T', Items.SOUL_TORCH)
                .input('A', ModItems.ALUMINUM_NUGGET)
                .criterion(hasItem(Items.SOUL_TORCH), conditionsFromItem(Items.SOUL_TORCH))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("soul_lantern_from_aluminum_nugget"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ALUMINUM_PRESSURE_PLATE)
                .pattern("AA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_pressure_plate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.NICKEL_PRESSURE_PLATE)
                .pattern("NN")
                .input('N', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier("nickel_pressure_plate"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.NICKEL_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.NICKEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_NICKEL,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_NICKEL_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NICKEL_INGOT)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', ModItems.NICKEL_NUGGET)
                .criterion(hasItem(ModItems.NICKEL_NUGGET), conditionsFromItem(ModItems.NICKEL_NUGGET))
                .offerTo(exporter, new Identifier("nickel_ingot_from_nickel_nugget"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NICKEL_NUGGET,9)
                .input(ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier("nickel_nugget_from_nickel_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NICKEL_APPLE)
                .pattern("NNN")
                .pattern("NAN")
                .pattern("NNN")
                .input('N', ModItems.NICKEL_INGOT)
                .input('A', Items.APPLE)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier("nickel_apple"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NICKEL_BEETROOT)
                .pattern("NNN")
                .pattern("NBN")
                .pattern("NNN")
                .input('N', ModItems.NICKEL_NUGGET)
                .input('B', Items.BEETROOT)
                .criterion(hasItem(ModItems.NICKEL_NUGGET), conditionsFromItem(ModItems.NICKEL_NUGGET))
                .criterion(hasItem(Items.BEETROOT), conditionsFromItem(Items.BEETROOT))
                .offerTo(exporter, new Identifier("nickel_beetroot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NICKEL_SWORD)
                .pattern("N")
                .pattern("N")
                .pattern("S")
                .input('N', ModItems.NICKEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("nickel_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NICKEL_PICKAXE)
                .pattern("NNN")
                .pattern(" S ")
                .pattern(" S ")
                .input('N', ModItems.NICKEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("nickel_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NICKEL_AXE)
                .pattern("NN")
                .pattern("NS")
                .pattern(" S")
                .input('N', ModItems.NICKEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("nickel_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NICKEL_SHOVEL)
                .pattern("N")
                .pattern("S")
                .pattern("S")
                .input('N', ModItems.NICKEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("nickel_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NICKEL_HOE)
                .pattern("NN")
                .pattern(" S")
                .pattern(" S")
                .input('N', ModItems.NICKEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("nickel_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_SWORD)
                .pattern("C")
                .pattern("C")
                .pattern("S")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("copper_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("copper_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_AXE)
                .pattern("CC")
                .pattern("CS")
                .pattern(" S")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("copper_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL)
                .pattern("C")
                .pattern("S")
                .pattern("S")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("copper_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_HOE)
                .pattern("CC")
                .pattern(" S")
                .pattern(" S")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("copper_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NICKEL_HELMET)
                .pattern("NNN")
                .pattern("N N")
                .input('N', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier("nickel_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NICKEL_CHESTPLATE)
                .pattern("N N")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier("nickel_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NICKEL_LEGGINGS)
                .pattern("NNN")
                .pattern("N N")
                .pattern("N N")
                .input('N', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier("nickel_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NICKEL_BOOTS)
                .pattern("N N")
                .pattern("N N")
                .input('N', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier("nickel_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_HELMET)
                .pattern("CCC")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier("copper_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier("copper_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier("copper_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_BOOTS)
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier("copper_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NICKEL_DRILL)
                .pattern(" N ")
                .pattern("NBP")
                .pattern(" N ")
                .input('N', ModItems.NICKEL_INGOT)
                .input('B', ModBlocks.NICKEL_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(ModBlocks.NICKEL_BLOCK), conditionsFromItem(ModBlocks.NICKEL_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("nickel_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NICKEL_CHAINSAW)
                .pattern("  P")
                .pattern("NNB")
                .input('N', ModItems.NICKEL_INGOT)
                .input('B', ModBlocks.NICKEL_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(ModBlocks.NICKEL_BLOCK), conditionsFromItem(ModBlocks.NICKEL_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("nickel_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_DRILL)
                .pattern(" C ")
                .pattern("CBP")
                .pattern(" C ")
                .input('C', Items.COPPER_INGOT)
                .input('B', Blocks.COPPER_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Blocks.COPPER_BLOCK), conditionsFromItem(Blocks.COPPER_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("copper_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_CHAINSAW)
                .pattern("  P")
                .pattern("CCB")
                .input('C', Items.COPPER_INGOT)
                .input('B', Blocks.COPPER_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Blocks.COPPER_BLOCK), conditionsFromItem(Blocks.COPPER_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("copper_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_BALL)
                .pattern(" I ")
                .pattern("I I")
                .pattern(" I ")
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("iron_ball"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_ALUMINUM)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.IRON_BALL)
                .input('#', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.IRON_BALL), conditionsFromItem(ModItems.IRON_BALL))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_ALUMINUM)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_NICKEL)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.IRON_BALL)
                .input('#', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.IRON_BALL), conditionsFromItem(ModItems.IRON_BALL))
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_NICKEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_COPPER)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.IRON_BALL)
                .input('#', Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.IRON_BALL), conditionsFromItem(ModItems.IRON_BALL))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_COPPER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_NICKINUM)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_NICKEL)
                .input('#', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_NICKEL), conditionsFromItem(ModItems.STEEL_COMPOUND_NICKEL))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_NICKINUM)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_COPPINUM)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_COPPER)
                .input('#', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_NICKEL), conditionsFromItem(ModItems.STEEL_COMPOUND_NICKEL))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_COPPINUM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_ALUCKEL)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_ALUMINUM)
                .input('#', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_ALUMINUM), conditionsFromItem(ModItems.STEEL_COMPOUND_ALUMINUM))
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_ALUCKEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_COPPEL)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_COPPER)
                .input('#', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_COPPER), conditionsFromItem(ModItems.STEEL_COMPOUND_COPPER))
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_COPPEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_ALUPPER)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_ALUMINUM)
                .input('#', Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_ALUMINUM), conditionsFromItem(ModItems.STEEL_COMPOUND_ALUMINUM))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_ALUPPER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_NICKOPPER)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_NICKEL)
                .input('#', Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_NICKEL), conditionsFromItem(ModItems.STEEL_COMPOUND_NICKEL))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_NICKOPPER)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_COPPELUNUM)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_COPPEL)
                .input('#', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_COPPEL), conditionsFromItem(ModItems.STEEL_COMPOUND_COPPEL))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_COPPELUNUM)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_NICKOPPINUM)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_NICKOPPER)
                .input('#', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_NICKOPPER), conditionsFromItem(ModItems.STEEL_COMPOUND_NICKOPPER))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_NICKOPPINUM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_ALUPPEREL)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_ALUPPER)
                .input('#', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_ALUPPER), conditionsFromItem(ModItems.STEEL_COMPOUND_ALUPPER))
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_ALUPPEREL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_COPPINUCKEL)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_COPPINUM)
                .input('#', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_COPPINUM), conditionsFromItem(ModItems.STEEL_COMPOUND_COPPINUM))
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_COPPINUCKEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_ALUNICKOPPER)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_ALUCKEL)
                .input('#', Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_ALUCKEL), conditionsFromItem(ModItems.STEEL_COMPOUND_ALUCKEL))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_ALUNICKOPPER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_NICKINUPPER)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_NICKINUM)
                .input('#', Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_NICKINUM), conditionsFromItem(ModItems.STEEL_COMPOUND_NICKINUM))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_NICKINUPPER)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_COPPELUNUM)
                .input('#', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_COPPELUNUM), conditionsFromItem(ModItems.STEEL_COMPOUND_COPPELUNUM))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("steel_compound_form_steel_compound_coppelinum"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_NICKOPPINUM)
                .input('#', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_NICKOPPINUM), conditionsFromItem(ModItems.STEEL_COMPOUND_NICKOPPINUM))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("steel_compound_form_steel_compound_nickoppinum"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_ALUPPEREL)
                .input('#', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_ALUPPEREL), conditionsFromItem(ModItems.STEEL_COMPOUND_ALUPPEREL))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("steel_compound_form_steel_compound_alupperel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_COPPINUCKEL)
                .input('#', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_COPPINUCKEL), conditionsFromItem(ModItems.STEEL_COMPOUND_COPPINUCKEL))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("steel_compound_form_steel_compound_coppinuckel"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_ALUNICKOPPER)
                .input('#', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_ALUNICKOPPER), conditionsFromItem(ModItems.STEEL_COMPOUND_ALUNICKOPPER))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("steel_compound_form_steel_compound_alunickopper"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_NICKINUPPER)
                .input('#', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_NICKINUPPER), conditionsFromItem(ModItems.STEEL_COMPOUND_NICKINUPPER))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("steel_compound_form_steel_compound_nickinupper"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_STEEL)
                .pattern("SSS")
                .pattern("SII")
                .pattern("II ")
                .input('S', ModItems.STEEL_COMPOUND)
                .input('I', Items.RAW_IRON)
                .criterion(hasItem(ModItems.STEEL_COMPOUND), conditionsFromItem(ModItems.STEEL_COMPOUND))
                .criterion(hasItem(Items.RAW_IRON), conditionsFromItem(Items.RAW_IRON))
                .offerTo(exporter, new Identifier("raw_steel_from_steel_compound"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModItems.RAW_STEEL), RecipeCategory.MISC, ModItems.STEEL_INGOT,0.7f, 2000)
                .criterion(hasItem(ModItems.RAW_STEEL), conditionsFromItem(ModItems.RAW_STEEL))
                .offerTo(exporter, new Identifier("steel_ingot_from_smelting"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems
                        (ModItems.RAW_STEEL), RecipeCategory.MISC, ModItems.STEEL_INGOT,0.7f, 1000)
                .criterion(hasItem(ModItems.RAW_STEEL), conditionsFromItem(ModItems.RAW_STEEL))
                .offerTo(exporter, new Identifier("steel_ingot_from_blasting"));

        offerSmithingTemplateCopyingRecipe(exporter, ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE, Blocks.DEEPSLATE);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.STEEL_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_STEEL,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_STEEL_BLOCK);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModBlocks.RAW_STEEL_BLOCK), RecipeCategory.MISC, ModBlocks.SMOOTH_STEEL_BLOCK,0.7f, 2000)
                .criterion(hasItem(ModBlocks.RAW_STEEL_BLOCK), conditionsFromItem(ModBlocks.RAW_STEEL_BLOCK))
                .offerTo(exporter, new Identifier("smooth_steel_block_from_smelting"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems
                        (ModBlocks.RAW_STEEL_BLOCK), RecipeCategory.MISC, ModBlocks.SMOOTH_STEEL_BLOCK,0.7f, 1000)
                .criterion(hasItem(ModBlocks.RAW_STEEL_BLOCK), conditionsFromItem(ModBlocks.RAW_STEEL_BLOCK))
                .offerTo(exporter, new Identifier("smooth_steel_block_from_blasting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL,4)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.SMOOTH_STEEL_BLOCK)
                .criterion(hasItem(ModBlocks.SMOOTH_STEEL_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_STEEL_BLOCK))
                .offerTo(exporter, new Identifier("cut_steel"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL, ModBlocks.SMOOTH_STEEL_BLOCK);

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STEEL_SLAB, ModBlocks.SMOOTH_STEEL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STEEL_SLAB, ModBlocks.SMOOTH_STEEL_BLOCK,2);

        createStairsRecipe(ModBlocks.CUT_STEEL_STAIRS, Ingredient.ofItems(ModBlocks.CUT_STEEL))
                .criterion(hasItem(ModBlocks.CUT_STEEL),conditionsFromItem(ModBlocks.CUT_STEEL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUT_STEEL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL_STAIRS, ModBlocks.SMOOTH_STEEL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL_STAIRS, ModBlocks.CUT_STEEL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL_SLAB, ModBlocks.CUT_STEEL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL_SLAB, ModBlocks.SMOOTH_STEEL_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL_SLAB, ModBlocks.CUT_STEEL,2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_APPLE)
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .input('S', ModBlocks.STEEL_BLOCK)
                .input('A', Items.APPLE)
                .criterion(hasItem(ModBlocks.STEEL_BLOCK), conditionsFromItem(ModBlocks.STEEL_BLOCK))
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier("steel_apple"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_BEETROOT)
                .pattern("SSS")
                .pattern("SBS")
                .pattern("SSS")
                .input('S', ModItems.STEEL_INGOT)
                .input('B', Items.BEETROOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(Items.BEETROOT), conditionsFromItem(Items.BEETROOT))
                .offerTo(exporter, new Identifier("steel_beetroot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STEEL_DOOR,3)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier("steel_door"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STEEL_TRAPDOOR)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier("steel_trapdoor"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.STEEL_BARS,16)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier("steel_bars"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STEEL_PRESSURE_PLATE)
                .pattern("SS")
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier("steel_pressure_plate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.STEEL_LAMP)
                .pattern("SBS")
                .pattern("BGB")
                .pattern("SBS")
                .input('S', ModItems.STEEL_INGOT)
                .input('B', ModBlocks.STEEL_BARS)
                .input('G', Blocks.GLOWSTONE)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(ModBlocks.STEEL_BARS), conditionsFromItem(ModBlocks.STEEL_BARS))
                .criterion(hasItem(Blocks.GLOWSTONE), conditionsFromItem(Blocks.GLOWSTONE))
                .offerTo(exporter, new Identifier("steel_lamp"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONEBARK_PLANKS,4)
                .input(ModBlocks.STONEBARK_LOG)
                .criterion(hasItem(ModBlocks.STONEBARK_LOG), conditionsFromItem(ModBlocks.STONEBARK_LOG))
                .offerTo(exporter, new Identifier("stonebark_planks_from_stonebark_log"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONEBARK_PLANKS,4)
                .input(ModBlocks.STRIPPED_STONEBARK_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_STONEBARK_LOG), conditionsFromItem(ModBlocks.STRIPPED_STONEBARK_LOG))
                .offerTo(exporter, new Identifier("stonebark_planks_from_stripped_stonebark_log"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONEBARK_PLANKS,4)
                .input(ModBlocks.STONEBARK_WOOD)
                .criterion(hasItem(ModBlocks.STONEBARK_WOOD), conditionsFromItem(ModBlocks.STONEBARK_WOOD))
                .offerTo(exporter, new Identifier("stonebark_planks_from_stonebark_wood"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONEBARK_PLANKS,4)
                .input(ModBlocks.STRIPPED_STONEBARK_WOOD)
                .criterion(hasItem(ModBlocks.STRIPPED_STONEBARK_WOOD), conditionsFromItem(ModBlocks.STRIPPED_STONEBARK_WOOD))
                .offerTo(exporter, new Identifier("stonebark_planks_from_stripped_stonebark_wood"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONEBARK_WOOD)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.STONEBARK_LOG)
                .criterion(hasItem(ModBlocks.STONEBARK_LOG), conditionsFromItem(ModBlocks.STONEBARK_LOG))
                .offerTo(exporter, new Identifier("stonebark_wood"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_STONEBARK_WOOD)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.STRIPPED_STONEBARK_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_STONEBARK_LOG), conditionsFromItem(ModBlocks.STRIPPED_STONEBARK_LOG))
                .offerTo(exporter, new Identifier("stripped_stonebark_wood"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_PLANKS,4)
                .input(ModBlocks.DEEPSLATE_LOG)
                .criterion(hasItem(ModBlocks.DEEPSLATE_LOG), conditionsFromItem(ModBlocks.DEEPSLATE_LOG))
                .offerTo(exporter, new Identifier("deepslate_planks_from_deepslate_log"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_PLANKS,4)
                .input(ModBlocks.STRIPPED_DEEPSLATE_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_DEEPSLATE_LOG), conditionsFromItem(ModBlocks.STRIPPED_DEEPSLATE_LOG))
                .offerTo(exporter, new Identifier("deepslate_planks_from_stripped_deepslate_log"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_PLANKS,4)
                .input(ModBlocks.DEEPSLATE_WOOD)
                .criterion(hasItem(ModBlocks.DEEPSLATE_WOOD), conditionsFromItem(ModBlocks.DEEPSLATE_WOOD))
                .offerTo(exporter, new Identifier("deepslate_planks_from_deepslate_wood"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_PLANKS,4)
                .input(ModBlocks.STRIPPED_DEEPSLATE_WOOD)
                .criterion(hasItem(ModBlocks.STRIPPED_DEEPSLATE_WOOD), conditionsFromItem(ModBlocks.STRIPPED_DEEPSLATE_WOOD))
                .offerTo(exporter, new Identifier("deepslate_planks_from_stripped_deepslate_wood"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_WOOD)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.DEEPSLATE_LOG)
                .criterion(hasItem(ModBlocks.DEEPSLATE_LOG), conditionsFromItem(ModBlocks.DEEPSLATE_LOG))
                .offerTo(exporter, new Identifier("deepslate_wood"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_DEEPSLATE_WOOD)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.STRIPPED_DEEPSLATE_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_DEEPSLATE_LOG), conditionsFromItem(ModBlocks.STRIPPED_DEEPSLATE_LOG))
                .offerTo(exporter, new Identifier("stripped_deepslate_wood"));

        createStairsRecipe(ModBlocks.STONEBARK_STAIRS, Ingredient.ofItems(ModBlocks.STONEBARK_PLANKS))
                .criterion(hasItem(ModBlocks.STONEBARK_PLANKS),conditionsFromItem(ModBlocks.STONEBARK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONEBARK_STAIRS)));
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONEBARK_SLAB, ModBlocks.STONEBARK_PLANKS);
        createFenceRecipe(ModBlocks.STONEBARK_FENCE, Ingredient.ofItems(ModBlocks.STONEBARK_PLANKS))
                .criterion(hasItem(ModBlocks.STONEBARK_PLANKS),conditionsFromItem(ModBlocks.STONEBARK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONEBARK_FENCE)));
        createFenceGateRecipe(ModBlocks.STONEBARK_FENCE_GATE, Ingredient.ofItems(ModBlocks.STONEBARK_PLANKS))
                .criterion(hasItem(ModBlocks.STONEBARK_PLANKS),conditionsFromItem(ModBlocks.STONEBARK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONEBARK_FENCE_GATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STONEBARK_BUTTON)
                .input(ModBlocks.STONEBARK_PLANKS)
                .criterion(hasItem(ModBlocks.STONEBARK_PLANKS), conditionsFromItem(ModBlocks.STONEBARK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONEBARK_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STONEBARK_PRESSURE_PLATE)
                .pattern("SS")
                .input('S', ModBlocks.STONEBARK_PLANKS)
                .criterion(hasItem(ModBlocks.STONEBARK_PLANKS), conditionsFromItem(ModBlocks.STONEBARK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONEBARK_PRESSURE_PLATE)));

        createStairsRecipe(ModBlocks.DEEPBARK_STAIRS, Ingredient.ofItems(ModBlocks.DEEPSLATE_PLANKS))
                .criterion(hasItem(ModBlocks.DEEPSLATE_PLANKS),conditionsFromItem(ModBlocks.DEEPSLATE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPBARK_STAIRS)));
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPBARK_SLAB, ModBlocks.DEEPSLATE_PLANKS);
        createFenceRecipe(ModBlocks.DEEPBARK_FENCE, Ingredient.ofItems(ModBlocks.DEEPSLATE_PLANKS))
                .criterion(hasItem(ModBlocks.DEEPSLATE_PLANKS),conditionsFromItem(ModBlocks.DEEPSLATE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPBARK_FENCE)));
        createFenceGateRecipe(ModBlocks.DEEPBARK_FENCE_GATE, Ingredient.ofItems(ModBlocks.DEEPSLATE_PLANKS))
                .criterion(hasItem(ModBlocks.DEEPSLATE_PLANKS),conditionsFromItem(ModBlocks.DEEPSLATE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPBARK_FENCE_GATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DEEPBARK_BUTTON)
                .input(ModBlocks.DEEPSLATE_PLANKS)
                .criterion(hasItem(ModBlocks.DEEPSLATE_PLANKS), conditionsFromItem(ModBlocks.DEEPSLATE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPBARK_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DEEPBARK_PRESSURE_PLATE)
                .pattern("SS")
                .input('S', ModBlocks.DEEPSLATE_PLANKS)
                .criterion(hasItem(ModBlocks.DEEPSLATE_PLANKS), conditionsFromItem(ModBlocks.DEEPSLATE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPBARK_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STONEBARK_DOOR,3)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.STONEBARK_PLANKS)
                .criterion(hasItem(ModBlocks.STONEBARK_PLANKS), conditionsFromItem(ModBlocks.STONEBARK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONEBARK_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STONEBARK_TRAPDOOR)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModBlocks.STONEBARK_PLANKS)
                .criterion(hasItem(ModBlocks.STONEBARK_PLANKS), conditionsFromItem(ModBlocks.STONEBARK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONEBARK_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DEEPBARK_DOOR,3)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.DEEPSLATE_PLANKS)
                .criterion(hasItem(ModBlocks.DEEPSLATE_PLANKS), conditionsFromItem(ModBlocks.DEEPSLATE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPBARK_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DEEPBARK_TRAPDOOR)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModBlocks.DEEPSLATE_PLANKS)
                .criterion(hasItem(ModBlocks.DEEPSLATE_PLANKS), conditionsFromItem(ModBlocks.DEEPSLATE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPBARK_TRAPDOOR)));

        createSignRecipe(ModItems.STONEBARK_SIGN, Ingredient.ofItems(ModBlocks.STONEBARK_PLANKS))
                .criterion(hasItem(ModBlocks.STONEBARK_PLANKS),conditionsFromItem(ModBlocks.STONEBARK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STONEBARK_SIGN)));

        createSignRecipe(ModItems.DEEPBARK_SIGN, Ingredient.ofItems(ModBlocks.DEEPSLATE_PLANKS))
                .criterion(hasItem(ModBlocks.DEEPSLATE_PLANKS),conditionsFromItem(ModBlocks.DEEPSLATE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DEEPBARK_SIGN)));

        offerHangingSignRecipe(exporter, ModItems.STONEBARK_HANGING_SIGN, ModBlocks.STRIPPED_STONEBARK_WOOD);
        offerHangingSignRecipe(exporter, ModItems.DEEPBARK_HANGING_SIGN, ModBlocks.STRIPPED_DEEPSLATE_WOOD);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TITANIUM_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.TITANIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_TITANIUM,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_TITANIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TITANIUM_SWORD)
                .pattern("T")
                .pattern("T")
                .pattern("S")
                .input('T', ModItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("titanium_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_PICKAXE)
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .input('T', ModItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("titanium_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_AXE)
                .pattern("TT")
                .pattern("TS")
                .pattern(" S")
                .input('T', ModItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("titanium_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_SHOVEL)
                .pattern("T")
                .pattern("S")
                .pattern("S")
                .input('T', ModItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("titanium_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_HOE)
                .pattern("TT")
                .pattern(" S")
                .pattern(" S")
                .input('T', ModItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("titanium_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TITANIUM_HELMET)
                .pattern("TTT")
                .pattern("T T")
                .input('T', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier("titanium_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TITANIUM_CHESTPLATE)
                .pattern("T T")
                .pattern("TTT")
                .pattern("TTT")
                .input('T', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier("titanium_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TITANIUM_LEGGINGS)
                .pattern("TTT")
                .pattern("T T")
                .pattern("T T")
                .input('T', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier("titanium_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TITANIUM_BOOTS)
                .pattern("T T")
                .pattern("T T")
                .input('T', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier("titanium_boots"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUNGSTEN_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT)
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .input('T', ModItems.TUNGSTEN_NUGGET)
                .criterion(hasItem(ModItems.TUNGSTEN_NUGGET), conditionsFromItem(ModItems.TUNGSTEN_NUGGET))
                .offerTo(exporter, new Identifier("tungsten_ingot_from_tungsten_nugget"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TUNGSTEN_NUGGET,9)
                .input(ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(exporter, new Identifier("tungsten_nugget_from_tungsten_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_SWORD)
                .pattern("T")
                .pattern("T")
                .pattern("S")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("tungsten_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_PICKAXE)
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("tungsten_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_AXE)
                .pattern("TT")
                .pattern("TS")
                .pattern(" S")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("tungsten_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_SHOVEL)
                .pattern("T")
                .pattern("S")
                .pattern("S")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("tungsten_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_HOE)
                .pattern("TT")
                .pattern(" S")
                .pattern(" S")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("tungsten_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_HELMET)
                .pattern("TTT")
                .pattern("T T")
                .pattern(" T ")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(exporter, new Identifier("tungsten_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_CHESTPLATE)
                .pattern("T T")
                .pattern("TTT")
                .pattern("TTT")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(exporter, new Identifier("tungsten_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_LEGGINGS)
                .pattern("TTT")
                .pattern("T T")
                .pattern("T T")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(exporter, new Identifier("tungsten_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_BOOTS)
                .pattern("T T")
                .pattern("T T")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(exporter, new Identifier("tungsten_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_ALLOY_SCRAP)
                .pattern(" N ")
                .pattern("NTN")
                .pattern(" N ")
                .input('N', ModItems.TUNGSTEN_NUGGET)
                .input('T', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_NUGGET), conditionsFromItem(ModItems.TUNGSTEN_NUGGET))
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier("titanium_alloy_scrap"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_ALLOY_INGOT)
                .pattern("TTT")
                .pattern("TAA")
                .pattern("AA ")
                .input('T', ModItems.TITANIUM_ALLOY_SCRAP)
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.TITANIUM_ALLOY_SCRAP), conditionsFromItem(ModItems.TITANIUM_ALLOY_SCRAP))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("titanium_alloy_ingot_from_titanium_alloy_scrap"));


        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TITANIUM_ALLOY_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.TITANIUM_ALLOY_BLOCK);

        offerSmithingTemplateCopyingRecipe(exporter, ModItems.TITANIUM_ALLOY_UPGRADE_SMITHING_TEMPLATE, Items.OBSIDIAN);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Blocks.OBSERVER)
                .pattern("CCC")
                .pattern("RRT")
                .pattern("CCC")
                .input('T', ModItems.TITANIUM_INGOT)
                .input('C', Blocks.COBBLESTONE)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier("observer_from_titanium_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.COMPARATOR)
                .pattern(" R ")
                .pattern("RTR")
                .pattern("SSS")
                .input('T', ModItems.TITANIUM_INGOT)
                .input('S', Blocks.STONE)
                .input('R', Items.REDSTONE_TORCH)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .criterion(hasItem(Items.REDSTONE_TORCH), conditionsFromItem(Items.REDSTONE_TORCH))
                .offerTo(exporter, new Identifier("comparator_from_titanium_ingot"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.COBALT_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBALT_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBALT_INGOT)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.COBALT_NUGGET)
                .criterion(hasItem(ModItems.COBALT_NUGGET), conditionsFromItem(ModItems.COBALT_NUGGET))
                .offerTo(exporter, new Identifier("cobalt_ingot_from_cobalt_nugget"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBALT_NUGGET,9)
                .input(ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier("cobalt_nugget_from_cobalt_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_SWORD)
                .pattern("C")
                .pattern("C")
                .pattern("S")
                .input('C', ModItems.COBALT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("cobalt_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', ModItems.COBALT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("cobalt_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_AXE)
                .pattern("CC")
                .pattern("CS")
                .pattern(" S")
                .input('C', ModItems.COBALT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("cobalt_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_SHOVEL)
                .pattern("C")
                .pattern("S")
                .pattern("S")
                .input('C', ModItems.COBALT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("cobalt_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_HOE)
                .pattern("CC")
                .pattern(" S")
                .pattern(" S")
                .input('C', ModItems.COBALT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("cobalt_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_HELMET)
                .pattern("CCC")
                .pattern("C C")
                .input('C', ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier("cobalt_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier("cobalt_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier("cobalt_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_BOOTS)
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier("cobalt_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBALT_HANDLE)
                .pattern(" C ")
                .pattern("C C")
                .pattern("CIC")
                .input('C', ModItems.COBALT_INGOT)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("cobalt_handle"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBALT_HANDLE)
                .pattern(" C ")
                .pattern("C C")
                .pattern("CIC")
                .input('C', ModItems.COBALT_INGOT)
                .input('I', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("cobalt_handle_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DUEL_POWER_DRIVE)
                .pattern("PIC")
                .pattern("III")
                .pattern("CIP")
                .input('C', ModItems.COPPER_DRIVE)
                .input('I', Items.IRON_INGOT)
                .input('P', Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.COPPER_DRIVE), conditionsFromItem(ModItems.COPPER_DRIVE))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier("duel_power_drive"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DUEL_POWER_DRIVE)
                .pattern("PIC")
                .pattern("III")
                .pattern("CIP")
                .input('C', ModItems.COPPER_DRIVE)
                .input('I', ModItems.ALUMINUM_INGOT)
                .input('P', Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.COPPER_DRIVE), conditionsFromItem(ModItems.COPPER_DRIVE))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier("duel_power_drive_from_aluminum_ingot"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DUEL_HANDLED_POWER_DRIVE)
                .input(ModItems.DUEL_POWER_DRIVE)
                .input(ModItems.COBALT_HANDLE)
                .criterion(hasItem(ModItems.DUEL_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_POWER_DRIVE))
                .criterion(hasItem(ModItems.COBALT_HANDLE), conditionsFromItem(ModItems.COBALT_HANDLE))
                .offerTo(exporter, new Identifier("duel_handled_power_drive"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NETHERITE_DRILL)
                .pattern(" I ")
                .pattern("IBP")
                .pattern(" I ")
                .input('I', Items.NETHERITE_SCRAP)
                .input('B', Items.NETHERITE_INGOT)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.NETHERITE_SCRAP), conditionsFromItem(Items.NETHERITE_SCRAP))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("netherite_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NETHERITE_CHAINSAW)
                .pattern("  P")
                .pattern("IIB")
                .input('I', Items.NETHERITE_SCRAP)
                .input('B', Items.NETHERITE_INGOT)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.NETHERITE_SCRAP), conditionsFromItem(Items.NETHERITE_SCRAP))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("netherite_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_DRILL)
                .pattern(" I ")
                .pattern("IBP")
                .pattern(" I ")
                .input('I', ModItems.STEEL_COMPOUND)
                .input('B', ModItems.STEEL_INGOT)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.STEEL_COMPOUND), conditionsFromItem(ModItems.STEEL_COMPOUND))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("steel_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_CHAINSAW)
                .pattern("  P")
                .pattern("IIB")
                .input('I', ModItems.STEEL_COMPOUND)
                .input('B', ModItems.STEEL_INGOT)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.STEEL_COMPOUND), conditionsFromItem(ModItems.STEEL_COMPOUND))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("steel_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_ALLOY_DRILL)
                .pattern(" I ")
                .pattern("IBP")
                .pattern(" I ")
                .input('I', ModItems.TITANIUM_ALLOY_SCRAP)
                .input('B', ModItems.TITANIUM_ALLOY_INGOT)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.TITANIUM_ALLOY_SCRAP), conditionsFromItem(ModItems.TITANIUM_ALLOY_SCRAP))
                .criterion(hasItem(ModItems.TITANIUM_ALLOY_INGOT), conditionsFromItem(ModItems.TITANIUM_ALLOY_INGOT))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("titanium_alloy_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_ALLOY_CHAINSAW)
                .pattern("  P")
                .pattern("IIB")
                .input('I', ModItems.TITANIUM_ALLOY_SCRAP)
                .input('B', ModItems.TITANIUM_ALLOY_INGOT)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.TITANIUM_ALLOY_SCRAP), conditionsFromItem(ModItems.TITANIUM_ALLOY_SCRAP))
                .criterion(hasItem(ModItems.TITANIUM_ALLOY_INGOT), conditionsFromItem(ModItems.TITANIUM_ALLOY_INGOT))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("titanium_alloy_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_DRILL)
                .pattern(" I ")
                .pattern("IBP")
                .pattern(" I ")
                .input('I', ModItems.COBALT_INGOT)
                .input('B', ModBlocks.COBALT_BLOCK)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(ModBlocks.COBALT_BLOCK), conditionsFromItem(ModBlocks.COBALT_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("cobalt_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_CHAINSAW)
                .pattern("  P")
                .pattern("IIB")
                .input('I', ModItems.COBALT_INGOT)
                .input('B', ModBlocks.COBALT_BLOCK)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(ModBlocks.COBALT_BLOCK), conditionsFromItem(ModBlocks.COBALT_BLOCK))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("cobalt_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_DRILL)
                .pattern(" I ")
                .pattern("IBP")
                .pattern(" I ")
                .input('I', ModItems.TUNGSTEN_INGOT)
                .input('B', ModBlocks.TUNGSTEN_BLOCK)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .criterion(hasItem(ModBlocks.TUNGSTEN_BLOCK), conditionsFromItem(ModBlocks.TUNGSTEN_BLOCK))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("tungsten_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_CHAINSAW)
                .pattern("  P")
                .pattern("IIB")
                .input('I', ModItems.TUNGSTEN_INGOT)
                .input('B', ModBlocks.TUNGSTEN_BLOCK)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .criterion(hasItem(ModBlocks.TUNGSTEN_BLOCK), conditionsFromItem(ModBlocks.TUNGSTEN_BLOCK))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("tungsten_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_DRILL)
                .pattern(" I ")
                .pattern("IBP")
                .pattern(" I ")
                .input('I', ModItems.TITANIUM_INGOT)
                .input('B', ModBlocks.TITANIUM_BLOCK)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(ModBlocks.TITANIUM_BLOCK), conditionsFromItem(ModBlocks.TITANIUM_BLOCK))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("titanium_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_CHAINSAW)
                .pattern("  P")
                .pattern("IIB")
                .input('I', ModItems.TITANIUM_INGOT)
                .input('B', ModBlocks.TITANIUM_BLOCK)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(ModBlocks.TITANIUM_BLOCK), conditionsFromItem(ModBlocks.TITANIUM_BLOCK))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("titanium_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_SANDSTONE)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.WHITE_SAND)
                .criterion(hasItem(ModBlocks.WHITE_SAND), conditionsFromItem(ModBlocks.WHITE_SAND))
                .offerTo(exporter, new Identifier("white_sandstone"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WHITE_SANDSTONE,4)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.WHITE_SANDSTONE)
                .criterion(hasItem(ModBlocks.WHITE_SANDSTONE), conditionsFromItem(ModBlocks.WHITE_SANDSTONE))
                .offerTo(exporter, new Identifier("cut_white_sandstone"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WHITE_SANDSTONE, ModBlocks.WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_WHITE_SANDSTONE, ModBlocks.WHITE_SANDSTONE);

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WHITE_SANDSTONE_SLAB, ModBlocks.CUT_WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WHITE_SANDSTONE_SLAB, ModBlocks.CUT_WHITE_SANDSTONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WHITE_SANDSTONE_SLAB, ModBlocks.WHITE_SANDSTONE,2);

        createStairsRecipe(ModBlocks.WHITE_SANDSTONE_STAIRS, Ingredient.ofItems(ModBlocks.WHITE_SANDSTONE))
                .criterion(hasItem(ModBlocks.WHITE_SANDSTONE),conditionsFromItem(ModBlocks.WHITE_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_SANDSTONE_STAIRS, ModBlocks.WHITE_SANDSTONE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_SANDSTONE_SLAB, ModBlocks.WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_SANDSTONE_SLAB, ModBlocks.WHITE_SANDSTONE,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.WHITE_SANDSTONE_WALL, ModBlocks.WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.WHITE_SANDSTONE_WALL, ModBlocks.WHITE_SANDSTONE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_WHITE_SANDSTONE, ModBlocks.WHITE_SANDSTONE_SLAB);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModBlocks.WHITE_SANDSTONE), RecipeCategory.MISC, ModBlocks.SMOOTH_WHITE_SANDSTONE,0.7f, 200)
                .criterion(hasItem(ModBlocks.WHITE_SANDSTONE), conditionsFromItem(ModBlocks.WHITE_SANDSTONE))
                .offerTo(exporter, new Identifier("smooth_white_sandstone_from_smelting"));

        createStairsRecipe(ModBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_WHITE_SANDSTONE))
                .criterion(hasItem(ModBlocks.SMOOTH_WHITE_SANDSTONE),conditionsFromItem(ModBlocks.SMOOTH_WHITE_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS, ModBlocks.SMOOTH_WHITE_SANDSTONE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_WHITE_SANDSTONE_SLAB, ModBlocks.SMOOTH_WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_WHITE_SANDSTONE_SLAB, ModBlocks.SMOOTH_WHITE_SANDSTONE,2);



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_SANDSTONE)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.BLACK_SAND)
                .criterion(hasItem(ModBlocks.BLACK_SAND), conditionsFromItem(ModBlocks.BLACK_SAND))
                .offerTo(exporter, new Identifier("black_sandstone"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACK_SANDSTONE,4)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.BLACK_SANDSTONE)
                .criterion(hasItem(ModBlocks.BLACK_SANDSTONE), conditionsFromItem(ModBlocks.BLACK_SANDSTONE))
                .offerTo(exporter, new Identifier("cut_black_sandstone"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACK_SANDSTONE, ModBlocks.BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BLACK_SANDSTONE, ModBlocks.BLACK_SANDSTONE);

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACK_SANDSTONE_SLAB, ModBlocks.CUT_BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACK_SANDSTONE_SLAB, ModBlocks.CUT_BLACK_SANDSTONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACK_SANDSTONE_SLAB, ModBlocks.BLACK_SANDSTONE,2);

        createStairsRecipe(ModBlocks.BLACK_SANDSTONE_STAIRS, Ingredient.ofItems(ModBlocks.BLACK_SANDSTONE))
                .criterion(hasItem(ModBlocks.BLACK_SANDSTONE),conditionsFromItem(ModBlocks.BLACK_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_SANDSTONE_STAIRS, ModBlocks.BLACK_SANDSTONE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_SANDSTONE_SLAB, ModBlocks.BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_SANDSTONE_SLAB, ModBlocks.BLACK_SANDSTONE,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.BLACK_SANDSTONE_WALL, ModBlocks.BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.BLACK_SANDSTONE_WALL, ModBlocks.BLACK_SANDSTONE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BLACK_SANDSTONE, ModBlocks.BLACK_SANDSTONE_SLAB);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModBlocks.BLACK_SANDSTONE), RecipeCategory.MISC, ModBlocks.SMOOTH_BLACK_SANDSTONE,0.7f, 200)
                .criterion(hasItem(ModBlocks.BLACK_SANDSTONE), conditionsFromItem(ModBlocks.BLACK_SANDSTONE))
                .offerTo(exporter, new Identifier("smooth_black_sandstone_from_smelting"));

        createStairsRecipe(ModBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_BLACK_SANDSTONE))
                .criterion(hasItem(ModBlocks.SMOOTH_BLACK_SANDSTONE),conditionsFromItem(ModBlocks.SMOOTH_BLACK_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS, ModBlocks.SMOOTH_BLACK_SANDSTONE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BLACK_SANDSTONE_SLAB, ModBlocks.SMOOTH_BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BLACK_SANDSTONE_SLAB, ModBlocks.SMOOTH_BLACK_SANDSTONE,2);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModBlocks.TERRACOTTA_GOLD_ORE), RecipeCategory.MISC, Items.GOLD_INGOT,0.7f, 200)
                .criterion(hasItem(ModBlocks.TERRACOTTA_GOLD_ORE), conditionsFromItem(ModBlocks.TERRACOTTA_GOLD_ORE))
                .offerTo(exporter, new Identifier("iron_ingot_from_smelting_terracotta_gold_ore"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems
                        (ModBlocks.TERRACOTTA_GOLD_ORE), RecipeCategory.MISC, Items.GOLD_INGOT,0.7f, 100)
                .criterion(hasItem(ModBlocks.TERRACOTTA_GOLD_ORE), conditionsFromItem(ModBlocks.TERRACOTTA_GOLD_ORE))
                .offerTo(exporter, new Identifier("iron_ingot_from_blasting_terracotta_gold_ore"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModBlocks.GRAVEL_COAL_ORE), RecipeCategory.MISC, Items.COAL,0.7f, 200)
                .criterion(hasItem(ModBlocks.GRAVEL_COAL_ORE), conditionsFromItem(ModBlocks.GRAVEL_COAL_ORE))
                .offerTo(exporter, new Identifier("coal_from_smelting_gravel_coal_ore"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems
                        (ModBlocks.GRAVEL_COAL_ORE), RecipeCategory.MISC, Items.COAL,0.7f, 100)
                .criterion(hasItem(ModBlocks.GRAVEL_COAL_ORE), conditionsFromItem(ModBlocks.GRAVEL_COAL_ORE))
                .offerTo(exporter, new Identifier("coal_from_blasting_gravel_coal_ore"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModBlocks.DRIPSTONE_COPPER_ORE), RecipeCategory.MISC, Items.COPPER_INGOT,0.7f, 200)
                .criterion(hasItem(ModBlocks.DRIPSTONE_COPPER_ORE), conditionsFromItem(ModBlocks.DRIPSTONE_COPPER_ORE))
                .offerTo(exporter, new Identifier("copper_ingot_from_smelting_dripstone_copper_ore"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems
                        (ModBlocks.DRIPSTONE_COPPER_ORE), RecipeCategory.MISC, Items.COPPER_INGOT,0.7f, 100)
                .criterion(hasItem(ModBlocks.DRIPSTONE_COPPER_ORE), conditionsFromItem(ModBlocks.DRIPSTONE_COPPER_ORE))
                .offerTo(exporter, new Identifier("copper_ingot_from_blasting_dripstone_copper_ore"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModBlocks.TUFF_IRON_ORE), RecipeCategory.MISC, Items.IRON_INGOT,0.7f, 200)
                .criterion(hasItem(ModBlocks.TUFF_IRON_ORE), conditionsFromItem(ModBlocks.TUFF_IRON_ORE))
                .offerTo(exporter, new Identifier("iron_ingot_from_smelting_tuff_iron_ore"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems
                        (ModBlocks.TUFF_IRON_ORE), RecipeCategory.MISC, Items.IRON_INGOT,0.7f, 100)
                .criterion(hasItem(ModBlocks.TUFF_IRON_ORE), conditionsFromItem(ModBlocks.TUFF_IRON_ORE))
                .offerTo(exporter, new Identifier("iron_ingot_from_blasting_tuff_iron_ore"));
    }
}