package com.jeff.pets.dungon_pets.client.rendering.cinnamon_ferret;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.CinnamonFerret;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class CinnamonFerretRenderer extends DungeonsGeoRenderer<CinnamonFerret> {
    public CinnamonFerretRenderer(EntityRendererProvider.Context context) {
        super(context, new CinnamonFerretModel());
    }

    @Override
    public float getScale() {
        return 2;
    }
}
