package com.henrikstabell.mistmonsters.entity.renderer;

import com.henrikstabell.mistmonsters.entity.PlantSpider;
import com.henrikstabell.mistmonsters.entity.model.PlantSpiderModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PlantSpiderRenderer extends GeoEntityRenderer<PlantSpider> {
    public PlantSpiderRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PlantSpiderModel());
    }
}
