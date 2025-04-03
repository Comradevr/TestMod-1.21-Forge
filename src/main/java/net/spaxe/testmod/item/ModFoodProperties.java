package net.spaxe.testmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties KOHLRABI = new FoodProperties.Builder().nutrition(1).saturationModifier(1f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 6), 100f)
            .fast().effect(new MobEffectInstance(MobEffects.REGENERATION, 3600, 1000000000), 100f)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 3600, 50), 100f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 1000000000), 100f)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600), 100f)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 100000), 100f)
            .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3600, 1000000), 100f).build();


}
