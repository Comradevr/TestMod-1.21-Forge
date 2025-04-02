package net.spaxe.testmod.item;

import net.spaxe.testmod.TestMod;
import net.spaxe.testmod.item.custom.ChiselItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    //ITEMS
    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
            () -> new Item(new Item.Properties()));

    //TOOLS/UTILITIES
    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    //FOODS
    public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi",
            () -> new Item(new Item.Properties().food(ModFoodProperties.KOHLRABI)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}