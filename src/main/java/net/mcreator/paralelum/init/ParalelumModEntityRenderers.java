
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paralelum.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.paralelum.client.renderer.BloodCrawlerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ParalelumModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ParalelumModEntities.BLOOD_CRAWLER.get(), BloodCrawlerRenderer::new);
	}
}
