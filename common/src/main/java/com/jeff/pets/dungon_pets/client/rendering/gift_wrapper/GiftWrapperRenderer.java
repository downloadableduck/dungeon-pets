package com.jeff.pets.dungon_pets.client.rendering.gift_wrapper;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.RenderPassInfo;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsPetRenderState;
import com.jeff.pets.dungon_pets.mob.pets.GiftWrapper;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class GiftWrapperRenderer extends DungeonsGeoRenderer<GiftWrapper> {
    public GiftWrapperRenderer(EntityRendererProvider.Context context) {
        super(context, new GiftWrapperModel());
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
