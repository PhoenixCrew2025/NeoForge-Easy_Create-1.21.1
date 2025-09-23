package net.phoenixcrew2025.EcreateMod.datagen;


import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.phoenixcrew2025.EcreateMod.EcreateMod;
import net.phoenixcrew2025.EcreateMod.block.ModBlocks;
import net.phoenixcrew2025.EcreateMod.block.custom.EcreateCropBlock;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EcreateMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ECREATE_CORRUPTED_IRON_ORE);
        blockWithItem(ModBlocks.ECREATE_CORRUPTED_EMERALD_ORE);
        blockWithItem(ModBlocks.ECREATE_CORRUPTED_GOLD_ORE);
        blockWithItem(ModBlocks.ECREATE_CORRUPTED_DIAMOND_ORE);
        blockWithItem(ModBlocks.ECREATE_CORRUPTED_COAL_ORE);
        blockWithItem(ModBlocks.ECREATE_CORRUPTED_IRON_BLOCK);

        blockWithItem(ModBlocks.ECREATE_TRADE_ONE);
        blockWithItem(ModBlocks.ECREATE_TRADE_FIVE);
        blockWithItem(ModBlocks.ECREATE_TRADE_FOUR);
        blockWithItem(ModBlocks.ECREATE_TRADE_THREE);
        blockWithItem(ModBlocks.ECREATE_TRADE_TWO);

        makeCrop(((CropBlock) ModBlocks.ECREATE_CROP.get()), "ecreate_crop_stage", "ecreate_crop_stage");
        
    }

    public void makeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((EcreateCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(EcreateMod.MOD_ID, "block/" + textureName + state.getValue(((EcreateCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }


    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
