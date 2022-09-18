package com.Epitap.detagen;

import com.Epitap.degeneracycraft.DegeneracyCraft;
import com.Epitap.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Items extends ItemModelProvider {
    public Items(DataGenerator generator,ExistingFileHelper existingFileHelper) {
        super(generator, DegeneracyCraft.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(
                Registration.GRAVITY_INGOT.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                 "layer0",
                new ResourceLocation(DegeneracyCraft.MODID, "item/gravity_ingot"));

        singleTexture(
                Registration.GRAVITATION_ORE_ITEM.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(DegeneracyCraft.MODID, "item/gravitation_ore"));
        withExistingParent(Registration.THERMAL_POWER_GENERATOR.get().getRegistryName().getPath(),
                new ResourceLocation(DegeneracyCraft.MODID,"block/thermal_power_generator"));


      //getBuilder(Registration.GRAVITY_INGOT.get().getRegistryName().getPath())
                //.parent(getExistingFile(mcLoc("item/generated")))
               // .texture("layer0", "item/gravity_ingot");
    }


}
