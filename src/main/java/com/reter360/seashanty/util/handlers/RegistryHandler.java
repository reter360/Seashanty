package com.reter360.seashanty.util.handlers;
import com.reter360.seashanty.Main;
import com.reter360.seashanty.init.ItemInit;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));}

    public static void preInitRegistries(FMLPreInitializationEvent event){ }

    public static void initRegistries(FMLInitializationEvent event){ }

    public static void postInitRegistries(FMLPostInitializationEvent event){ }

    public static void serverRegistries(FMLServerStartingEvent event){ }

}
