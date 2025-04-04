package net.rayusbakery.modid.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.rayusbakery.modid.RayusBakery;
import net.rayusbakery.modid.block.custom.Chopping_Board;

public class ModBlocks {

    //chopping board
    public static final Block CHOPPING_BOARD = registerBlock("chopping_board",
            AbstractBlock.Settings.create().nonOpaque());

    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RayusBakery.MOD_ID, name));
        Block block = new Block(blockSettings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RayusBakery.MOD_ID, name))));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }


    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RayusBakery.MOD_ID, name));
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);
    }

    public static void registerModBlocks(){
        RayusBakery.LOGGER.info("Registering Mod Blocks for " + RayusBakery.MOD_ID);
    }
}
