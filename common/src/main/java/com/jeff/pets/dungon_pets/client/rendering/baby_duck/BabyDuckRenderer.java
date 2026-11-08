package com.jeff.pets.dungon_pets.client.rendering.baby_duck;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.BabyDuck;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class BabyDuckRenderer extends DungeonsGeoRenderer<BabyDuck> {
    public BabyDuckRenderer(EntityRendererProvider.Context context) {
        super(context, new BabyDuckModel());
    }
}
