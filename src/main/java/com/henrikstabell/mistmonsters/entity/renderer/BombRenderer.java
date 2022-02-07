package com.henrikstabell.mistmonsters.entity.renderer;

import com.henrikstabell.mistmonsters.entity.Bomb;
import com.henrikstabell.mistmonsters.entity.model.BombModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BombRenderer extends GeoEntityRenderer<Bomb> {

    public BombRenderer(EntityRendererProvider.Context renderManager, AnimatedGeoModel<Bomb> modelProvider) {
        super(renderManager, new BombModel());
    }
}
