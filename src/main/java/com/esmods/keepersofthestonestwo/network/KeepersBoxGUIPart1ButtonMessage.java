
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

import com.esmods.keepersofthestonestwo.world.inventory.KeepersBoxGUIPart1Menu;
import com.esmods.keepersofthestonestwo.procedures.WaterElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.RainElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.OceanElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.MagnetElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.LightningElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.LavaElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.KBtoPart2Procedure;
import com.esmods.keepersofthestonestwo.procedures.IceElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.FireElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.ExplosionElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.EnergyElementGetProcedure;
import com.esmods.keepersofthestonestwo.procedures.BlueFlameElementGetProcedure;
import com.esmods.keepersofthestonestwo.PowerMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public record KeepersBoxGUIPart1ButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final ResourceLocation ID = new ResourceLocation(PowerMod.MODID, "keepers_box_gui_part_1_buttons");
	public KeepersBoxGUIPart1ButtonMessage(FriendlyByteBuf buffer) {
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

	public static void handleData(final KeepersBoxGUIPart1ButtonMessage message, final PlayPayloadContext context) {
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
		HashMap guistate = KeepersBoxGUIPart1Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			KBtoPart2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			FireElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			LavaElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 4) {

			EnergyElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 5) {

			RainElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 6) {

			LightningElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 7) {

			WaterElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 8) {

			OceanElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 9) {

			IceElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 10) {

			ExplosionElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 11) {

			MagnetElementGetProcedure.execute(world, entity);
		}
		if (buttonID == 12) {

			BlueFlameElementGetProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(KeepersBoxGUIPart1ButtonMessage.ID, KeepersBoxGUIPart1ButtonMessage::new, KeepersBoxGUIPart1ButtonMessage::handleData);
	}
}
