package com.jeff.pets.dungon_pets.fabric.client;

import com.jeff.pets.dungon_pets.client.DungeonPetsClient;
import net.fabricmc.api.ClientModInitializer;

public final class DungeonPetsFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        DungeonPetsClient.clientInit();
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
    }
}
