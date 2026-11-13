package com.jeff.pets.dungon_pets.client.rendering.mystery_merchant;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.MysteryMerchant;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class MysteryMerchantRenderer extends DungeonsGeoRenderer<MysteryMerchant> {
    public MysteryMerchantRenderer(EntityRendererProvider.Context context) {
        super(context, new MysteryMerchantModel());
    }
}
