package com.jeff.pets.dungon_pets.client.rendering.skunk;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Skunk;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class SkunkRenderer extends DungeonsGeoRenderer<Skunk> {
    public SkunkRenderer(EntityRendererProvider.Context context) {
        super(context, new SkunkModel());
    }

    @Override
    public float getScale() {
        return 2;
    }
}
