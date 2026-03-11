package com.vappad.pjo.item;

import com.vappad.pjo.PjoMod;
import com.vappad.pjo.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PjoMod.MODID);


    public static final Supplier<CreativeModeTab> PJO_ITEMS_TAB = CREATIVE_MODE_TAB.register("pjo_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CELESTIALBRONZEINGOT.get()))
                    .title(Component.translatable("creativetab.pjomod.pjo_items"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        output.accept(ModItems.CELESTIALBRONZEINGOT);
                        output.accept(ModItems.RAWCELESTIALBRONZE);
                        output.accept(ModItems.CELESTIALBRONZEROD);
                            }).build());


    public static final Supplier<CreativeModeTab> PJO_BLOCKS_TAB = CREATIVE_MODE_TAB.register("pjo_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CELESTIALBRONZEBLOCK.get()))
                    .title(Component.translatable("creativetab.pjomod.pjo_blocks"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        output.accept(ModBlocks.CELESTIALBRONZEORE);
                        output.accept(ModBlocks.CELESTIALBRONZEBLOCK);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
