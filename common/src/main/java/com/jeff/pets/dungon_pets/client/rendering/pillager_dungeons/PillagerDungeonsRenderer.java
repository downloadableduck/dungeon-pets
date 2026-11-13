package com.jeff.pets.dungon_pets.client.rendering.pillager_dungeons;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.PillagerDungeons;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class PillagerDungeonsRenderer extends DungeonsGeoRenderer<PillagerDungeons> {
    public PillagerDungeonsRenderer(EntityRendererProvider.Context context) {
        super(context, new PillagerDungeonsModel());
    }

    @Override
    public float getScale() {
        return 2;
    }
}
