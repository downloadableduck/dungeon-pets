package com.jeff.pets.dungon_pets.client.rendering.conjured_slime;

import com.jeff.pets.dungon_pets.client.DungeonPetsClient;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsPetRenderState;
import com.jeff.pets.dungon_pets.mob.pets.ConjuredSlime;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

public class ConjuredSlimeRenderer extends DungeonsGeoRenderer<ConjuredSlime> {
    public ConjuredSlimeRenderer(EntityRendererProvider.Context context) {
        super(context, new ConjuredSlimeModel());
    }

    @Override
    public float getScale() {
        return switch (DungeonPetsClient.conjuredSlimeSkin) {
            case "medium" -> 0.5f;
            case "large" -> 1;
            case null, default -> 0.25f;
        };
    }

    @Override
    public RenderType getRenderType(@NonNull DungeonsPetRenderState state, @NotNull Identifier texture) {
        super.getRenderType(state, texture);
        return RenderTypes.entityTranslucent(texture);
    }

    @Override
    public boolean shouldRotate() {
        return false;
    }
}
