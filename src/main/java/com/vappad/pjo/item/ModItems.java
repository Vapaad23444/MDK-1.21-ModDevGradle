package com.vappad.pjo.item;

import com.vappad.pjo.PjoMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PjoMod.MODID);


    public static final DeferredItem<Item> CELESTIALBRONZEINGOT = ITEMS.register("celestialbronzeingot",
            () -> (new Item(new Item.Properties())));

    public static final DeferredItem<Item> RAWCELESTIALBRONZE = ITEMS.register("rawcelestialbronze",
            () -> (new Item(new Item.Properties())));

    public static final DeferredItem<Item> CELESTIALBRONZEROD = ITEMS.register("celestialbronzerod",
            () -> (new Item(new Item.Properties())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
