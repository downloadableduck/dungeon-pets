package com.jeff.pets.dungon_pets.client.rendering.wraith;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Wraith;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class WraithRenderer extends DungeonsGeoRenderer<Wraith> {
    public WraithRenderer(EntityRendererProvider.Context context) {
        super(context, new WraithModel());
    }

    @Override
    public float getScale() {
        return 2;
    }

    @Override
    public boolean hasShadowTexture() {
        return true;
    }
}
