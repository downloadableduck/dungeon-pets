package com.jeff.pets.dungon_pets.client.rendering;

import com.geckolib.animatable.GeoAnimatable;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.dungon_pets.DungeonPets;
import net.minecraft.resources.Identifier;
import org.jspecify.annotations.NonNull;

public abstract class VillagerDungeonsModel<T extends GeoAnimatable> extends DungeonsGeoModel<T> {

    @Override
    public @NonNull Identifier getModelResource(@NonNull GeoRenderState state) {
        return Identifier.fromNamespaceAndPath(DungeonPets.MOD_ID, "villager/villager");
    }

    @Override
    public @NonNull Identifier getAnimationResource(@NonNull T state) {
        return Identifier.fromNamespaceAndPath(DungeonPets.MOD_ID, "villager/villager");
    }
}
