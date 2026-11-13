package com.jeff.pets.dungon_pets.mob.pets;

import com.jeff.pets.dungon_pets.DungeonPets;
import com.jeff.pets.dungon_pets.mob.DungeonsFlyingPet;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class GuardianVex extends DungeonsFlyingPet {
    public GuardianVex(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
        this.setItemInHand(InteractionHand.MAIN_HAND, DungeonPets.MACE.getDefaultInstance());
    }

    @Override
    protected int stopDistance() {
        return 2;
    }

    @Override
    protected float heartHeight() {
        return 1.5f;
    }
}
