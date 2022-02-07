package com.henrikstabell.mistmonsters;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MistMonsters.MODID)
public class MistMonsters {

    public static final String MODID = "mistmonsters";
    public static final Logger LOGGER = LogManager.getLogger();

    public MistMonsters() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
