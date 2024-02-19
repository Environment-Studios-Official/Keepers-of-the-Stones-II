
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import ru.power_umc.keepersofthestonestwo.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class PowerModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, PowerMod.MODID);
	public static final RegistryObject<SimpleParticleType> BASS_BOOM = REGISTRY.register("bass_boom", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> INSECTS = REGISTRY.register("insects", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> LIGHT_SPARKLE = REGISTRY.register("light_sparkle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> VACUUM_PARTICLE = REGISTRY.register("vacuum_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> ENERGY_SPARK = REGISTRY.register("energy_spark", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SUN_PARTICLES = REGISTRY.register("sun_particles", () -> new SimpleParticleType(false));
}
