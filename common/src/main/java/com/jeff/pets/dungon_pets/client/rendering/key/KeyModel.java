package com.jeff.pets.dungon_pets.client.rendering.key;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.dungon_pets.client.DungeonPetsClient;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoModel;
import com.jeff.pets.dungon_pets.mob.pets.Key;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.dungon_pets.DungeonPets.MOD_ID;

public class KeyModel extends DungeonsGeoModel<Key> {
    @Override
    public String name() {
        return "key";
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState geoAnimatable) {
        if (DungeonPetsClient.keySkin.equals("gold")) {
            return Identifier.fromNamespaceAndPath(MOD_ID, "textures/key/gold.png");
        }
        return Identifier.fromNamespaceAndPath(MOD_ID, "textures/key/diamond.png");
    }
}
