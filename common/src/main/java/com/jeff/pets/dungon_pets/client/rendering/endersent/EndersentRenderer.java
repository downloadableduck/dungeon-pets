package com.jeff.pets.dungon_pets.client.rendering.endersent;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Endersent;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class EndersentRenderer extends DungeonsGeoRenderer<Endersent> {
    public EndersentRenderer(EntityRendererProvider.Context context) {
        super(context, new EndersentModel());
    }

    @Override
    public float getScale() {
        return 2;
    }
}
