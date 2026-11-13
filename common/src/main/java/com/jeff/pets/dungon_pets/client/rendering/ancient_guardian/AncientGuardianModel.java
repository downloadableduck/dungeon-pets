package com.jeff.pets.dungon_pets.client.rendering.ancient_guardian;

import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.dungon_pets.DungeonPets;
import com.jeff.pets.dungon_pets.client.DungeonPetsClient;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoModel;
import com.jeff.pets.dungon_pets.mob.pets.AncientGuardian;
import net.minecraft.resources.Identifier;

public class AncientGuardianModel extends DungeonsGeoModel<AncientGuardian> {
    @Override
    public String name() {
        return "ancient_guardian";
    }

    @Override
    public Identifier getTextureResource(GeoRenderState state) {
        if (DungeonPetsClient.ancientGuardianSkin.equals("fake")) {
            return Identifier.fromNamespaceAndPath(DungeonPets.MOD_ID, "textures/ancient_guardian/fake.png");
        }
        return Identifier.fromNamespaceAndPath(DungeonPets.MOD_ID, "textures/ancient_guardian/ancient_guardian.png");
    }
}
