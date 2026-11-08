package com.jeff.pets.dungon_pets.client.rendering.golden_parrot;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.GoldenParrot;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class GoldenParrotRenderer extends DungeonsGeoRenderer<GoldenParrot> {
    public GoldenParrotRenderer(EntityRendererProvider.Context context) {
        super(context, new GoldenParrotMode());
    }

    @Override
    public float getScale() {
        return 2;
    }
}
