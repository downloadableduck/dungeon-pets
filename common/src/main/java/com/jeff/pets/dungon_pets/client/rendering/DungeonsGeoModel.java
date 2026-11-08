package com.jeff.pets.dungon_pets.client.rendering;

import com.geckolib.animatable.GeoAnimatable;
import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.dungon_pets.DungeonPets.MOD_ID;

public abstract class DungeonsGeoModel<T extends GeoAnimatable> extends GeoModel<@NotNull T> {
    public abstract String name();

    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState renderState) {
        return Identifier.fromNamespaceAndPath(MOD_ID, name() + "/" + name());
    }

    @Override
    public @NotNull Identifier getAnimationResource(@NotNull T animatable) {
        return Identifier.fromNamespaceAndPath(MOD_ID, name() + "/" + name());
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState geoRenderState) {
        return Identifier.fromNamespaceAndPath(MOD_ID, "textures/" + name() + "/" + name() + ".png");
    }
}
