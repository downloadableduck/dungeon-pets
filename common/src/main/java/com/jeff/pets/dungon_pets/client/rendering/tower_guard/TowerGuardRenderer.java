package com.jeff.pets.dungon_pets.client.rendering.tower_guard;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.TowerGuard;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class TowerGuardRenderer extends DungeonsGeoRenderer<TowerGuard> {
    public TowerGuardRenderer(EntityRendererProvider.Context context) {
        super(context, new TowerGuardModel());
    }

    @Override
    public boolean hasShadowTexture() {
        return true;
    }
}
