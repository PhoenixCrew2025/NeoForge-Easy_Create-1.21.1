package net.phoenixcrew2025.EcreateMod.datagen;


import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.phoenixcrew2025.EcreateMod.EcreateMod;
import net.phoenixcrew2025.EcreateMod.block.ModBlocks;

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
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
