package com.jeff.pets.dungon_pets.client.rendering.baby_squid;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.BabySquid;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class BabySquidRenderer extends DungeonsGeoRenderer<BabySquid> {
    public BabySquidRenderer(EntityRendererProvider.Context context) {
        super(context, new BabySquidModel());
    }

    @Override
    public float getScale() {
        return 0.25f;
    }
}
