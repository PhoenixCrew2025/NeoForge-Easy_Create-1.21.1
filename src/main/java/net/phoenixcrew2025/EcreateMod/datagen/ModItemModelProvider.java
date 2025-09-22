package net.phoenixcrew2025.EcreateMod.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.phoenixcrew2025.EcreateMod.EcreateMod;
import net.phoenixcrew2025.EcreateMod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EcreateMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ONE_DOLLAR.get());
        basicItem(ModItems.FIVE_DOLLAR.get());
        basicItem(ModItems.TEN_DOLLAR.get());
        basicItem(ModItems.FIFTY_DOLLAR.get());
        basicItem(ModItems.ONE_HUNDRED_DOLLAR.get());
        basicItem(ModItems.ONE_THOUSAND_DOLLAR.get());
        basicItem(ModItems.COBBLEMON_BATTLE_MUSIC_DISC.get());
        basicItem(ModItems.PINK_FLUFFY_UNICORN_DISC.get());
        basicItem(ModItems.ACDC_BACK_IN_BLACK_DISC.get());
        basicItem(ModItems.ACDC_BIG_BALLS_DISC.get());
        basicItem(ModItems.ACDC_HELLS_BELLS_DISC.get());
        basicItem(ModItems.ACDC_HIGHWAY_TO_HELL_DISC.get());
        basicItem(ModItems.DEMONS_SONG_DISC.get());
        basicItem(ModItems.OCEAN_DRIVE_DISC.get());
        basicItem(ModItems.SICKNESS_DISC.get());
        basicItem(ModItems.ALLSTARS_DISC.get());
        basicItem(ModItems.JUST_A_BOOK_DISC.get());
        basicItem(ModItems.GODS_THEME_DISC.get());
        basicItem(ModItems.SLEEP_TOKEN_DISC.get());
        basicItem(ModItems.TEN_THOUSAND_DOLLARS.get());
        basicItem(ModItems.ONE_HUNDRED_THOUSAND_DOLLARS.get());
        basicItem(ModItems.ONE_MILLION_DOLLARS.get());
        basicItem(ModItems.UNIVERSAL_COLLAPSE_DISC.get());
        basicItem(ModItems.LAVA_CHICKEN_MUSIC_DISC.get());
        basicItem(ModItems.TEARS_MUSIC_DISC.get());
        basicItem(ModItems.BLACK_CATCHER_DISC.get());
        basicItem(ModItems.EVERYTHING_I_GOT_DISC.get());
        basicItem(ModItems.DONT_FORGET_DELTARUNE_DISC.get());
        basicItem(ModItems.YOU_SPIN_ME_RIGHT_ROUND_DISC.get());
        basicItem(ModItems.ECREATE_ROD.get());
        basicItem(ModItems.ECREATE_QUARTS.get());
        basicItem(ModItems.ECREATE_CORRUPTED_GOLD.get());
        basicItem(ModItems.ECREATE_CORRUPTED_IRON_INGOT.get());
        basicItem(ModItems.ECREATE_CORRUPTED_COAL.get());
        basicItem(ModItems.ECREATE_CORRUPTED_DIAMOND.get());
        basicItem(ModItems.ECREATE_CORRUPTED_EMERALD.get());
        basicItem(ModItems.ECREATE_CORRUPTED_RAW_IRON.get());
        basicItem(ModItems.ECREATE_CORRUPTED_RAW_DIAMOND.get());
        basicItem(ModItems.ECREATE_CORRUPTED_RAW_EMERALD.get());
        basicItem(ModItems.ECREATE_CORRUPTED_RAW_GOLD.get());
        basicItem(ModItems.ECREATE_CRYSTAL.get());
        basicItem(ModItems.ECREATE_ESSENCE.get());
        basicItem(ModItems.ECREATE_CORRUPTED_NETHER_STAR.get());
        basicItem(ModItems.ECREATE_SHARD.get());
        basicItem(ModItems.ATM_ALLOY_SMITHING_TEMPLATE.get());
        basicItem(ModItems.GOD_MAIN_PART.get());
        basicItem(ModItems.BLOOD_GOD_PART.get());
        basicItem(ModItems.FOOD_GOD_PART.get());
        basicItem(ModItems.HEART_OF_ECREATE.get());
        basicItem(ModItems.MEK_GOD_PART.get());
        basicItem(ModItems.MODIUM_GOD_PART.get());
        basicItem(ModItems.CREATE_GOD_PART.get());
        basicItem(ModItems.ORE_GOD_PART.get());


        handheldItem(ModItems.ECREATE_KING_SWORD.get());
        handheldItem(ModItems.ECREATE_KING_AXE.get());
        handheldItem(ModItems.ECREATE_KING_HOE.get());
        handheldItem(ModItems.ECREATE_KING_PICKAXE.get());
        handheldItem(ModItems.ECREATE_KING_SHOVEL.get());
    }
}
