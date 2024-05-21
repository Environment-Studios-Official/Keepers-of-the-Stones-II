package com.esmods.keepersofthestonestwo.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import javax.annotation.Nullable;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;
import com.esmods.keepersofthestonestwo.init.PowerModMobEffects;

@Mod.EventBusSubscriber
public class AbilityKeyPressedTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).use_ability_key_var) {
			if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).ability_block == false) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(PowerModMobEffects.FIRE_MASTER.get())) {
					FireSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(PowerModMobEffects.AIR_MASTER.get())) {
					AirSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(PowerModMobEffects.EARTH_MASTER.get())) {
					EarthSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(PowerModMobEffects.WATER_MASTER.get())) {
					WaterSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(PowerModMobEffects.ETHER_MASTER.get())) {
					EtherSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(PowerModMobEffects.ICE_MASTER.get())) {
					IceSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(PowerModMobEffects.LIGHTNING_MASTER.get())) {
					LightningSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(PowerModMobEffects.SOUND_MASTER.get())) {
					SoundSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(PowerModMobEffects.CRYSTAL_MASTER.get())) {
					CrystalSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(PowerModMobEffects.LAVA_MASTER.get())) {
					LavaSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt11 && _livEnt11.hasEffect(PowerModMobEffects.RAIN_MASTER.get())) {
					RainSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(PowerModMobEffects.TORNADO_MASTER.get())) {
					TornadoSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt13 && _livEnt13.hasEffect(PowerModMobEffects.OCEAN_MASTER.get())) {
					OceanSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt14 && _livEnt14.hasEffect(PowerModMobEffects.PLANTS_MASTER.get())) {
					PlantsSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt15 && _livEnt15.hasEffect(PowerModMobEffects.ANIMALS_MASTER.get())) {
					AnimalsSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(PowerModMobEffects.METAL_MASTER.get())) {
					MetalSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt17 && _livEnt17.hasEffect(PowerModMobEffects.LIGHT_MASTER.get())) {
					LightSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt18 && _livEnt18.hasEffect(PowerModMobEffects.LIGHT_MASTER.get())) {
					LightSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(PowerModMobEffects.SHADOW_MASTER.get())) {
					ShadowSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt20 && _livEnt20.hasEffect(PowerModMobEffects.VACUUM_MASTER.get())) {
					VacuumSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt21 && _livEnt21.hasEffect(PowerModMobEffects.ENERGY_MASTER.get())) {
					EnergySpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt22 && _livEnt22.hasEffect(PowerModMobEffects.SUN_MASTER.get())) {
					SunSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt23 && _livEnt23.hasEffect(PowerModMobEffects.MOON_MASTER.get())) {
					MoonSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt24 && _livEnt24.hasEffect(PowerModMobEffects.SPACE_MASTER.get())) {
					SpaceSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt25 && _livEnt25.hasEffect(PowerModMobEffects.TIME_MASTER.get())) {
					TimeSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt26 && _livEnt26.hasEffect(PowerModMobEffects.CREATION_MASTER.get())) {
					CreationSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt27 && _livEnt27.hasEffect(PowerModMobEffects.DESTRUCTION_MASTER.get())) {
					DestructionSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt28 && _livEnt28.hasEffect(PowerModMobEffects.BLOOD_MASTER.get())) {
					BloodSpecialAttackProcedure.execute(world, entity);
				}
				if (entity instanceof LivingEntity _livEnt29 && _livEnt29.hasEffect(PowerModMobEffects.TECHNOLOGY_MASTER.get())) {
					TechnologySpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt30 && _livEnt30.hasEffect(PowerModMobEffects.TELEPORTATION_MASTER.get())) {
					TeleportationSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt31 && _livEnt31.hasEffect(PowerModMobEffects.EXPLOSION_MASTER.get())) {
					ExplosionSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				if (entity instanceof LivingEntity _livEnt32 && _livEnt32.hasEffect(PowerModMobEffects.AMBER_MASTER.get())) {
					AmberSpecialAttackProcedure.execute(world, x, y, z, entity);
				}
				{
					boolean _setval = false;
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.use_ability_key_var = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
