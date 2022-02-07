package com.henrikstabell.mistmonsters.entity.model;

import com.henrikstabell.mistmonsters.MistMonsters;
import com.henrikstabell.mistmonsters.entity.SandGolem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SandGolemModel extends AnimatedGeoModel<SandGolem> {

    @Override
    public ResourceLocation getModelLocation(SandGolem object) {
        return new ResourceLocation(MistMonsters.MODID, "geo/sand_golem.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SandGolem object) {
        return new ResourceLocation(MistMonsters.MODID, "textures/entity/sand_golem.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SandGolem object) {
        return new ResourceLocation(MistMonsters.MODID, "animations/sand_golem.animation.json");
    }
}
