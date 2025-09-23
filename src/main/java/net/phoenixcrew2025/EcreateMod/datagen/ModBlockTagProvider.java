package net.phoenixcrew2025.EcreateMod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.phoenixcrew2025.EcreateMod.EcreateMod;
import net.phoenixcrew2025.EcreateMod.block.ModBlocks;
import net.phoenixcrew2025.EcreateMod.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EcreateMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ECREATE_CORRUPTED_IRON_ORE.get())
                .add(ModBlocks.ECREATE_CORRUPTED_EMERALD_ORE.get())
                .add(ModBlocks.ECREATE_CORRUPTED_GOLD_ORE.get())
                .add(ModBlocks.ECREATE_CORRUPTED_DIAMOND_ORE.get())
                .add(ModBlocks.ECREATE_CORRUPTED_COAL_ORE.get())
                .add(ModBlocks.ECREATE_CORRUPTED_IRON_BLOCK.get())
                .add(ModBlocks.ECREATE_TRADE_FOUR.get())
                .add(ModBlocks.ECREATE_TRADE_ONE.get())
                .add(ModBlocks.ECREATE_TRADE_TWO.get())
                .add(ModBlocks.ECREATE_TRADE_THREE.get())
                .add(ModBlocks.ECREATE_TRADE_FIVE.get());


        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ECREATE_CORRUPTED_IRON_BLOCK.get())
                .add(ModBlocks.ECREATE_TRADE_FOUR.get())
                .add(ModBlocks.ECREATE_TRADE_ONE.get())
                .add(ModBlocks.ECREATE_TRADE_TWO.get())
                .add(ModBlocks.ECREATE_TRADE_THREE.get())
                .add(ModBlocks.ECREATE_TRADE_FIVE.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ECREATE_CORRUPTED_IRON_ORE.get())
                .add(ModBlocks.ECREATE_CORRUPTED_EMERALD_ORE.get())
                .add(ModBlocks.ECREATE_CORRUPTED_GOLD_ORE.get())
                .add(ModBlocks.ECREATE_CORRUPTED_DIAMOND_ORE.get())
                .add(ModBlocks.ECREATE_CORRUPTED_COAL_ORE.get());

        tag(ModTags.Blocks.NEEDS_ECREATE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_ECREATE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTags.Blocks.NEEDS_ECREATE_TOOL);
    }
}
