package net.phoenixcrew2025.EcreateMod.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.phoenixcrew2025.EcreateMod.EcreateMod;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> ECREATE_CORRUPTED_IRON_ORE_PLACED_KEY = registerKey("ecreate_corrupted_iron_ore_placed");
    public static final ResourceKey<PlacedFeature> ECREATE_CORRUPTED_GOLD_ORE_PLACED_KEY = registerKey("ecreate_corrupted_gold_ore_placed");
    public static final ResourceKey<PlacedFeature> ECREATE_CORRUPTED_DIAMOND_ORE_PLACED_KEY = registerKey("ecreate_corrupted_diamond_ore_placed");
    public static final ResourceKey<PlacedFeature> ECREATE_CORRUPTED_EMERALD_ORE_PLACED_KEY = registerKey("ecreate_corrupted_emerald_ore_placed");
    public static final ResourceKey<PlacedFeature> ECREATE_CORRUPTED_COAL_ORE_PLACED_KEY = registerKey("ecreate_corrupted_coal_ore_placed");


    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ECREATE_CORRUPTED_COAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ECREATE_CORRUPTED_COAL_ORE_KEY),
                ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, ECREATE_CORRUPTED_EMERALD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ECREATE_CORRUPTED_EMERALD_ORE_KEY),
                ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, ECREATE_CORRUPTED_DIAMOND_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ECREATE_CORRUPTED_DIAMOND_ORE_KEY),
                ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, ECREATE_CORRUPTED_GOLD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ECREATE_CORRUPTED_GOLD_ORE_KEY),
                ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, ECREATE_CORRUPTED_IRON_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ECREATE_CORRUPTED_IRON_ORE_KEY),
                ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(EcreateMod.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

}
