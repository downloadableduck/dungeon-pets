package com.jeff.pets.dungon_pets.client.rendering.emperor_penguin;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.EmperorPenguin;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class EmperorPenguinRenderer extends DungeonsGeoRenderer<EmperorPenguin> {
    public EmperorPenguinRenderer(EntityRendererProvider.Context context) {
        super(context, new EmperorPenguinModel());
    }

    @Override
    public float getScale() {
        return 2;
    }
}
