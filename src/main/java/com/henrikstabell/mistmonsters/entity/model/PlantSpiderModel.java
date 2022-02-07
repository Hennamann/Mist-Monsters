package com.henrikstabell.mistmonsters.entity.model;

import com.henrikstabell.mistmonsters.MistMonsters;
import com.henrikstabell.mistmonsters.entity.PlantSpider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PlantSpiderModel extends AnimatedGeoModel<PlantSpider> {

    @Override
    public ResourceLocation getModelLocation(PlantSpider object) {
        return new ResourceLocation(MistMonsters.MODID, "geo/plant_spider.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PlantSpider object) {
        return new ResourceLocation(MistMonsters.MODID, "textures/entity/plant_spider.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PlantSpider object) {
        return new ResourceLocation(MistMonsters.MODID, "animations/plant_spider.animation.json");
    }
}
