package com.jeff.pets.dungon_pets.client.rendering.mountaineer;

import com.geckolib.renderer.base.BoneSnapshots;
import com.geckolib.renderer.base.RenderPassInfo;
import com.jeff.pets.dungon_pets.client.DungeonPetsClient;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsGeoRenderer;
import com.jeff.pets.dungon_pets.client.rendering.DungeonsPetRenderState;
import com.jeff.pets.dungon_pets.mob.pets.Mountaineer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;

public class MountaineerRenderer extends DungeonsGeoRenderer<Mountaineer> {
    public MountaineerRenderer(EntityRendererProvider.Context context) {
        super(context, new MountaineerModel());
    }

    @Override
    public void adjustModelBonesForRender(RenderPassInfo<@NotNull DungeonsPetRenderState> renderPassInfo, BoneSnapshots snapshots) {
        snapshots.ifPresent("right_shoulder_pad", bone -> bone.skipRender(!DungeonPetsClient.mountaineerSkin.equals("tier3")));
        snapshots.ifPresent("left_shoulder_pad", bone -> bone.skipRender(!DungeonPetsClient.mountaineerSkin.equals("tier3")));
        snapshots.ifPresent("right_boot", bone -> bone.skipRender(!DungeonPetsClient.mountaineerSkin.equals("tier3")));
        snapshots.ifPresent("left_boot", bone -> bone.skipRender(!DungeonPetsClient.mountaineerSkin.equals("tier3")));
        snapshots.ifPresent("backpack", bone -> bone.skipRender(!DungeonPetsClient.mountaineerSkin.equals("tier2")));
    }

    @Override
    public float getScale() {
        return 2;
    }
}
