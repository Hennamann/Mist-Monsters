package com.henrikstabell.mistmonsters;

import com.henrikstabell.mistmonsters.entity.Bomb;
import com.henrikstabell.mistmonsters.entity.PlantSpider;
import com.henrikstabell.mistmonsters.entity.SandGolem;
import com.henrikstabell.mistmonsters.entity.renderer.PlantSpiderRenderer;
import com.henrikstabell.mistmonsters.entity.renderer.SandGolemRenderer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.henrikstabell.mistmonsters.MistMonsters.MODID;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityRegistry {

    public static EntityType<PlantSpider> PLANT_SPIDER;
    public static EntityType<SandGolem> SAND_GOLEM;
    public static EntityType<Bomb> BOMB;

    @SubscribeEvent
    public static void registerEntitiies(RegistryEvent.Register<EntityType<?>> event) {
        PLANT_SPIDER = EntityType.Builder.of(PlantSpider::new, MobCategory.MONSTER).sized(1.4F, 0.9F).clientTrackingRange(8).build("plant_spider");
        PLANT_SPIDER.setRegistryName(MODID, "plant_spider");
        event.getRegistry().register(PLANT_SPIDER);

        SAND_GOLEM = EntityType.Builder.of(SandGolem::new, MobCategory.MONSTER).clientTrackingRange(5).build("sand_golem");
        SAND_GOLEM.setRegistryName(MODID, "sand_golem");
        event.getRegistry().register(SAND_GOLEM);
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(PLANT_SPIDER, PlantSpiderRenderer::new);
        event.registerEntityRenderer(SAND_GOLEM, SandGolemRenderer::new);
    }
}
