package com.jeff.pets.dungon_pets.client.rendering.redstone_monstrocity;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.RedstoneMonstrocity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class RedstoneMonstrocityRenderer extends DungeonsGeoRenderer<RedstoneMonstrocity> {
    public RedstoneMonstrocityRenderer(EntityRendererProvider.Context context) {
        super(context, new RedstoneMonstrocityModel());
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
