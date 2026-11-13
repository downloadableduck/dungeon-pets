package com.jeff.pets.dungon_pets.client.rendering.geomancer;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Geomancer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class GeomancerRenderer extends DungeonsGeoRenderer<Geomancer> {
    public GeomancerRenderer(EntityRendererProvider.Context context) {
        super(context, new GeomancerModel());
    }

    @Override
    public float getScale() {
        return 2f;
    }

    @Override
    public boolean hasShadowTexture() {
        return true;
    }
}
