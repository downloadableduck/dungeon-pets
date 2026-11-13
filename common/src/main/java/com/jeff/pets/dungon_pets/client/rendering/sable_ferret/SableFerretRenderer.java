package com.jeff.pets.dungon_pets.client.rendering.sable_ferret;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.SableFerret;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class SableFerretRenderer extends DungeonsGeoRenderer<SableFerret> {
    public SableFerretRenderer(EntityRendererProvider.Context context) {
        super(context, new SableFerretModel());
    }

    @Override
    public float getScale() {
        return 2;
    }
}
