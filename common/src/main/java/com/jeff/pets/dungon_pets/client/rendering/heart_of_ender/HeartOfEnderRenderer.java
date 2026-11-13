package com.jeff.pets.dungon_pets.client.rendering.heart_of_ender;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.HeartOfEnder;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class HeartOfEnderRenderer extends DungeonsGeoRenderer<HeartOfEnder> {
    public HeartOfEnderRenderer(EntityRendererProvider.Context context) {
        super(context, new HeartOfEnderModel());
    }
}
