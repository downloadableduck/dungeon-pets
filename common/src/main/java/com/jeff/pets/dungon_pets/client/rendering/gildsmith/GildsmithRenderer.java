package com.jeff.pets.dungon_pets.client.rendering.gildsmith;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Gildsmith;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class GildsmithRenderer extends DungeonsGeoRenderer<Gildsmith> {
    public GildsmithRenderer(EntityRendererProvider.Context context) {
        super(context, new GildsmithModel());
    }

    @Override
    public float getScale() {
        return 3;
    }
}
