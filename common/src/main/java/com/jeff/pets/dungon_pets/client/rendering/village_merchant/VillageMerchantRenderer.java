package com.jeff.pets.dungon_pets.client.rendering.village_merchant;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.VillageMerchant;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class VillageMerchantRenderer extends DungeonsGeoRenderer<VillageMerchant> {
    public VillageMerchantRenderer(EntityRendererProvider.Context context) {
        super(context, new VillageMerchantModel());
    }

    @Override
    public float getScale() {
        return 2f;
    }
}
