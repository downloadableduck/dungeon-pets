package com.jeff.pets.dungon_pets.client.rendering.enchantsmith;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.Enchantsmith;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class EnchantsmithRenderer extends DungeonsGeoRenderer<Enchantsmith> {
    public EnchantsmithRenderer(EntityRendererProvider.Context context) {
        super(context, new EnchantsmithModel());
    }

    @Override
    public float getScale() {
        return 2f;
    }
}
