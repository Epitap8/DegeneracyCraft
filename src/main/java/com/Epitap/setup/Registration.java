package com.Epitap.setup;

import com.Epitap.blocks.GravitationOre;
import com.Epitap.blocks.ThermalPowerGenerator;
import com.Epitap.items.GravityIngot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import static com.Epitap.degeneracycraft.DegeneracyCraft.MODID;

public class Registration {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,MODID);
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,MODID);

    public static void init(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
        BLOCKS.register(bus);
    }

    public static final RegistryObject<GravityIngot> GRAVITY_INGOT = ITEMS.register("gravity_ingot",
            ()-> new GravityIngot(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));


    public static final RegistryObject<ThermalPowerGenerator> THERMAL_POWER_GENERATOR = BLOCKS.register(
            "thermal_power_generator",ThermalPowerGenerator::new);
    public static final RegistryObject<Item> THERMAL_POWER_GENERATOR_ITEM = ITEMS.register
            ("thermal_power_generator",
            ()-> new BlockItem(THERMAL_POWER_GENERATOR.get(),new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<GravitationOre> GRAVITATION_ORE = BLOCKS.register("gravitation_ore",
            GravitationOre::new);
    public static final RegistryObject<Item> GRAVITATION_ORE_ITEM = ITEMS.register("gravitation_ore",
            ()-> new BlockItem(GRAVITATION_ORE.get(),new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
