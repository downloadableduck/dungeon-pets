package com.jeff.pets.dungon_pets.client.rendering.wisp;

import com.geckolib.renderer.layer.builtin.AutoGlowingGeoLayer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Wisp;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class WIspRenderer extends DungeonsGeoRenderer<Wisp> {
    public WIspRenderer(EntityRendererProvider.Context context) {
        super(context, new WispModel());
        this.renderLayers.addLayer(new AutoGlowingGeoLayer<>(this));
    }

    @Override
    public boolean shouldRotate() {
        return false;
    }

    @Override
    public boolean hasShadowTexture() {
        return true;
    }
}
