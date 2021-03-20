package net.mcreator.sirenhead;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

//import static com.mrbelieve.mvw.ItemTagWrappers.SILVER_REPAIR_ITEMS;


public enum ModItemTier implements IItemTier
{
	//HarvestLvl,
	//Durability(Wood = 59, Iron = 250, Diamond = 1561, Netherite = 2031),
	//Efficiency(Wood = 2.0, Iron = 6.0, Diamond = 8.0),
	//Attack Damage(Wood = 0),
	//Enchantibility(Wood = 15),
	//RepairMat
	hunter(4, 3215, 9.0F, 0.0F, 15, () -> {
		return Ingredient.fromItems();
	});
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantibility;
	private final LazyValue<Ingredient> repairMaterial;
	
	private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantibility, Supplier<Ingredient> repairMaterial) 
	{
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantibility = enchantibility;
		this.repairMaterial = new LazyValue<>(repairMaterial);
	}

	@Override
	public int getMaxUses() {
		return this.maxUses;
	}

	@Override
	public float getEfficiency() {
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}

	@Override
	public int getEnchantability() {
		return this.enchantibility;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}
}
