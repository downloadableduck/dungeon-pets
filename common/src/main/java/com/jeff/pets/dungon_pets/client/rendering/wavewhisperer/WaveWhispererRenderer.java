package com.jeff.pets.dungon_pets.client.rendering.wavewhisperer;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.WaveWhisperer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class WaveWhispererRenderer extends DungeonsGeoRenderer<WaveWhisperer> {
    public WaveWhispererRenderer(EntityRendererProvider.Context context) {
        super(context, new WaveWhispererModel());
    }
}
