package com.jeff.pets.dungon_pets.neoforge;

import com.jeff.pets.dungon_pets.DungeonPets;
import com.jeff.pets.dungon_pets.client.DungeonPetsClient;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@Mod(DungeonPets.MOD_ID)
@EventBusSubscriber
public final class DungeonPetsNeoforge {
    public DungeonPetsNeoforge() {
    }

    @SubscribeEvent
    public static void onInit(FMLClientSetupEvent event) {
        DungeonPets.init();
        DungeonPetsClient.clientInit();
    }

    @SubscribeEvent
    public static void onAttributeInit(EntityAttributeCreationEvent event) {
        DungeonPets.initAttributes(event::put);
    }
}
