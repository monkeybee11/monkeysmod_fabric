package net.monkeymines.mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.EntityRendererRegistry;

public class BananaClientInit implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Connects entity to renderer.
        EntityRendererRegistry.INSTANCE.register(BananaEntity.class,
                (entityrender, context) -> new BananaRender(entityrender));
    }
}