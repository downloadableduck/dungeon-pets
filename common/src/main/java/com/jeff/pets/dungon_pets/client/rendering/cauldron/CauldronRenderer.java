package com.jeff.pets.dungon_pets.client.rendering.cauldron;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Cauldron;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class CauldronRenderer extends DungeonsGeoRenderer<Cauldron> {
    public CauldronRenderer(EntityRendererProvider.Context context) {
        super(context, new CauldronModel());
    }

    @Override
    public float getScale() {
        return 4;
    }

    @Override
    public boolean shouldRotate() {
        return false;
    }
}
