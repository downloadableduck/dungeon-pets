package com.jeff.pets.dungon_pets.client.rendering.sable_ferret;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.SableFerret;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class SableFerretRenderer extends DungeonsGeoRenderer<SableFerret> {
    public SableFerretRenderer(EntityRendererProvider.Context context) {
        super(context, new SableFerretModel());
    }
}
