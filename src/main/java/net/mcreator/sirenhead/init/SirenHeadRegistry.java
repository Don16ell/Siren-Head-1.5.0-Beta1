package net.mcreator.sirenhead.init;

import net.mcreator.sirenhead.ModItemTier;
import net.mcreator.sirenhead.SirenHeadModMod;
import net.mcreator.sirenhead.item.HunterBowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SirenHeadRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SirenHeadModMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus()); // Send the item register to the game
    }

    public static final RegistryObject<Item> hunter_sword = ITEMS.register("hunter_sword",
            () -> new SwordItem(ModItemTier.hunter,24, -2.4F, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> hunter_bow = ITEMS.register("hunter_bow",
            () -> new HunterBowItem(new Item.Properties().defaultMaxDamage(256).group(ItemGroup.COMBAT)));
}
