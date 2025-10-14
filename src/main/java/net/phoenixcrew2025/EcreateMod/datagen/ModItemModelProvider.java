package net.phoenixcrew2025.EcreateMod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.phoenixcrew2025.EcreateMod.EcreateMod;
import net.phoenixcrew2025.EcreateMod.item.ModItems;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }


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
        basicItem(ModItems.FOOD_GOD_PART.get());
        basicItem(ModItems.HEART_OF_ECREATE.get());
        basicItem(ModItems.MEK_GOD_PART.get());
        basicItem(ModItems.MODIUM_GOD_PART.get());
        basicItem(ModItems.CREATE_GOD_PART.get());
        basicItem(ModItems.ORE_GOD_PART.get());
        basicItem(ModItems.ECREATE_SEEDS.get());

        basicItem(ModItems.BLUE_KEY.get());
        basicItem(ModItems.GREEN_KEY.get());
        basicItem(ModItems.PURPLE_KEY.get());
        basicItem(ModItems.ORANGE_KEY.get());
        basicItem(ModItems.RED_KEY.get());
        basicItem(ModItems.YELLOW_KEY.get());
        basicItem(ModItems.CONDENSED_BLOOD.get());

        basicItem(ModItems.ECREATE_CORRUPTED_BONE.get());
        basicItem(ModItems.ECREATE_CORRUPTED_ENDER_PEARL.get());
        basicItem(ModItems.ECREATE_CORRUPTED_FLESH.get());
        basicItem(ModItems.ECREATE_CORRUPTED_GUNPOWDER.get());
        basicItem(ModItems.ECREATE_CORRUPTED_SPIDER_EYE.get());
        basicItem(ModItems.ECREATE_CORRUPTED_STRING.get());

        basicItem(ModItems.SHADOW_MECHANISM.get());
        basicItem(ModItems.SHADOW_STEEL.get());
        basicItem(ModItems.REFINED_INGOT.get());
        basicItem(ModItems.REFINED_MECHANISM.get());
        basicItem(ModItems.MULTIPLITE_INGOT.get());
        basicItem(ModItems.MULTIPLITE_TUBE.get());
        basicItem(ModItems.INDUSTRIUM_INGOT.get());
        basicItem(ModItems.CHROMATIC_COMPOUND.get());
        basicItem(ModItems.DURASTEEL_INGOT.get());
        basicItem(ModItems.FORTUNITE_INGOT.get());


        handheldItem(ModItems.ECREATE_KING_SWORD);
        handheldItem(ModItems.ECREATE_KING_AXE);
        handheldItem(ModItems.ECREATE_KING_HOE);
        handheldItem(ModItems.ECREATE_KING_PICKAXE);
        handheldItem(ModItems.ECREATE_KING_SHOVEL);
        handheldItem(ModItems.ECREATE_KING_HAMMER);

        trimmedArmorItem(ModItems.ECREATE_KING_BOOTS);
        trimmedArmorItem(ModItems.ECREATE_KING_CHESTPLATE);
        trimmedArmorItem(ModItems.ECREATE_KING_LEGGINGS);
        trimmedArmorItem(ModItems.ECREATE_KING_HELMET);


    }

    private void trimmedArmorItem(DeferredItem<ArmorItem> itemDeferredItem) {
        final String MOD_ID = EcreateMod.MOD_ID; // Change this to your mod id

        if(itemDeferredItem.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemDeferredItem.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemDeferredItem.getId().getPath()));
            });
        }
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(EcreateMod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(EcreateMod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(EcreateMod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(EcreateMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
