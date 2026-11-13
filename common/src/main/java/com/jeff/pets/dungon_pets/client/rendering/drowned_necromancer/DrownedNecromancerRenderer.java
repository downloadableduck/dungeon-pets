package com.jeff.pets.dungon_pets.client.rendering.drowned_necromancer;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.DrownedNecromancer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class DrownedNecromancerRenderer extends DungeonsGeoRenderer<DrownedNecromancer> {
    public DrownedNecromancerRenderer(EntityRendererProvider.Context context) {
        super(context, new DrownedNecromancerModel());
    }

    @Override
    public float getScale() {
        return 2;
    }
}
