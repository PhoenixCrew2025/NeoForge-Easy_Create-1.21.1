package net.phoenixcrew2025.EcreateMod.datagen;

import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.phoenixcrew2025.EcreateMod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    protected ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather() {
        this.builder(NeoForgeDataMaps.FURNACE_FUELS)
                .add(ModItems.ECREATE_CORRUPTED_COAL.getId(), new FurnaceFuel(72000), false);

        this.builder(NeoForgeDataMaps.COMPOSTABLES)
                .add(ModItems.ECREATE_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.ECREATE_ESSENCE.getId(), new Compostable(0.25f), false);
    }
}
