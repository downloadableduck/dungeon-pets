package com.jeff.pets.dungon_pets.client.rendering.nameless_one;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.NamelessOne;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class NamelessOneRenderer extends DungeonsGeoRenderer<NamelessOne> {
    public NamelessOneRenderer(EntityRendererProvider.Context context) {
        super(context, new NamelessOneModel());
    }

    @Override
    public float getScale() {
        return 2.5f;
    }
}
