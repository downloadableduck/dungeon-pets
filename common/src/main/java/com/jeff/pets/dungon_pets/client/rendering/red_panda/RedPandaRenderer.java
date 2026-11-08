package com.jeff.pets.dungon_pets.client.rendering.red_panda;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.RedPanda;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class RedPandaRenderer extends DungeonsGeoRenderer<RedPanda> {
    public RedPandaRenderer(EntityRendererProvider.Context context) {
        super(context, new RedPandaModel());
    }
}
