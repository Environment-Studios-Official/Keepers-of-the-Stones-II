
package com.esmods.keepersofthestonestwo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class KeeperBookItem extends Item {
	public KeeperBookItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
