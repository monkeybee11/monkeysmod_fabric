package net.monkeymines.mod;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class BananaItem extends Item {

    public BananaItem(Settings item$Setting_1) {
        super(item$Setting_1);
    }

    public TypedActionResult<ItemStack> use(World minecraft, PlayerEntity Theplayer, Hand stump) {
        ItemStack banana = Theplayer.getStackInHand(stump);
           banana.decrement(1);
           ItemStack peeled_banana = new ItemStack(MyMod.BANANA);
           Theplayer.inventory.insertStack(peeled_banana);
           peeled_banana.increment(1);

           return new TypedActionResult<ItemStack>(ActionResult.PASS, Theplayer.getStackInHand(stump));

         
    }
}