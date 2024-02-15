
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import ru.power_umc.keepersofthestonestwo.entity.WaterAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.StoneAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.SphereNothingProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.SoundBombProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.ShadowSphereEntity;
import ru.power_umc.keepersofthestonestwo.entity.ShadowEntity;
import ru.power_umc.keepersofthestonestwo.entity.RainDropProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.PoisonousThornEntity;
import ru.power_umc.keepersofthestonestwo.entity.MiniTornadoProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.MagicFireballProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.LightballProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.LavaAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.KnifeAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.IronAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.IceAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.GrassBlockAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.GoldAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.EtherAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.EnergyChargeEntity;
import ru.power_umc.keepersofthestonestwo.entity.DirtBlockAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.CopperAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.CobblestoneAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.CobbledDeepslateAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.BallLightningProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.AmethystClusterAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.entity.AmethystAttackProjectileEntity;
import ru.power_umc.keepersofthestonestwo.PowerMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, PowerMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<ShadowEntity>> SHADOW = register("shadow",
			EntityType.Builder.<ShadowEntity>of(ShadowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MagicFireballProjectileEntity>> MAGIC_FIREBALL_PROJECTILE = register("magic_fireball_projectile",
			EntityType.Builder.<MagicFireballProjectileEntity>of(MagicFireballProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<StoneAttackProjectileEntity>> STONE_ATTACK_PROJECTILE = register("stone_attack_projectile",
			EntityType.Builder.<StoneAttackProjectileEntity>of(StoneAttackProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GrassBlockAttackProjectileEntity>> GRASS_BLOCK_ATTACK_PROJECTILE = register("grass_block_attack_projectile",
			EntityType.Builder.<GrassBlockAttackProjectileEntity>of(GrassBlockAttackProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<DirtBlockAttackProjectileEntity>> DIRT_BLOCK_ATTACK_PROJECTILE = register("dirt_block_attack_projectile",
			EntityType.Builder.<DirtBlockAttackProjectileEntity>of(DirtBlockAttackProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<CobblestoneAttackProjectileEntity>> COBBLESTONE_ATTACK_PROJECTILE = register("cobblestone_attack_projectile",
			EntityType.Builder.<CobblestoneAttackProjectileEntity>of(CobblestoneAttackProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<CobbledDeepslateAttackProjectileEntity>> COBBLED_DEEPSLATE_ATTACK_PROJECTILE = register("cobbled_deepslate_attack_projectile",
			EntityType.Builder.<CobbledDeepslateAttackProjectileEntity>of(CobbledDeepslateAttackProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<WaterAttackProjectileEntity>> WATER_ATTACK_PROJECTILE = register("water_attack_projectile",
			EntityType.Builder.<WaterAttackProjectileEntity>of(WaterAttackProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<EtherAttackProjectileEntity>> ETHER_ATTACK_PROJECTILE = register("ether_attack_projectile",
			EntityType.Builder.<EtherAttackProjectileEntity>of(EtherAttackProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<IceAttackProjectileEntity>> ICE_ATTACK_PROJECTILE = register("ice_attack_projectile",
			EntityType.Builder.<IceAttackProjectileEntity>of(IceAttackProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BallLightningProjectileEntity>> BALL_LIGHTNING_PROJECTILE = register("ball_lightning_projectile",
			EntityType.Builder.<BallLightningProjectileEntity>of(BallLightningProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<AmethystAttackProjectileEntity>> AMETHYST_ATTACK_PROJECTILE = register("amethyst_attack_projectile",
			EntityType.Builder.<AmethystAttackProjectileEntity>of(AmethystAttackProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<LavaAttackProjectileEntity>> LAVA_ATTACK_PROJECTILE = register("lava_attack_projectile",
			EntityType.Builder.<LavaAttackProjectileEntity>of(LavaAttackProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SoundBombProjectileEntity>> SOUND_BOMB_PROJECTILE = register("sound_bomb_projectile",
			EntityType.Builder.<SoundBombProjectileEntity>of(SoundBombProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<AmethystClusterAttackProjectileEntity>> AMETHYST_CLUSTER_ATTACK_PROJECTILE = register("amethyst_cluster_attack_projectile",
			EntityType.Builder.<AmethystClusterAttackProjectileEntity>of(AmethystClusterAttackProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RainDropProjectileEntity>> RAIN_DROP_PROJECTILE = register("rain_drop_projectile",
			EntityType.Builder.<RainDropProjectileEntity>of(RainDropProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<MiniTornadoProjectileEntity>> MINI_TORNADO_PROJECTILE = register("mini_tornado_projectile",
			EntityType.Builder.<MiniTornadoProjectileEntity>of(MiniTornadoProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PoisonousThornEntity>> POISONOUS_THORN = register("poisonous_thorn",
			EntityType.Builder.<PoisonousThornEntity>of(PoisonousThornEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<CopperAttackProjectileEntity>> COPPER_ATTACK_PROJECTILE = register("copper_attack_projectile",
			EntityType.Builder.<CopperAttackProjectileEntity>of(CopperAttackProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldAttackProjectileEntity>> GOLD_ATTACK_PROJECTILE = register("gold_attack_projectile",
			EntityType.Builder.<GoldAttackProjectileEntity>of(GoldAttackProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<IronAttackProjectileEntity>> IRON_ATTACK_PROJECTILE = register("iron_attack_projectile",
			EntityType.Builder.<IronAttackProjectileEntity>of(IronAttackProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<KnifeAttackProjectileEntity>> KNIFE_ATTACK_PROJECTILE = register("knife_attack_projectile",
			EntityType.Builder.<KnifeAttackProjectileEntity>of(KnifeAttackProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<LightballProjectileEntity>> LIGHTBALL_PROJECTILE = register("lightball_projectile",
			EntityType.Builder.<LightballProjectileEntity>of(LightballProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShadowSphereEntity>> SHADOW_SPHERE = register("shadow_sphere",
			EntityType.Builder.<ShadowSphereEntity>of(ShadowSphereEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SphereNothingProjectileEntity>> SPHERE_NOTHING_PROJECTILE = register("sphere_nothing_projectile",
			EntityType.Builder.<SphereNothingProjectileEntity>of(SphereNothingProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnergyChargeEntity>> ENERGY_CHARGE = register("energy_charge",
			EntityType.Builder.<EnergyChargeEntity>of(EnergyChargeEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ShadowEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SHADOW.get(), ShadowEntity.createAttributes().build());
	}
}
