package com.jeff.pets.dungon_pets.client.rendering.redstone_golem;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.RedstoneGolem;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class RedstoneGolemRenderer extends DungeonsGeoRenderer<RedstoneGolem> {
    public RedstoneGolemRenderer(EntityRendererProvider.Context context) {
        super(context, new RedstoneGolemModel());
    }

    @Override
    public float getScale() {
        return 2;
    }

    @Override
    public boolean hasShadowTexture() {
        return true;
    }
}
