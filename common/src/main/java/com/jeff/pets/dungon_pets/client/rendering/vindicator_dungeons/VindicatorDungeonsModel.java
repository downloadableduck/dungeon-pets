package com.jeff.pets.dungon_pets.client.rendering.vindicator_dungeons;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.dungon_pets.DungeonPets;
import com.jeff.pets.dungon_pets.client.DungeonPetsClient;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoModel;
import com.jeff.pets.dungon_pets.mob.pets.VindicatorDungeons;
import net.minecraft.resources.Identifier;
import org.jspecify.annotations.NonNull;

public class VindicatorDungeonsModel extends DungeonsGeoModel<VindicatorDungeons> {
    @Override
    public String name() {
        return "vindicator";
    }

    @Override
    public @NonNull Identifier getTextureResource(@NonNull GeoRenderState state) {
        return Identifier.fromNamespaceAndPath(DungeonPets.MOD_ID, "textures/vindicator/" + DungeonPetsClient.vindicatorDungeonsSkin.replace("tier", "t") + ".png");
    }
}
