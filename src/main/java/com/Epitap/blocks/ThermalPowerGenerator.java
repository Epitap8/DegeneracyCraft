package com.Epitap.blocks;

import com.Epitap.detagen.BlockStates;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;

public class ThermalPowerGenerator extends Block {
    public ThermalPowerGenerator() {
        super(Properties.of(Material.METAL)
                .sound(SoundType.METAL)
                .lightLevel(state->state.getValue(BlockStateProperties.POWERED)? 15:0)
                .strength(3.0f));
    }
}
