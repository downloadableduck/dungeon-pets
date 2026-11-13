package com.jeff.pets.dungon_pets.client.rendering.windcaller;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.WindCaller;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class WindCallerRenderer extends DungeonsGeoRenderer<WindCaller> {
    public WindCallerRenderer(EntityRendererProvider.Context context) {
        super(context, new WindCallerModel());
    }

    @Override
    public float getScale() {
        return 2;
    }
}
