package com.reter360.seashanty;
import com.reter360.seashanty.creativetabs.SeaShantyTab;
import com.reter360.seashanty.proxy.CommonProxy;
import com.reter360.seashanty.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class Main
{
        @Instance
        public static Main instance;

        @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
        public static CommonProxy proxy;

        public static final CreativeTabs SEASHANTY = new SeaShantyTab();

        //public static File config;

        static { FluidRegistry.enableUniversalBucket(); }

        @EventHandler
        public static void preInit(FMLPreInitializationEvent event){
            RegistryHandler.preInitRegistries(event); }

        @EventHandler
        public static void init(FMLInitializationEvent event){
            RegistryHandler.initRegistries(event); }

        @EventHandler
        public static void postInit(FMLPostInitializationEvent event){
            RegistryHandler.postInitRegistries(event); }

        @EventHandler
        public static void serverInit(FMLServerStartingEvent event){
            RegistryHandler.serverRegistries(event); }
    }
