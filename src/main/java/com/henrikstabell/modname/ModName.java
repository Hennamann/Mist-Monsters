package com.henrikstabell.modname;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod(ModName.MODID)
@Mod.EventBusSubscriber(modid = ModName.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModName {

    public static final String MODID = "modname";
    public static final Logger LOGGER = LogManager.getLogger();


    public HorseLantern() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
