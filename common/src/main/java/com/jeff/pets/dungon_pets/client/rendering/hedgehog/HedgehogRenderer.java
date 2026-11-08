package com.jeff.pets.dungon_pets.client.rendering.hedgehog;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Hedgehog;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class HedgehogRenderer extends DungeonsGeoRenderer<Hedgehog> {
    public HedgehogRenderer(EntityRendererProvider.Context context) {
        super(context, new HedgehogModel());
    }

    @Override
    public float getScale() {
        return 0.25f;
    }
}
