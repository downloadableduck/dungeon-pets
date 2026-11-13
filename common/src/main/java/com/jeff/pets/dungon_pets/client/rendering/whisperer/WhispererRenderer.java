package com.jeff.pets.dungon_pets.client.rendering.whisperer;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Whisperer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class WhispererRenderer extends DungeonsGeoRenderer<Whisperer> {
    public WhispererRenderer(EntityRendererProvider.Context context) {
        super(context, new WhispererModel());
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
