package com.esmods.keepersofthestonestwo;

import com.auranite.abloom.AbloomMod;
import com.auranite.abloom.registries.ElementalProjectileRegistry;
import com.auranite.abloom.util.ElementType;
import com.esmods.keepersofthestonestwo.init.PowerModEntities;
import net.minecraft.world.entity.animal.Wolf;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;


public class PowerModElementalProjectiles {

    public static void onCommonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(PowerModElementalProjectiles::registerAll);
    }

    public static void registerAll() {

        ElementalProjectileRegistry.registerProjectile(PowerModEntities.MAGIC_FIREBALL_PROJECTILE.get(), ElementType.FIRE, 15f);

        ElementalProjectileRegistry.registerProjectile(PowerModEntities.DIRT_BLOCK_ATTACK_PROJECTILE.get(), ElementType.EARTH, 20f);
        ElementalProjectileRegistry.registerProjectile(PowerModEntities.GRASS_BLOCK_ATTACK_PROJECTILE.get(), ElementType.EARTH, 20f);
        ElementalProjectileRegistry.registerProjectile(PowerModEntities.STONE_ATTACK_PROJECTILE.get(), ElementType.EARTH, 25f);
        ElementalProjectileRegistry.registerProjectile(PowerModEntities.COBBLESTONE_ATTACK_PROJECTILE.get(), ElementType.EARTH, 25f);
        ElementalProjectileRegistry.registerProjectile(PowerModEntities.COBBLED_DEEPSLATE_ATTACK_PROJECTILE.get(), ElementType.EARTH, 30f);

        ElementalProjectileRegistry.registerProjectile(PowerModEntities.WATER_ATTACK_PROJECTILE.get(), ElementType.WATER, 30f);

        ElementalProjectileRegistry.registerProjectile(PowerModEntities.ETHER_ATTACK_PROJECTILE.get(), ElementType.ETHER, 25f);

        ElementalProjectileRegistry.registerProjectile(PowerModEntities.ICE_ATTACK_PROJECTILE.get(), ElementType.ICE, 25f);

        ElementalProjectileRegistry.registerProjectile(PowerModEntities.LIGHTBALL_PROJECTILE.get(), ElementType.ELECTRIC, 75f);

        ElementalProjectileRegistry.registerProjectile(PowerModEntities.SOUND_BOMB_PROJECTILE.get(), ElementType.WIND, 25f);

        ElementalProjectileRegistry.registerProjectile(PowerModEntities.AMETHYST_ATTACK_PROJECTILE.get(), ElementType.EARTH, 30f);
        ElementalProjectileRegistry.registerProjectile(PowerModEntities.AMETHYST_CLUSTER_ATTACK_PROJECTILE.get(), ElementType.EARTH, 15f);

        ElementalProjectileRegistry.registerProjectile(PowerModEntities.LAVA_ATTACK_PROJECTILE.get(), ElementType.FIRE, 25f);

        ElementalProjectileRegistry.registerProjectile(PowerModEntities.LAVA_ATTACK_PROJECTILE.get(), ElementType.FIRE, 25f);

        ElementalProjectileRegistry.registerProjectile(PowerModEntities.MINI_TORNADO_PROJECTILE.get(), ElementType.WIND, 40f);

        ElementalProjectileRegistry.registerProjectile(PowerModEntities.POISONOUS_THORN.get(), ElementType.NATURAL, 25f);

        registerCustomProjectiles();

        AbloomMod.LOGGER.info("Registered {} elemental projectile types",
                ElementalProjectileRegistry.getRegisteredCount());
    }

    private static void registerCustomProjectiles() {

    }
}
