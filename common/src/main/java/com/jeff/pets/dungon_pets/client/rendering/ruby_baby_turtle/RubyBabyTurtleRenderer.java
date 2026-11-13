package com.jeff.pets.dungon_pets.client.rendering.ruby_baby_turtle;

import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.mob.pets.RubyBabyTurtle;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class RubyBabyTurtleRenderer extends DungeonsGeoRenderer<RubyBabyTurtle> {
    public RubyBabyTurtleRenderer(EntityRendererProvider.Context context) {
        super(context, new RubyBabyTurtleModel());
    }
}
