package com.josephwest2.gigacraft.item;

import com.josephwest2.gigacraft.GigaCraft;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Items {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GigaCraft.MODID);

    public static final DeferredItem<Item> BISMUTH = ITEMS.registerSimpleItem("bismuth");

    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.registerSimpleItem("raw_bismuth");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
