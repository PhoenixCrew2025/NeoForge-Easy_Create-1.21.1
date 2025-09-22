package net.phoenixcrew2025.EcreateMod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.phoenixcrew2025.EcreateMod.EcreateMod;
import net.phoenixcrew2025.EcreateMod.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, EcreateMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.SWORDS)
                .add(ModItems.ECREATE_KING_SWORD.get());

        tag(ItemTags.PICKAXES)
                .add(ModItems.ECREATE_KING_PICKAXE.get());

        tag(ItemTags.SHOVELS)
                .add(ModItems.ECREATE_KING_SHOVEL.get());

        tag(ItemTags.AXES)
                .add(ModItems.ECREATE_KING_AXE.get());

        tag(ItemTags.HOES)
                .add(ModItems.ECREATE_KING_HOE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ECREATE_KING_BOOTS.get())
                .add(ModItems.ECREATE_KING_LEGGINGS.get())
                .add(ModItems.ECREATE_KING_CHESTPLATE.get())
                .add(ModItems.ECREATE_KING_HELMET.get());

    }
}
