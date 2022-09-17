package com.Epitap.detagen;

import com.Epitap.degeneracycraft.DegeneracyCraft;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStates extends BlockStateProvider {
    public BlockStates(DataGenerator gen,ExistingFileHelper exFileHelper) {
        super(gen, DegeneracyCraft.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }
}
