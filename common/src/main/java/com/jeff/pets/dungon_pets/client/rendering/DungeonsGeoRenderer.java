package com.jeff.pets.dungon_pets.client.rendering;

import com.geckolib.animatable.GeoAnimatable;
import com.geckolib.model.GeoModel;
import com.geckolib.renderer.GeoEntityRenderer;
import com.geckolib.renderer.base.RenderPassInfo;
import com.geckolib.renderer.layer.builtin.TextureLayerGeoLayer;
import com.jeff.pets.dungon_pets.DungeonPets;
import com.jeff.pets.dungon_pets.client.DungeonPetsClient;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.feature.ItemFeatureRenderer;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.rendertype.TextureTransform;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

import static com.mojang.math.Axis.YP;

public abstract class DungeonsGeoRenderer<T extends Entity & GeoAnimatable> extends GeoEntityRenderer<@NotNull T, @NotNull DungeonsPetRenderState> {

    public static final RenderType ENTITY_GLINT = RenderType.create("entity_glint", RenderSetup.builder(RenderPipelines.GLINT).withTexture("Sampler0",ItemFeatureRenderer.ENCHANTED_GLINT_ITEM).setTextureTransform(TextureTransform.ENTITY_GLINT_TEXTURING).createRenderSetup());

    public DungeonsGeoRenderer(EntityRendererProvider.Context context, GeoModel<@NotNull T> model) {
        super(context, model);
        this.renderLayers.addLayer(new TextureLayerGeoLayer<>(this, Identifier.fromNamespaceAndPath(DungeonPets.MOD_ID, "textures/enchanted.png"), (identifier) -> DungeonPetsClient.enchanted ? ENTITY_GLINT : null));
    }

    public boolean shouldRotate() {
        return true;
    }

    @Override
    public void adjustRenderPose(@NotNull RenderPassInfo<@NotNull DungeonsPetRenderState> state) {
        super.adjustRenderPose(state);
        if (this.shouldRotate()) state.poseStack().rotate(YP.rotationDegrees(180));
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
    public @NonNull DungeonsPetRenderState createRenderState(@NonNull T animateable, Void voi) {
        return new DungeonsPetRenderState();
    }

    public boolean hasShadowTexture() {
        return false;
    }
}
