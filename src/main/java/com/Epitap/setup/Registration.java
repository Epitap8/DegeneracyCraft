package com.Epitap.setup;

import com.Epitap.item.GravityIngot;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import static com.Epitap.degeneracycraft.DegeneracyCraft.MODID;

public class Registration {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,MODID);

    public static void init(){

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());}

    public static final RegistryObject<Item> GRAVITY_INGOT = ITEMS.register("gravity_ingot",()-> new GravityIngot(new Item.Properties()));
}
