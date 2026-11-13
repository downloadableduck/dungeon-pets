package com.jeff.pets.dungon_pets.mob.pets;

import com.jeff.pets.dungon_pets.mob.DungeonsGroundPet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class WretchedWraith extends DungeonsGroundPet {
    public WretchedWraith(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    protected int stopDistance() {
        return 4;
    }

    @Override
    protected float heartHeight() {
        return 2.5f;
    }
}
