
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

import com.esmods.keepersofthestonestwo.world.inventory.KeepersBoxGUIPart3Menu;
import com.esmods.keepersofthestonestwo.procedures.VacuumElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.SunElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.SpaceElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.ShadowElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.MoonElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.LightElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.KBtoPart4Procedure;
import com.esmods.keepersofthestonestwo.procedures.KBtoPart2Procedure;
import com.esmods.keepersofthestonestwo.procedures.BloodElementGetProcedure;
import com.esmods.keepersofthestonestwo.PowerMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public record KeepersBoxGUIPart3ButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final ResourceLocation ID = new ResourceLocation(PowerMod.MODID, "keepers_box_gui_part_3_buttons");
	public KeepersBoxGUIPart3ButtonMessage(FriendlyByteBuf buffer) {
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

	public static void handleData(final KeepersBoxGUIPart3ButtonMessage message, final PlayPayloadContext context) {
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
		HashMap guistate = KeepersBoxGUIPart3Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			KBtoPart2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			KBtoPart4Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			LightElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			ShadowElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 4) {

			SunElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 5) {

			SpaceElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 6) {

			MoonElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 7) {

			VacuumElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 8) {

			BloodElementGetProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(KeepersBoxGUIPart3ButtonMessage.ID, KeepersBoxGUIPart3ButtonMessage::new, KeepersBoxGUIPart3ButtonMessage::handleData);
	}
}
