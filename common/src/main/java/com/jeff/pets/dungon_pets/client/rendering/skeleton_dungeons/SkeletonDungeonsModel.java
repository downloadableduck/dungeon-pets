package com.jeff.pets.dungon_pets.client.rendering.skeleton_dungeons;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.dungon_pets.DungeonPets;
import com.jeff.pets.dungon_pets.client.DungeonPetsClient;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoModel;
import com.jeff.pets.dungon_pets.mob.pets.SkeletonDungeons;
import net.minecraft.resources.Identifier;
import org.jspecify.annotations.NonNull;

public class SkeletonDungeonsModel extends DungeonsGeoModel<SkeletonDungeons> {
    @Override
    public String name() {
        return "skeleton";
    }
}
