package com.jeff.pets.dungon_pets.client.rendering.stone_minitrocity;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.StoneMinitrocity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class StoneMinitrocityRenderer extends DungeonsGeoRenderer<StoneMinitrocity> {
    public StoneMinitrocityRenderer(EntityRendererProvider.Context context) {
        super(context, new StoneMinitrocityModel());
    }

    @Override
    public float getScale() {
        return 2f;
    }
}
