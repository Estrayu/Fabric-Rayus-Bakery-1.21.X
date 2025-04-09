package net.rayusbakery.modid.item;

import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.rayusbakery.modid.RayusBakery;

public class ModItems {

    //fruit a-z
    public static final Item CHERRY = registerItem("cherry", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RayusBakery.MOD_ID, "cherry")))));
    public static final Item BLUEBERRY = registerItem("blueberry", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RayusBakery.MOD_ID, "blueberry")))));
    public static final Item LEMON = registerItem("lemon", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RayusBakery.MOD_ID, "lemon")))));
    public static final Item LIME = registerItem("lime", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RayusBakery.MOD_ID, "lime")))));
    public static final Item ORANGE = registerItem("orange", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RayusBakery.MOD_ID, "orange")))));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RayusBakery.MOD_ID, "strawberry")))));

    //ingredients a-z
    public static final Item FLOUR_SACK = registerItem("flour_sack", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RayusBakery.MOD_ID, "flour_sack")))));

    //dessert a-z
    public static final Item CHEESECAKE = registerItem("cheesecake", new Item(new Item.Settings().food(ModFoodComponents.CHEESECAKE).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RayusBakery.MOD_ID,"cheesecake")))));
    public static final Item DANGO = registerItem("dango", new Item(new Item.Settings().food(ModFoodComponents.DANGO).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RayusBakery.MOD_ID, "dango")))));
    public static final Item KEY_LIME_PIE = registerItem("key_lime_pie", new Item(new Item.Settings().food(ModFoodComponents.KEY_LIME_PIE).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RayusBakery.MOD_ID, "key_lime_pie")))));
    public static final Item LEMON_SUGAR_COOKIE = registerItem("lemon_sugar_cookie", new Item(new Item.Settings().food(ModFoodComponents.LEMON_SUGAR_COOKIE).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RayusBakery.MOD_ID, "lemon_sugar_cookie")))));
    public static final Item STRAWBERRY_CAKE = registerItem("strawberry_cake", new Item(new Item.Settings().food(ModFoodComponents.STRAWBERRY_CAKE).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RayusBakery.MOD_ID, "strawberry_cake")))));

    //drinks a-z
    public static final Item MILK_TEA = registerItem("milk_tea", new Item(new Item.Settings().food(ModFoodComponents.MILK_TEA).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RayusBakery.MOD_ID, "milk_tea")))));

    //food items a-z
    public static final Item CINNAMON_ROLL = registerItem("cinnamon_roll", new Item(new Item.Settings().food(ModFoodComponents.CINNAMON_ROLL).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RayusBakery.MOD_ID, "cinnamon_roll")))));
    public static final Item CROISSANT = registerItem("croissant", new Item(new Item.Settings().food(ModFoodComponents.CROISSANT).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RayusBakery.MOD_ID, "croissant")))));

    //register item helper method
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(RayusBakery.MOD_ID, name), item);
    }

    public static void registerModItems(){
        RayusBakery.LOGGER.info("Registering Mod Items for " + RayusBakery.MOD_ID);
    }
}
