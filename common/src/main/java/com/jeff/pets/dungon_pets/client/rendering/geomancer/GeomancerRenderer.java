package com.jeff.pets.dungon_pets.client.rendering.geomancer;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Geomancer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class GeomancerRenderer extends DungeonsGeoRenderer<Geomancer> {
    public GeomancerRenderer(EntityRendererProvider.Context context) {
        super(context, new GeomancerModel());
    }

    @Override
    public float getScale() {
        return 2.5f;
    }
}
