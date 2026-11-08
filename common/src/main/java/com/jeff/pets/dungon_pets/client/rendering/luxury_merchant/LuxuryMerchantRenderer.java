package com.jeff.pets.dungon_pets.client.rendering.luxury_merchant;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.RenderPassInfo;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsPetRenderState;
import com.jeff.pets.dungon_pets.mob.pets.LuxuryMerchant;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class LuxuryMerchantRenderer extends DungeonsGeoRenderer<LuxuryMerchant> {
    public LuxuryMerchantRenderer(EntityRendererProvider.Context context) {
        super(context, new LuxuryMerchantModel());
    }

    @Override
    public float getScale() {
        return 2.5f;
    }

    @Override
    public void scaleModelForRender(@NotNull RenderPassInfo<@NotNull DungeonsPetRenderState> state, float f, float g) {
        super.scaleModelForRender(state, f, g);
        state.poseStack().translate(0, -0.15f, 0);
    }
}
