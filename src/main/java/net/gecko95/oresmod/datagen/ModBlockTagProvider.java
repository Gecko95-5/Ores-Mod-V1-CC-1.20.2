package net.gecko95.oresmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ModTags.Blocks.DRILL_MINEABLE)
                .forceAddTag(BlockTags.PICKAXE_MINEABLE)
                .forceAddTag(BlockTags.SHOVEL_MINEABLE);

        getOrCreateTagBuilder(ModTags.Blocks.CHAINSAW_MINEABLE)
                .forceAddTag(BlockTags.AXE_MINEABLE)
                .forceAddTag(BlockTags.HOE_MINEABLE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SALT_ORE)
                .add(ModBlocks.RAW_SALT_BLOCK)
                .add(ModBlocks.FROSITE_ORE)
                .add(ModBlocks.ICE_FROSITE_ORE)
                .add(ModBlocks.FROSITE_BLOCK)
                .add(ModBlocks.FROSITE_BRICKS)
                .add(ModBlocks.FROSITE_BRICK_STAIRS)
                .add(ModBlocks.FROSITE_BRICK_SLAB)
                .add(ModBlocks.FROSITE_BRICK_WALL)
                .add(ModBlocks.FROSITE_TILES)
                .add(ModBlocks.FROSITE_TILE_STAIRS)
                .add(ModBlocks.FROSITE_TILE_SLAB)
                .add(ModBlocks.FROSITE_TILE_WALL)
                .add(ModBlocks.CHISELED_FROSITE)
                .add(ModBlocks.ALUMINUM_BLOCK)
                .add(ModBlocks.RAW_ALUMINUM_BLOCK)
                .add(ModBlocks.ALUMINUM_ORE)
                .add(ModBlocks.DEEPSLATE_ALUMINUM_ORE)
                .add(ModBlocks.ALUMINUM_DOOR)
                .add(ModBlocks.ALUMINUM_TRAPDOOR)
                .add(ModBlocks.ALUMINUM_BARS)
                .add(ModBlocks.ALUMINUM_PRESSURE_PLATE)
                .add(ModBlocks.NICKEL_BLOCK)
                .add(ModBlocks.RAW_NICKEL_BLOCK)
                .add(ModBlocks.NICKEL_ORE)
                .add(ModBlocks.DEEPSLATE_NICKEL_ORE)
                .add(ModBlocks.STEEL_BLOCK)
                .add(ModBlocks.RAW_STEEL_BLOCK)
                .add(ModBlocks.SMOOTH_STEEL_BLOCK)
                .add(ModBlocks.CUT_STEEL)
                .add(ModBlocks.SMOOTH_STEEL_SLAB)
                .add(ModBlocks.CUT_STEEL_STAIRS)
                .add(ModBlocks.CUT_STEEL_SLAB)
                .add(ModBlocks.STEEL_DOOR)
                .add(ModBlocks.STEEL_TRAPDOOR)
                .add(ModBlocks.STEEL_BARS)
                .add(ModBlocks.STEEL_PRESSURE_PLATE)
                .add(ModBlocks.NICKEL_PRESSURE_PLATE)
                .add(ModBlocks.STEEL_LAMP)
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ModBlocks.TITANIUM_BLOCK)
                .add(ModBlocks.RAW_TITANIUM_BLOCK)
                .add(ModBlocks.NETHER_TUNGSTEN_ORE)
                .add(ModBlocks.TUNGSTEN_BLOCK)
                .add(ModBlocks.TITANIUM_ALLOY_BLOCK)
                .add(ModBlocks.NETHER_COBALT_ORE)
                .add(ModBlocks.COBALT_BLOCK)
                .add(ModBlocks.WHITE_SANDSTONE)
                .add(ModBlocks.WHITE_SANDSTONE_STAIRS)
                .add(ModBlocks.WHITE_SANDSTONE_SLAB)
                .add(ModBlocks.WHITE_SANDSTONE_WALL)
                .add(ModBlocks.CUT_WHITE_SANDSTONE)
                .add(ModBlocks.CUT_WHITE_SANDSTONE_SLAB)
                .add(ModBlocks.SMOOTH_WHITE_SANDSTONE)
                .add(ModBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS)
                .add(ModBlocks.SMOOTH_WHITE_SANDSTONE_SLAB)
                .add(ModBlocks.CHISELED_WHITE_SANDSTONE)
                .add(ModBlocks.BLACK_SANDSTONE)
                .add(ModBlocks.BLACK_SANDSTONE_STAIRS)
                .add(ModBlocks.BLACK_SANDSTONE_SLAB)
                .add(ModBlocks.BLACK_SANDSTONE_WALL)
                .add(ModBlocks.CUT_BLACK_SANDSTONE)
                .add(ModBlocks.CUT_BLACK_SANDSTONE_SLAB)
                .add(ModBlocks.SMOOTH_BLACK_SANDSTONE)
                .add(ModBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS)
                .add(ModBlocks.SMOOTH_BLACK_SANDSTONE_SLAB)
                .add(ModBlocks.CHISELED_BLACK_SANDSTONE)
                .add(ModBlocks.TERRACOTTA_GOLD_ORE)
                .add(ModBlocks.DRIPSTONE_COPPER_ORE)
                .add(ModBlocks.TUFF_IRON_ORE);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.SALT_BLOCK)
                .add(ModBlocks.STONEBARK_LEAVES)
                .add(ModBlocks.DEEPSLATE_LEAVES);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.STONEBARK_PLANKS)
                .add(ModBlocks.STONEBARK_LOG)
                .add(ModBlocks.STONEBARK_WOOD)
                .add(ModBlocks.STRIPPED_STONEBARK_LOG)
                .add(ModBlocks.STRIPPED_STONEBARK_WOOD)
                .add(ModBlocks.STONEBARK_SLAB)
                .add(ModBlocks.STONEBARK_STAIRS)
                .add(ModBlocks.STONEBARK_FENCE)
                .add(ModBlocks.STONEBARK_FENCE_GATE)
                .add(ModBlocks.STONEBARK_BUTTON)
                .add(ModBlocks.STONEBARK_PRESSURE_PLATE)
                .add(ModBlocks.STONEBARK_DOOR)
                .add(ModBlocks.STONEBARK_TRAPDOOR)
                .add(ModBlocks.STANDING_STONEBARK_SIGN)
                .add(ModBlocks.WALL_STONEBARK_SIGN)
                .add(ModBlocks.HANGING_STONEBARK_SIGN)
                .add(ModBlocks.WALL_HANGING_STONEBARK_SIGN)
                .add(ModBlocks.DEEPSLATE_PLANKS)
                .add(ModBlocks.DEEPSLATE_LOG)
                .add(ModBlocks.DEEPSLATE_WOOD)
                .add(ModBlocks.STRIPPED_DEEPSLATE_LOG)
                .add(ModBlocks.STRIPPED_DEEPSLATE_WOOD)
                .add(ModBlocks.DEEPBARK_SLAB)
                .add(ModBlocks.DEEPBARK_STAIRS)
                .add(ModBlocks.DEEPBARK_FENCE)
                .add(ModBlocks.DEEPBARK_FENCE_GATE)
                .add(ModBlocks.DEEPBARK_BUTTON)
                .add(ModBlocks.DEEPBARK_PRESSURE_PLATE)
                .add(ModBlocks.DEEPBARK_DOOR)
                .add(ModBlocks.DEEPBARK_TRAPDOOR)
                .add(ModBlocks.STANDING_DEEPBARK_SIGN)
                .add(ModBlocks.WALL_DEEPBARK_SIGN)
                .add(ModBlocks.HANGING_DEEPBARK_SIGN)
                .add(ModBlocks.WALL_HANGING_DEEPBARK_SIGN);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.WHITE_SAND)
                .add(ModBlocks.GRAVEL_COAL_ORE)
                .add(ModBlocks.SUSPICIOUS_WHITE_SAND)
                .add(ModBlocks.BLACK_SAND);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.ALUMINUM_BLOCK)
                .add(ModBlocks.RAW_ALUMINUM_BLOCK)
                .add(ModBlocks.ALUMINUM_ORE)
                .add(ModBlocks.DEEPSLATE_ALUMINUM_ORE)
                .add(ModBlocks.ALUMINUM_DOOR)
                .add(ModBlocks.ALUMINUM_TRAPDOOR)
                .add(ModBlocks.ALUMINUM_BARS)
                .add(ModBlocks.ALUMINUM_PRESSURE_PLATE)
                .add(ModBlocks.NICKEL_BLOCK)
                .add(ModBlocks.RAW_NICKEL_BLOCK)
                .add(ModBlocks.NICKEL_PRESSURE_PLATE)
                .add(ModBlocks.NICKEL_ORE)
                .add(ModBlocks.DEEPSLATE_NICKEL_ORE)
                .add(ModBlocks.DRIPSTONE_COPPER_ORE)
                .add(ModBlocks.TUFF_IRON_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.FROSITE_ORE)
                .add(ModBlocks.ICE_FROSITE_ORE)
                .add(ModBlocks.FROSITE_BLOCK)
                .add(ModBlocks.FROSITE_BRICKS)
                .add(ModBlocks.FROSITE_BRICK_STAIRS)
                .add(ModBlocks.FROSITE_BRICK_SLAB)
                .add(ModBlocks.FROSITE_BRICK_WALL)
                .add(ModBlocks.FROSITE_TILES)
                .add(ModBlocks.FROSITE_TILE_STAIRS)
                .add(ModBlocks.FROSITE_TILE_SLAB)
                .add(ModBlocks.FROSITE_TILE_WALL)
                .add(ModBlocks.CHISELED_FROSITE)
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ModBlocks.TITANIUM_BLOCK)
                .add(ModBlocks.RAW_TITANIUM_BLOCK)
                .add(ModBlocks.NETHER_TUNGSTEN_ORE)
                .add(ModBlocks.TUNGSTEN_BLOCK)
                .add(ModBlocks.NETHER_COBALT_ORE)
                .add(ModBlocks.COBALT_BLOCK)
                .add(ModBlocks.TERRACOTTA_GOLD_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.STEEL_BLOCK)
                .add(ModBlocks.RAW_STEEL_BLOCK)
                .add(ModBlocks.SMOOTH_STEEL_BLOCK)
                .add(ModBlocks.CUT_STEEL)
                .add(ModBlocks.SMOOTH_STEEL_SLAB)
                .add(ModBlocks.CUT_STEEL_STAIRS)
                .add(ModBlocks.CUT_STEEL_SLAB)
                .add(ModBlocks.STEEL_DOOR)
                .add(ModBlocks.STEEL_TRAPDOOR)
                .add(ModBlocks.STEEL_BARS)
                .add(ModBlocks.STEEL_PRESSURE_PLATE)
                .add(ModBlocks.STEEL_LAMP)
                .add(ModBlocks.TITANIUM_ALLOY_BLOCK);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.FROSITE_BRICK_WALL)
                .add(ModBlocks.FROSITE_TILE_WALL)
                .add(ModBlocks.WHITE_SANDSTONE_WALL)
                .add(ModBlocks.BLACK_SANDSTONE_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.STONEBARK_FENCE)
                .add(ModBlocks.DEEPBARK_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.STONEBARK_FENCE_GATE)
                .add(ModBlocks.DEEPBARK_FENCE_GATE);

        getOrCreateTagBuilder(ModTags.Blocks.STONEBARK_PLACEABLE)
                .add(Blocks.STONE)
                .add(Blocks.DIORITE)
                .add(Blocks.ANDESITE)
                .add(Blocks.GRANITE)
                .add(Blocks.COBBLESTONE)
                .add(Blocks.MOSSY_COBBLESTONE)
                .add(Blocks.MOSS_BLOCK)
                .add(Blocks.DRIPSTONE_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.DEEPBARK_PLACEABLE)
                .add(Blocks.DEEPSLATE)
                .add(Blocks.COBBLED_DEEPSLATE)
                .add(Blocks.TUFF)
                .add(Blocks.SCULK)
                .add(Blocks.DRIPSTONE_BLOCK);

        getOrCreateTagBuilder(BlockTags.SAND)
                .add(ModBlocks.WHITE_SAND)
                .add(ModBlocks.BLACK_SAND);
    }
}
