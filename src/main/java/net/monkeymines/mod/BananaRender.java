package net.monkeymines.mod;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BananaRender extends MobEntityRenderer<BananaEntity, BananaEntityModel> {

    public BananaRender(EntityRenderDispatcher entityrender)
    { 
        super(entityrender, new BananaEntityModel(), 1);
    }

    @Override
    protected Identifier getTexture(BananaEntity bananamodel)
    {
        return new Identifier("tutorial:textures/entity/banana/bananamob.png");
    }
    

}