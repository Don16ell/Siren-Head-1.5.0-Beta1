package net.mcreator.sirenhead.HunterBow;

import net.minecraft.item.ItemStack;

public interface IRangedWeapon {

    // Non-Enchantment Abilities

    default boolean setsPetsAttackTarget(ItemStack stack){
        return false;
    }

    // Enchantment Abilities

    default boolean hasQuickChargeBuiltIn(ItemStack stack){
        return false;
    }
}
