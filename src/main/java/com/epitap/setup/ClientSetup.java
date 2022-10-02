package com.epitap.setup;

import com.epitap.blocks.SolarPowerGeneratorScreen;
import com.epitap.blocks.ThermalPowerGeneratorScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {
    public static void setup(final FMLClientSetupEvent event){
        event.enqueueWork(()->{
            MenuScreens.register(Registration.THERMAL_POWER_GENERATOR_CONTAINER.get(), ThermalPowerGeneratorScreen::new);
            MenuScreens.register(Registration.SOLAR_POWER_GENERATOR_CONTAINER.get(), SolarPowerGeneratorScreen::new);
        });
    }
}
