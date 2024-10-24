package com.esmods.keepersofthestonestwo.procedures;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

import com.esmods.keepersofthestonestwo.PowerMod;

@EventBusSubscriber(modid = "power", bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AnimationsModuleSetupProcedure {
	@SubscribeEvent
	public static void onClientSetup(FMLClientSetupEvent event) {
		PlayerAnimationAccess.REGISTER_ANIMATION_EVENT.register((player, animationStack) -> {
			ModifierLayer<IAnimation> layer = new ModifierLayer<>();
			animationStack.addAnimLayer(69, layer);
			PlayerAnimationAccess.getPlayerAssociatedData(player).set(ResourceLocation.fromNamespaceAndPath("power", "player_animation"), layer);
		});
	}

	@EventBusSubscriber(modid = "power", bus = EventBusSubscriber.Bus.MOD)
	public static record PowerModAnimationMessage(String animation, int target, boolean override) implements CustomPacketPayload {

		public static final Type<PowerModAnimationMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(PowerMod.MODID, "animations_module_setup"));
		public static final StreamCodec<RegistryFriendlyByteBuf, PowerModAnimationMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, PowerModAnimationMessage message) -> {
			buffer.writeUtf(message.animation);
			buffer.writeInt(message.target);
			buffer.writeBoolean(message.override);
		}, (RegistryFriendlyByteBuf buffer) -> new PowerModAnimationMessage(buffer.readUtf(), buffer.readInt(), buffer.readBoolean()));
		@Override
		public Type<PowerModAnimationMessage> type() {
			return TYPE;
		}

		public static void handleData(final PowerModAnimationMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND) {
				context.enqueueWork(() -> {
					Level level = Minecraft.getInstance().player.level();
					if (level.getEntity(message.target) != null) {
						Player player = (Player) level.getEntity(message.target);
						if (player instanceof AbstractClientPlayer player_) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(Minecraft.getInstance().player).get(ResourceLocation.fromNamespaceAndPath("power", "player_animation"));
							if (animation != null && (message.override ? true : !animation.isActive())) {
								animation.setAnimation(new KeyframeAnimationPlayer((KeyframeAnimation) PlayerAnimationRegistry.getAnimation(ResourceLocation.fromNamespaceAndPath("power", message.animation))));
							}
						}
					}
				}).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}

		@SubscribeEvent
		public static void registerMessage(FMLCommonSetupEvent event) {
			PowerMod.addNetworkMessage(PowerModAnimationMessage.TYPE, PowerModAnimationMessage.STREAM_CODEC, PowerModAnimationMessage::handleData);
		}
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
	}
}
