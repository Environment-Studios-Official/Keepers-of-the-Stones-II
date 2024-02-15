/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package ru.power_umc.keepersofthestonestwo;

import ru.power_umc.keepersofthestonestwo.network.PowerModVariables;
import ru.power_umc.keepersofthestonestwo.init.PowerModTabs;
import ru.power_umc.keepersofthestonestwo.init.PowerModSounds;
import ru.power_umc.keepersofthestonestwo.init.PowerModParticleTypes;
import ru.power_umc.keepersofthestonestwo.init.PowerModMobEffects;
import ru.power_umc.keepersofthestonestwo.init.PowerModMenus;
import ru.power_umc.keepersofthestonestwo.init.PowerModItems;
import ru.power_umc.keepersofthestonestwo.init.PowerModEntities;
import ru.power_umc.keepersofthestonestwo.init.PowerModEnchantments;
import ru.power_umc.keepersofthestonestwo.init.PowerModBlocks;
import ru.power_umc.keepersofthestonestwo.init.PowerModBlockEntities;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.neoforged.neoforge.network.registration.IPayloadRegistrar;
import net.neoforged.neoforge.network.handling.IPlayPayloadHandler;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlerEvent;
import net.neoforged.neoforge.event.TickEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.fml.util.thread.SidedThreadGroups;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.util.Tuple;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.FriendlyByteBuf;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;

@Mod("power")
public class PowerMod {
	public static final Logger LOGGER = LogManager.getLogger(PowerMod.class);
	public static final String MODID = "power";

	public PowerMod(IEventBus modEventBus) {
		NeoForge.EVENT_BUS.register(this);
		modEventBus.addListener(this::registerNetworking);
		PowerModSounds.REGISTRY.register(modEventBus);
		PowerModBlocks.REGISTRY.register(modEventBus);
		PowerModBlockEntities.REGISTRY.register(modEventBus);
		PowerModItems.register(modEventBus);
		PowerModEntities.REGISTRY.register(modEventBus);
		PowerModTabs.REGISTRY.register(modEventBus);
		PowerModVariables.ATTACHMENT_TYPES.register(modEventBus);

		PowerModMobEffects.REGISTRY.register(modEventBus);
		PowerModEnchantments.REGISTRY.register(modEventBus);
		PowerModMenus.REGISTRY.register(modEventBus);
		PowerModParticleTypes.REGISTRY.register(modEventBus);

	}

	private static boolean networkingRegistered = false;
	private static final Map<ResourceLocation, NetworkMessage<?>> MESSAGES = new HashMap<>();

	private record NetworkMessage<T extends CustomPacketPayload>(FriendlyByteBuf.Reader<T> reader, IPlayPayloadHandler<T> handler) {
	}

	public static <T extends CustomPacketPayload> void addNetworkMessage(ResourceLocation id, FriendlyByteBuf.Reader<T> reader, IPlayPayloadHandler<T> handler) {
		if (networkingRegistered)
			throw new IllegalStateException("Cannot register new network messages after networking has been registered");
		MESSAGES.put(id, new NetworkMessage<>(reader, handler));
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	private void registerNetworking(final RegisterPayloadHandlerEvent event) {
		final IPayloadRegistrar registrar = event.registrar(MODID);
		MESSAGES.forEach((id, networkMessage) -> registrar.play(id, ((NetworkMessage) networkMessage).reader(), networkMessage.handler()));
		networkingRegistered = true;
	}

	private static final Collection<Tuple<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new Tuple<>(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<Tuple<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setB(work.getB() - 1);
				if (work.getB() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getA().run());
			workQueue.removeAll(actions);
		}
	}
}
