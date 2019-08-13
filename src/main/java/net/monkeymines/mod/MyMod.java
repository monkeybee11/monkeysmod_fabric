package net.monkeymines.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MyMod implements ModInitializer 
{
    //an instance for new items :D 
    public static final BananaItem BANANA_ITEM = new BananaItem(new Item.Settings().group(ItemGroup.MISC));
    public static final Item BANANA_PICKER = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Banana BANANA = new Banana(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item BANANA_PEEL = new Item(new Item.Settings().group(ItemGroup.MISC));


    
    //my Entitys
   public static final EntityType<BananaEntity> BANANA_MOB = FabricEntityTypeBuilder.create(EntityCategory.MONSTER, BananaEntity::new).size(EntityDimensions.fixed(1, 2)).build();



    //a instance of a new block
    public static final Bananabunch BANANA_BUNCH = new Bananabunch(FabricBlockSettings.of(Material.BAMBOO).build());
    public static final Block VOODOO_BENCH = new Block(FabricBlockSettings.of(Material.BAMBOO).build());

       @Override
       public void onInitialize() {

        Registry.register(Registry.ITEM, new Identifier("tutorial", "banana_item"), BANANA_ITEM);
        Registry.register(Registry.ITEM, new Identifier("tutorial", "banana_picker"), BANANA_PICKER);
        Registry.register(Registry.BLOCK, new Identifier("tutorial", "banana_bunch"), BANANA_BUNCH);
        Registry.register(Registry.ITEM, new Identifier("tutorial", "banana_bunch"), new BlockItem(BANANA_BUNCH, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("tutorial", "banana"), BANANA);
        Registry.register(Registry.ITEM, new Identifier("tutorial", "banana_peel"), BANANA_PEEL); 
        Registry.register(Registry.BLOCK, new Identifier("tutorial", "voodoo_bench"), VOODOO_BENCH);
        Registry.register(Registry.ITEM, new Identifier("tutorial", "voodoo_bench"), new BlockItem(VOODOO_BENCH, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ENTITY_TYPE, new Identifier("tutorial", "banana_mob"),BANANA_MOB);
       }
}