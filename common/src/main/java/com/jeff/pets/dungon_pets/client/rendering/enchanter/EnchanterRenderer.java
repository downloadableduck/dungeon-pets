package com.jeff.pets.dungon_pets.client.rendering.enchanter;

import com.geckolib.renderer.layer.builtin.AutoGlowingGeoLayer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsPetRenderState;
import com.jeff.pets.dungon_pets.mob.pets.Enchanter;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

public class EnchanterRenderer extends DungeonsGeoRenderer<Enchanter> {
    public EnchanterRenderer(EntityRendererProvider.Context context) {
        super(context, new EnchanterModel());
        this.renderLayers.addLayer(new AutoGlowingGeoLayer<>(this) {
            @Override
            protected Identifier getTextureResource(@NotNull DungeonsPetRenderState renderState) {
                return EnchanterRenderer.this.getGeoModel().getTextureResource(renderState);
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
