package com.epitap.detagen;

import com.epitap.degeneracycraft.DegeneracyCraft;
import com.epitap.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Items extends ItemModelProvider {

    public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, DegeneracyCraft.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        singleTexture(
                Registration.GRAVITY_INGOT.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(DegeneracyCraft.MODID,"item/gravity_ingot"));

        singleTexture(
                Registration.ASTEMA.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(DegeneracyCraft.MODID,"item/astema"));

        singleTexture(
                Registration.THERMAL_POWER_GENERATOR.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"));
        withExistingParent(Registration.THERMAL_POWER_GENERATOR_ITEM.get().getRegistryName().getPath(),
                new ResourceLocation(DegeneracyCraft.MODID, "block/thermal_power_generator"));

        singleTexture(
                Registration.GRAVITATION_ORE.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"));
        withExistingParent(Registration.GRAVITATION_ORE_ITEM.get().getRegistryName().getPath(),
                new ResourceLocation(DegeneracyCraft.MODID, "block/gravitation_ore"));
    }

    private void singleTexture(String path, ResourceLocation resourceLocation) {
    }
}
