package net.monkeymines.mod;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class AppleRender extends MobEntityRenderer<AppleEntity, PotatoEntityModel>{

    public AppleRender(EntityRenderDispatcher entityrender)
    { 
        super(entityrender, new PotatoEntityModel(), 1);
    }

    @Override
    protected Identifier getTexture(AppleEntity applemodel)
    {
        return new Identifier("minecraft", "textures/item/apple.png");
    }
    

}