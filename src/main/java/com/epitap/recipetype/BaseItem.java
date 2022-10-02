package com.epitap.recipetype;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Function;

public abstract class BaseItem extends Item {
	public BaseItem(Function<Properties, Properties> properties) {
		super(properties.apply(new Properties()));
	}

	@Override
	public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items) {
		if (this instanceof IEnableable enableable) {
			if (enableable.isEnabled())
				super.fillItemCategory(group, items);
		} else {
			super.fillItemCategory(group, items);
		}
	}

	public abstract boolean hasCraftingRemainingItem(ItemStack stack);

	public abstract boolean getCraftingRemainingItem(ItemStack stack);
}