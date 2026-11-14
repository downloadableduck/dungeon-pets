package com.jeff.pets.dungon_pets.client.rendering.clam_cat;

import com.geckolib.renderer.base.RenderPassInfo;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsPetRenderState;
import com.jeff.pets.dungon_pets.mob.pets.ClamCat;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

import static com.mojang.math.Axis.YP;

public class ClamCatRenderer extends DungeonsGeoRenderer<ClamCat> {
    public ClamCatRenderer(EntityRendererProvider.Context context) {
        super(context, new ClamCatModel());
    }

    @Override
    public boolean shouldRotate() {
        return false;
    }

    @Override
    public float getScale() {
        return 2;
    }

    @Override
    public void adjustRenderPose(@NotNull RenderPassInfo<@NotNull DungeonsPetRenderState> state) {
        super.adjustRenderPose(state);
        state.poseStack().rotate(YP.rotationDegrees(90));
    }
}
