package com.esmods.keepersofthestonestwo.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.resources.PlayerSkin;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import com.esmods.keepersofthestonestwo.init.PowerModAttributes;
import com.esmods.keepersofthestonestwo.client.model.Modeliceberg;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class AmberLayerRenderEventProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onEventTriggered(RenderLivingEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (((LivingEntity) entity).getAttribute(PowerModAttributes.SEALEDINAMBER.get()).getValue() == 1) {
				RenderLivingEvent _evt = (RenderLivingEvent) event;
				Minecraft mc = Minecraft.getInstance();
				EntityRenderDispatcher dis = Minecraft.getInstance().getEntityRenderDispatcher();
				EntityRendererProvider.Context context = new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font);
				Entity _evtEntity = _evt.getEntity();
				PlayerRenderer _pr = null;
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/empty.png");
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer emptyRenderer = new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context,
							(_evtEntity instanceof AbstractClientPlayer ? ((AbstractClientPlayer) _evtEntity).getSkin().model() == PlayerSkin.Model.SLIM : false), _texture);
					_pr = emptyRenderer;
					emptyRenderer.clearLayers();
					emptyRenderer.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					if (_evt instanceof RenderLivingEvent.Pre) {
						_evt.setCanceled(true);
					}
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerRenderer(context, new ResourceLocation("power:textures/entities/amber_trap.png"), new Modeliceberg(context.bakeLayer(Modeliceberg.LAYER_LOCATION)))
							.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
				}
			}
		} else {
			if (((LivingEntity) entity).getAttribute(PowerModAttributes.SEALEDINAMBER.get()).getValue() == 1) {
				RenderLivingEvent _evt = (RenderLivingEvent) event;
				Minecraft mc = Minecraft.getInstance();
				EntityRenderDispatcher dis = Minecraft.getInstance().getEntityRenderDispatcher();
				EntityRendererProvider.Context context = new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font);
				Entity _evtEntity = _evt.getEntity();
				PlayerRenderer _pr = null;
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/empty.png");
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer emptyRenderer = new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context,
							(_evtEntity instanceof AbstractClientPlayer ? ((AbstractClientPlayer) _evtEntity).getSkin().model() == PlayerSkin.Model.SLIM : false), _texture);
					_pr = emptyRenderer;
					emptyRenderer.clearLayers();
					emptyRenderer.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (!(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersEntityRenderer) && _evt.getEntity() instanceof Mob) {
					if (_evt instanceof RenderLivingEvent.Pre) {
						_evt.setCanceled(true);
					}
					new com.kleiders.kleidersplayerrenderer.KleidersEntityRenderer(context, new ResourceLocation("power:textures/entities/amber_trap.png"), new Modeliceberg(context.bakeLayer(Modeliceberg.LAYER_LOCATION)))
							.render((Mob) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
				}
			}
		}
	}
}
