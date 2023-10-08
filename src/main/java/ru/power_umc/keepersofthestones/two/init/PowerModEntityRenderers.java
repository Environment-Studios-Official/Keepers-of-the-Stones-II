
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestones.two.init;

import ru.power_umc.keepersofthestones.two.client.renderer.WaterAttackRenderer;
import ru.power_umc.keepersofthestones.two.client.renderer.StoneAttackRenderer;
import ru.power_umc.keepersofthestones.two.client.renderer.GrassBlockAttackRenderer;
import ru.power_umc.keepersofthestones.two.client.renderer.EtherAttackRenderer;
import ru.power_umc.keepersofthestones.two.client.renderer.DirtBlockAttackRenderer;
import ru.power_umc.keepersofthestones.two.client.renderer.CobblestoneAttackRenderer;
import ru.power_umc.keepersofthestones.two.client.renderer.CobbledDeepslateAttackRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PowerModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PowerModEntities.MAGIC_FIREBALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.STONE_ATTACK.get(), StoneAttackRenderer::new);
		event.registerEntityRenderer(PowerModEntities.GRASS_BLOCK_ATTACK.get(), GrassBlockAttackRenderer::new);
		event.registerEntityRenderer(PowerModEntities.DIRT_BLOCK_ATTACK.get(), DirtBlockAttackRenderer::new);
		event.registerEntityRenderer(PowerModEntities.COBBLESTONE_ATTACK.get(), CobblestoneAttackRenderer::new);
		event.registerEntityRenderer(PowerModEntities.COBBLED_DEEPSLATE_ATTACK.get(), CobbledDeepslateAttackRenderer::new);
		event.registerEntityRenderer(PowerModEntities.WATER_ATTACK.get(), WaterAttackRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ETHER_ATTACK.get(), EtherAttackRenderer::new);
	}
}
