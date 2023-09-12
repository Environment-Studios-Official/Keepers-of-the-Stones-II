
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestones.two.init;

import ru.power_umc.keepersofthestones.two.entity.StoneAttackEntity;
import ru.power_umc.keepersofthestones.two.entity.MagicFireballEntity;
import ru.power_umc.keepersofthestones.two.entity.GrassBlockAttackEntity;
import ru.power_umc.keepersofthestones.two.entity.DirtBlockAttackEntity;
import ru.power_umc.keepersofthestones.two.entity.CobblestoneAttackEntity;
import ru.power_umc.keepersofthestones.two.entity.CobbledDeepslateAttackEntity;
import ru.power_umc.keepersofthestones.two.PowerMod;

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

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PowerMod.MODID);
	public static final RegistryObject<EntityType<MagicFireballEntity>> MAGIC_FIREBALL = register("projectile_magic_fireball",
			EntityType.Builder.<MagicFireballEntity>of(MagicFireballEntity::new, MobCategory.MISC).setCustomClientFactory(MagicFireballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StoneAttackEntity>> STONE_ATTACK = register("projectile_stone_attack",
			EntityType.Builder.<StoneAttackEntity>of(StoneAttackEntity::new, MobCategory.MISC).setCustomClientFactory(StoneAttackEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GrassBlockAttackEntity>> GRASS_BLOCK_ATTACK = register("projectile_grass_block_attack", EntityType.Builder.<GrassBlockAttackEntity>of(GrassBlockAttackEntity::new, MobCategory.MISC)
			.setCustomClientFactory(GrassBlockAttackEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DirtBlockAttackEntity>> DIRT_BLOCK_ATTACK = register("projectile_dirt_block_attack", EntityType.Builder.<DirtBlockAttackEntity>of(DirtBlockAttackEntity::new, MobCategory.MISC)
			.setCustomClientFactory(DirtBlockAttackEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CobblestoneAttackEntity>> COBBLESTONE_ATTACK = register("projectile_cobblestone_attack", EntityType.Builder.<CobblestoneAttackEntity>of(CobblestoneAttackEntity::new, MobCategory.MISC)
			.setCustomClientFactory(CobblestoneAttackEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CobbledDeepslateAttackEntity>> COBBLED_DEEPSLATE_ATTACK = register("projectile_cobbled_deepslate_attack",
			EntityType.Builder.<CobbledDeepslateAttackEntity>of(CobbledDeepslateAttackEntity::new, MobCategory.MISC).setCustomClientFactory(CobbledDeepslateAttackEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
