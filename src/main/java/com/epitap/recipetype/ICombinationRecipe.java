package com.epitap.recipetype;

import com.epitap.degeneracycraft.DegeneracyCraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Container;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;

import java.util.List;

/**
 * Used to represent a Combination recipe for the recipe type
 */
public interface ICombinationRecipe extends Recipe<Container> {
    int getPowerCost();
    int getPowerRate();
    List<Component> getInputsList();
    public static final RecipeType<ICombinationRecipe> RECIPE_TYPE = RecipeType.register(DegeneracyCraft.MODID);
}
