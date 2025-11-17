package net.cynicalmuse.moresnowballs;

import net.cynicalmuse.moresnowballs.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class MoreSnowballsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.SUPER_SNOWBALL, FlyingItemEntityRenderer::new);

    }
}
