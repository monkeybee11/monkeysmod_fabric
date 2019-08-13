package net.monkeymines.mod;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderLayer;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.entity.EntityContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.StateFactory;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.ViewableWorld;
import net.minecraft.world.World;



public class Bananabunch extends CropBlock{

    public static final IntProperty AGE = Properties.AGE_2;
    public static final VoxelShape Y_SHAPE = createCuboidShape(7.0D, 6.0D, 7.0D, 8.0D, 16.0D, 8.0D);

    public Bananabunch(Settings settings) {
        super(settings);

    }

    @Environment(EnvType.CLIENT)
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public boolean canPlaceAt(BlockState blockState_1, ViewableWorld viewableWorld_1, BlockPos blockPos_1) {
        BlockState block = viewableWorld_1.getBlockState(blockPos_1.offset(Direction.UP));
        return block.getBlock() == Blocks.JUNGLE_LEAVES;
     }

    public VoxelShape getOutlineShape(BlockState blockState_1, BlockView blockView_1, BlockPos blockPos_1,
            EntityContext entityContext_1) {
        return Y_SHAPE;
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

     @Override
    public int getMaxAge() {
        return 2;
    }



    @Override
    public void onBreak(World world_1, BlockPos blockPos_1, BlockState blockState_1, PlayerEntity playerEntity_1) {
        super.onBreak(world_1, blockPos_1, blockState_1, playerEntity_1);
    }

    @Override
    public boolean activate(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand,
            BlockHitResult hit) {
        ItemStack itemStack = player.getMainHandStack();
        if (itemStack.getItem() == MyMod.BANANA_PICKER) {
            if (getAge(state) >= 2) {
                ItemStack stack = new ItemStack(MyMod.BANANA_ITEM, world.random.nextInt(6) + 1);
                dropStack(world, pos, stack);
                world.setBlockState(pos, state.with(AGE, 0));
        }
            return true;
        } else {
            if (itemStack.getItem() != Items.BONE_MEAL)
                player.addChatMessage(new LiteralText("cant reach that from here if only there was a banana picker"),
                        true);
            return false;
        }
    }

   
	@Override
	protected void appendProperties(StateFactory.Builder<Block, BlockState> builder) {
		builder.add(AGE);
    }
}