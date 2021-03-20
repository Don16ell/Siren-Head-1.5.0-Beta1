package net.mcreator.sirenhead.HunterBow;

import net.mcreator.sirenhead.item.HunterBowItem;
import net.minecraft.item.ItemStack;

public class RangedAttackHelper {

    public static float getModdedBowChargeTime(ItemStack stack){
        float chargeTime;
        if(stack.getItem() instanceof HunterBowItem){
            chargeTime = ((HunterBowItem)stack.getItem()).getBowChargeTime(stack);
        }
        else{
            chargeTime = 20.0F;
        }
        return chargeTime;
    }
}
