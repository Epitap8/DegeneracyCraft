package com.Epitap.degeneracycraft;

import com.Epitap.setup.ClientSetup;
import com.Epitap.setup.Registration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("degeneracycraft")
public class DegeneracyCraft {

    public static final String MODID = "degeneracycraft";
    private static final Logger LOGGER = LogManager.getLogger();

    public DegeneracyCraft() {
        Registration.init();

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(ClientSetup::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }
}
