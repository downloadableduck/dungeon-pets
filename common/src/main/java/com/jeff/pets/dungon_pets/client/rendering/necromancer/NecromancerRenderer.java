package com.jeff.pets.dungon_pets.client.rendering.necromancer;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Necromancer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class NecromancerRenderer extends DungeonsGeoRenderer<Necromancer> {
    public NecromancerRenderer(EntityRendererProvider.Context context) {
        super(context, new NecromancerModel());
    }

    @Override
    public float getScale() {
        return 2f;
    }

    @Override
    public boolean hasShadowTexture() {
        return true;
    }
}
