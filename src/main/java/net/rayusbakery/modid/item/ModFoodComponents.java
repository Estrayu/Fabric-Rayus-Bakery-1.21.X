package net.rayusbakery.modid.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class ModFoodComponents {

    //health boost consumable component
    public static final ConsumableComponent HEALTH_BOOST_CONSUMABLE_COMPONENTS = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 6 * 20, 1), 1.0f))
            .build();

    //food components (desserts a-z)
    public static final FoodComponent CHEESECAKE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3f).build();
    public static final FoodComponent DANGO = new FoodComponent.Builder().nutrition(4).saturationModifier(0.2f).build();
    public static final FoodComponent KEY_LIME_PIE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3f).build();
    public static final FoodComponent LEMON_SUGAR_COOKIE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3f).build();
    public static final FoodComponent STRAWBERRY_CAKE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3f).build();

    //food components (food items a-z)
    public static final FoodComponent CINNAMON_ROLL = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3f).build();
    public static final FoodComponent CROISSANT = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3f).build();

}