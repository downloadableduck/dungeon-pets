package com.jeff.pets.dungon_pets.client.rendering.vindicator_chef;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.VindicatorChef;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class VindicatorChefRenderer extends DungeonsGeoRenderer<VindicatorChef> {
    public VindicatorChefRenderer(EntityRendererProvider.Context context) {
        super(context, new VindicatorChefModel());
    }

    @Override
    public float getScale() {
        return 2;
    }
}
