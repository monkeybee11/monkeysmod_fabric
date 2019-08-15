package net.monkeymines.mod;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.monkeymines.mod.MyMod;

public class Banana extends Item
{


    public Banana(Settings settings) {
        super(new Item.Settings().food((new FoodComponent.Builder().hunger(6).saturationModifier(.6f).snack().build())));

    }


public ItemStack finishUsing(ItemStack banana, World world, LivingEntity living) {
  super.finishUsing(banana, world, living);
    if (living instanceof PlayerEntity) {
      banana.decrement(1);
       PlayerEntity Player = (PlayerEntity)living;
       ItemStack banana_peel = new ItemStack(MyMod.BANANA_PEEL);
       Player.inventory.insertStack(banana_peel);
       banana_peel.increment(1);
    }


    return banana.isEmpty() ? new ItemStack(MyMod.BANANA_PEEL) : banana;
 }


}