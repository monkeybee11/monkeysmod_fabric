package net.monkeymines.mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.EntityRendererRegistry;
import net.minecraft.entity.EntityType;
import net.monkeymines.mod.BananaEntity;
import net.monkeymines.mod.BananaRender;

public class BananaClientInit implements ClientModInitializer {

    public static EntityType<?> entityType;

	@Override
    public void onInitializeClient() {
        // Connects entity to renderer.
        EntityRendererRegistry.INSTANCE.register(BananaEntity.class,
                (entityrender, context) -> new BananaRender(entityrender));
    }
    


}