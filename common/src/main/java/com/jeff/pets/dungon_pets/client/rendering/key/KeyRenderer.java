package com.jeff.pets.dungon_pets.client.rendering.key;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Key;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class KeyRenderer extends DungeonsGeoRenderer<Key> {
    public KeyRenderer(EntityRendererProvider.Context context) {
        super(context, new KeyModel());
    }

    @Override
    public boolean hasShadowTexture() {
        return true;
    }
}
