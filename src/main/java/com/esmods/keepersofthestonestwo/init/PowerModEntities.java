
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.entity.WaterAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.StoneAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.SphereNothingProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.SoundBombProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.ShadowSphereEntity;
import com.esmods.keepersofthestonestwo.entity.ShadowEntity;
import com.esmods.keepersofthestonestwo.entity.RainDropProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.PoisonousThornEntity;
import com.esmods.keepersofthestonestwo.entity.MiniTornadoProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.MagicFireballProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.LightballProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.LavaAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.KnifeAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.IronAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.IceAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.GrassBlockAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.GoldAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.EtherAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.EnergyChargeEntity;
import com.esmods.keepersofthestonestwo.entity.DirtBlockAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.CopperAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.CobblestoneAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.CobbledDeepslateAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.BlackHoleEntity;
import com.esmods.keepersofthestonestwo.entity.BallLightningProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.AmethystClusterAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.entity.AmethystAttackProjectileEntity;
import com.esmods.keepersofthestonestwo.PowerMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PowerMod.MODID);
	public static final RegistryObject<EntityType<ShadowEntity>> SHADOW = register("shadow",
			EntityType.Builder.<ShadowEntity>of(ShadowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadowEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MagicFireballProjectileEntity>> MAGIC_FIREBALL_PROJECTILE = register("projectile_magic_fireball_projectile",
			EntityType.Builder.<MagicFireballProjectileEntity>of(MagicFireballProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(MagicFireballProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StoneAttackProjectileEntity>> STONE_ATTACK_PROJECTILE = register("projectile_stone_attack_projectile",
			EntityType.Builder.<StoneAttackProjectileEntity>of(StoneAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(StoneAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GrassBlockAttackProjectileEntity>> GRASS_BLOCK_ATTACK_PROJECTILE = register("projectile_grass_block_attack_projectile",
			EntityType.Builder.<GrassBlockAttackProjectileEntity>of(GrassBlockAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(GrassBlockAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DirtBlockAttackProjectileEntity>> DIRT_BLOCK_ATTACK_PROJECTILE = register("projectile_dirt_block_attack_projectile",
			EntityType.Builder.<DirtBlockAttackProjectileEntity>of(DirtBlockAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(DirtBlockAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CobblestoneAttackProjectileEntity>> COBBLESTONE_ATTACK_PROJECTILE = register("projectile_cobblestone_attack_projectile",
			EntityType.Builder.<CobblestoneAttackProjectileEntity>of(CobblestoneAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(CobblestoneAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CobbledDeepslateAttackProjectileEntity>> COBBLED_DEEPSLATE_ATTACK_PROJECTILE = register("projectile_cobbled_deepslate_attack_projectile",
			EntityType.Builder.<CobbledDeepslateAttackProjectileEntity>of(CobbledDeepslateAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(CobbledDeepslateAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WaterAttackProjectileEntity>> WATER_ATTACK_PROJECTILE = register("projectile_water_attack_projectile",
			EntityType.Builder.<WaterAttackProjectileEntity>of(WaterAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(WaterAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EtherAttackProjectileEntity>> ETHER_ATTACK_PROJECTILE = register("projectile_ether_attack_projectile",
			EntityType.Builder.<EtherAttackProjectileEntity>of(EtherAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(EtherAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IceAttackProjectileEntity>> ICE_ATTACK_PROJECTILE = register("projectile_ice_attack_projectile", EntityType.Builder.<IceAttackProjectileEntity>of(IceAttackProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(IceAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BallLightningProjectileEntity>> BALL_LIGHTNING_PROJECTILE = register("projectile_ball_lightning_projectile",
			EntityType.Builder.<BallLightningProjectileEntity>of(BallLightningProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(BallLightningProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AmethystAttackProjectileEntity>> AMETHYST_ATTACK_PROJECTILE = register("projectile_amethyst_attack_projectile",
			EntityType.Builder.<AmethystAttackProjectileEntity>of(AmethystAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(AmethystAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LavaAttackProjectileEntity>> LAVA_ATTACK_PROJECTILE = register("projectile_lava_attack_projectile", EntityType.Builder.<LavaAttackProjectileEntity>of(LavaAttackProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(LavaAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SoundBombProjectileEntity>> SOUND_BOMB_PROJECTILE = register("projectile_sound_bomb_projectile", EntityType.Builder.<SoundBombProjectileEntity>of(SoundBombProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(SoundBombProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AmethystClusterAttackProjectileEntity>> AMETHYST_CLUSTER_ATTACK_PROJECTILE = register("projectile_amethyst_cluster_attack_projectile",
			EntityType.Builder.<AmethystClusterAttackProjectileEntity>of(AmethystClusterAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(AmethystClusterAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RainDropProjectileEntity>> RAIN_DROP_PROJECTILE = register("projectile_rain_drop_projectile", EntityType.Builder.<RainDropProjectileEntity>of(RainDropProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(RainDropProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MiniTornadoProjectileEntity>> MINI_TORNADO_PROJECTILE = register("projectile_mini_tornado_projectile",
			EntityType.Builder.<MiniTornadoProjectileEntity>of(MiniTornadoProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(MiniTornadoProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PoisonousThornEntity>> POISONOUS_THORN = register("projectile_poisonous_thorn",
			EntityType.Builder.<PoisonousThornEntity>of(PoisonousThornEntity::new, MobCategory.MISC).setCustomClientFactory(PoisonousThornEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CopperAttackProjectileEntity>> COPPER_ATTACK_PROJECTILE = register("projectile_copper_attack_projectile",
			EntityType.Builder.<CopperAttackProjectileEntity>of(CopperAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(CopperAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GoldAttackProjectileEntity>> GOLD_ATTACK_PROJECTILE = register("projectile_gold_attack_projectile", EntityType.Builder.<GoldAttackProjectileEntity>of(GoldAttackProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(GoldAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IronAttackProjectileEntity>> IRON_ATTACK_PROJECTILE = register("projectile_iron_attack_projectile", EntityType.Builder.<IronAttackProjectileEntity>of(IronAttackProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(IronAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KnifeAttackProjectileEntity>> KNIFE_ATTACK_PROJECTILE = register("projectile_knife_attack_projectile",
			EntityType.Builder.<KnifeAttackProjectileEntity>of(KnifeAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(KnifeAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LightballProjectileEntity>> LIGHTBALL_PROJECTILE = register("projectile_lightball_projectile", EntityType.Builder.<LightballProjectileEntity>of(LightballProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(LightballProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShadowSphereEntity>> SHADOW_SPHERE = register("projectile_shadow_sphere",
			EntityType.Builder.<ShadowSphereEntity>of(ShadowSphereEntity::new, MobCategory.MISC).setCustomClientFactory(ShadowSphereEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SphereNothingProjectileEntity>> SPHERE_NOTHING_PROJECTILE = register("projectile_sphere_nothing_projectile",
			EntityType.Builder.<SphereNothingProjectileEntity>of(SphereNothingProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SphereNothingProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EnergyChargeEntity>> ENERGY_CHARGE = register("projectile_energy_charge",
			EntityType.Builder.<EnergyChargeEntity>of(EnergyChargeEntity::new, MobCategory.MISC).setCustomClientFactory(EnergyChargeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlackHoleEntity>> BLACK_HOLE = register("black_hole", EntityType.Builder.<BlackHoleEntity>of(BlackHoleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(BlackHoleEntity::new).fireImmune().sized(0.2f, 0.2f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ShadowEntity.init();
			BlackHoleEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SHADOW.get(), ShadowEntity.createAttributes().build());
		event.put(BLACK_HOLE.get(), BlackHoleEntity.createAttributes().build());
	}
}
