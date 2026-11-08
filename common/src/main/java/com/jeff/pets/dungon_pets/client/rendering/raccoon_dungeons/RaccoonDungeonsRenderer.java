package com.jeff.pets.dungon_pets.client.rendering.raccoon_dungeons;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.RaccoonDungeons;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class RaccoonDungeonsRenderer extends DungeonsGeoRenderer<RaccoonDungeons> {
    public RaccoonDungeonsRenderer(EntityRendererProvider.Context context) {
        super(context, new RaccoonDungeonsModel());
    }

    @Override
    public float getScale() {
        return 2.5f;
    }
}
