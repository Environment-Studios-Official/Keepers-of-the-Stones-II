
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import com.esmods.keepersofthestonestwo.client.particle.VacuumParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.TimeStopParticle;
import com.esmods.keepersofthestonestwo.client.particle.TimeSlowParticle;
import com.esmods.keepersofthestonestwo.client.particle.TimeFastParticle;
import com.esmods.keepersofthestonestwo.client.particle.TechnobarrierParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.SunParticlesParticle;
import com.esmods.keepersofthestonestwo.client.particle.StarParticleParticle;
import com.esmods.keepersofthestonestwo.client.particle.RunesOfDestructionParticle;
import com.esmods.keepersofthestonestwo.client.particle.RunesOfCreationParticle;
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
		event.registerSpriteSet(PowerModParticleTypes.STAR_PARTICLE.get(), StarParticleParticle::provider);
		event.registerSpriteSet(PowerModParticleTypes.TIME_SLOW.get(), TimeSlowParticle::provider);
		event.registerSpriteSet(PowerModParticleTypes.TIME_STOP.get(), TimeStopParticle::provider);
		event.registerSpriteSet(PowerModParticleTypes.TIME_FAST.get(), TimeFastParticle::provider);
		event.registerSpriteSet(PowerModParticleTypes.RUNES_OF_CREATION.get(), RunesOfCreationParticle::provider);
		event.registerSpriteSet(PowerModParticleTypes.RUNES_OF_DESTRUCTION.get(), RunesOfDestructionParticle::provider);
		event.registerSpriteSet(PowerModParticleTypes.TECHNOBARRIER_PARTICLE.get(), TechnobarrierParticleParticle::provider);
	}
}
