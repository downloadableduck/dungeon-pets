package com.jeff.pets.dungon_pets.client.rendering.blacksmith_dungeons;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.BlacksmithDungeons;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class BlacksmithDungeonsRenderer extends DungeonsGeoRenderer<BlacksmithDungeons> {
    public BlacksmithDungeonsRenderer(EntityRendererProvider.Context context) {
        super(context, new BlacksmithDungeonsModel());
    }

    @Override
    public float getScale() {
        return 2f;
    }

    @Override
    public boolean hasShadowTexture() {
        return true;
    }
}
