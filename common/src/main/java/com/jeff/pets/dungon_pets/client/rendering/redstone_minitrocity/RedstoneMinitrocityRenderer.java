package com.jeff.pets.dungon_pets.client.rendering.redstone_minitrocity;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.RedstoneMinitrocity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class RedstoneMinitrocityRenderer extends DungeonsGeoRenderer<RedstoneMinitrocity> {
    public RedstoneMinitrocityRenderer(EntityRendererProvider.Context context) {
        super(context, new RedstoneMinitrocityModel());
    }
}
