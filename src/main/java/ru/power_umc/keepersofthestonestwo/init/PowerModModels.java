
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestonestwo.init;

import ru.power_umc.keepersofthestonestwo.client.model.Modelrain_drop;
import ru.power_umc.keepersofthestonestwo.client.model.Modelpoisonous_thorn;
import ru.power_umc.keepersofthestonestwo.client.model.Modelmini_tornado;
import ru.power_umc.keepersofthestonestwo.client.model.Modellightball;
import ru.power_umc.keepersofthestonestwo.client.model.Modelknife;
import ru.power_umc.keepersofthestonestwo.client.model.Modelether_bullet;
import ru.power_umc.keepersofthestonestwo.client.model.Modelblock_attack;
import ru.power_umc.keepersofthestonestwo.client.model.ModelCrossed;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PowerModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmini_tornado.LAYER_LOCATION, Modelmini_tornado::createBodyLayer);
		event.registerLayerDefinition(Modelblock_attack.LAYER_LOCATION, Modelblock_attack::createBodyLayer);
		event.registerLayerDefinition(Modelether_bullet.LAYER_LOCATION, Modelether_bullet::createBodyLayer);
		event.registerLayerDefinition(ModelCrossed.LAYER_LOCATION, ModelCrossed::createBodyLayer);
		event.registerLayerDefinition(Modelrain_drop.LAYER_LOCATION, Modelrain_drop::createBodyLayer);
		event.registerLayerDefinition(Modelknife.LAYER_LOCATION, Modelknife::createBodyLayer);
		event.registerLayerDefinition(Modellightball.LAYER_LOCATION, Modellightball::createBodyLayer);
		event.registerLayerDefinition(Modelpoisonous_thorn.LAYER_LOCATION, Modelpoisonous_thorn::createBodyLayer);
	}
}
