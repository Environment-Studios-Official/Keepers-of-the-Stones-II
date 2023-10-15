
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestones.two.init;

import ru.power_umc.keepersofthestones.two.client.renderer.WaterAttackProjectileRenderer;
import ru.power_umc.keepersofthestones.two.client.renderer.StoneAttackProjectileRenderer;
import ru.power_umc.keepersofthestones.two.client.renderer.IceAttackProjectileRenderer;
import ru.power_umc.keepersofthestones.two.client.renderer.GrassBlockAttackProjectileRenderer;
import ru.power_umc.keepersofthestones.two.client.renderer.EtherAttackProjectileRenderer;
import ru.power_umc.keepersofthestones.two.client.renderer.DirtBlockAttackProjectileRenderer;
import ru.power_umc.keepersofthestones.two.client.renderer.CobblestoneAttackProjectileRenderer;
import ru.power_umc.keepersofthestones.two.client.renderer.CobbledDeepslateAttackProjectileRenderer;
import ru.power_umc.keepersofthestones.two.client.renderer.BallLightningProjectileRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PowerModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PowerModEntities.MAGIC_FIREBALL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.STONE_ATTACK_PROJECTILE.get(), StoneAttackProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.GRASS_BLOCK_ATTACK_PROJECTILE.get(), GrassBlockAttackProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.DIRT_BLOCK_ATTACK_PROJECTILE.get(), DirtBlockAttackProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.COBBLESTONE_ATTACK_PROJECTILE.get(), CobblestoneAttackProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.COBBLED_DEEPSLATE_ATTACK_PROJECTILE.get(), CobbledDeepslateAttackProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.WATER_ATTACK_PROJECTILE.get(), WaterAttackProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ETHER_ATTACK_PROJECTILE.get(), EtherAttackProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ICE_ATTACK_PROJECTILE.get(), IceAttackProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.BALL_LIGHTNING_PROJECTILE.get(), BallLightningProjectileRenderer::new);
	}
}
