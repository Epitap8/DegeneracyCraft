package com.epitap.recipetype;


import net.minecraft.world.item.ItemStack;

import java.util.function.Function;

public class BaseReusableItem extends BaseItem {
	private final boolean damage;
	private final boolean tooltip;

	public BaseReusableItem(Function<Properties, Properties> properties) {
		this(true, properties);
	}

	public boolean hasCraftingRemainingItem(ItemStack stack) {
		return true;
	}

	public boolean getCraftingRemainingItem(ItemStack stack) {
		return true;
	}

	public BaseReusableItem(boolean tooltip, Function<Properties, Properties> properties) {
		this(0, tooltip, properties);
	}

	public BaseReusableItem(int uses, Function<Properties, Properties> properties) {
		this(uses, true, properties);
	}

	public BaseReusableItem(int uses, boolean tooltip, Function<Properties, Properties> properties) {
		super(properties.compose(p -> p.defaultDurability(Math.max(uses - 1, 0)).setNoRepair()));
		this.damage = uses > 0;
		this.tooltip = tooltip;
	}



}
