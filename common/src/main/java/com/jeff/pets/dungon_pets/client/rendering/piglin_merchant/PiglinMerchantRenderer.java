package com.jeff.pets.dungon_pets.client.rendering.piglin_merchant;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.PiglinMerchant;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class PiglinMerchantRenderer extends DungeonsGeoRenderer<PiglinMerchant> {
    public PiglinMerchantRenderer(EntityRendererProvider.Context context) {
        super(context, new PiglinMerchantModel());
    }

    @Override
    public float getScale() {
        return 4;
    }

    @Override
    public boolean hasShadowTexture() {
        return true;
    }
}
