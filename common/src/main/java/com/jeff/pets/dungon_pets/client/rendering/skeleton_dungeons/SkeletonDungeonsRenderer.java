package com.jeff.pets.dungon_pets.client.rendering.skeleton_dungeons;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.BoneSnapshots;
import com.geckolib.renderer.base.RenderPassInfo;
import com.jeff.pets.dungon_pets.client.DungeonPetsClient;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsPetRenderState;
import com.jeff.pets.dungon_pets.mob.pets.SkeletonDungeons;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class SkeletonDungeonsRenderer extends DungeonsGeoRenderer<SkeletonDungeons> {
    public SkeletonDungeonsRenderer(EntityRendererProvider.Context context) {
        super(context, new SkeletonDungeonsModel());
    }

    @Override
    public void adjustModelBonesForRender(RenderPassInfo<@NotNull DungeonsPetRenderState> renderPassInfo, BoneSnapshots snapshots) {
        snapshots.ifPresent("helmet", bone -> bone.skipRender(DungeonPetsClient.skeletonDungeonsSkin.equals("tier1")));
        snapshots.ifPresent("reinforced_mail", bone -> bone.skipRender(!DungeonPetsClient.skeletonDungeonsSkin.equals("tier3")));
    }

    @Override
    public float getScale() {
        return 2;
    }
}
