package net.rayusbakery.modid.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rayusbakery.modid.RayusBakery;
import net.rayusbakery.modid.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup RAYUS_BAKERY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RayusBakery.MOD_ID, "rayus_bakery_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CINNAMON_ROLL))
                    .displayName(Text.translatable("itemgroup.rayus-bakery.rayus_bakery_items"))
                    .entries((displayContext, entries) -> {

                        //fruit a-z
                        entries.add(ModItems.CHERRY);
                        entries.add(ModItems.BLUEBERRY);
                        entries.add(ModItems.LEMON);
                        entries.add(ModItems.LIME);
                        entries.add(ModItems.ORANGE);
                        entries.add(ModItems.STRAWBERRY);

                        //ingredients a-z
                        entries.add(ModItems.FLOUR_SACK);

                        //dessert a-z
                        entries.add(ModItems.CHEESECAKE);
                        entries.add(ModItems.DANGO);
                        entries.add(ModItems.KEY_LIME_PIE);
                        entries.add(ModItems.LEMON_SUGAR_COOKIE);
                        entries.add(ModItems.STRAWBERRY_CAKE);

                        //food items a-z
                        entries.add(ModItems.CINNAMON_ROLL);
                        entries.add(ModItems.CROISSANT);

                    }).build());

    public static final ItemGroup RAYUS_BAKERY_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RayusBakery.MOD_ID, "rayus_bakery_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.CHOPPING_BOARD))
                    .displayName(Text.translatable("itemgroup.rayus-bakery.rayus_bakery_blocks"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModBlocks.CHOPPING_BOARD);

                    }).build());

    public static void registerItemGroups(){
        RayusBakery.LOGGER.info("Registering Item Groups for " + RayusBakery.MOD_ID);
    }
}
