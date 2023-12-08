package net.gecko95.oresmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.item.custom.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item POWDERED_SALT = registerItem("powdered_salt", new Item(new FabricItemSettings()));
    public static final Item RAW_SALT = registerItem("raw_salt", new Item(new FabricItemSettings()));

    public static final Item RAW_FLESH = registerItem("raw_flesh",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_FLESH)));
    public static final Item COOKED_FLESH = registerItem("cooked_flesh",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_FLESH)));

    public static final Item FROSITE = registerItem("frosite", new Item(new FabricItemSettings()));

    public static final Item FROSITE_PICKAXE = registerItem("frosite_pickaxe",
            new PickaxeItem(ModToolMaterial.FROSITE, 1, -2.8f, new FabricItemSettings()));
    public static final Item FROSITE_SWORD = registerItem("frosite_sword",
            new FrositeSwordItem(ModToolMaterial.FROSITE, 3, -2.4f, new FabricItemSettings()));
    public static final Item FROSITE_AXE = registerItem("frosite_axe",
            new AxeItem(ModToolMaterial.FROSITE, 6.0f, -3.1f, new FabricItemSettings()));
    public static final Item FROSITE_SHOVEL = registerItem("frosite_shovel",
            new ShovelItem(ModToolMaterial.FROSITE, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item FROSITE_HOE = registerItem("frosite_hoe",
            new HoeItem(ModToolMaterial.FROSITE, -2, -1.0f, new FabricItemSettings()));

    public static final Item FROSITE_HELMET = registerItem("frosite_helmet",
            new ArmorItem(ModArmorMaterials.FROSITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item FROSITE_CHESTPLATE = registerItem("frosite_chestplate",
            new ModArmorItem(ModArmorMaterials.FROSITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item FROSITE_LEGGINGS = registerItem("frosite_leggings",
            new ArmorItem(ModArmorMaterials.FROSITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item FROSITE_BOOTS = registerItem("frosite_boots",
            new ArmorItem(ModArmorMaterials.FROSITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item ALUMINUM_INGOT = registerItem("aluminum_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_ALUMINUM = registerItem("raw_aluminum", new Item(new FabricItemSettings()));
    public static final Item ALUMINUM_NUGGET = registerItem("aluminum_nugget", new Item(new FabricItemSettings()));

    public static final Item ALUMINUM_PICKAXE = registerItem("aluminum_pickaxe",
            new PickaxeItem(ModToolMaterial.ALUMINUM, 1, -2.6f, new FabricItemSettings()));
    public static final Item ALUMINUM_SWORD = registerItem("aluminum_sword",
            new SwordItem(ModToolMaterial.ALUMINUM, 3, -2.2f, new FabricItemSettings()));
    public static final Item ALUMINUM_AXE = registerItem("aluminum_axe",
            new AxeItem(ModToolMaterial.ALUMINUM, 6.0f, -2.9f, new FabricItemSettings()));
    public static final Item ALUMINUM_SHOVEL = registerItem("aluminum_shovel",
            new ShovelItem(ModToolMaterial.ALUMINUM, 1.5f, -2.8f, new FabricItemSettings()));
    public static final Item ALUMINUM_HOE = registerItem("aluminum_hoe",
            new HoeItem(ModToolMaterial.ALUMINUM, -2, -0.8f, new FabricItemSettings()));
    public static final Item FLINT_AND_ALUMINUM = registerItem("flint_and_aluminum",
            new FlintAndSteelItem(new FabricItemSettings().maxDamage(32)));

    public static final Item ALUMINUM_HELMET = registerItem("aluminum_helmet",
            new ArmorItem(ModArmorMaterials.ALUMINUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ALUMINUM_CHESTPLATE = registerItem("aluminum_chestplate",
            new ArmorItem(ModArmorMaterials.ALUMINUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ALUMINUM_LEGGINGS = registerItem("aluminum_leggings",
            new ArmorItem(ModArmorMaterials.ALUMINUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ALUMINUM_BOOTS = registerItem("aluminum_boots",
            new ArmorItem(ModArmorMaterials.ALUMINUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item NICKEL_INGOT = registerItem("nickel_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_NICKEL = registerItem("raw_nickel", new Item(new FabricItemSettings()));
    public static final Item NICKEL_NUGGET = registerItem("nickel_nugget", new Item(new FabricItemSettings()));

    public static final Item NICKEL_APPLE = registerItem("nickel_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.NICKEL_APPLE)));
    public static final Item NICKEL_BEETROOT = registerItem("nickel_beetroot",
            new Item(new FabricItemSettings().food(ModFoodComponents.NICKEL_BEETROOT)));

    public static final Item NICKEL_SWORD = registerItem("nickel_sword",
            new SwordItem(ModToolMaterial.NICKEL, 3, -2.4f, new FabricItemSettings()));
    public static final Item NICKEL_PICKAXE = registerItem("nickel_pickaxe",
            new PickaxeItem(ModToolMaterial.NICKEL, 1, -2.8f, new FabricItemSettings()));
    public static final Item NICKEL_AXE = registerItem("nickel_axe",
            new AxeItem(ModToolMaterial.NICKEL, 6.0f, -3.2f, new FabricItemSettings()));
    public static final Item NICKEL_SHOVEL = registerItem("nickel_shovel",
            new ShovelItem(ModToolMaterial.NICKEL, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item NICKEL_HOE = registerItem("nickel_hoe",
            new HoeItem(ModToolMaterial.NICKEL, -2, -2.0f, new FabricItemSettings()));

    public static final Item NICKEL_HELMET = registerItem("nickel_helmet",
            new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item NICKEL_CHESTPLATE = registerItem("nickel_chestplate",
            new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item NICKEL_LEGGINGS = registerItem("nickel_leggings",
            new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item NICKEL_BOOTS = registerItem("nickel_boots",
            new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterial.COPPER, 3, -2.4f, new FabricItemSettings()));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterial.COPPER, 1, -2.8f, new FabricItemSettings()));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterial.COPPER, 7.0f, -3.2f, new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterial.COPPER, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(ModToolMaterial.COPPER, -1, -2.0f, new FabricItemSettings()));

    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item IRON_BALL = registerItem("iron_ball", new Item(new FabricItemSettings()));

    public static final Item STEEL_COMPOUND_ALUMINUM = registerItem("steel_compound_aluminum",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_NICKEL = registerItem("steel_compound_nickel",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_COPPER = registerItem("steel_compound_copper",
            new Item(new FabricItemSettings()));

    public static final Item STEEL_COMPOUND_ALUCKEL = registerItem("steel_compound_aluckel",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_ALUPPER = registerItem("steel_compound_alupper",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_NICKINUM = registerItem("steel_compound_nickinum",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_NICKOPPER = registerItem("steel_compound_nickopper",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_COPPINUM = registerItem("steel_compound_coppinum",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_COPPEL = registerItem("steel_compound_coppel",
            new Item(new FabricItemSettings()));

    public static final Item STEEL_COMPOUND_ALUNICKOPPER = registerItem("steel_compound_alunickopper",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_ALUPPEREL = registerItem("steel_compound_alupperel",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_NICKINUPPER = registerItem("steel_compound_nickinupper",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_NICKOPPINUM = registerItem("steel_compound_nickoppinum",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_COPPINUCKEL = registerItem("steel_compound_coppinuckel",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_COPPELUNUM = registerItem("steel_compound_coppelinum",
            new Item(new FabricItemSettings()));

    public static final Item STEEL_COMPOUND = registerItem("steel_compound", new Item(new FabricItemSettings()));
    public static final Item RAW_STEEL = registerItem("raw_steel", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_UPGRADE_SMITHING_TEMPLATE = registerItem("steel_upgrade_smithing_template",
            new SteelUpgradeTemplateItem(new FabricItemSettings()));

    public static final Item STEEL_APPLE = registerItem("steel_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.STEEL_APPLE)));
    public static final Item STEEL_BEETROOT = registerItem("steel_beetroot",
            new Item(new FabricItemSettings().food(ModFoodComponents.STEEL_BEETROOT)));

    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterial.STEEL, 3, -2.4f, new FabricItemSettings()));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterial.STEEL, 1, -2.8f, new FabricItemSettings()));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModToolMaterial.STEEL, 5.0f, -3.0f, new FabricItemSettings()));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterial.STEEL, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModToolMaterial.STEEL, -3, 0.0f, new FabricItemSettings()));

    public static final Item STEEL_HELMET = registerItem("steel_helmet",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new FabricItemSettings()));
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new FabricItemSettings()));

    public static final Item TITANIUM_SWORD = registerItem("titanium_sword",
            new SwordItem(ModToolMaterial.TITANIUM, 3, -2.4f, new FabricItemSettings()));
    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new PickaxeItem(ModToolMaterial.TITANIUM, 1, -2.8f, new FabricItemSettings()));
    public static final Item TITANIUM_AXE = registerItem("titanium_axe",
            new AxeItem(ModToolMaterial.TITANIUM, 5.0f, -3.0f, new FabricItemSettings()));
    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new ShovelItem(ModToolMaterial.TITANIUM, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item TITANIUM_HOE = registerItem("titanium_hoe",
            new HoeItem(ModToolMaterial.TITANIUM, -3, 0.0f, new FabricItemSettings()));

    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item TUNGSTEN_NUGGET = registerItem("tungsten_nugget", new Item(new FabricItemSettings().fireproof()));
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", new Item(new FabricItemSettings().fireproof()));

    public static final Item TUNGSTEN_HELMET = registerItem("tungsten_helmet",
            new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item TUNGSTEN_CHESTPLATE = registerItem("tungsten_chestplate",
            new ModArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item TUNGSTEN_LEGGINGS = registerItem("tungsten_leggings",
            new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item TUNGSTEN_BOOTS = registerItem("tungsten_boots",
            new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item TUNGSTEN_SWORD = registerItem("tungsten_sword",
            new SwordItem(ModToolMaterial.TUNGSTEN, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static final Item TUNGSTEN_PICKAXE = registerItem("tungsten_pickaxe",
            new PickaxeItem(ModToolMaterial.TUNGSTEN, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item TUNGSTEN_AXE = registerItem("tungsten_axe",
            new AxeItem(ModToolMaterial.TUNGSTEN, 5.0f, -3.0f, new FabricItemSettings().fireproof()));
    public static final Item TUNGSTEN_SHOVEL = registerItem("tungsten_shovel",
            new ShovelItem(ModToolMaterial.TUNGSTEN, 1.5f, -3.0f, new FabricItemSettings().fireproof()));
    public static final Item TUNGSTEN_HOE = registerItem("tungsten_hoe",
            new HoeItem(ModToolMaterial.TUNGSTEN, -2, 0.0f, new FabricItemSettings().fireproof()));

    public static final Item TITANIUM_ALLOY_INGOT = registerItem("titanium_alloy_ingot", new Item(new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_SCRAP = registerItem("titanium_alloy_scrap", new Item(new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_UPGRADE_SMITHING_TEMPLATE = registerItem("titanium_alloy_upgrade_smithing_template",
            new TitaniumAlloyUpgradeTemplateItem(new FabricItemSettings()));

    public static final Item TITANIUM_ALLOY_SWORD = registerItem("titanium_alloy_sword",
            new SwordItem(ModToolMaterial.TITANIUM_ALLOY, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_PICKAXE = registerItem("titanium_alloy_pickaxe",
            new PickaxeItem(ModToolMaterial.TITANIUM_ALLOY, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_AXE = registerItem("titanium_alloy_axe",
            new AxeItem(ModToolMaterial.TITANIUM_ALLOY, 5.0f, -3.0f, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_SHOVEL = registerItem("titanium_alloy_shovel",
            new ShovelItem(ModToolMaterial.TITANIUM_ALLOY, 1.5f, -3.0f, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_HOE = registerItem("titanium_alloy_hoe",
            new HoeItem(ModToolMaterial.TITANIUM_ALLOY, -4, 0.0f, new FabricItemSettings().fireproof()));

    public static final Item TITANIUM_ALLOY_HELMET = registerItem("titanium_alloy_helmet",
            new ArmorItem(ModArmorMaterials.TITANIUM_ALLOY, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_CHESTPLATE = registerItem("titanium_alloy_chestplate",
            new ModArmorItem(ModArmorMaterials.TITANIUM_ALLOY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_LEGGINGS = registerItem("titanium_alloy_leggings",
            new ArmorItem(ModArmorMaterials.TITANIUM_ALLOY, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_BOOTS = registerItem("titanium_alloy_boots",
            new ArmorItem(ModArmorMaterials.TITANIUM_ALLOY, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item COBALT_INGOT = registerItem("cobalt_ingot", new Item(new FabricItemSettings()));
    public static final Item COBALT_NUGGET = registerItem("cobalt_nugget", new Item(new FabricItemSettings()));

    public static final Item COBALT_SWORD = registerItem("cobalt_sword",
            new SwordItem(ModToolMaterial.COBALT, 3, -2.4f, new FabricItemSettings()));
    public static final Item COBALT_PICKAXE = registerItem("cobalt_pickaxe",
            new PickaxeItem(ModToolMaterial.COBALT, 1, -2.8f, new FabricItemSettings()));
    public static final Item COBALT_AXE = registerItem("cobalt_axe",
            new AxeItem(ModToolMaterial.COBALT, 5.0f, -3.0f, new FabricItemSettings()));
    public static final Item COBALT_SHOVEL = registerItem("cobalt_shovel",
            new ShovelItem(ModToolMaterial.COBALT, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item COBALT_HOE = registerItem("cobalt_hoe",
            new HoeItem(ModToolMaterial.COBALT, -2, 0.0f, new FabricItemSettings()));

    public static final Item COBALT_HELMET = registerItem("cobalt_helmet",
            new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COBALT_CHESTPLATE = registerItem("cobalt_chestplate",
            new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COBALT_LEGGINGS = registerItem("cobalt_leggings",
            new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COBALT_BOOTS = registerItem("cobalt_boots",
            new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item COPPER_HANDLE = registerItem("copper_handle", new Item(new FabricItemSettings()));
    public static final Item COBALT_HANDLE = registerItem("cobalt_handle", new Item(new FabricItemSettings()));
    public static final Item COPPER_DRIVE = registerItem("copper_drive", new Item(new FabricItemSettings()));
    public static final Item POWER_DRIVE = registerItem("power_drive", new Item(new FabricItemSettings()));
    public static final Item DUEL_POWER_DRIVE = registerItem("duel_power_drive", new Item(new FabricItemSettings()));
    public static final Item HANDLED_POWER_DRIVE = registerItem("handled_power_drive",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item DUEL_HANDLED_POWER_DRIVE = registerItem("duel_handled_power_drive",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item IRON_DRILL = registerItem("iron_drill",
            new DrillItem(ModToolMaterial.POWER_IRON, 0, -2.8f, new FabricItemSettings()));
    public static final Item IRON_CHAINSAW = registerItem("iron_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_IRON, 0, -2.8f, new FabricItemSettings()));
    public static final Item DIAMOND_DRILL = registerItem("diamond_drill",
            new DrillItem(ModToolMaterial.POWER_DIAMOND, 0, -2.8f, new FabricItemSettings()));
    public static final Item DIAMOND_CHAINSAW = registerItem("diamond_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_DIAMOND, 0, -2.8f, new FabricItemSettings()));
    public static final Item GOLDEN_DRILL = registerItem("golden_drill",
            new DrillItem(ModToolMaterial.POWER_GOLD, 0, -2.8f, new FabricItemSettings()));
    public static final Item GOLDEN_CHAINSAW = registerItem("golden_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_GOLD, 0, -2.8f, new FabricItemSettings()));
    public static final Item FROSITE_DRILL = registerItem("frosite_drill",
            new DrillItem(ModToolMaterial.POWER_FROSITE, 0, -2.8f, new FabricItemSettings()));
    public static final Item FROSITE_CHAINSAW = registerItem("frosite_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_FROSITE, 0, -2.8f, new FabricItemSettings()));
    public static final Item ALUMINUM_DRILL = registerItem("aluminum_drill",
            new DrillItem(ModToolMaterial.POWER_ALUMINUM, 0, -2.8f, new FabricItemSettings()));
    public static final Item ALUMINUM_CHAINSAW = registerItem("aluminum_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_ALUMINUM, 0, -2.8f, new FabricItemSettings()));
    public static final Item NICKEL_DRILL = registerItem("nickel_drill",
            new DrillItem(ModToolMaterial.POWER_NICKEL, 0, -2.8f, new FabricItemSettings()));
    public static final Item NICKEL_CHAINSAW = registerItem("nickel_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_NICKEL, 0, -2.8f, new FabricItemSettings()));
    public static final Item COPPER_DRILL = registerItem("copper_drill",
            new DrillItem(ModToolMaterial.POWER_COPPER, 0, -2.8f, new FabricItemSettings()));
    public static final Item COPPER_CHAINSAW = registerItem("copper_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_COPPER, 0, -2.8f, new FabricItemSettings()));
    public static final Item COBALT_DRILL = registerItem("cobalt_drill",
            new DrillItem(ModToolMaterial.POWER_COBALT, 0, -2.8f, new FabricItemSettings()));
    public static final Item COBALT_CHAINSAW = registerItem("cobalt_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_COBALT, 0, -2.8f, new FabricItemSettings()));
    public static final Item STEEL_DRILL = registerItem("steel_drill",
            new DrillItem(ModToolMaterial.POWER_STEEL, 0, -2.8f, new FabricItemSettings()));
    public static final Item STEEL_CHAINSAW = registerItem("steel_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_STEEL, 0, -2.8f, new FabricItemSettings()));
    public static final Item NETHERITE_DRILL = registerItem("netherite_drill",
            new DrillItem(ModToolMaterial.POWER_NETHERITE, 0, -2.8f, new FabricItemSettings()));
    public static final Item NETHERITE_CHAINSAW = registerItem("netherite_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_NETHERITE, 0, -2.8f, new FabricItemSettings()));
    public static final Item TUNGSTEN_DRILL = registerItem("tungsten_drill",
            new DrillItem(ModToolMaterial.POWER_TUNGSTEN, 0, -2.8f, new FabricItemSettings()));
    public static final Item TUNGSTEN_CHAINSAW = registerItem("tungsten_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_TUNGSTEN, 0, -2.8f, new FabricItemSettings()));
    public static final Item TITANIUM_DRILL = registerItem("titanium_drill",
            new DrillItem(ModToolMaterial.POWER_TITANIUM, 0, -2.8f, new FabricItemSettings()));
    public static final Item TITANIUM_CHAINSAW = registerItem("titanium_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_TITANIUM, 0, -2.8f, new FabricItemSettings()));
    public static final Item TITANIUM_ALLOY_DRILL = registerItem("titanium_alloy_drill",
            new DrillItem(ModToolMaterial.POWER_TITANIUM_ALLOY, 0, -2.8f, new FabricItemSettings()));
    public static final Item TITANIUM_ALLOY_CHAINSAW = registerItem("titanium_alloy_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_TITANIUM_ALLOY, 0, -2.8f, new FabricItemSettings()));

    public static final Item STONEBARK_SIGN = registerItem("stonebark_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_STONEBARK_SIGN, ModBlocks.WALL_STONEBARK_SIGN));
    public static final Item STONEBARK_HANGING_SIGN = registerItem("stonebark_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_STONEBARK_SIGN, ModBlocks.WALL_HANGING_STONEBARK_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item DEEPBARK_SIGN = registerItem("deepbark_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_DEEPBARK_SIGN, ModBlocks.WALL_DEEPBARK_SIGN));
    public static final Item DEEPBARK_HANGING_SIGN = registerItem("deepbark_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_DEEPBARK_SIGN, ModBlocks.WALL_HANGING_DEEPBARK_SIGN, new FabricItemSettings().maxCount(16)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(OresMod.MOD_ID, name),item);
    }
    public static void registerModItems(){
        OresMod.LOGGER.info("Registering Mod Items for " + OresMod.MOD_ID);
    }
}
