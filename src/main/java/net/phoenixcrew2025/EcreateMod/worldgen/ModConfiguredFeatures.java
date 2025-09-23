package net.phoenixcrew2025.EcreateMod.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.phoenixcrew2025.EcreateMod.EcreateMod;
import net.phoenixcrew2025.EcreateMod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> ECREATE_CORRUPTED_IRON_ORE_KEY = registerKey("ecreate_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ECREATE_CORRUPTED_GOLD_ORE_KEY = registerKey("ecreate_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ECREATE_CORRUPTED_DIAMOND_ORE_KEY = registerKey("ecreate_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ECREATE_CORRUPTED_EMERALD_ORE_KEY = registerKey("ecreate_emerald_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ECREATE_CORRUPTED_COAL_ORE_KEY = registerKey("ecreate_coal_ore");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> ecreateCorruptedOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.ECREATE_CORRUPTED_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceables, ModBlocks.ECREATE_CORRUPTED_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceables, ModBlocks.ECREATE_CORRUPTED_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceables, ModBlocks.ECREATE_CORRUPTED_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(stoneReplaceables, ModBlocks.ECREATE_CORRUPTED_IRON_ORE.get().defaultBlockState()));

        register(context, ECREATE_CORRUPTED_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(ecreateCorruptedOre, 5));
        register(context, ECREATE_CORRUPTED_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(ecreateCorruptedOre, 5));
        register(context, ECREATE_CORRUPTED_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(ecreateCorruptedOre, 5));
        register(context, ECREATE_CORRUPTED_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(ecreateCorruptedOre, 5));
        register(context, ECREATE_CORRUPTED_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(ecreateCorruptedOre, 5));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(EcreateMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
