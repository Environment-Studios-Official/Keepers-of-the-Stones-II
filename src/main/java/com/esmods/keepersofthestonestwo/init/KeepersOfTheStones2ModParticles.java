
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.esmods.keepersofthestonestwo.client.particle.VacuumParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.TimeStopParticle;
import com.esmods.keepersofthestonestwo.client.particle.TimeSlowParticle;
import com.esmods.keepersofthestonestwo.client.particle.TimeFastParticle;
import com.esmods.keepersofthestonestwo.client.particle.SunParticlesParticle;
import com.esmods.keepersofthestonestwo.client.particle.StarParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.MoonParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.LightSparkleParticle;
import com.esmods.keepersofthestonestwo.client.particle.InsectsParticle;
import com.esmods.keepersofthestonestwo.client.particle.EnergySparkParticle;
import com.esmods.keepersofthestonestwo.client.particle.BassBoomParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KeepersOfTheStones2ModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(KeepersOfTheStones2ModParticleTypes.BASS_BOOM.get(), BassBoomParticle::provider);
		event.registerSpriteSet(KeepersOfTheStones2ModParticleTypes.INSECTS.get(), InsectsParticle::provider);
		event.registerSpriteSet(KeepersOfTheStones2ModParticleTypes.LIGHT_SPARKLE.get(), LightSparkleParticle::provider);
		event.registerSpriteSet(KeepersOfTheStones2ModParticleTypes.VACUUM_PARTICLE.get(), VacuumParticleParticle::provider);
		event.registerSpriteSet(KeepersOfTheStones2ModParticleTypes.ENERGY_SPARK.get(), EnergySparkParticle::provider);
		event.registerSpriteSet(KeepersOfTheStones2ModParticleTypes.SUN_PARTICLES.get(), SunParticlesParticle::provider);
		event.registerSpriteSet(KeepersOfTheStones2ModParticleTypes.MOON_PARTICLE.get(), MoonParticleParticle::provider);
		event.registerSpriteSet(KeepersOfTheStones2ModParticleTypes.STAR_PARTICLE.get(), StarParticleParticle::provider);
		event.registerSpriteSet(KeepersOfTheStones2ModParticleTypes.TIME_SLOW.get(), TimeSlowParticle::provider);
		event.registerSpriteSet(KeepersOfTheStones2ModParticleTypes.TIME_STOP.get(), TimeStopParticle::provider);
		event.registerSpriteSet(KeepersOfTheStones2ModParticleTypes.TIME_FAST.get(), TimeFastParticle::provider);
	}
}
