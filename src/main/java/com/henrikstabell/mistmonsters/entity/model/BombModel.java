package com.henrikstabell.mistmonsters.entity.model;

import com.henrikstabell.mistmonsters.entity.Bomb;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BombModel extends AnimatedGeoModel<Bomb> {

    @Override
    public ResourceLocation getModelLocation(Bomb object) {
        return null;
    }

    @Override
    public ResourceLocation getTextureLocation(Bomb object) {
        return null;
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Bomb animatable) {
        return null;
    }
}
