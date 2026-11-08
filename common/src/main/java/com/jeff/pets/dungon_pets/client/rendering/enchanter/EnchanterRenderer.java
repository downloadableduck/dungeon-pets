package com.jeff.pets.dungon_pets.client.rendering.enchanter;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Enchanter;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class EnchanterRenderer extends DungeonsGeoRenderer<Enchanter> {
    public EnchanterRenderer(EntityRendererProvider.Context context) {
        super(context, new EnchanterModel());
    }

    @Override
    public float getScale() {
        return 2.5f;
    }
}
