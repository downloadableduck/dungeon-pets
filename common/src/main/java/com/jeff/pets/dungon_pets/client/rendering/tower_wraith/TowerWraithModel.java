package com.jeff.pets.dungon_pets.client.rendering.tower_wraith;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.dungon_pets.DungeonPets;
import com.jeff.pets.dungon_pets.client.DungeonPetsClient;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoModel;
import com.jeff.pets.dungon_pets.mob.pets.TowerWraith;
import net.minecraft.resources.Identifier;
import org.jspecify.annotations.NonNull;

public class TowerWraithModel extends DungeonsGeoModel<TowerWraith> {
    @Override
    public String name() {
        return "tower_wraith";
    }

    @Override
    public @NonNull Identifier getTextureResource(@NonNull GeoRenderState state) {
        if (DungeonPetsClient.towerWrathSkin.equals("pink"))
            return Identifier.fromNamespaceAndPath(DungeonPets.MOD_ID, "textures/tower_wraith/pink.png");
        else return Identifier.fromNamespaceAndPath(DungeonPets.MOD_ID, "textures/tower_wraith/normal.png");
    }
}
