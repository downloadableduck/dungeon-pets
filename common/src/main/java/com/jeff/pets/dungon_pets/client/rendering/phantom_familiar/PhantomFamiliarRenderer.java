package com.jeff.pets.dungon_pets.client.rendering.phantom_familiar;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.PhantomFamiliar;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class PhantomFamiliarRenderer extends DungeonsGeoRenderer<PhantomFamiliar> {
    public PhantomFamiliarRenderer(EntityRendererProvider.Context context) {
        super(context, new PhantomFamiliarModel());
    }

    @Override
    public float getScale() {
        return 2f;
    }
}
