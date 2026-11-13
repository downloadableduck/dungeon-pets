package com.jeff.pets.dungon_pets.client.rendering.tower_wraith;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.TowerWraith;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class TowerWraithRenderer extends DungeonsGeoRenderer<TowerWraith> {
    public TowerWraithRenderer(EntityRendererProvider.Context context) {
        super(context, new TowerWraithModel());
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
