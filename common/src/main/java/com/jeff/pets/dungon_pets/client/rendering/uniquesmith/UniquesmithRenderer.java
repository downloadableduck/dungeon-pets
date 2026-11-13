package com.jeff.pets.dungon_pets.client.rendering.uniquesmith;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Uniquesmith;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class UniquesmithRenderer extends DungeonsGeoRenderer<Uniquesmith> {
    public UniquesmithRenderer(EntityRendererProvider.Context context) {
        super(context, new UniquesmithModel());
    }

    @Override
    public float getScale() {
        return 2;
    }
}
