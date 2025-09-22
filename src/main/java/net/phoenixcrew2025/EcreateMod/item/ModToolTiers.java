package net.phoenixcrew2025.EcreateMod.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.phoenixcrew2025.EcreateMod.util.ModTags;

public class ModToolTiers {
    public static final Tier ECREATE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ECREATE_TOOL,
            1400, 4f, 3f, 28, () -> Ingredient.of(ModItems.ECREATE_CORRUPTED_IRON_INGOT));
}
