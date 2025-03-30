package com.josephwest2.gigacraft;

import java.util.function.Supplier;
import com.josephwest2.gigacraft.item.GCItems;
import com.josephwest2.gigacraft.block.GCBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GCCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, GigaCraft.MODID);

    public static final Supplier<CreativeModeTab> ITEMS_TAB = CREATIVE_MODE_TAB.register("items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(GCItems.BISMUTH.get()))
                    .title(Component.translatable("creativetab.gigacraft.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(GCItems.BISMUTH);
                        output.accept(GCItems.RAW_BISMUTH);
                    }).build());

    public static final Supplier<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TAB.register("blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(GCBlocks.BISMUTH_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(GigaCraft.MODID, "items_tab"))
                    .title(Component.translatable("creativetab.gigacraft.blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(GCBlocks.BISMUTH_BLOCK);
                        output.accept(GCBlocks.BISMUTH_ORE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
