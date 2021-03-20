package net.mcreator.sirenhead.HunterBow;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nullable;

public class CapabilityHelper {

    @Nullable
    public static IWeapon getWeaponCapability(ItemStack stack)
    {
        LazyOptional<IWeapon> lazyCap = stack.getCapability(WeaponProvider.WEAPON_CAPABILITY);
        if (lazyCap.isPresent()) {
            return lazyCap.orElseThrow(() -> new IllegalStateException("Couldn't get the weapon capability from the ItemStack!"));
        }
        return null;
    }
}
