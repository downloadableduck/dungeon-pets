package com.jeff.pets.dungon_pets.fabric;

import com.jeff.pets.dungon_pets.mob.pets.Key;
import net.fabricmc.api.ModInitializer;

import com.jeff.pets.dungon_pets.DungeonPets;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.client.renderer.entity.EntityRenderers;

public final class DungeonPetsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in archillager mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        DungeonPets.init();
        DungeonPets.initAttributes(FabricDefaultAttributeRegistry::register);
    }
}
