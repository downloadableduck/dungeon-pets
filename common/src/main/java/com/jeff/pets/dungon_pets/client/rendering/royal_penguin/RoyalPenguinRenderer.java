package com.jeff.pets.dungon_pets.client.rendering.royal_penguin;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.RoyalPenguin;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class RoyalPenguinRenderer extends DungeonsGeoRenderer<RoyalPenguin> {
    public RoyalPenguinRenderer(EntityRendererProvider.Context context) {
        super(context, new RoyalPenguinModel());
    }
}
