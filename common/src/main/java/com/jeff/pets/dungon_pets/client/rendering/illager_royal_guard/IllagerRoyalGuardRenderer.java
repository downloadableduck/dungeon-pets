package com.jeff.pets.dungon_pets.client.rendering.illager_royal_guard;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.layer.builtin.AutoGlowingGeoLayer;
import com.geckolib.renderer.layer.builtin.ItemInHandGeoLayer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.IllagerRoyalGuard;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class IllagerRoyalGuardRenderer extends DungeonsGeoRenderer<IllagerRoyalGuard> {
    public IllagerRoyalGuardRenderer(EntityRendererProvider.Context context) {
        super(context, new IllagerRoyalGuardModel());
        this.renderLayers.addLayer(new ItemInHandGeoLayer<>(context, this, "J_R_Hand", "J_L_Hand"));
    }

    @Override
    public float getScale() {
        return 2f;
    }
}
