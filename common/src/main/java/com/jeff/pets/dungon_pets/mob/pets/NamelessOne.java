package com.jeff.pets.dungon_pets.mob.pets;

import com.jeff.pets.dungon_pets.mob.DungeonsFlyingPet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class NamelessOne extends DungeonsFlyingPet {
    public NamelessOne(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    protected int stopDistance() {
        return 2;
    }

    @Override
    protected float heartHeight() {
        return 3;
    }
}
