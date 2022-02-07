package com.henrikstabell.mistmonsters.entity.renderer;

import com.henrikstabell.mistmonsters.entity.SandGolem;
import com.henrikstabell.mistmonsters.entity.model.SandGolemModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SandGolemRenderer extends GeoEntityRenderer<SandGolem> {

    public SandGolemRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SandGolemModel());
    }
}
