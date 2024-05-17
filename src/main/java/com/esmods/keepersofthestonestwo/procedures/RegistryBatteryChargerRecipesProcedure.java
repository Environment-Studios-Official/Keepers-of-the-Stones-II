package com.esmods.keepersofthestonestwo.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

import com.esmods.keepersofthestonestwo.init.PowerModItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryBatteryChargerRecipesProcedure {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		execute();
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		com.google.gson.JsonObject mainJsonObject = new com.google.gson.JsonObject();
		com.google.gson.JsonObject subJsonObject = new com.google.gson.JsonObject();
		File file = new File("");
		file = new File((FMLPaths.GAMEDIR.get().toString() + "/config/power/custom_data/recipes/"), File.separator + ("recipes_registry" + ".json"));
		if (!file.exists()) {
			try {
				file.getParentFile().mkdirs();
				file.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			mainJsonObject.add((ForgeRegistries.ITEMS.getKey(PowerModItems.FIRE_STONE.get()).toString() + "_battery_charge"), subJsonObject);
			subJsonObject.addProperty("stone_input_slot", (ForgeRegistries.ITEMS.getKey(PowerModItems.FIRE_STONE.get()).toString()));
			subJsonObject.addProperty("empty_battery_input_slot", (ForgeRegistries.ITEMS.getKey(PowerModItems.EMPTY_BATTERY.get()).toString()));
			subJsonObject.addProperty("battery_output_slot", (ForgeRegistries.ITEMS.getKey(PowerModItems.FIRE_BATTERY.get()).toString()));
			{
				com.google.gson.Gson mainGSONBuilderVariable = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
				try {
					FileWriter fileWriter = new FileWriter(file);
					fileWriter.write(mainGSONBuilderVariable.toJson(mainJsonObject));
					fileWriter.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
			mainJsonObject.add((ForgeRegistries.ITEMS.getKey(PowerModItems.AIR_STONE.get()).toString() + "_battery_charge"), subJsonObject);
			subJsonObject.addProperty("stone_input_slot", (ForgeRegistries.ITEMS.getKey(PowerModItems.AIR_STONE.get()).toString()));
			subJsonObject.addProperty("empty_battery_input_slot", (ForgeRegistries.ITEMS.getKey(PowerModItems.EMPTY_BATTERY.get()).toString()));
			subJsonObject.addProperty("battery_output_slot", (ForgeRegistries.ITEMS.getKey(PowerModItems.AIR_BATTERY.get()).toString()));
			{
				com.google.gson.Gson mainGSONBuilderVariable = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
				try {
					FileWriter fileWriter = new FileWriter(file);
					fileWriter.write(mainGSONBuilderVariable.toJson(mainJsonObject));
					fileWriter.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		}
	}
}
