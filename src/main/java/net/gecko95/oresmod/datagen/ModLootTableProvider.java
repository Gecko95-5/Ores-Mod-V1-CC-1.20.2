package net.gecko95.oresmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RAW_SALT_BLOCK);
        addDrop(ModBlocks.FROSITE_BLOCK);
        addDrop(ModBlocks.FROSITE_BRICKS);
        addDrop(ModBlocks.FROSITE_BRICK_STAIRS);
        addDrop(ModBlocks.FROSITE_BRICK_WALL);
        addDrop(ModBlocks.FROSITE_TILES);
        addDrop(ModBlocks.FROSITE_TILE_STAIRS);
        addDrop(ModBlocks.FROSITE_TILE_WALL);
        addDrop(ModBlocks.CHISELED_FROSITE);
        addDrop(ModBlocks.RAW_ALUMINUM_BLOCK);
        addDrop(ModBlocks.ALUMINUM_BLOCK);
        addDrop(ModBlocks.ALUMINUM_TRAPDOOR);
        addDrop(ModBlocks.ALUMINUM_BARS);
        addDrop(ModBlocks.ALUMINUM_PRESSURE_PLATE);
        addDrop(ModBlocks.RAW_NICKEL_BLOCK);
        addDrop(ModBlocks.NICKEL_BLOCK);
        addDrop(ModBlocks.STEEL_BLOCK);
        addDrop(ModBlocks.RAW_STEEL_BLOCK);
        addDrop(ModBlocks.SMOOTH_STEEL_BLOCK);
        addDrop(ModBlocks.CUT_STEEL);
        addDrop(ModBlocks.CUT_STEEL_STAIRS);
        addDrop(ModBlocks.STEEL_TRAPDOOR);
        addDrop(ModBlocks.STEEL_BARS);
        addDrop(ModBlocks.STEEL_PRESSURE_PLATE);
        addDrop(ModBlocks.STEEL_LAMP);
        addDrop(ModBlocks.STONEBARK_LOG);
        addDrop(ModBlocks.STONEBARK_WOOD);
        addDrop(ModBlocks.STRIPPED_STONEBARK_LOG);
        addDrop(ModBlocks.STRIPPED_STONEBARK_WOOD);
        addDrop(ModBlocks.STONEBARK_PLANKS);
        addDrop(ModBlocks.DEEPSLATE_LOG);
        addDrop(ModBlocks.DEEPSLATE_WOOD);
        addDrop(ModBlocks.STRIPPED_DEEPSLATE_LOG);
        addDrop(ModBlocks.STRIPPED_DEEPSLATE_WOOD);
        addDrop(ModBlocks.DEEPSLATE_PLANKS);
        addDrop(ModBlocks.STONEBARK_STAIRS);
        addDrop(ModBlocks.STONEBARK_FENCE);
        addDrop(ModBlocks.STONEBARK_FENCE_GATE);
        addDrop(ModBlocks.STONEBARK_BUTTON);
        addDrop(ModBlocks.STONEBARK_PRESSURE_PLATE);
        addDrop(ModBlocks.STONEBARK_TRAPDOOR);
        addDrop(ModBlocks.DEEPBARK_STAIRS);
        addDrop(ModBlocks.DEEPBARK_FENCE);
        addDrop(ModBlocks.DEEPBARK_FENCE_GATE);
        addDrop(ModBlocks.DEEPBARK_BUTTON);
        addDrop(ModBlocks.DEEPBARK_PRESSURE_PLATE);
        addDrop(ModBlocks.NICKEL_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPBARK_TRAPDOOR);
        addDrop(ModBlocks.STONEBARK_SAPLING);
        addDrop(ModBlocks.DEEPBARK_SAPLING);
        addDrop(ModBlocks.RAW_TITANIUM_BLOCK);
        addDrop(ModBlocks.TITANIUM_BLOCK);
        addDrop(ModBlocks.TUNGSTEN_BLOCK);
        addDrop(ModBlocks.TITANIUM_ALLOY_BLOCK);
        addDrop(ModBlocks.COBALT_BLOCK);
        addDrop(ModBlocks.WHITE_SAND);
        addDrop(ModBlocks.WHITE_SANDSTONE);
        addDrop(ModBlocks.WHITE_SANDSTONE_STAIRS);
        addDrop(ModBlocks.WHITE_SANDSTONE_WALL);
        addDrop(ModBlocks.CUT_WHITE_SANDSTONE);
        addDrop(ModBlocks.SMOOTH_WHITE_SANDSTONE);
        addDrop(ModBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS);
        addDrop(ModBlocks.CHISELED_WHITE_SANDSTONE);
        addDrop(ModBlocks.BLACK_SAND);
        addDrop(ModBlocks.BLACK_SANDSTONE);
        addDrop(ModBlocks.BLACK_SANDSTONE_STAIRS);
        addDrop(ModBlocks.BLACK_SANDSTONE_WALL);
        addDrop(ModBlocks.CUT_BLACK_SANDSTONE);
        addDrop(ModBlocks.SMOOTH_BLACK_SANDSTONE);
        addDrop(ModBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS);
        addDrop(ModBlocks.CHISELED_BLACK_SANDSTONE);

        addDrop(ModBlocks.SALT_ORE,copperLikeOreDrops(ModBlocks.SALT_ORE, ModItems.RAW_SALT));

        addDrop(ModBlocks.FROSITE_ORE,oreDrops(ModBlocks.FROSITE_ORE, ModItems.FROSITE));

        addDrop(ModBlocks.ALUMINUM_ORE,oreDrops(ModBlocks.ALUMINUM_ORE, ModItems.RAW_ALUMINUM));
        addDrop(ModBlocks.DEEPSLATE_ALUMINUM_ORE,oreDrops(ModBlocks.DEEPSLATE_ALUMINUM_ORE, ModItems.RAW_ALUMINUM));

        addDrop(ModBlocks.NICKEL_ORE,oreDrops(ModBlocks.NICKEL_ORE, ModItems.RAW_NICKEL));
        addDrop(ModBlocks.DEEPSLATE_NICKEL_ORE,oreDrops(ModBlocks.DEEPSLATE_NICKEL_ORE, ModItems.RAW_NICKEL));

        addDrop(ModBlocks.ICE_FROSITE_ORE,iceOreDrops(ModBlocks.ICE_FROSITE_ORE, ModItems.FROSITE));

        addDrop(ModBlocks.DEEPSLATE_TITANIUM_ORE,oreDrops(ModBlocks.DEEPSLATE_TITANIUM_ORE, ModItems.RAW_TITANIUM));

        addDrop(ModBlocks.TERRACOTTA_GOLD_ORE,oreDrops(ModBlocks.TERRACOTTA_GOLD_ORE, Items.RAW_GOLD));
        addDrop(ModBlocks.GRAVEL_COAL_ORE,oreDrops(ModBlocks.GRAVEL_COAL_ORE, Items.COAL));
        addDrop(ModBlocks.DRIPSTONE_COPPER_ORE,oreDrops(ModBlocks.DRIPSTONE_COPPER_ORE, Items.RAW_COPPER));
        addDrop(ModBlocks.TUFF_IRON_ORE,oreDrops(ModBlocks.TUFF_IRON_ORE, Items.RAW_IRON));

        addDrop(ModBlocks.NETHER_TUNGSTEN_ORE,copperLikeOreDrops(ModBlocks.NETHER_TUNGSTEN_ORE, ModItems.TUNGSTEN_NUGGET));

        addDrop(ModBlocks.NETHER_COBALT_ORE,nuggetLikeOreDrops(ModBlocks.NETHER_COBALT_ORE, ModItems.COBALT_NUGGET));

        addDrop(ModBlocks.SUSPICIOUS_WHITE_SAND,saltBlockDrops(ModBlocks.SUSPICIOUS_WHITE_SAND));

        addDrop(ModBlocks.SALT_BLOCK,saltBlockDrops(ModBlocks.SALT_BLOCK));

        addDrop(ModBlocks.FROSITE_BRICK_SLAB, slabDrops(ModBlocks.FROSITE_BRICK_SLAB));
        addDrop(ModBlocks.FROSITE_TILE_SLAB, slabDrops(ModBlocks.FROSITE_TILE_SLAB));

        addDrop(ModBlocks.SMOOTH_STEEL_BLOCK, slabDrops(ModBlocks.SMOOTH_STEEL_SLAB));
        addDrop(ModBlocks.CUT_STEEL_SLAB, slabDrops(ModBlocks.CUT_STEEL_SLAB));

        addDrop(ModBlocks.STONEBARK_SLAB, slabDrops(ModBlocks.STONEBARK_SLAB));
        addDrop(ModBlocks.DEEPBARK_SLAB, slabDrops(ModBlocks.DEEPBARK_SLAB));

        addDrop(ModBlocks.WHITE_SANDSTONE_SLAB, slabDrops(ModBlocks.WHITE_SANDSTONE_SLAB));
        addDrop(ModBlocks.CUT_WHITE_SANDSTONE_SLAB, slabDrops(ModBlocks.CUT_WHITE_SANDSTONE_SLAB));
        addDrop(ModBlocks.SMOOTH_WHITE_SANDSTONE_SLAB, slabDrops(ModBlocks.SMOOTH_WHITE_SANDSTONE_SLAB));

        addDrop(ModBlocks.BLACK_SANDSTONE_SLAB, slabDrops(ModBlocks.BLACK_SANDSTONE_SLAB));
        addDrop(ModBlocks.CUT_BLACK_SANDSTONE_SLAB, slabDrops(ModBlocks.CUT_BLACK_SANDSTONE_SLAB));
        addDrop(ModBlocks.SMOOTH_BLACK_SANDSTONE_SLAB, slabDrops(ModBlocks.SMOOTH_BLACK_SANDSTONE_SLAB));

        addDrop(ModBlocks.ALUMINUM_DOOR, doorDrops(ModBlocks.ALUMINUM_DOOR));
        addDrop(ModBlocks.STEEL_DOOR, doorDrops(ModBlocks.STEEL_DOOR));
        addDrop(ModBlocks.STONEBARK_DOOR, doorDrops(ModBlocks.STONEBARK_DOOR));
        addDrop(ModBlocks.DEEPBARK_DOOR, doorDrops(ModBlocks.DEEPBARK_DOOR));

        addDrop(ModBlocks.STONEBARK_LEAVES, leavesDrops(ModBlocks.STONEBARK_LEAVES, ModBlocks.STONEBARK_SAPLING, 0.025f));
        addDrop(ModBlocks.DEEPSLATE_LEAVES, leavesDrops(ModBlocks.DEEPSLATE_LEAVES, ModBlocks.DEEPBARK_SAPLING, 0.025f));

        addPottedPlantDrops(ModBlocks.POTTED_STONEBARK_SAPLING);
        addPottedPlantDrops(ModBlocks.POTTED_DEEPBARK_SAPLING);
    }
    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }

    public LootTable.Builder nuggetLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(4.0f, 9.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }

    public LootTable.Builder saltBlockDrops(Block drop) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop,
                (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                        ((LeafEntry.Builder)ItemEntry.builder(ModItems.POWDERED_SALT).apply(SetCountLootFunction.builder
                                (UniformLootNumberProvider.create(4.0f, 9.0f)))).apply(ApplyBonusLootFunction.oreDrops
                                (Enchantments.FORTUNE))));
    }
    public LootTable.Builder iceOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(1.0f, 2.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
