package com.jeff.pets.dungon_pets.client.rendering.wretched_wraith;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.WretchedWraith;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class WretchedWraithRenderer extends DungeonsGeoRenderer<WretchedWraith> {
    public WretchedWraithRenderer(EntityRendererProvider.Context context) {
        super(context, new WretchedWraithModel());
    }

    @Override
    public float getScale() {
        return 2;
    }
}
