package com.jeff.pets.dungon_pets.mob.pets;

import com.jeff.pets.dungon_pets.mob.DungeonsGroundPet;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class SkeletonHorseman extends DungeonsGroundPet {
    public SkeletonHorseman(EntityType<? extends @NotNull TamableAnimal> type, Level level) {
        super(type, level);
        this.setItemInHand(InteractionHand.MAIN_HAND, new ItemStack(Items.BOW));
    }

    @Override
    protected int stopDistance() {
        return 4;
    }

    @Override
    protected float heartHeight() {
        return 3;
    }
}
