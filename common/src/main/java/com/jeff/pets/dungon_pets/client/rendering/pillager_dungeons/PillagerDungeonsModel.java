package com.jeff.pets.dungon_pets.client.rendering.pillager_dungeons;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.dungon_pets.DungeonPets;
import com.jeff.pets.dungon_pets.client.DungeonPetsClient;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoModel;
import com.jeff.pets.dungon_pets.mob.pets.PillagerDungeons;
import net.minecraft.resources.Identifier;
import org.jspecify.annotations.NonNull;

public class PillagerDungeonsModel extends DungeonsGeoModel<PillagerDungeons> {
    @Override
    public String name() {
        return "pillager";
    }

    @Override
    public @NonNull Identifier getTextureResource(@NonNull GeoRenderState state) {
        return Identifier.fromNamespaceAndPath(DungeonPets.MOD_ID, "textures/pillager/" + DungeonPetsClient.pillagerDungeonsSkin.replace("tier", "t") + ".png");
    }
}
