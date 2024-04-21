package com.esmods.keepersofthestonestwo.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.forgespi.language.IModInfo;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

import java.util.List;

import java.net.URL;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

@Mod.EventBusSubscriber
public class ModVersionCheckerProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		File testfile = new File("");
		String version = "";
		String url = "";
		com.google.gson.JsonObject jmain = new com.google.gson.JsonObject();
		double v1 = 0;
		double v2 = 0;
		double v3 = 0;
		double v4 = 0;
		PowerModVariables.dev_channel = 0;
		if (PowerModVariables.dev_channel == 0) {
			List<IModInfo> mods = ModList.get().getMods();
			for (IModInfo mod : mods) {
				if ((mod.getModId()).equals("power")) {
					version = mod.getVersion().toString();
					String[] ver = version.split("[.]");
					v1 = new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(ver[0]);
					v2 = new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(ver[1]);
					v3 = new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(ver[2]);
					v4 = new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(ver[3]);
				}
			}
			testfile = new File(System.getProperty("java.io.tmpdir"), File.separator + "modcheck.json");
			jmain = jmain;
			url = "https://raw.githubusercontent.com/Environment-Studios-Official/Environment-Update-Center/main/kots_latest_beta.json";
			try {
				org.apache.commons.io.FileUtils.copyURLToFile(new URL(url), testfile, 4000, 4000);
			} catch (IOException e) {
				e.printStackTrace();
			}
			{
				try {
					BufferedReader bufferedReader = new BufferedReader(new FileReader(testfile));
					StringBuilder jsonstringbuilder = new StringBuilder();
					String line;
					while ((line = bufferedReader.readLine()) != null) {
						jsonstringbuilder.append(line);
					}
					bufferedReader.close();
					jmain = new com.google.gson.Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
					if (jmain.get("ver1").getAsDouble() > v1 || jmain.get("ver2").getAsDouble() > v2 && jmain.get("ver1").getAsDouble() >= v1
							|| jmain.get("ver3").getAsDouble() > v3 && jmain.get("ver2").getAsDouble() >= v2 && jmain.get("ver1").getAsDouble() >= v1
							|| jmain.get("ver4").getAsDouble() > v4 && jmain.get("ver3").getAsDouble() >= v3 && jmain.get("ver2").getAsDouble() >= v2 && jmain.get("ver1").getAsDouble() >= v1) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((Component.translatable("power.modinfo.outdated_mod").getString() + "" + Math.round(jmain.get("ver1").getAsDouble()) + "." + Math.round(jmain.get("ver2").getAsDouble()) + "."
									+ Math.round(jmain.get("ver3").getAsDouble()) + "." + Math.round(jmain.get("ver4").getAsDouble()) + ")")), false);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else if (PowerModVariables.dev_channel == 1) {
			List<IModInfo> mods = ModList.get().getMods();
			for (IModInfo mod : mods) {
				if ((mod.getModId()).equals("power")) {
					version = mod.getVersion().toString();
					String[] ver = version.split("[.]");
					v1 = new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(ver[0]);
					v2 = new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(ver[1]);
					v3 = new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(ver[2]);
				}
			}
			testfile = new File(System.getProperty("java.io.tmpdir"), File.separator + "modcheck.json");
			jmain = jmain;
			url = "https://raw.githubusercontent.com/Environment-Studios-Official/Environment-Update-Center/main/kots_latest_release.json";
			try {
				org.apache.commons.io.FileUtils.copyURLToFile(new URL(url), testfile, 4000, 4000);
			} catch (IOException e) {
				e.printStackTrace();
			}
			{
				try {
					BufferedReader bufferedReader = new BufferedReader(new FileReader(testfile));
					StringBuilder jsonstringbuilder = new StringBuilder();
					String line;
					while ((line = bufferedReader.readLine()) != null) {
						jsonstringbuilder.append(line);
					}
					bufferedReader.close();
					jmain = new com.google.gson.Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
					if (jmain.get("ver1").getAsDouble() > v1 || jmain.get("ver2").getAsDouble() > v2 && jmain.get("ver1").getAsDouble() >= v1
							|| jmain.get("ver3").getAsDouble() > v3 && jmain.get("ver2").getAsDouble() >= v2 && jmain.get("ver1").getAsDouble() >= v1) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((Component.translatable("power.modinfo.outdated_mod").getString() + "" + Math.round(jmain.get("ver1").getAsDouble()) + "." + Math.round(jmain.get("ver2").getAsDouble()) + "."
									+ Math.round(jmain.get("ver3").getAsDouble()) + ")")), false);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else if (PowerModVariables.dev_channel >= 2) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("" + Component.translatable("power.modinfo.unofficial_version").getString())), false);
		}
	}
}
