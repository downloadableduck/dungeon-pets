package com.jeff.pets.dungon_pets.client.rendering.vanguard;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Vanguard;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class VanguardRenderer extends DungeonsGeoRenderer<Vanguard> {
    public VanguardRenderer(EntityRendererProvider.Context context) {
        super(context, new VanguardModel());
    }

    @Override
    public float getScale() {
        return 2f;
    }
}
