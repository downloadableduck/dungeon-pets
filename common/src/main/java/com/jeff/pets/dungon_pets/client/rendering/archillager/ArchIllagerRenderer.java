package com.jeff.pets.dungon_pets.client.rendering.archillager;

import com.geckolib.renderer.base.RenderPassInfo;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsPetRenderState;
import com.jeff.pets.dungon_pets.mob.pets.ArchIllager;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class ArchIllagerRenderer extends DungeonsGeoRenderer<ArchIllager> {
    public ArchIllagerRenderer(EntityRendererProvider.Context context) {
        super(context, new ArchIllagerModel());
    }

    @Override
    public float getScale() {
        return 2;
    }
}
