package net.monkeymines.mod;

//Made with Blockbench



import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.model.ModelPart;




public class PotatoEntityModel extends EntityModel<PotatoEntity> {
        private final ModelPart bone;

        public PotatoEntityModel() {
                textureWidth = 16;
                textureHeight = 16;

                bone = new ModelPart(this);
                bone.setRotationPoint(0.0F, 24.0F, 0.0F);
                bone.addCuboid("bone", -8.0F, -15.0F, 0.0F, 16, 15, 0, 0.0F, 0, 1);
        }

        @Override
        public void render(PotatoEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
                bone.render(f5);
        }
        public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.rotationPointX = x;
        modelRenderer.rotationPointY = y;
        modelRenderer.rotationPointZ = z;
        }
}