
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.keepersofthestones.two.init;

import ru.power_umc.keepersofthestones.two.client.model.Modeltyrannosaurus_rex;
import ru.power_umc.keepersofthestones.two.client.model.Modeltornadocc;
import ru.power_umc.keepersofthestones.two.client.model.Modelshadow;
import ru.power_umc.keepersofthestones.two.client.model.Modelrocket;
import ru.power_umc.keepersofthestones.two.client.model.Modelmagic_arrow;
import ru.power_umc.keepersofthestones.two.client.model.Modelglow;
import ru.power_umc.keepersofthestones.two.client.model.ModelRaptor;
import ru.power_umc.keepersofthestones.two.client.model.ModelPterodactyl;
import ru.power_umc.keepersofthestones.two.client.model.ModelPlesiosaurus;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PowerModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeltornadocc.LAYER_LOCATION, Modeltornadocc::createBodyLayer);
		event.registerLayerDefinition(Modelshadow.LAYER_LOCATION, Modelshadow::createBodyLayer);
		event.registerLayerDefinition(ModelRaptor.LAYER_LOCATION, ModelRaptor::createBodyLayer);
		event.registerLayerDefinition(Modelrocket.LAYER_LOCATION, Modelrocket::createBodyLayer);
		event.registerLayerDefinition(Modelglow.LAYER_LOCATION, Modelglow::createBodyLayer);
		event.registerLayerDefinition(ModelPterodactyl.LAYER_LOCATION, ModelPterodactyl::createBodyLayer);
		event.registerLayerDefinition(Modeltyrannosaurus_rex.LAYER_LOCATION, Modeltyrannosaurus_rex::createBodyLayer);
		event.registerLayerDefinition(ModelPlesiosaurus.LAYER_LOCATION, ModelPlesiosaurus::createBodyLayer);
		event.registerLayerDefinition(Modelmagic_arrow.LAYER_LOCATION, Modelmagic_arrow::createBodyLayer);
	}
}
