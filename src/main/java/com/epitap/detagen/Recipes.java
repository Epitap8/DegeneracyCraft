package com.epitap.detagen;

import com.epitap.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {
    private boolean FurnaceBlock;

    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        ShapedRecipeBuilder.shaped(Registration.THERMAL_POWER_GENERATOR.get())
                .pattern("iii")
                .pattern("ifi")
                .pattern("iii")
                .define('i', Tags.Items.INGOTS_IRON)
                .define('f',Tags.Items.STONE)
                .group("degeneracycraft")
                .unlockedBy("ingots/iron", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
                .save(consumer);

    }
}

