package net.phoenixcrew2025.EcreateMod.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.phoenixcrew2025.EcreateMod.EcreateMod;
import net.phoenixcrew2025.EcreateMod.block.ModBlocks;
import net.phoenixcrew2025.EcreateMod.item.ModItems;
import net.phoenixcrew2025.EcreateMod.item.custom.HammerItem;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.BlockEvent;
import net.phoenixcrew2025.EcreateMod.villager.ModVillagers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@EventBusSubscriber(modid = EcreateMod.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {
    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

    // Done with the help of https://github.com/CoFH/CoFHCore/blob/1.19.x/src/main/java/cofh/core/event/AreaEffectEvents.java
    // Don't be a jerk License
    @SubscribeEvent
    public static void onHammerUsage(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack mainHandItem = player.getMainHandItem();

        if(mainHandItem.getItem() instanceof HammerItem hammer && player instanceof ServerPlayer serverPlayer) {
            BlockPos initialBlockPos = event.getPos();
            if(HARVESTED_BLOCKS.contains(initialBlockPos)) {
                return;
            }

            for(BlockPos pos : HammerItem.getBlocksToBeDestroyed(1, initialBlockPos, serverPlayer)) {
                if(pos == initialBlockPos || !hammer.isCorrectToolForDrops(mainHandItem, event.getLevel().getBlockState(pos))) {
                    continue;
                }

                HARVESTED_BLOCKS.add(pos);
                serverPlayer.gameMode.destroyBlock(pos);
                HARVESTED_BLOCKS.remove(pos);
            }
        }
    }

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == ModVillagers.ECREATOR_ONE.value()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.ONE_DOLLAR.get(), 2),
                    new ItemStack(ModItems.ECREATE_SEEDS.get(), 1), 32, 3, 0.05f));

            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.FIVE_DOLLAR.get(), 3),
                    new ItemStack(ModBlocks.ECREATE_TRADE_TWO.get(), 1), 2, 3, 0.05f));
        }

        if(event.getType() == ModVillagers.ECREATOR_TWO.value()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.TEN_DOLLAR.get(), 1),
                    new ItemStack(ModItems.ECREATE_CORRUPTED_BONE.get(), 2), 8000, 3, 0.05f));

            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.TEN_DOLLAR.get(), 2),
                    new ItemStack(ModItems.ECREATE_CORRUPTED_STRING.get(), 3), 8000, 3, 0.05f));

            trades.get(3).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.FIFTY_DOLLAR.get(), 1),
                    new ItemStack(ModBlocks.ECREATE_TRADE_THREE.get(), 1), 2, 3, 0.05f));
        }

        if(event.getType() == ModVillagers.ECREATOR_THREE.value()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.TEN_DOLLAR.get(), 1),
                    new ItemStack(ModItems.ECREATE_CORRUPTED_GUNPOWDER.get(), 2), 8000, 3, 0.05f));

            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.TEN_DOLLAR.get(), 2),
                    new ItemStack(ModItems.ECREATE_CORRUPTED_FLESH.get(), 3), 8000, 3, 0.05f));

            trades.get(3).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.ONE_HUNDRED_DOLLAR.get(), 1),
                    new ItemStack(ModBlocks.ECREATE_TRADE_FOUR.get(), 1), 2, 3, 0.05f));
        }

        if(event.getType() == ModVillagers.ECREATOR_FOUR.value()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.ONE_THOUSAND_DOLLAR.get(), 1),
                    new ItemStack(ModItems.ECREATE_CORRUPTED_ENDER_PEARL.get(), 3), 8000, 3, 0.05f));

            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.ONE_THOUSAND_DOLLAR.get(), 3),
                    new ItemStack(ModBlocks.ECREATE_TRADE_FIVE.get(), 1), 2, 3, 0.05f));
        }

        if(event.getType() == ModVillagers.ECREATOR_FIVE.value()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.ONE_HUNDRED_THOUSAND_DOLLARS.get(), 1),
                    new ItemStack(ModItems.ECREATE_CORRUPTED_SPIDER_EYE.get(), 2), 8000, 3, 0.05f));

            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.ONE_HUNDRED_THOUSAND_DOLLARS.get(), 5),
                    new ItemStack(ModItems.HEART_OF_ECREATE.get(), 3), 8000, 3, 0.05f));

            trades.get(3).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.ONE_MILLION_DOLLARS.get(), 1),
                    new ItemStack(ModItems.ECREATE_CORRUPTED_NETHER_STAR.get(), 1), 8000, 3, 0.05f));
        }
    }

}