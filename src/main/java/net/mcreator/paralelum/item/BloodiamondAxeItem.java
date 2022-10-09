
package net.mcreator.paralelum.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.paralelum.init.ParalelumModItems;

public class BloodiamondAxeItem extends AxeItem {
	public BloodiamondAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2000;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 20f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 34;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ParalelumModItems.BLOODIAMOND.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
