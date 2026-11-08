package com.jeff.pets.dungon_pets.client.rendering.jungle_zombie;

import com.geckolib.model.GeoModel;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.JungleZombie;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class JungleZombieRenderer extends DungeonsGeoRenderer<JungleZombie> {
    public JungleZombieRenderer(EntityRendererProvider.Context context) {
        super(context, new JungleZombieModel());
    }

    @Override
    public float getScale() {
        return 2.5f;
    }
}
