package com.jeff.pets.dungon_pets.client.rendering.blastling;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Blastling;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class BlastlingRenderer extends DungeonsGeoRenderer<Blastling> {
    public BlastlingRenderer(EntityRendererProvider.Context context) {
        super(context, new BlastlingModel());
    }

    @Override
    public float getScale() {
        return 2;
    }
}
