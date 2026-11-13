package com.jeff.pets.dungon_pets.client.rendering.baby_ghast;

import com.geckolib.renderer.base.RenderPassInfo;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsPetRenderState;
import com.jeff.pets.dungon_pets.mob.pets.BabyGhast;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.mojang.math.Axis.YP;

public class BabyGhastRenderer extends DungeonsGeoRenderer<BabyGhast> {
    public BabyGhastRenderer(EntityRendererProvider.Context context) {
        super(context, new BabyGhastModel());
    }

    @Override
    public float getScale() {
        return 0.25f;
    }

    @Override
    public boolean shouldRotate() {
        return false;
    }

    @Override
    public void adjustRenderPose(@NotNull RenderPassInfo<@NotNull DungeonsPetRenderState> state) {
        super.adjustRenderPose(state);
        state.poseStack().mulPose(YP.rotationDegrees(90));
    }

    @Override
    public RenderType getRenderType(DungeonsPetRenderState state, @NotNull Identifier texture) {
        super.getRenderType(state, texture);
        return RenderTypes.entityTranslucent(texture);
    }
}
