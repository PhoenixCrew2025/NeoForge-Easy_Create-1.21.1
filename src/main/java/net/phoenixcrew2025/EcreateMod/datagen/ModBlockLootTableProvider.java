package net.phoenixcrew2025.EcreateMod.datagen;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.phoenixcrew2025.EcreateMod.block.ModBlocks;
import net.phoenixcrew2025.EcreateMod.block.custom.EcreateCropBlock;
import net.phoenixcrew2025.EcreateMod.item.ModItems;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.ECREATE_CORRUPTED_IRON_BLOCK.get());

        dropSelf(ModBlocks.ECREATE_TRADE_ONE.get());
        dropSelf(ModBlocks.ECREATE_TRADE_TWO.get());
        dropSelf(ModBlocks.ECREATE_TRADE_THREE.get());
        dropSelf(ModBlocks.ECREATE_TRADE_FOUR.get());
        dropSelf(ModBlocks.ECREATE_TRADE_FIVE.get());

        add(ModBlocks.ECREATE_CORRUPTED_GOLD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ECREATE_CORRUPTED_GOLD_ORE.get(), ModItems.ECREATE_CORRUPTED_RAW_GOLD.get(), 1, 3));

        add(ModBlocks.ECREATE_CORRUPTED_DIAMOND_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ECREATE_CORRUPTED_DIAMOND_ORE.get(), ModItems.ECREATE_CORRUPTED_RAW_DIAMOND.get(), 1, 3));

        add(ModBlocks.ECREATE_CORRUPTED_COAL_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ECREATE_CORRUPTED_COAL_ORE.get(), ModItems.ECREATE_CORRUPTED_COAL.get(), 1, 3));

        add(ModBlocks.ECREATE_CORRUPTED_EMERALD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ECREATE_CORRUPTED_EMERALD_ORE.get(), ModItems.ECREATE_CORRUPTED_RAW_EMERALD.get(), 1, 3));

        add(ModBlocks.ECREATE_CORRUPTED_IRON_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ECREATE_CORRUPTED_IRON_ORE.get(), ModItems.ECREATE_CORRUPTED_RAW_IRON.get(), 1, 3));


        LootItemCondition.Builder lootItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.ECREATE_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(EcreateCropBlock.AGE, 3));
        this.add(ModBlocks.ECREATE_CROP.get(), this.createCropDrops(ModBlocks.ECREATE_CROP.get(),
                ModItems.ECREATE_ESSENCE.get(), ModItems.ECREATE_SEEDS.get(), lootItemConditionBuilder));

    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
