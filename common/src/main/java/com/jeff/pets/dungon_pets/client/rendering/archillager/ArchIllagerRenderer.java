package com.jeff.pets.dungon_pets.client.rendering.archillager;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.ArchIllager;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ArchIllagerRenderer extends DungeonsGeoRenderer<ArchIllager> {
    public ArchIllagerRenderer(EntityRendererProvider.Context context) {
        super(context, new ArchIllagerModel());
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
