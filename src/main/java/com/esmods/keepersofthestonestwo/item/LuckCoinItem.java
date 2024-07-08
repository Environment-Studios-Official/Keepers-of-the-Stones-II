
package com.esmods.keepersofthestonestwo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LuckCoinItem extends Item {
	public LuckCoinItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}
}
