package net.monkeymines.mod;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnType;
import net.minecraft.entity.ai.goal.FollowTargetGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biomes;

public class PotatoEntity extends HostileEntity {

    public PotatoEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public boolean canSpawn(IWorld iWorld, SpawnType spawnType) {
      BlockPos down = new BlockPos(this).down();
  
        return world.getBiome(down).equals(Biomes.PLAINS) && (spawnType == SpawnType.NATURAL) || world.getBlockState(down).allowsSpawning(world, down, getType());

    }

    @Override
    protected void initGoals()
    {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new MeleeAttackGoal(this, 1.0D, true));
        this.goalSelector.add(2, new LookAtEntityGoal(this, PlayerEntity.class, 9.0F));
        this.targetSelector.add(3, new FollowTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
        this.goalSelector.add(4, new WanderAroundFarGoal(this, 1.0D));
    }

    @Override
    protected void initAttributes()
    {
        super.initAttributes();
        this.getAttributeInstance(EntityAttributes.MAX_HEALTH).setBaseValue(20);
        this.getAttributeInstance(EntityAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
        this.getAttributeInstance(EntityAttributes.KNOCKBACK_RESISTANCE).setBaseValue(10.0D);
        this.getAttributeInstance(EntityAttributes.ATTACK_DAMAGE).setBaseValue(3);
    }


    @Override
    protected Identifier getLootTableId()
    {
        return new Identifier("monkeysmod" , "bananamob/potatomob");
    }


    
}