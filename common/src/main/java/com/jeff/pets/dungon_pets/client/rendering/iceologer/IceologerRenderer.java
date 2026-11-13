package com.jeff.pets.dungon_pets.client.rendering.iceologer;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Iceologer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class IceologerRenderer extends DungeonsGeoRenderer<Iceologer> {
    public IceologerRenderer(EntityRendererProvider.Context context) {
        super(context, new IceologerModel());
    }

    @Override
    public float getScale() {
        return 2f;
    }
}
