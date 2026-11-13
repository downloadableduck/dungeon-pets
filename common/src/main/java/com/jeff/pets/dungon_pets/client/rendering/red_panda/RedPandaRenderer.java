package com.jeff.pets.dungon_pets.client.rendering.red_panda;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.RedPanda;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class RedPandaRenderer extends DungeonsGeoRenderer<RedPanda> {
    public RedPandaRenderer(EntityRendererProvider.Context context) {
        super(context, new RedPandaModel());
    }

    @Override
    public float getScale() {
        return 2f;
    }
}
