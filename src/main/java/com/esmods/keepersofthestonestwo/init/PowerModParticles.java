
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.esmods.keepersofthestonestwo.client.particle.VacuumParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.SunParticlesParticle;
import com.esmods.keepersofthestonestwo.client.particle.MoonParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.LightSparkleParticle;
import com.esmods.keepersofthestonestwo.client.particle.InsectsParticle;
import com.esmods.keepersofthestonestwo.client.particle.EnergySparkParticle;
import com.esmods.keepersofthestonestwo.client.particle.BassBoomParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PowerModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(PowerModParticleTypes.BASS_BOOM.get(), BassBoomParticle::provider);
		event.registerSpriteSet(PowerModParticleTypes.INSECTS.get(), InsectsParticle::provider);
		event.registerSpriteSet(PowerModParticleTypes.LIGHT_SPARKLE.get(), LightSparkleParticle::provider);
		event.registerSpriteSet(PowerModParticleTypes.VACUUM_PARTICLE.get(), VacuumParticleParticle::provider);
		event.registerSpriteSet(PowerModParticleTypes.ENERGY_SPARK.get(), EnergySparkParticle::provider);
		event.registerSpriteSet(PowerModParticleTypes.SUN_PARTICLES.get(), SunParticlesParticle::provider);
		event.registerSpriteSet(PowerModParticleTypes.MOON_PARTICLE.get(), MoonParticleParticle::provider);
	}
}
