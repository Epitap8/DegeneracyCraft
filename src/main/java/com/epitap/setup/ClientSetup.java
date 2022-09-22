package com.epitap.setup;

import com.epitap.blocks.ThermalPowerGeneratorScreen;
import com.epitap.degeneracycraft.DegeneracyCraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {
    public static void setup(final FMLClientSetupEvent event){
        event.enqueueWork(()->{
            MenuScreens.register(Registration.THERMAL_POWER_GENERATOR_CONTAINER.get(), ThermalPowerGeneratorScreen::new);
        });
    }
}
