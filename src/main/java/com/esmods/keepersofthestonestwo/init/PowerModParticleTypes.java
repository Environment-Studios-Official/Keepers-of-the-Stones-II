
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import com.esmods.keepersofthestonestwo.PowerMod;

public class PowerModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, PowerMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BASS_BOOM = REGISTRY.register("bass_boom", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> INSECTS = REGISTRY.register("insects", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> LIGHT_SPARKLE = REGISTRY.register("light_sparkle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> VACUUM_PARTICLE = REGISTRY.register("vacuum_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> ENERGY_SPARK = REGISTRY.register("energy_spark", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> SUN_PARTICLES = REGISTRY.register("sun_particles", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> MOON_PARTICLE = REGISTRY.register("moon_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> STAR_PARTICLE = REGISTRY.register("star_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> TIME_SLOW = REGISTRY.register("time_slow", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> TIME_STOP = REGISTRY.register("time_stop", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> TIME_FAST = REGISTRY.register("time_fast", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> RUNES_OF_CREATION = REGISTRY.register("runes_of_creation", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> RUNES_OF_DESTRUCTION = REGISTRY.register("runes_of_destruction", () -> new SimpleParticleType(false));
}
