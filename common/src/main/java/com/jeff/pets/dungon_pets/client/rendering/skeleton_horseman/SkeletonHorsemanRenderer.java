package com.jeff.pets.dungon_pets.client.rendering.skeleton_horseman;

import com.geckolib.cache.model.GeoBone;
import com.geckolib.renderer.layer.builtin.ItemInHandGeoLayer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsPetRenderState;
import com.jeff.pets.dungon_pets.mob.pets.SkeletonHorseman;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.item.ItemStackRenderState;

public class SkeletonHorsemanRenderer extends DungeonsGeoRenderer<SkeletonHorseman> {
    public SkeletonHorsemanRenderer(EntityRendererProvider.Context context) {
        super(context, new SkeletonHorsemanModel());
        this.renderLayers.addLayer(new ItemInHandGeoLayer<>(context, this, "J_R_Hand_ske", "J_L_Hand_ske") {
            @Override
            public void submitItemStackRender(PoseStack poseStack,
                                              GeoBone e,
                                              ItemStackRenderState stackState,
                                              net.minecraft.world.item.ItemDisplayContext displayContext,
                                              DungeonsPetRenderState renderState,
                                              net.minecraft.client.renderer.SubmitNodeCollector renderTasks,
                                              int packedLight) {
                float scale = 1 / SkeletonHorsemanRenderer.this.getScale();
                poseStack.scale(scale, scale, scale);
                super.submitItemStackRender(poseStack, e, stackState, displayContext, renderState, renderTasks, packedLight);
            }
        });
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
