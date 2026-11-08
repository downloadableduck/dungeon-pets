package com.jeff.pets.dungon_pets.client.rendering.key;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Key;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class KeyRenderer extends DungeonsGeoRenderer<Key> {
    public KeyRenderer(EntityRendererProvider.Context context) {
        super(context, new KeyModel());
    }
}
