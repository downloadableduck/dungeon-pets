package com.jeff.pets.dungon_pets.impl;

import com.geckolib.animatable.GeoItem;
import com.geckolib.animatable.client.GeoRenderProvider;
import com.geckolib.animatable.instance.AnimatableInstanceCache;
import com.geckolib.animatable.manager.AnimatableManager;
import com.geckolib.renderer.GeoItemRenderer;
import com.geckolib.util.GeckoLibUtil;
import com.google.common.base.Suppliers;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.Nullable;

import javax.crypto.Mac;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Mace extends Item implements GeoItem {

    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);
    private final Supplier<GeoItemRenderer<Mace>> renderer = Suppliers.memoize(() -> new GeoItemRenderer<>(this));

    public Mace(Properties properties) {
        super(properties);
    }

    @Override
    public void registerControllers(final AnimatableManager.@NotNull ControllerRegistrar controllers) {
        // We can fill this in later
    }

    @Override
    public @NotNull AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.geoCache;
    }

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            @Override
            public @Nullable GeoItemRenderer<?> getGeoItemRenderer() {
                return Mace.this.renderer.get();
            }
        });
    }
}