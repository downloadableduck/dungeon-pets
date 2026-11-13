package com.jeff.pets.dungon_pets.client.rendering.snareling;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Snareling;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class SnarelingRenderer extends DungeonsGeoRenderer<Snareling> {
    public SnarelingRenderer(EntityRendererProvider.Context context) {
        super(context, new SnarelingModel());
    }

    @Override
    public float getScale() {
        return 2f;
    }
}
