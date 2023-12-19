
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import ru.power_umc.keepersofthestonestwo.client.renderer.WaterAttackProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.StoneAttackProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.SoundBombProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.ShadowRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.RainDropProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.PoisonousThornRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.MiniTornadoProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.LightballProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.LavaAttackProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.KnifeAttackProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.IronAttackProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.IceAttackProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.GrassBlockAttackProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.GoldAttackProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.EtherAttackProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.DirtBlockAttackProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.CopperAttackProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.CobblestoneAttackProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.CobbledDeepslateAttackProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.BallLightningProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.AmethystClusterAttackProjectileRenderer;
import ru.power_umc.keepersofthestonestwo.client.renderer.AmethystAttackProjectileRenderer;

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
		event.registerEntityRenderer(PowerModEntities.AMETHYST_ATTACK_PROJECTILE.get(), AmethystAttackProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.LAVA_ATTACK_PROJECTILE.get(), LavaAttackProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SOUND_BOMB_PROJECTILE.get(), SoundBombProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.AMETHYST_CLUSTER_ATTACK_PROJECTILE.get(), AmethystClusterAttackProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.RAIN_DROP_PROJECTILE.get(), RainDropProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MINI_TORNADO_PROJECTILE.get(), MiniTornadoProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.POISONOUS_THORN.get(), PoisonousThornRenderer::new);
		event.registerEntityRenderer(PowerModEntities.COPPER_ATTACK_PROJECTILE.get(), CopperAttackProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.GOLD_ATTACK_PROJECTILE.get(), GoldAttackProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.IRON_ATTACK_PROJECTILE.get(), IronAttackProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.KNIFE_ATTACK_PROJECTILE.get(), KnifeAttackProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.LIGHTBALL_PROJECTILE.get(), LightballProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SHADOW.get(), ShadowRenderer::new);
	}
}
