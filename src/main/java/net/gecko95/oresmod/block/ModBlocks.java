package net.gecko95.oresmod.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.block.custom.DeepbarkSaplingBlock;
import net.gecko95.oresmod.block.custom.StonebarkSaplingBlock;
import net.gecko95.oresmod.world.ModConfiguredFeatures;
import net.gecko95.oresmod.world.tree.DeepbarkSaplingGenerator;
import net.gecko95.oresmod.world.tree.StonebarkSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block SALT_ORE = registerBlock("salt_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE)));
    public static final Block SALT_BLOCK = registerBlock("salt_block",
            new Block(FabricBlockSettings.create()
                    .strength(1.0f, 3.0f).sounds(BlockSoundGroup.PACKED_MUD)
                    .mapColor(MapColor.IRON_GRAY)));
    public static final Block RAW_SALT_BLOCK = registerBlock("raw_salt_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE)
                    .mapColor(MapColor.RAW_IRON_PINK).sounds(BlockSoundGroup.PACKED_MUD)));
    public static final Block FROSITE_ORE = registerBlock("frosite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block ICE_FROSITE_ORE = registerBlock("ice_frosite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)
                    .mapColor(MapColor.PALE_PURPLE).instrument(Instrument.CHIME).slipperiness(0.98f)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block FROSITE_BLOCK = registerBlock("frosite_block",
            new Block(FabricBlockSettings.create()
                    .strength(5.0f, 6.0f).sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.PALE_PURPLE).instrument(Instrument.CHIME)));
    public static final Block FROSITE_BRICKS = registerBlock("frosite_bricks",
            new Block(FabricBlockSettings.create()
                    .strength(5.0f, 6.0f).sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.PALE_PURPLE).instrument(Instrument.CHIME)));
    public static final Block FROSITE_TILES = registerBlock("frosite_tiles",
            new Block(FabricBlockSettings.create()
                    .strength(5.0f, 6.0f).sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.PALE_PURPLE).instrument(Instrument.CHIME)));

    public static final Block CHISELED_FROSITE = registerBlock("chiseled_frosite",
            new Block(FabricBlockSettings.copyOf(ModBlocks.FROSITE_BLOCK)));

    public static final Block FROSITE_BRICK_STAIRS = registerBlock("frosite_brick_stairs",
            new StairsBlock(ModBlocks.FROSITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.FROSITE_BRICKS)));
    public static final Block FROSITE_BRICK_SLAB = registerBlock("frosite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.FROSITE_BRICKS)));
    public static final Block FROSITE_BRICK_WALL = registerBlock("frosite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.FROSITE_BRICKS)));

    public static final Block FROSITE_TILE_STAIRS = registerBlock("frosite_tile_stairs",
            new StairsBlock(ModBlocks.FROSITE_TILES.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.FROSITE_TILES)));
    public static final Block FROSITE_TILE_SLAB = registerBlock("frosite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.FROSITE_TILES)));
    public static final Block FROSITE_TILE_WALL = registerBlock("frosite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.FROSITE_TILES)));

    public static final Block ALUMINUM_ORE = registerBlock("aluminum_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(2.5f, 2.5f)));
    public static final Block DEEPSLATE_ALUMINUM_ORE = registerBlock("deepslate_aluminum_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).strength(4.0f, 2.5f)));
    public static final Block ALUMINUM_BLOCK = registerBlock("aluminum_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.IRON_XYLOPHONE)
                    .requiresTool().strength(4.0f, 5.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BASEDRUM)
                    .requiresTool().strength(4.0f, 5.0f)));

    public static final Block ALUMINUM_DOOR = registerBlock("aluminum_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE_GRAY).
                    requiresTool().strength(4.0f).nonOpaque().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.IRON));
    public static final Block ALUMINUM_TRAPDOOR = registerBlock("aluminum_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE_GRAY).requiresTool()
                    .strength(4.0f).nonOpaque().allowsSpawning(Blocks::never), BlockSetType.IRON));
    public static final Block ALUMINUM_BARS = registerBlock("aluminum_bars",
            new PaneBlock(AbstractBlock.Settings.create().requiresTool().strength(4.0f, 5.0f)
                    .sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block ALUMINUM_PRESSURE_PLATE = registerBlock("aluminum_pressure_plate",
            new WeightedPressurePlateBlock(75, FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE),
                    BlockSetType.IRON));

    public static final Block NICKEL_ORE = registerBlock("nickel_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final Block NICKEL_BLOCK = registerBlock("nickel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.STONE_GRAY).instrument(Instrument.XYLOPHONE)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BASEDRUM)
                    .requiresTool()));
    public static final Block NICKEL_PRESSURE_PLATE = registerBlock("nickel_pressure_plate",
            new WeightedPressurePlateBlock(7, FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE),
                    BlockSetType.IRON));

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).requiresTool()
                    .strength(25.0f, 600.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block RAW_STEEL_BLOCK = registerBlock("raw_steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM)
                    .requiresTool()));

    public static final Block SMOOTH_STEEL_BLOCK = registerBlock("smooth_steel_block",
            new Block(FabricBlockSettings.copyOf(ModBlocks.STEEL_BLOCK)));
    public static final Block SMOOTH_STEEL_SLAB = registerBlock("smooth_steel_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.SMOOTH_STEEL_BLOCK)));

    public static final Block CUT_STEEL = registerBlock("cut_steel",
            new Block(FabricBlockSettings.copyOf(ModBlocks.STEEL_BLOCK)));
    public static final Block CUT_STEEL_STAIRS = registerBlock("cut_steel_stairs",
            new StairsBlock(ModBlocks.CUT_STEEL.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.CUT_STEEL)));
    public static final Block CUT_STEEL_SLAB = registerBlock("cut_steel_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.CUT_STEEL)));

    public static final Block STEEL_DOOR = registerBlock("steel_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).
                    requiresTool().strength(25.0f).nonOpaque().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.IRON));
    public static final Block STEEL_TRAPDOOR = registerBlock("steel_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).requiresTool()
                    .strength(25.0f).nonOpaque().allowsSpawning(Blocks::never), BlockSetType.IRON));
    public static final Block STEEL_BARS = registerBlock("steel_bars",
            new PaneBlock(AbstractBlock.Settings.create().requiresTool().strength(25.0f, 600.0f)
                    .sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block STEEL_PRESSURE_PLATE = registerBlock("steel_pressure_plate",
            new WeightedPressurePlateBlock(300, FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE),
                    BlockSetType.IRON));

    public static final Block STEEL_LAMP = registerBlock("steel_lamp",
            new Block(FabricBlockSettings.copyOf(ModBlocks.STEEL_BLOCK).luminance(state -> 15).solidBlock(Blocks::never)));

    public static final Block STONEBARK_LOG = registerBlock("stonebark_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM).mapColor(MapColor.STONE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block STONEBARK_WOOD = registerBlock("stonebark_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE).mapColor(MapColor.STONE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block STRIPPED_STONEBARK_LOG = registerBlock("stripped_stonebark_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).mapColor(MapColor.STONE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block STRIPPED_STONEBARK_WOOD = registerBlock("stripped_stonebark_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_HYPHAE).mapColor(MapColor.STONE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STONEBARK_PLANKS = registerBlock("stonebark_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.STONE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block STONEBARK_LEAVES = registerBlock("stonebark_leaves",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).mapColor(MapColor.LIGHT_BLUE_GRAY)));



    public static final Block DEEPSLATE_LOG = registerBlock("deepslate_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM).mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 6.0f)
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DEEPSLATE_WOOD = registerBlock("deepslate_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE).mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 6.0f)
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block STRIPPED_DEEPSLATE_LOG = registerBlock("stripped_deepslate_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 6.0f)
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block STRIPPED_DEEPSLATE_WOOD = registerBlock("stripped_deepslate_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_HYPHAE).mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block DEEPSLATE_PLANKS = registerBlock("deepslate_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DEEPSLATE_LEAVES = registerBlock("deepslate_leaves",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).mapColor(MapColor.DARK_RED)));

    public static final Block STONEBARK_STAIRS = registerBlock("stonebark_stairs",
            new StairsBlock(ModBlocks.STONEBARK_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.STONEBARK_PLANKS)));
    public static final Block STONEBARK_SLAB = registerBlock("stonebark_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.STONEBARK_PLANKS)));
    public static final Block STONEBARK_FENCE = registerBlock("stonebark_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.STONEBARK_PLANKS)));
    public static final Block STONEBARK_FENCE_GATE = registerBlock("stonebark_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.STONEBARK_PLANKS),WoodType.OAK));
    public static final Block STONEBARK_BUTTON = registerBlock("stonebark_button",
            new ButtonBlock(FabricBlockSettings.copyOf(ModBlocks.STONEBARK_PLANKS), BlockSetType.STONE, 10,false));
    public static final Block STONEBARK_PRESSURE_PLATE = registerBlock("stonebark_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(ModBlocks.STONEBARK_PLANKS), BlockSetType.STONE));
    public static final Block STONEBARK_DOOR = registerBlock("stonebark_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONEBARK_PLANKS).requiresTool()
                    .nonOpaque().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.STONE));
    public static final Block STONEBARK_TRAPDOOR = registerBlock("stonebark_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.STONEBARK_PLANKS).requiresTool()
                    .nonOpaque().allowsSpawning(Blocks::never), BlockSetType.STONE));

    public static Identifier STONEBARK_SIGN_TEXTURE = new Identifier(OresMod.MOD_ID, "entity/signs/stonebark");
    public static Identifier STONEBARK_HANDING_SIGN_TEXTURE = new Identifier(OresMod.MOD_ID, "entity/signs/hanging/stonebark");
    public static Identifier STONEBARK_HANDING_GUI_SIGN_TEXTURE = new Identifier(OresMod.MOD_ID, "textures/gui/hanging_signs/stonebark");

    public static final Block STANDING_STONEBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "stonebark_standing_sign"), new TerraformSignBlock(STONEBARK_SIGN_TEXTURE,
            FabricBlockSettings.copyOf(Blocks.CRIMSON_SIGN).sounds(BlockSoundGroup.STONE).requiresTool()));
    public static final Block WALL_STONEBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "stonebark_wall_sign"), new TerraformWallSignBlock(STONEBARK_SIGN_TEXTURE,
            FabricBlockSettings.copyOf(ModBlocks.STANDING_STONEBARK_SIGN).sounds(BlockSoundGroup.STONE).requiresTool()));
    public static final Block HANGING_STONEBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "stonebark_hanging_sign"), new TerraformHangingSignBlock(STONEBARK_HANDING_SIGN_TEXTURE,
            STONEBARK_HANDING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CRIMSON_HANGING_SIGN).sounds(BlockSoundGroup.STONE).requiresTool()));
    public static final Block WALL_HANGING_STONEBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "stonebark_wall_hanging_sign"), new TerraformWallHangingSignBlock(STONEBARK_HANDING_SIGN_TEXTURE,
            STONEBARK_HANDING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(ModBlocks.HANGING_STONEBARK_SIGN).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final BlockFamily STONEBARK_FAMILY = BlockFamilies.register(ModBlocks.STONEBARK_PLANKS)
            .sign(ModBlocks.STANDING_STONEBARK_SIGN, ModBlocks.WALL_STONEBARK_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final Block DEEPBARK_STAIRS = registerBlock("deepbark_stairs",
            new StairsBlock(ModBlocks.DEEPSLATE_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PLANKS)));
    public static final Block DEEPBARK_SLAB = registerBlock("deepbark_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PLANKS)));
    public static final Block DEEPBARK_FENCE = registerBlock("deepbark_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PLANKS)));
    public static final Block DEEPBARK_FENCE_GATE = registerBlock("deepbark_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PLANKS),WoodType.OAK));
    public static final Block DEEPBARK_BUTTON = registerBlock("deepbark_button",
            new ButtonBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PLANKS), BlockSetType.STONE, 10,false));
    public static final Block DEEPBARK_PRESSURE_PLATE = registerBlock("deepbark_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PLANKS), BlockSetType.STONE));
    public static final Block DEEPBARK_DOOR = registerBlock("deepbark_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PLANKS).requiresTool()
                    .nonOpaque().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.STONE));
    public static final Block DEEPBARK_TRAPDOOR = registerBlock("deepbark_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PLANKS).requiresTool()
                    .nonOpaque().allowsSpawning(Blocks::never), BlockSetType.STONE));
    public static Identifier DEEPBARK_SIGN_TEXTURE = new Identifier(OresMod.MOD_ID, "entity/signs/deepbark");
    public static Identifier DEEPBARK_HANDING_SIGN_TEXTURE = new Identifier(OresMod.MOD_ID, "entity/signs/hanging/deepbark");
    public static Identifier DEEPBARK_HANDING_GUI_SIGN_TEXTURE = new Identifier(OresMod.MOD_ID, "textures/gui/hanging_signs/deepbark");
    public static final Block STANDING_DEEPBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "deepbark_standing_sign"), new TerraformSignBlock(DEEPBARK_SIGN_TEXTURE,
            FabricBlockSettings.copyOf(Blocks.CRIMSON_SIGN).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block WALL_DEEPBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
                "deepbark_wall_sign"), new TerraformWallSignBlock(DEEPBARK_SIGN_TEXTURE,
            FabricBlockSettings.copyOf(ModBlocks.STANDING_DEEPBARK_SIGN).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block HANGING_DEEPBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
                    "deepbark_hanging_sign"), new TerraformHangingSignBlock(DEEPBARK_HANDING_SIGN_TEXTURE,
            DEEPBARK_HANDING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CRIMSON_HANGING_SIGN).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block WALL_HANGING_DEEPBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "deepbark_wall_hanging_sign"), new TerraformWallHangingSignBlock(DEEPBARK_HANDING_SIGN_TEXTURE,
            DEEPBARK_HANDING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(ModBlocks.HANGING_DEEPBARK_SIGN).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));

    public static final BlockFamily DEEPBARK_FAMILY = BlockFamilies.register(ModBlocks.DEEPSLATE_PLANKS)
            .sign(ModBlocks.STANDING_DEEPBARK_SIGN, ModBlocks.WALL_DEEPBARK_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final Block STONEBARK_SAPLING = registerBlock("stonebark_sapling",
            new StonebarkSaplingBlock(new StonebarkSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_STONEBARK_SAPLING = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "potted_stonebark_sapling"), new FlowerPotBlock(STONEBARK_SAPLING,
            FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));


    public static final Block DEEPBARK_SAPLING = registerBlock("deepbark_sapling",
            new DeepbarkSaplingBlock(new DeepbarkSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_DEEPBARK_SAPLING = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "potted_deepbark_sapling"), new FlowerPotBlock(DEEPBARK_SAPLING,
            FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));

    public static final Block DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.PALE_YELLOW).instrument(Instrument.XYLOPHONE)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM)
                    .requiresTool()));
    public static final Block NETHER_TUNGSTEN_ORE = registerBlock("nether_tungsten_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE).sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.XYLOPHONE)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block TITANIUM_ALLOY_BLOCK = registerBlock("titanium_alloy_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.XYLOPHONE)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block NETHER_COBALT_ORE = registerBlock("nether_cobalt_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE).sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block COBALT_BLOCK = registerBlock("cobalt_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.BLUE).instrument(Instrument.XYLOPHONE)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block WHITE_SAND = registerBlock("white_sand",
            new GravelBlock(FabricBlockSettings.copyOf(Blocks.SAND).mapColor(MapColor.WHITE)));
    public static final Block SUSPICIOUS_WHITE_SAND = registerBlock("suspicious_white_sand",
            new GravelBlock(FabricBlockSettings.copyOf(ModBlocks.WHITE_SAND)));
    public static final Block WHITE_SANDSTONE = registerBlock("white_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.WHITE)));
    public static final Block WHITE_SANDSTONE_STAIRS = registerBlock("white_sandstone_stairs",
            new StairsBlock(ModBlocks.WHITE_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.WHITE_SANDSTONE)));
    public static final Block WHITE_SANDSTONE_SLAB = registerBlock("white_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.WHITE_SANDSTONE)));
    public static final Block WHITE_SANDSTONE_WALL = registerBlock("white_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.WHITE_SANDSTONE)));
    public static final Block WHITE_SANDSTONE_TEXTURE = registerBlock("white_sandstone_texture",
            new Block(FabricBlockSettings.copyOf(ModBlocks.WHITE_SANDSTONE)));
    public static final Block CUT_WHITE_SANDSTONE = registerBlock("cut_white_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).mapColor(MapColor.WHITE)));
    public static final Block CUT_WHITE_SANDSTONE_SLAB = registerBlock("cut_white_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.CUT_WHITE_SANDSTONE)));
    public static final Block SMOOTH_WHITE_SANDSTONE = registerBlock("smooth_white_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).mapColor(MapColor.WHITE)));
    public static final Block SMOOTH_WHITE_SANDSTONE_STAIRS = registerBlock("smooth_white_sandstone_stairs",
            new StairsBlock(ModBlocks.SMOOTH_WHITE_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.SMOOTH_WHITE_SANDSTONE)));
    public static final Block SMOOTH_WHITE_SANDSTONE_SLAB = registerBlock("smooth_white_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.SMOOTH_WHITE_SANDSTONE)));
    public static final Block CHISELED_WHITE_SANDSTONE = registerBlock("chiseled_white_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE).mapColor(MapColor.WHITE)));

    public static final Block BLACK_SAND = registerBlock("black_sand",
            new GravelBlock(FabricBlockSettings.copyOf(Blocks.SAND).mapColor(MapColor.BLACK)));
    public static final Block BLACK_SANDSTONE = registerBlock("black_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.BLACK)));
    public static final Block BLACK_SANDSTONE_STAIRS = registerBlock("black_sandstone_stairs",
            new StairsBlock(ModBlocks.BLACK_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.BLACK_SANDSTONE)));
    public static final Block BLACK_SANDSTONE_SLAB = registerBlock("black_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.BLACK_SANDSTONE)));
    public static final Block BLACK_SANDSTONE_WALL = registerBlock("black_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.BLACK_SANDSTONE)));
    public static final Block BLACK_SANDSTONE_TEXTURE = registerBlock("black_sandstone_texture",
            new Block(FabricBlockSettings.copyOf(ModBlocks.BLACK_SANDSTONE)));
    public static final Block CUT_BLACK_SANDSTONE = registerBlock("cut_black_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).mapColor(MapColor.BLACK)));
    public static final Block CUT_BLACK_SANDSTONE_SLAB = registerBlock("cut_black_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.CUT_BLACK_SANDSTONE)));
    public static final Block SMOOTH_BLACK_SANDSTONE = registerBlock("smooth_black_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).mapColor(MapColor.BLACK)));
    public static final Block SMOOTH_BLACK_SANDSTONE_STAIRS = registerBlock("smooth_black_sandstone_stairs",
            new StairsBlock(ModBlocks.SMOOTH_BLACK_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.SMOOTH_BLACK_SANDSTONE)));
    public static final Block SMOOTH_BLACK_SANDSTONE_SLAB = registerBlock("smooth_black_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.SMOOTH_BLACK_SANDSTONE)));
    public static final Block CHISELED_BLACK_SANDSTONE = registerBlock("chiseled_black_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE).mapColor(MapColor.BLACK)));

    public static final Block TERRACOTTA_GOLD_ORE = registerBlock("terracotta_gold_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE).mapColor(MapColor.ORANGE)
                    .instrument(Instrument.BASEDRUM).strength(1.25f, 4.2f)));
    public static final Block GRAVEL_COAL_ORE = registerBlock("gravel_coal_ore",
            new GravelBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE).mapColor(MapColor.STONE_GRAY)
                    .instrument(Instrument.SNARE).strength(0.6f).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block DRIPSTONE_COPPER_ORE = registerBlock("dripstone_copper_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE).mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(Instrument.BASEDRUM).strength(1.5f, 1.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block TUFF_IRON_ORE = registerBlock("tuff_iron_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(Instrument.BASEDRUM).strength(1.5f, 6.0f).sounds(BlockSoundGroup.TUFF)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OresMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        OresMod.LOGGER.info("Registering ModBlocks for " + OresMod.MOD_ID);
    }
}
