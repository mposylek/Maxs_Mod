package net.max.maxsmod.item;

import net.max.maxsmod.MaxsMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MaxsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab MAXS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MAXS_TAB = event.registerCreativeModeTab(new ResourceLocation(MaxsMod.MOD_ID, "maxs_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.ADAMANT.get()))
                        .title(Component.translatable("creativemodetab.maxs_tab")));
    }
}
