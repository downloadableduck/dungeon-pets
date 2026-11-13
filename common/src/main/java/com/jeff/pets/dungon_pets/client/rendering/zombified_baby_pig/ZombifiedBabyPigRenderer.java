package com.jeff.pets.dungon_pets.client.rendering.zombified_baby_pig;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.ZombifiedBabyPig;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ZombifiedBabyPigRenderer extends DungeonsGeoRenderer<ZombifiedBabyPig> {
    public ZombifiedBabyPigRenderer(EntityRendererProvider.Context context) {
        super(context, new ZombifiedBabyPigModel());
    }
}
