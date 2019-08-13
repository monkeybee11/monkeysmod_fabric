//Made with Blockbench

package net.monkeymines.mod;

import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.model.Cuboid;

public class BananaEntityModel extends EntityModel<BananaEntity> {
        private final Cuboid bone;
        private final Cuboid bone2;

        public BananaEntityModel() {
                textureWidth = 16;
                textureHeight = 16;

                bone = new Cuboid(this);
                bone.setRotationPoint(0.0F, 24.0F, 0.0F);
                setRotationAngle(bone, -0.6109F, 0.0F, 0.0F);
                bone.addBox("bone", -4.0F, -11.0F, -10.0F, 8, 12, 8, 0.0F, 0, 0);
                bone.addBox("bone", -1.0F, 1.0F, -7.0F, 2, 2, 2, 0.0F, 0, 2);

                bone2 = new Cuboid(this);
                bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
                bone2.addBox("bone2", -4.0F, -23.2F, -3.3F, 8, 13, 8, 0.0F, 0, 0);
                bone2.addBox("bone2", -1.0F, -25.2F, -0.6F, 2, 2, 2, 0.0F, 0, 2);
        }

        @Override
        public void render(BananaEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
                bone.render(f5);
                bone2.render(f5);
        }
        public void setRotationAngle(Cuboid modelRenderer, float x, float y, float z) {
        modelRenderer.rotationPointX = x;
        modelRenderer.rotationPointY = y;
        modelRenderer.rotationPointZ = z;
        }
}