package net.phoenixcrew2025.EcreateMod.villager;

import com.google.common.collect.ImmutableSet;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.phoenixcrew2025.EcreateMod.EcreateMod;
import net.phoenixcrew2025.EcreateMod.block.ModBlocks;
import net.phoenixcrew2025.EcreateMod.sound.ModSounds;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(BuiltInRegistries.POINT_OF_INTEREST_TYPE, EcreateMod.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(BuiltInRegistries.VILLAGER_PROFESSION, EcreateMod.MOD_ID);

    public static final Holder<PoiType> TRADING_ONE = POI_TYPES.register("trading_one",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.ECREATE_TRADE_ONE.get().getStateDefinition().getPossibleStates()), 1, 1));

    public static final Holder<VillagerProfession> ECREATOR_ONE = VILLAGER_PROFESSIONS.register("ecreator_one",
            () -> new VillagerProfession("ecreator_one", holder -> holder.value() == TRADING_ONE.value(),
                    poiTypeHolder -> poiTypeHolder.value() == TRADING_ONE.value(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundType.DEEPSLATE_BRICKS.getBreakSound()));


    public static final Holder<PoiType> TRADING_TWO = POI_TYPES.register("trading_two",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.ECREATE_TRADE_TWO.get().getStateDefinition().getPossibleStates()), 1, 1));

    public static final Holder<VillagerProfession> ECREATOR_TWO = VILLAGER_PROFESSIONS.register("ecreator_two",
            () -> new VillagerProfession("ecreator_two", holder -> holder.value() == TRADING_TWO.value(),
                    poiTypeHolder -> poiTypeHolder.value() == TRADING_TWO.value(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundType.DEEPSLATE_BRICKS.getBreakSound()));


    public static final Holder<PoiType> TRADING_THREE = POI_TYPES.register("trading_three",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.ECREATE_TRADE_THREE.get().getStateDefinition().getPossibleStates()), 1, 1));

    public static final Holder<VillagerProfession> ECREATOR_THREE = VILLAGER_PROFESSIONS.register("ecreator_three",
            () -> new VillagerProfession("ecreator_three", holder -> holder.value() == TRADING_THREE.value(),
                    poiTypeHolder -> poiTypeHolder.value() == TRADING_THREE.value(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundType.DEEPSLATE_BRICKS.getBreakSound()));


    public static final Holder<PoiType> TRADING_FOUR = POI_TYPES.register("trading_four",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.ECREATE_TRADE_FOUR.get().getStateDefinition().getPossibleStates()), 1, 1));

    public static final Holder<VillagerProfession> ECREATOR_FOUR = VILLAGER_PROFESSIONS.register("ecreator_four",
            () -> new VillagerProfession("ecreator_four", holder -> holder.value() == TRADING_FOUR.value(),
                    poiTypeHolder -> poiTypeHolder.value() == TRADING_FOUR.value(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundType.DEEPSLATE_BRICKS.getBreakSound()));


    public static final Holder<PoiType> TRADING_FIVE = POI_TYPES.register("trading_five",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.ECREATE_TRADE_FIVE.get().getStateDefinition().getPossibleStates()), 1, 1));

    public static final Holder<VillagerProfession> ECREATOR_FIVE = VILLAGER_PROFESSIONS.register("ecreator_five",
            () -> new VillagerProfession("ecreator_five", holder -> holder.value() == TRADING_FIVE.value(),
                    poiTypeHolder -> poiTypeHolder.value() == TRADING_FIVE.value(), ImmutableSet.of(), ImmutableSet.of(), SoundType.DEEPSLATE_BRICKS.getBreakSound()));


    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }

}
