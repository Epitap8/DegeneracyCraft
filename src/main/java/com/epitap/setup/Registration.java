package com.epitap.setup;

import com.epitap.blocks.*;
import com.epitap.items.Astema;
import com.epitap.items.GravityIngot;
import net.minecraft.core.BlockPos;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import static com.epitap.degeneracycraft.DegeneracyCraft.MODID;

public class Registration {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,MODID);
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,MODID);
    private static final DeferredRegister<BlockEntityType<?>> BLOCKENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,MODID);
    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS,MODID);

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_TYPES = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MODID);


    public static void init(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
        BLOCKS.register(bus);
        BLOCKENTITIES.register(bus);
        CONTAINERS.register(bus);
        RECIPE_TYPES.register(bus);


    }


    public static final RegistryObject<Astema> ASTEMA = ITEMS.register("astema",
            ()-> new Astema(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<GravityIngot> GRAVITY_INGOT = ITEMS.register("gravity_ingot",
            ()-> new GravityIngot(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<GravitationOre> GRAVITATION_ORE = BLOCKS.register("gravitation_ore",
            GravitationOre::new);
    public static final RegistryObject<Item> GRAVITATION_ORE_ITEM = ITEMS.register("gravitation_ore",
            ()-> new BlockItem(GRAVITATION_ORE.get(),new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<ThermalPowerGenerator> THERMAL_POWER_GENERATOR = BLOCKS.register(
            "thermal_power_generator", ThermalPowerGenerator::new);

    public static final RegistryObject<Item> THERMAL_POWER_GENERATOR_ITEM = ITEMS.register("thermal_power_generator",
            ()-> new BlockItem(THERMAL_POWER_GENERATOR.get(),new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<BlockEntityType<ThermalPowerGeneratorBE>> THERMAL_POWER_GENERATOR_BE = BLOCKENTITIES.register(
            "thermal_power_generator",()-> BlockEntityType.Builder.of(ThermalPowerGeneratorBE::new,
                    THERMAL_POWER_GENERATOR.get()).build(null));
    public static final RegistryObject<MenuType<ThermalPowerGeneratorContainer>> THERMAL_POWER_GENERATOR_CONTAINER =CONTAINERS.register(
            "thermal_power_generator",()-> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                Level world = inv.player.getCommandSenderWorld();
                return new ThermalPowerGeneratorContainer(windowId,world,pos,inv,inv.player);
            }))
    );
    public static final RegistryObject<SolarPowerGenerator> SOLAR_POWER_GENERATOR = BLOCKS.register(
            "solar_power_generator", SolarPowerGenerator::new);

    public static final RegistryObject<Item> SOLAR_POWER_GENERATOR_ITEM = ITEMS.register("solar_power_generator",
            ()-> new BlockItem(SOLAR_POWER_GENERATOR.get(),new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<BlockEntityType<SolarPowerGeneratorBE>> SOLAR_POWER_GENERATOR_BE = BLOCKENTITIES.register(
            "solar_power_generator",()-> BlockEntityType.Builder.of(SolarPowerGeneratorBE::new,
                    SOLAR_POWER_GENERATOR.get()).build(null));
    public static final RegistryObject<MenuType<SolarPowerGeneratorContainer>> SOLAR_POWER_GENERATOR_CONTAINER =CONTAINERS.register(
            "solar_power_generator",()-> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                Level world = inv.player.getCommandSenderWorld();
                return new SolarPowerGeneratorContainer(windowId,world,pos,inv,inv.player);
            }))
    );
    public static final RegistryObject<SolarPowerGenerator> KILO_WORK_BENCH = BLOCKS.register(
            "kilo_work_bench", SolarPowerGenerator::new);

    public static final RegistryObject<Item> KILO_WORK_BENCH_ITEM = ITEMS.register("kilo_work_bench",
            ()-> new BlockItem(KILO_WORK_BENCH.get(),new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<BlockEntityType<SolarPowerGeneratorBE>> KILO_WORK_BENCH_BE = BLOCKENTITIES.register(
            "kilo_work_bench",()-> BlockEntityType.Builder.of(SolarPowerGeneratorBE::new,
                    KILO_WORK_BENCH.get()).build(null));
    public static final RegistryObject<MenuType<SolarPowerGeneratorContainer>> KILO_WORK_BENCH_CONTAINER =CONTAINERS.register(
            "kilo_work_bench",()-> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                Level world = inv.player.getCommandSenderWorld();
                return new SolarPowerGeneratorContainer(windowId,world,pos,inv,inv.player);
            }))
    );


}
