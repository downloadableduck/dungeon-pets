package com.jeff.pets.dungon_pets.client.rendering.wildfire;

import com.geckolib.renderer.layer.builtin.AutoGlowingGeoLayer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Wildfire;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class WildfireRenderer extends DungeonsGeoRenderer<Wildfire> {
    public WildfireRenderer(EntityRendererProvider.Context context) {
        super(context, new WildfireModel());
        this.renderLayers.addLayer(new AutoGlowingGeoLayer<>(this));
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
