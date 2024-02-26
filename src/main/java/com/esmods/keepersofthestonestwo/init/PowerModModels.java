
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.esmods.keepersofthestonestwo.client.model.Modelsolar_salvo;
import com.esmods.keepersofthestonestwo.client.model.Modelrain_drop;
import com.esmods.keepersofthestonestwo.client.model.Modelpoisonous_thorn;
import com.esmods.keepersofthestonestwo.client.model.Modelmini_tornado;
import com.esmods.keepersofthestonestwo.client.model.Modellightball;
import com.esmods.keepersofthestonestwo.client.model.Modelknife;
import com.esmods.keepersofthestonestwo.client.model.Modeliceberg;
import com.esmods.keepersofthestonestwo.client.model.Modelether_bullet;
import com.esmods.keepersofthestonestwo.client.model.Modelblock_attack;
import com.esmods.keepersofthestonestwo.client.model.ModelCrossed;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PowerModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmini_tornado.LAYER_LOCATION, Modelmini_tornado::createBodyLayer);
		event.registerLayerDefinition(Modelblock_attack.LAYER_LOCATION, Modelblock_attack::createBodyLayer);
		event.registerLayerDefinition(Modelether_bullet.LAYER_LOCATION, Modelether_bullet::createBodyLayer);
		event.registerLayerDefinition(Modelsolar_salvo.LAYER_LOCATION, Modelsolar_salvo::createBodyLayer);
		event.registerLayerDefinition(Modeliceberg.LAYER_LOCATION, Modeliceberg::createBodyLayer);
		event.registerLayerDefinition(ModelCrossed.LAYER_LOCATION, ModelCrossed::createBodyLayer);
		event.registerLayerDefinition(Modelrain_drop.LAYER_LOCATION, Modelrain_drop::createBodyLayer);
		event.registerLayerDefinition(Modelknife.LAYER_LOCATION, Modelknife::createBodyLayer);
		event.registerLayerDefinition(Modellightball.LAYER_LOCATION, Modellightball::createBodyLayer);
		event.registerLayerDefinition(Modelpoisonous_thorn.LAYER_LOCATION, Modelpoisonous_thorn::createBodyLayer);
	}
}