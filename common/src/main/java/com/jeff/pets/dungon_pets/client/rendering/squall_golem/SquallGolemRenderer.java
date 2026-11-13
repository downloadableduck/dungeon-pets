package com.jeff.pets.dungon_pets.client.rendering.squall_golem;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.SquallGolem;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class SquallGolemRenderer extends DungeonsGeoRenderer<SquallGolem> {
    public SquallGolemRenderer(EntityRendererProvider.Context context) {
        super(context, new SquallGolemModel());
    }

    @Override
    public float getScale() {
        return 4;
    }

    @Override
    public boolean hasShadowTexture() {
        return true;
    }
}
