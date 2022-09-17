package com.Epitap.blocks;

import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.material.Material;

public class GravitationOre extends OreBlock {
    public GravitationOre() {
        super(Properties.of(Material.STONE).strength(3.0f));
    }
}
