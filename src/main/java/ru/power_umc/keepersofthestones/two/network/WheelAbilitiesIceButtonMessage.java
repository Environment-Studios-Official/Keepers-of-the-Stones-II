
package ru.power_umc.keepersofthestones.two.network;

import ru.power_umc.keepersofthestones.two.world.inventory.WheelAbilitiesIceMenu;
import ru.power_umc.keepersofthestones.two.procedures.OpenWheelTwoProcedure;
import ru.power_umc.keepersofthestones.two.procedures.OpenWheelThreeProcedure;
import ru.power_umc.keepersofthestones.two.procedures.OpenWheelOneProcedure;
import ru.power_umc.keepersofthestones.two.procedures.Attack23Procedure;
import ru.power_umc.keepersofthestones.two.procedures.Attack22Procedure;
import ru.power_umc.keepersofthestones.two.procedures.Attack21Procedure;
import ru.power_umc.keepersofthestones.two.PowerMod;

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
public class WheelAbilitiesIceButtonMessage {
	private final int buttonID, x, y, z;

	public WheelAbilitiesIceButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public WheelAbilitiesIceButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(WheelAbilitiesIceButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(WheelAbilitiesIceButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = WheelAbilitiesIceMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenWheelOneProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpenWheelTwoProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenWheelThreeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			Attack21Procedure.execute(entity);
		}
		if (buttonID == 4) {

			Attack22Procedure.execute(entity);
		}
		if (buttonID == 5) {

			Attack23Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(WheelAbilitiesIceButtonMessage.class, WheelAbilitiesIceButtonMessage::buffer, WheelAbilitiesIceButtonMessage::new, WheelAbilitiesIceButtonMessage::handler);
	}
}
