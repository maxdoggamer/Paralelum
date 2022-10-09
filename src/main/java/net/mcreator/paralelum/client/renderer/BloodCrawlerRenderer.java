
package net.mcreator.paralelum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.paralelum.entity.BloodCrawlerEntity;

public class BloodCrawlerRenderer extends MobRenderer<BloodCrawlerEntity, SpiderModel<BloodCrawlerEntity>> {
	public BloodCrawlerRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BloodCrawlerEntity entity) {
		return new ResourceLocation("paralelum:textures/entities/bloodcrawler.png");
	}
}
