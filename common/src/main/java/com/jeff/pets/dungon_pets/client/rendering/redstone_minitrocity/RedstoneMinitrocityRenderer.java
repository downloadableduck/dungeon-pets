package com.jeff.pets.dungon_pets.client.rendering.redstone_minitrocity;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.RedstoneMinitrocity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class RedstoneMinitrocityRenderer extends DungeonsGeoRenderer<RedstoneMinitrocity> {
    public RedstoneMinitrocityRenderer(EntityRendererProvider.Context context) {
        super(context, new RedstoneMinitrocityModel());
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
