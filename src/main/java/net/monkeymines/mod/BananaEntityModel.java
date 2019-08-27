package net.monkeymines.mod;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.Cuboid;
import net.minecraft.client.render.entity.model.EntityModel;
import net.monkeymines.mod.Banana;

/**
 * huge thanks to lars for fixing this for me :) check out his mod https://github.com/XeonPowder/FabricRPG
 */
@Environment(EnvType.CLIENT)
public class BananaEntityModel extends EntityModel<BananaEntity> {
        private final Cuboid bone;
        private final Cuboid bone1;
        private final Cuboid bone2;
        private final Cuboid bone3;
        private final Cuboid bone4;
        private final Cuboid bone5;
        private final Cuboid bone6;
        private final Cuboid bone7;
        private final Cuboid bone8;
        private final Cuboid bone9;
        private final Cuboid bone10;
        private final Cuboid bone11;

        private final Cuboid bone12;
        private final Cuboid bone13;
        private final Cuboid bone14;
        private final Cuboid bone15;
        private final Cuboid bone16;
        private final Cuboid bone17;
        private final Cuboid bone18;
        private final Cuboid bone19;
        private final Cuboid bone20;
        private final Cuboid bone21;
        private final Cuboid bone22;
        private final Cuboid bone23;

        public BananaEntityModel() {
                this(0.0F);
        }

