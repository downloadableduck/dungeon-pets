package com.jeff.pets.dungon_pets.client.rendering.vindicator_dungeons;

import com.geckolib.renderer.base.BoneSnapshots;
import com.geckolib.renderer.base.RenderPassInfo;
import com.jeff.pets.dungon_pets.client.DungeonPetsClient;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsPetRenderState;
import com.jeff.pets.dungon_pets.mob.pets.VindicatorDungeons;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class VindicatorDungeonsRenderer extends DungeonsGeoRenderer<VindicatorDungeons> {
    public VindicatorDungeonsRenderer(EntityRendererProvider.Context context) {
        super(context, new VindicatorDungeonsModel());
    }

    @Override
    public void adjustModelBonesForRender(RenderPassInfo<@NotNull DungeonsPetRenderState> renderPassInfo, BoneSnapshots snapshots) {
        snapshots.ifPresent("VindicatorHelmet", bone -> bone.skipRender(DungeonPetsClient.vindicatorDungeonsSkin.equals("tier1")));
    }

    @Override
    public float getScale() {
        return 2;
    }

    @Override
    public boolean hasShadowTexture() {
        return true;
    }
}
