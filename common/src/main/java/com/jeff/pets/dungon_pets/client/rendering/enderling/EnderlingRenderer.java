package com.jeff.pets.dungon_pets.client.rendering.enderling;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Enderling;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class EnderlingRenderer extends DungeonsGeoRenderer<Enderling> {
    public EnderlingRenderer(EntityRendererProvider.Context context) {
        super(context, new EnderlingModel());
    }

    @Override
    public float getScale() {
        return 2;
    }
}
