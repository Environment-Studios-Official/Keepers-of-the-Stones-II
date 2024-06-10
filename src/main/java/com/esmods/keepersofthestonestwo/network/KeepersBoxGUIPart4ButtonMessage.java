
package com.esmods.keepersofthestonestwo.network;

import net.neoforged.neoforge.network.handling.PlayPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.HashMap;

import com.esmods.keepersofthestonestwo.world.inventory.KeepersBoxGUIPart4Menu;
import com.esmods.keepersofthestonestwo.procedures.PlantsElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.MetalElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.KBtoPart3Procedure;
import com.esmods.keepersofthestonestwo.procedures.EtherElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.EarthElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.CrystalElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.AnimalsElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.AmberElementGetProcedure;
import com.esmods.keepersofthestonestwo.PowerMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public record KeepersBoxGUIPart4ButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final ResourceLocation ID = new ResourceLocation(PowerMod.MODID, "keepers_box_gui_part_4_buttons");
	public KeepersBoxGUIPart4ButtonMessage(FriendlyByteBuf buffer) {
		this(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt());
	}

	@Override
	public void write(final FriendlyByteBuf buffer) {
		buffer.writeInt(buttonID);
		buffer.writeInt(x);
		buffer.writeInt(y);
		buffer.writeInt(z);
	}

	@Override
	public ResourceLocation id() {
		return ID;
	}

	public static void handleData(final KeepersBoxGUIPart4ButtonMessage message, final PlayPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.workHandler().submitAsync(() -> {
				Player entity = context.player().get();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			}).exceptionally(e -> {
				context.packetHandler().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = KeepersBoxGUIPart4Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			KBtoPart3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			AnimalsElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			CrystalElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 4) {

			EtherElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 5) {

			MetalElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 6) {

			EarthElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 7) {

			PlantsElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 8) {

			AmberElementGetProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(KeepersBoxGUIPart4ButtonMessage.ID, KeepersBoxGUIPart4ButtonMessage::new, KeepersBoxGUIPart4ButtonMessage::handleData);
	}
}
