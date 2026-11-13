package com.jeff.pets.dungon_pets.client.rendering.mountaineer;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.dungon_pets.DungeonPets;
import com.jeff.pets.dungon_pets.client.DungeonPetsClient;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoModel;
import com.jeff.pets.dungon_pets.mob.pets.Mountaineer;
import net.minecraft.resources.Identifier;

public class MountaineerModel extends DungeonsGeoModel<Mountaineer> {
    @Override
    public String name() {
        return "mountaineer";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState state) {
        return Identifier.fromNamespaceAndPath(DungeonPets.MOD_ID, "textures/mountaineer/" + DungeonPetsClient.mountaineerSkin.replace("tier", "t") + ".png");
    }
}
