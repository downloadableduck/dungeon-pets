package com.jeff.pets.dungon_pets.client.rendering.tempest_golem;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.TempestGolem;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class TempestGolemRenderer extends DungeonsGeoRenderer<TempestGolem> {
    public TempestGolemRenderer(EntityRendererProvider.Context context) {
        super(context, new TempestGolemModel());
    }

    @Override
    public float getScale() {
        return 2f;
    }
}
