package net.gecko95.oresmod.util;

import net.gecko95.oresmod.OresMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> DRILL_MINEABLE =
                createTag("drill_mineable");
        public static final TagKey<Block> CHAINSAW_MINEABLE =
                createTag("chainsaw_mineable");

        public static final TagKey<Block> STONEBARK_PLACEABLE =
                createTag("stonebark_placeable");
        public static final TagKey<Block> DEEPBARK_PLACEABLE =
                createTag("deepbark_placeable");

        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(OresMod.MOD_ID, name));
        }
    }

    public static class Items {


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(OresMod.MOD_ID, name));
        }
    }
}
