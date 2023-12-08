package net.gecko95.oresmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.FROSITE_HELMET, ModItems.FROSITE_CHESTPLATE, ModItems.FROSITE_LEGGINGS, ModItems.FROSITE_BOOTS)
                .add(ModItems.ALUMINUM_HELMET, ModItems.ALUMINUM_CHESTPLATE, ModItems.ALUMINUM_LEGGINGS, ModItems.ALUMINUM_BOOTS)
                .add(ModItems.NICKEL_HELMET, ModItems.NICKEL_CHESTPLATE, ModItems.NICKEL_LEGGINGS, ModItems.NICKEL_BOOTS)
                .add(ModItems.COPPER_HELMET, ModItems.COPPER_CHESTPLATE, ModItems.COPPER_LEGGINGS, ModItems.COPPER_BOOTS)
                .add(ModItems.STEEL_HELMET, ModItems.STEEL_CHESTPLATE, ModItems.STEEL_LEGGINGS, ModItems.STEEL_BOOTS)
                .add(ModItems.TITANIUM_HELMET, ModItems.TITANIUM_CHESTPLATE, ModItems.TITANIUM_LEGGINGS, ModItems.TITANIUM_BOOTS)
                .add(ModItems.TUNGSTEN_HELMET, ModItems.TUNGSTEN_CHESTPLATE, ModItems.TUNGSTEN_LEGGINGS, ModItems.TUNGSTEN_BOOTS)
                .add(ModItems.TITANIUM_ALLOY_HELMET, ModItems.TITANIUM_ALLOY_CHESTPLATE, ModItems.TITANIUM_ALLOY_LEGGINGS, ModItems.TITANIUM_ALLOY_BOOTS)
                .add(ModItems.COBALT_HELMET, ModItems.COBALT_CHESTPLATE, ModItems.COBALT_LEGGINGS, ModItems.COBALT_BOOTS);

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.STONEBARK_PLANKS.asItem())
                .add(ModBlocks.DEEPSLATE_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.SAND)
                .add(ModBlocks.WHITE_SAND.asItem())
                .add(ModBlocks.BLACK_SAND.asItem());

        getOrCreateTagBuilder(ItemTags.SMELTS_TO_GLASS)
                .add(ModBlocks.WHITE_SAND.asItem())
                .add(ModBlocks.BLACK_SAND.asItem());
    }
}
