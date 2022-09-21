package com.epitap.detagen;

import com.epitap.degeneracycraft.DegeneracyCraft;
import com.epitap.setup.Registration;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Function;

public class BlockStates extends BlockStateProvider {
    public BlockStates(DataGenerator gen,ExistingFileHelper exFileHelper) {
        super(gen, DegeneracyCraft.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        registerThermalPowerGeneratorBlock();
        registerGravitationOre();
    }
    private void registerGravitationOre() {
        simpleBlock(Registration.GRAVITATION_ORE.get());
    }
    private void registerThermalPowerGeneratorBlock() {
        ResourceLocation txt = new ResourceLocation(DegeneracyCraft.MODID,"block/thermal_power_generator");
        BlockModelBuilder modelthermal_power_generator = models().cube("thermal_power_generator",
                txt, txt, new ResourceLocation(DegeneracyCraft.MODID,"block/thermal_power_generator_front"), txt, txt, txt);
        BlockModelBuilder modelthermal_power_generatorPowered = models().cube("thermal_power_generator_powered",
                txt, txt, new ResourceLocation(DegeneracyCraft.MODID, "block/thermal_power_generator_front_powered"), txt, txt, txt);
        orientedBlock(Registration.THERMAL_POWER_GENERATOR.get(), state -> {
            if (state.getValue(BlockStateProperties.POWERED)) {
                return modelthermal_power_generatorPowered;
            } else {
                return modelthermal_power_generator;
            }
        });
    }

    private void orientedBlock(Block block, Function<BlockState, ModelFile> modelFunc) {
        getVariantBuilder(block)
                .forAllStates(state -> {
                    Direction dir = state.getValue(BlockStateProperties.FACING);
                    return ConfiguredModel.builder()
                            .modelFile(modelFunc.apply(state))
                            .rotationX(dir.getAxis() == Direction.Axis.Y ?  dir.getAxisDirection().getStep() * -90 : 0)
                            .rotationY(dir.getAxis() != Direction.Axis.Y ? ((dir.get2DDataValue() + 2) % 4) * 90 : 0)
                            .build();
                });
    }
}