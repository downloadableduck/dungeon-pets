package com.jeff.pets.dungon_pets.client.rendering.leapleaf;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Leapleaf;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class LeapleafRenderer extends DungeonsGeoRenderer<Leapleaf> {
    public LeapleafRenderer(EntityRendererProvider.Context context) {
        super(context, new LeapleafModel());
    }

    @Override
    public float getScale() {
        return 2f;
    }
}