        public BananaEntityModel(float f1) {
        bone = new Cuboid(this).setTextureSize(16, 16);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.pitch = -0.6981F;
        bone.yaw = 0.0F;
        bone.roll = 0.0F;
        bone.addBox("body", 0.0F, -0.0642F, -5.5712F, 1, 1, 1, 0.0F, 0, 0);

        bone1 = new Cuboid(this).setTextureSize(16, 16);
        bone1.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone1.pitch = -0.6981F;
        bone1.yaw = 0.0F;
        bone1.roll = 0.0F;
        bone1.addBox("body", -1.0F, -0.0642F, -5.5712F, 1, 1, 1, 0.0F, 0, 0);

        bone2 = new Cuboid(this).setTextureSize(16, 16);
        bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone2.pitch = -0.6981F;
        bone2.yaw = 0.0F;
        bone2.roll = 0.0F;
        bone2.addBox("body", -1.0F, -0.0642F, -4.5712F, 1, 1, 1, 0.0F, 0, 0);

        bone3 = new Cuboid(this).setTextureSize(16, 16);
        bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone3.pitch = -0.6981F;
        bone3.yaw = 0.0F;
        bone3.roll = 0.0F;
        bone3.addBox("body", 0.0F, -0.0642F, -4.5712F, 1, 1, 1, 0.0F, 0, 0);

        bone4 = new Cuboid(this).setTextureSize(16, 16);
        bone4.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone4.pitch = -0.6981F;
        bone4.yaw = 0.0F;
        bone4.roll = 0.0F;
        bone4.addBox("body", 0.0F, -10.0642F, -7.5712F, 3, 5, 3, 0.0F, 0, 2);

        bone5 = new Cuboid(this).setTextureSize(16, 16);
        bone5.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone5.pitch = -0.6981F;
        bone5.yaw = 0.0F;
        bone5.roll = 0.0F;
        bone5.addBox("body", 0.0F, -10.0642F, -4.5712F, 3, 5, 3, 0.0F, 0, 2);

        bone6 = new Cuboid(this).setTextureSize(16, 16);
        bone6.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone6.pitch = -0.6981F;
        bone6.yaw = 0.0F;
        bone6.roll = 0.0F;
        bone6.addBox("body", -3.0F, -10.0642F, -7.5712F, 3, 5, 3, 0.0F, 0, 2);

        bone7 = new Cuboid(this).setTextureSize(16, 16);
        bone7.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone7.pitch = -0.6981F;
        bone7.yaw = 0.0F;
        bone7.roll = 0.0F;
        bone7.addBox("body", -3.0F, -10.0642F, -4.5712F, 3, 5, 3, 0.0F, 0, 2);

        bone8 = new Cuboid(this).setTextureSize(16, 16);
        bone8.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone8.pitch = -0.6981F;
        bone8.yaw = 0.0F;
        bone8.roll = 0.0F;
        bone8.addBox("body", -3.0F, -5.0642F, -4.5712F, 3, 5, 3, 0.0F, 0, 2);

        bone9 = new Cuboid(this).setTextureSize(16, 16);
        bone9.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone9.pitch = -0.6981F;
        bone9.yaw = 0.0F;
        bone9.roll = 0.0F;
        bone9.addBox("body", 0.0F, -5.0642F, -4.5712F, 3, 5, 3, 0.0F, 0, 2);

        bone10 = new Cuboid(this).setTextureSize(16, 16);
        bone10.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone10.pitch = -0.6981F;
        bone10.yaw = 0.0F;
        bone10.roll = 0.0F;
        bone10.addBox("body", 0.0F, -5.0642F, -7.5712F, 3, 5, 3, 0.0F, 0, 2);

        bone11 = new Cuboid(this).setTextureSize(16, 16);
        bone11.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone11.pitch = -0.6981F;
        bone11.yaw = 0.0F;
        bone11.roll = 0.0F;
        bone11.addBox("body", -3.0F, -5.0642F, -7.5712F, 3, 5, 3, 0.0F, 0, 2);

        bone12 = new Cuboid(this).setTextureSize(16, 16);
        bone12.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone12.addBox("body", -1.0F, -22.0F, 3.0F, 1, 1, 1, 0.0F, 0, 0);

        bone13 = new Cuboid(this).setTextureSize(16, 16);
        bone13.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone13.addBox("body", 0.0F, -22.0F, 3.0F, 1, 1, 1, 0.0F, 0, 0);

        bone14 = new Cuboid(this).setTextureSize(16, 16);
        bone14.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone14.addBox("body", 0.0F, -22.0F, 2.0F, 1, 1, 1, 0.0F, 0, 0);

        bone15 = new Cuboid(this).setTextureSize(16, 16);
        bone15.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone15.addBox("body", -1.0F, -22.0F, 2.0F, 1, 1, 1, 0.0F, 0, 0);

        bone16 = new Cuboid(this).setTextureSize(16, 16);
        bone16.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone16.addBox("body", 0.0F, -16.0F, 0.0F, 3, 5, 3, 0.0F, 0, 2);

        bone17 = new Cuboid(this).setTextureSize(16, 16);
        bone17.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone17.addBox("body", -3.0F, -16.0F, 0.0F, 3, 5, 3, 0.0F, 0, 2);

        bone18 = new Cuboid(this).setTextureSize(16, 16);
        bone18.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone18.addBox("body", -3.0F, -16.0F, 3.0F, 3, 5, 3, 0.0F, 0, 2);

        bone19 = new Cuboid(this).setTextureSize(16, 16);
        bone19.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone19.addBox("body", 0.0F, -16.0F, 3.0F, 3, 5, 3, 0.0F, 0, 2);

        bone20 = new Cuboid(this).setTextureSize(16, 16);
        bone20.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone20.addBox("body", 0.0F, -21.0F, 3.0F, 3, 5, 3, 0.0F, 0, 2);

        bone21 = new Cuboid(this).setTextureSize(16, 16);
        bone21.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone21.addBox("body", -3.0F, -21.0F, 3.0F, 3, 5, 3, 0.0F, 0, 2);

        bone22 = new Cuboid(this).setTextureSize(16, 16);
        bone22.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone22.addBox("body", -3.0F, -21.0F, 0.0F, 3, 5, 3, 0.0F, 0, 2);

        bone23 = new Cuboid(this).setTextureSize(16, 16);
        bone23.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone23.addBox("body", 0.0F, -21.0F, 0.0F, 3, 5, 3, 0.0F, 0, 2);
    }

    public void render(BananaEntity banana, float float_1, float float_2, float float_3, float float_4, float float_5,
            float float_6) {

        this.setAngles(banana, float_1, float_2, float_3, float_4, float_5, float_6);
        this.bone.render(float_6);
        this.bone1.render(float_6);
        this.bone2.render(float_6);
        this.bone3.render(float_6);
        this.bone4.render(float_6);
        this.bone5.render(float_6);
        this.bone6.render(float_6);
        this.bone7.render(float_6);
        this.bone8.render(float_6);
        this.bone9.render(float_6);
        this.bone10.render(float_6);
        this.bone11.render(float_6);
        this.bone12.render(float_6);
        this.bone13.render(float_6);
        this.bone14.render(float_6);
        this.bone15.render(float_6);
        this.bone16.render(float_6);
        this.bone17.render(float_6);
        this.bone18.render(float_6);
        this.bone19.render(float_6);
        this.bone20.render(float_6);
        this.bone21.render(float_6);
        this.bone22.render(float_6);
        this.bone23.render(float_6);
    }

    public void setAngles(Banana banana, float float_1, float float_2, float float_3, float float_4, float float_5,
            float float_6) {
    }
}