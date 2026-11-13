package com.jeff.pets.dungon_pets.client.rendering.frozen_zombie;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.FrozenZombie;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class FrozenZombieRenderer extends DungeonsGeoRenderer<FrozenZombie> {
    public FrozenZombieRenderer(EntityRendererProvider.Context context) {
        super(context, new FrozenZombieModel());
    }

    @Override
    public float getScale() {
        return 2f;
    }
}
