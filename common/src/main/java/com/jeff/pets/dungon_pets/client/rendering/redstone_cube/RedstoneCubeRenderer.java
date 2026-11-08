package com.jeff.pets.dungon_pets.client.rendering.redstone_cube;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.RedstoneCube;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class RedstoneCubeRenderer extends DungeonsGeoRenderer<RedstoneCube> {
    public RedstoneCubeRenderer(EntityRendererProvider.Context context) {
        super(context, new RedstoneCubeModel());
    }
}
