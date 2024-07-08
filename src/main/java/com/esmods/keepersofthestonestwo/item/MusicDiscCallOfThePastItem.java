
package com.esmods.keepersofthestonestwo.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class CallOfThePastRecordItem extends RecordItem {
	public CallOfThePastRecordItem() {
		super(8, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("power:record.call_of_the_past")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2960);
	}
}
