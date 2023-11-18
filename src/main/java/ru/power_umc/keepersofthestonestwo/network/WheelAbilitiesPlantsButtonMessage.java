
package ru.power_umc.keepersofthestonestwo.network;

import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesPlantsMenu;
import ru.power_umc.keepersofthestonestwo.procedures.OpenWheelTwoProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.OpenWheelThreeProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.OpenWheelOneProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.Attack55Procedure;
import ru.power_umc.keepersofthestonestwo.procedures.Attack54Procedure;
import ru.power_umc.keepersofthestonestwo.procedures.Attack53Procedure;
import ru.power_umc.keepersofthestonestwo.PowerMod;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WheelAbilitiesPlantsButtonMessage {
	private final int buttonID, x, y, z;

	public WheelAbilitiesPlantsButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public WheelAbilitiesPlantsButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(WheelAbilitiesPlantsButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(WheelAbilitiesPlantsButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = WheelAbilitiesPlantsMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			Attack53Procedure.execute(entity);
		}
		if (buttonID == 1) {

			Attack54Procedure.execute(entity);
		}
		if (buttonID == 2) {

			Attack55Procedure.execute(entity);
		}
		if (buttonID == 3) {

			OpenWheelOneProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			OpenWheelTwoProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			OpenWheelThreeProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(WheelAbilitiesPlantsButtonMessage.class, WheelAbilitiesPlantsButtonMessage::buffer, WheelAbilitiesPlantsButtonMessage::new, WheelAbilitiesPlantsButtonMessage::handler);
	}
}
