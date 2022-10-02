//package com.epitap.recipetype;
//
//import com.epitap.degeneracycraft.DegeneracyCraft;
//import net.minecraft.world.item.crafting.RecipeSerializer;
//import net.minecraftforge.common.crafting.CraftingHelper;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fmllegacy.RegistryObject;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//
//import java.util.function.Supplier;
//
//public final class ModRecipeSerializers {
//    public static final DeferredRegister<RecipeSerializer<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, DegeneracyCraft.MODID);
//
//    public static final RegistryObject<RecipeSerializer<?>> COMBINATION = register("combination", CombinationRecipe.Serializer::new);
//    public static final RegistryObject<RecipeSerializer<?>> SHAPED_TABLE = register("shaped_table", ShapedTableRecipe.Serializer::new);
//    public static final RegistryObject<RecipeSerializer<?>> SHAPELESS_TABLE = register("shapeless_table", ShapelessTableRecipe.Serializer::new);
//    public static final RegistryObject<RecipeSerializer<?>> COMPRESSOR = register("compressor", CompressorRecipe.Serializer::new);
//
//    @SubscribeEvent
//
//    private static RegistryObject<RecipeSerializer<?>> register(String name, Supplier<RecipeSerializer<?>> serializer) {
//        return REGISTRY.register(name, serializer);
//    }
//}
