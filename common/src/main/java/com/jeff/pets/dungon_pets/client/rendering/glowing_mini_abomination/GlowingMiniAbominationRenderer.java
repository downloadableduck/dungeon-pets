package com.jeff.pets.dungon_pets.client.rendering.glowing_mini_abomination;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.GlowingMiniAbomination;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class GlowingMiniAbominationRenderer extends DungeonsGeoRenderer<GlowingMiniAbomination> {
    public GlowingMiniAbominationRenderer(EntityRendererProvider.Context context) {
        super(context, new GlowingMiniAbominationModel());
    }

    @Override
    public float getScale() {
        return 3;
    }

    @Override
    public boolean hasShadowTexture() {
        return true;
    }
}
