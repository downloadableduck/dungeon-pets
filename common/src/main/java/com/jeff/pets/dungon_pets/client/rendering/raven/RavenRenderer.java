package com.jeff.pets.dungon_pets.client.rendering.raven;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Raven;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class RavenRenderer extends DungeonsGeoRenderer<Raven> {
    public RavenRenderer(EntityRendererProvider.Context context) {
        super(context, new RavenModel());
    }

    @Override
    public float getScale() {
        return 2.5f;
    }
}
