package com.epitap.detagen;

import com.epitap.degeneracycraft.DegeneracyCraft;
import com.epitap.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Tags extends BlockTagsProvider {
    public Tags(DataGenerator generator, ExistingFileHelper helper){
        super(generator, DegeneracyCraft.MODID,helper);}
    @Override
    protected void addTags(){
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.THERMAL_POWER_GENERATOR.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.THERMAL_POWER_GENERATOR.get());
    }

    @Override
    public String getName(){return "Degeneracy Craft Tags";}
}

