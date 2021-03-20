package net.mcreator.sirenhead.HunterBow;

import net.mcreator.sirenhead.item.HunterBowItem;
import net.mcreator.sirenhead.init.SirenHeadRegistry;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.ResourceLocation;


public class BowItemModelsProperties {

	public BowItemModelsProperties() {

		// bow animations
		ItemModelsProperties.registerProperty(SirenHeadRegistry.hunter_bow.get(), new ResourceLocation("pull"),
				(stack, clientWorld, livingEntity) -> {
					if (livingEntity == null) {
						return 0.0F;
					} else {
						return !(livingEntity.getActiveItemStack().getItem() instanceof HunterBowItem) ? 0.0F
								: (float) (stack.getUseDuration() - livingEntity.getItemInUseCount())
								/ RangedAttackHelper.getModdedBowChargeTime(livingEntity.getActiveItemStack());
					}
				});
		ItemModelsProperties.registerProperty(SirenHeadRegistry.hunter_bow.get(), new ResourceLocation("pulling"),
				(stack, clientWorld, livingEntity) -> {
					return livingEntity != null && livingEntity.isHandActive()
							&& livingEntity.getActiveItemStack() == stack
							? 1.0F
							: 0.0F;
				});
	}

}