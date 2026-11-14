package com.jeff.pets.dungon_pets.client.rendering.guardian_vex;

import com.geckolib.cache.model.GeoBone;
import com.geckolib.renderer.layer.builtin.ItemInHandGeoLayer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsPetRenderState;
import com.jeff.pets.dungon_pets.mob.pets.GuardianVex;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.item.ItemStackRenderState;

public class GuardianVexRenderer extends DungeonsGeoRenderer<GuardianVex> {
    public GuardianVexRenderer(EntityRendererProvider.Context context) {
        super(context, new GuardianVexModel());
        this.renderLayers.addLayer(new ItemInHandGeoLayer<>(context, this, "J_R_WeaponSocket", "J_R_WeaponSocket") {
            @Override
            public void submitItemStackRender(PoseStack poseStack,
                                              GeoBone e,
                                              ItemStackRenderState stackState,
                                              net.minecraft.world.item.ItemDisplayContext displayContext,
                                              DungeonsPetRenderState renderState,
                                              net.minecraft.client.renderer.SubmitNodeCollector renderTasks,
                                              int packedLight) {
                poseStack.rotate(Axis.YP.rotationDegrees(-90));
                super.submitItemStackRender(poseStack, e, stackState, displayContext, renderState, renderTasks, packedLight);
            }
        });
    }

    @Override
    public float getScale() {
        return 2;
    }
}
