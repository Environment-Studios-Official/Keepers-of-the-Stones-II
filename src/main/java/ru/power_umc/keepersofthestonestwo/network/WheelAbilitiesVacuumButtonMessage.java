
package ru.power_umc.keepersofthestonestwo.network;

import ru.power_umc.keepersofthestonestwo.world.inventory.WheelAbilitiesVacuumMenu;
import ru.power_umc.keepersofthestonestwo.procedures.OpenWheelTwoProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.OpenWheelThreeProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.OpenWheelOneProcedure;
import ru.power_umc.keepersofthestonestwo.procedures.Atttack73Procedure;
import ru.power_umc.keepersofthestonestwo.procedures.Attack75Procedure;
import ru.power_umc.keepersofthestonestwo.procedures.Attack74Procedure;
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
public class WheelAbilitiesVacuumButtonMessage {
	private final int buttonID, x, y, z;

	public WheelAbilitiesVacuumButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public WheelAbilitiesVacuumButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(WheelAbilitiesVacuumButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(WheelAbilitiesVacuumButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = WheelAbilitiesVacuumMenu.guistate;
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

			Atttack73Procedure.execute(entity);
		}
		if (buttonID == 4) {

			Attack74Procedure.execute(entity);
		}
		if (buttonID == 5) {

			Attack75Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(WheelAbilitiesVacuumButtonMessage.class, WheelAbilitiesVacuumButtonMessage::buffer, WheelAbilitiesVacuumButtonMessage::new, WheelAbilitiesVacuumButtonMessage::handler);
	}
}
