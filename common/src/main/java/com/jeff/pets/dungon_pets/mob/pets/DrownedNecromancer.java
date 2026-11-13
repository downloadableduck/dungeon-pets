package com.jeff.pets.dungon_pets.mob.pets;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class DrownedNecromancer extends Necromancer {
    public DrownedNecromancer(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    public float heartHeight() {
        return 2;
    }
}
