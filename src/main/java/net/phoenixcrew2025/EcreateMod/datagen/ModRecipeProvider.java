package net.phoenixcrew2025.EcreateMod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.phoenixcrew2025.EcreateMod.block.ModBlocks;
import net.phoenixcrew2025.EcreateMod.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }


    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ECREATE_CORRUPTED_IRON_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.ECREATE_CORRUPTED_IRON_INGOT.get())
                .unlockedBy("has_ecreate_corrupted_iron_ingot", has(ModItems.ECREATE_CORRUPTED_IRON_INGOT)).save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ECREATE_CORRUPTED_IRON_INGOT.get(), 9)
                .requires(ModBlocks.ECREATE_CORRUPTED_IRON_BLOCK)
                .unlockedBy("has_ecreate_corrupted_iron_block", has(ModBlocks.ECREATE_CORRUPTED_IRON_BLOCK)).save(recipeOutput);


    }
}
