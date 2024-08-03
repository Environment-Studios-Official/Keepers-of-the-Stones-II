package com.esmods.keepersofthestonestwo.procedures;

import net.neoforged.neoforge.network.handling.PlayPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationFactory;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

import com.esmods.keepersofthestonestwo.PowerMod;

@Mod.EventBusSubscriber(modid = "power", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AnimationsModuleSetupProcedure {
	@SubscribeEvent
	public static void onClientSetup(FMLClientSetupEvent event) {
		PlayerAnimationFactory.ANIMATION_DATA_FACTORY.registerFactory(new ResourceLocation("power", "player_animation"), 1000, AnimationsModuleSetupProcedure::registerPlayerAnimations);
	}

	private static IAnimation registerPlayerAnimations(AbstractClientPlayer player) {
		return new ModifierLayer<>();
	}

	@Mod.EventBusSubscriber(modid = "power", bus = Mod.EventBusSubscriber.Bus.MOD)
	public static record PowerModAnimationMessage(Component animation, int target, boolean override) implements CustomPacketPayload {

		public static final ResourceLocation ID = new ResourceLocation(PowerMod.MODID, "animations_module_setup");
		public PowerModAnimationMessage(FriendlyByteBuf buffer) {
			this(buffer.readComponent(), buffer.readInt(), buffer.readBoolean());
		}

		@Override
		public void write(final FriendlyByteBuf buffer) {
			buffer.writeComponent(animation);
			buffer.writeInt(target);
			buffer.writeBoolean(override);
		}

		@Override
		public ResourceLocation id() {
			return ID;
		}

		public static void handleData(final PowerModAnimationMessage message, final PlayPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND) {
				context.workHandler().submitAsync(() -> {
					Level level = Minecraft.getInstance().player.level();
					if (level.getEntity(message.target) != null) {
						Player player = (Player) level.getEntity(message.target);
						if (player instanceof AbstractClientPlayer player_) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player_).get(new ResourceLocation("power", "player_animation"));
							if (animation != null && (message.override ? true : !animation.isActive())) {
								animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("power", message.animation.getString()))));
							}
						}
					}
				}).exceptionally(e -> {
					context.packetHandler().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}

		@SubscribeEvent
		public static void registerMessage(FMLCommonSetupEvent event) {
			PowerMod.addNetworkMessage(PowerModAnimationMessage.ID, PowerModAnimationMessage::new, PowerModAnimationMessage::handleData);
		}
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
	}
}
