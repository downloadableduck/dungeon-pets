package com.jeff.pets.dungon_pets.mob.pets;

import com.jeff.pets.dungon_pets.mob.DungeonsGroundPet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

//dont forget to remove the shoulderpads and keepads on t1 and t2, and remove the backpack on t1 and t3
public class Mountaineer extends DungeonsGroundPet {
    public Mountaineer(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
    }

    @Override
    protected int stopDistance() {
        return 2;
    }

    @Override
    protected float heartHeight() {
        return 2;
    }
}
