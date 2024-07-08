
package com.esmods.keepersofthestonestwo.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class MusicDiscAncientMoodItem extends RecordItem {
	public MusicDiscAncientMoodItem() {
		super(9, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("power:record.ancient_mood")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4060);
	}
}
