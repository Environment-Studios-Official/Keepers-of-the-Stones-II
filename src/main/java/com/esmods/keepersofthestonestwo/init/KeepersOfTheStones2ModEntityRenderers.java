
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import com.esmods.keepersofthestonestwo.client.renderer.WaterAttackProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.StoneAttackProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.SphereNothingProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.SoundBombProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.ShadowSphereRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.ShadowRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.RainDropProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.PoisonousThornRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.MiniTornadoProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.MeteoriteProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.LightballProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.LavaAttackProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.KnifeAttackProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.IronAttackProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.IceAttackProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.GrassBlockAttackProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.GoldAttackProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.EtherAttackProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.EnergyChargeRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.DirtBlockAttackProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.CopperAttackProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.CobblestoneAttackProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.CobbledDeepslateAttackProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.BlackHoleRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.BallLightningProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.AmethystClusterAttackProjectileRenderer;
import com.esmods.keepersofthestonestwo.client.renderer.AmethystAttackProjectileRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KeepersOfTheStones2ModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.SHADOW.get(), ShadowRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.BLACK_HOLE.get(), BlackHoleRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.MAGIC_FIREBALL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.STONE_ATTACK_PROJECTILE.get(), StoneAttackProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.GRASS_BLOCK_ATTACK_PROJECTILE.get(), GrassBlockAttackProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.DIRT_BLOCK_ATTACK_PROJECTILE.get(), DirtBlockAttackProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.COBBLESTONE_ATTACK_PROJECTILE.get(), CobblestoneAttackProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.COBBLED_DEEPSLATE_ATTACK_PROJECTILE.get(), CobbledDeepslateAttackProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.WATER_ATTACK_PROJECTILE.get(), WaterAttackProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.ETHER_ATTACK_PROJECTILE.get(), EtherAttackProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.ICE_ATTACK_PROJECTILE.get(), IceAttackProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.BALL_LIGHTNING_PROJECTILE.get(), BallLightningProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.AMETHYST_ATTACK_PROJECTILE.get(), AmethystAttackProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.LAVA_ATTACK_PROJECTILE.get(), LavaAttackProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.SOUND_BOMB_PROJECTILE.get(), SoundBombProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.AMETHYST_CLUSTER_ATTACK_PROJECTILE.get(), AmethystClusterAttackProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.RAIN_DROP_PROJECTILE.get(), RainDropProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.MINI_TORNADO_PROJECTILE.get(), MiniTornadoProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.POISONOUS_THORN.get(), PoisonousThornRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.COPPER_ATTACK_PROJECTILE.get(), CopperAttackProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.GOLD_ATTACK_PROJECTILE.get(), GoldAttackProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.IRON_ATTACK_PROJECTILE.get(), IronAttackProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.KNIFE_ATTACK_PROJECTILE.get(), KnifeAttackProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.LIGHTBALL_PROJECTILE.get(), LightballProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.SHADOW_SPHERE.get(), ShadowSphereRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.SPHERE_NOTHING_PROJECTILE.get(), SphereNothingProjectileRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.ENERGY_CHARGE.get(), EnergyChargeRenderer::new);
		event.registerEntityRenderer(KeepersOfTheStones2ModEntities.METEORITE_PROJECTILE.get(), MeteoriteProjectileRenderer::new);
	}
}
