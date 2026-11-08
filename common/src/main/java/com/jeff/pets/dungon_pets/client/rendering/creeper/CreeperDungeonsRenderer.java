package com.jeff.pets.dungon_pets.client.rendering.creeper;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.CreeperDungeons;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class CreeperDungeonsRenderer extends DungeonsGeoRenderer<CreeperDungeons> {
    public CreeperDungeonsRenderer(EntityRendererProvider.Context context) {
        super(context, new CreeperDungeonsModel());
    }

    @Override
    public float getScale() {
        return 3;
    }
}
