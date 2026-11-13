package com.jeff.pets.dungon_pets.client.rendering.zombie_dungeons;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.BoneSnapshots;
import com.geckolib.renderer.base.RenderPassInfo;
import com.jeff.pets.dungon_pets.client.DungeonPetsClient;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsPetRenderState;
import com.jeff.pets.dungon_pets.mob.pets.ZombieDungeons;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class ZombieDungeonsRenderer extends DungeonsGeoRenderer<ZombieDungeons> {
    public ZombieDungeonsRenderer(EntityRendererProvider.Context context) {
        super(context, new ZombieDungeonsModel());
    }

    @Override
    public void adjustModelBonesForRender(RenderPassInfo<@NotNull DungeonsPetRenderState> renderPassInfo, BoneSnapshots snapshots) {
        snapshots.ifPresent("helmet", bone -> bone.skipRender(DungeonPetsClient.zombieDungeonsSkin.equals("tier1")));
        snapshots.ifPresent("scale_mail", bone -> bone.skipRender(!DungeonPetsClient.zombieDungeonsSkin.equals("tier2")));
        snapshots.ifPresent("reinforced_mail", bone -> bone.skipRender(!DungeonPetsClient.zombieDungeonsSkin.equals("tier3")));
        snapshots.ifPresent("left_shoulder_pad", bone -> bone.skipRender(!DungeonPetsClient.zombieDungeonsSkin.equals("tier3")));
        snapshots.ifPresent("right_shoulder_pad", bone -> bone.skipRender(!DungeonPetsClient.zombieDungeonsSkin.equals("tier3")));
    }

    @Override
    public float getScale() {
        return 2;
    }
}
