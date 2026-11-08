package com.jeff.pets.dungon_pets.client.rendering;

import com.geckolib.animatable.GeoAnimatable;
import com.geckolib.model.GeoModel;
import com.geckolib.renderer.GeoEntityRenderer;
import com.geckolib.renderer.base.RenderPassInfo;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;

import static com.mojang.math.Axis.YP;

public abstract class DungeonsGeoRenderer<T extends Entity & GeoAnimatable> extends GeoEntityRenderer<@NotNull T, @NotNull DungeonsPetRenderState> {
    public DungeonsGeoRenderer(EntityRendererProvider.Context context, GeoModel<@NotNull T> model) {
        super(context, model);
    }

    public boolean shouldRotate() {
        return true;
    }

    @Override
    public void adjustRenderPose(@NotNull RenderPassInfo<@NotNull DungeonsPetRenderState> state) {
        super.adjustRenderPose(state);
        if (this.shouldRotate()) state.poseStack().mulPose(YP.rotationDegrees(180));
    }

    @Override
    public void scaleModelForRender(@NotNull RenderPassInfo<@NotNull DungeonsPetRenderState> state, float f, float g) {
        super.scaleModelForRender(state, f, g);
        state.poseStack().scale(this.getScale(), this.getScale(), this.getScale());
    }

    public float getScale() {
        return 1;
    }

    @Override
    public DungeonsPetRenderState createRenderState(T animateable, Void voi) {
        return new DungeonsPetRenderState();
    }
}
