package com.josephwest2.gigacraft.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.josephwest2.gigacraft.GigaCraft;
import com.josephwest2.gigacraft.item.Items;

public class Blocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(GigaCraft.MODID);

    public static final DeferredBlock<Block> BISMUTH_BLOCK = BLOCKS.registerSimpleBlock("bismuth_block",
            BlockBehaviour.Properties.of().sound(SoundType.AMETHYST));

    public static final DeferredItem<BlockItem> BISMUTH_BLOCK_ITEM = Items.ITEMS.registerSimpleBlockItem(BISMUTH_BLOCK);

    public static final DeferredBlock<Block> BISMUTH_ORE = BLOCKS.register("bismuth_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of()));

    public static final DeferredItem<BlockItem> BISMUTH_ORE_ITEM = Items.ITEMS.registerSimpleBlockItem(BISMUTH_ORE);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
