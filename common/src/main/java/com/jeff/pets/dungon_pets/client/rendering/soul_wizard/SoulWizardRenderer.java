package com.jeff.pets.dungon_pets.client.rendering.soul_wizard;

import com.geckolib.renderer.base.RenderPassInfo;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsPetRenderState;
import com.jeff.pets.dungon_pets.mob.pets.SoulWizard;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

import static com.mojang.math.Axis.YP;

public class SoulWizardRenderer extends DungeonsGeoRenderer<SoulWizard> {
    public SoulWizardRenderer(EntityRendererProvider.Context context) {
        super(context, new SoulWizardModel());
    }

    @Override
    public void adjustRenderPose(@NotNull RenderPassInfo<@NotNull DungeonsPetRenderState> state) {
        super.adjustRenderPose(state);
        state.poseStack().mulPose(YP.rotationDegrees(90));
    }

    @Override
    public float getScale() {
        return 2f;
    }
}
