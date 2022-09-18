package com.Epitap.detagen;

import com.Epitap.degeneracycraft.DegeneracyCraft;
import com.Epitap.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
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

