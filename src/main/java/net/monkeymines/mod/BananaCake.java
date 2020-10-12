package net.monkeymines.mod;

//Item
import net.minecraft.item.ItemStack;

//Block
import net.minecraft.block.Material;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.CakeBlock;

//Util
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;

//Entity
import net.minecraft.entity.player.PlayerEntity;

//Stats
import net.minecraft.stat.Stats;

//World

import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;


public class BananaCake extends CakeBlock {
	public BananaCake() {
		super(FabricBlockSettings.of(Material.CAKE));
	}

   public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
      if (world.isClient) {
         ItemStack itemStack = player.getStackInHand(hand);
         if (this.tryEat(world, pos, state, player).isAccepted()) {
            return ActionResult.SUCCESS;
         }

         if (itemStack.isEmpty()) {
            return ActionResult.CONSUME;
         }
      }

      return this.tryEat(world, pos, state, player);
   }

   public ActionResult tryEat(WorldAccess world, BlockPos pos, BlockState state, PlayerEntity player) {
      if (!player.canConsume(false)) {
         return ActionResult.PASS;
      } else {
         player.incrementStat(Stats.EAT_CAKE_SLICE);
         player.getHungerManager().add(5, 0.5F);
         int i = (Integer)state.get(BITES);
         if (i < 6) {
            world.setBlockState(pos, (BlockState)state.with(BITES, i + 1), 3);
         } else {
            world.removeBlock(pos, false);
         }

         return ActionResult.SUCCESS;
      }
   }
}