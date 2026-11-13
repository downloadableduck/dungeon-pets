package com.jeff.pets.dungon_pets.client.rendering.toucan;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Toucan;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ToucanRenderer extends DungeonsGeoRenderer<Toucan> {
    public ToucanRenderer(EntityRendererProvider.Context context) {
        super(context, new ToucanModel());
    }

    @Override
    public float getScale() {
        return 2;
    }
}
