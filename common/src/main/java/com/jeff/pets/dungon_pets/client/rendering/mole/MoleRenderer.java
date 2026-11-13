package com.jeff.pets.dungon_pets.client.rendering.mole;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Mole;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class MoleRenderer extends DungeonsGeoRenderer<Mole> {
    public MoleRenderer(EntityRendererProvider.Context context) {
        super(context, new MoleModel());
    }

    @Override
    public float getScale() {
        return 2f;
    }
}
