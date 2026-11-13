package com.jeff.pets.dungon_pets.client.rendering.ancient_guardian;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.AncientGuardian;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class AncientGuardianRenderer extends DungeonsGeoRenderer<AncientGuardian> {
    public AncientGuardianRenderer(EntityRendererProvider.Context context) {
        super(context, new AncientGuardianModel());
    }
}
