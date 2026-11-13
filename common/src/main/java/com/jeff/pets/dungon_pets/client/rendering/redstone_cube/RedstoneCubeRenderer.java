package com.jeff.pets.dungon_pets.client.rendering.redstone_cube;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.RedstoneCube;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class RedstoneCubeRenderer extends DungeonsGeoRenderer<RedstoneCube> {
    public RedstoneCubeRenderer(EntityRendererProvider.Context context) {
        super(context, new RedstoneCubeModel());
    }

    @Override
    public float getScale() {
        return 0.2f;
    }

    @Override
    public boolean hasShadowTexture() {
        return true;
    }
}
