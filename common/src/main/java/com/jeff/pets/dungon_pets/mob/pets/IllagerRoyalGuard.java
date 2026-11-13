package com.jeff.pets.dungon_pets.mob.pets;

import com.jeff.pets.dungon_pets.DungeonPets;
import com.jeff.pets.dungon_pets.mob.DungeonsGroundPet;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class IllagerRoyalGuard extends DungeonsGroundPet {
    public IllagerRoyalGuard(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
        this.setItemInHand(InteractionHand.MAIN_HAND, new ItemStack(DungeonPets.MACE));
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
