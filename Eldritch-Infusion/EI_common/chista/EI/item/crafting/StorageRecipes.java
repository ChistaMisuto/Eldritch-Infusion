package chista.EI.item.crafting;

import net.minecraft.item.ItemStack;
import chista.EI.block.ModBlocks;
import chista.EI.item.gem.ModGems;
import cpw.mods.fml.common.registry.GameRegistry;

public class StorageRecipes
{
    ItemStack amethystBlockStack = new ItemStack(ModBlocks.amethystBlock, 1);
    ItemStack aquamarineBlockStack = new ItemStack(ModBlocks.aquamarineBlock, 1);
    ItemStack carnelianBlockStack = new ItemStack(ModBlocks.carnelianBlock, 1);
    ItemStack garnetBlockStack = new ItemStack(ModBlocks.garnetBlock, 1);
    ItemStack hematiteBlockStack = new ItemStack(ModBlocks.hematiteBlock, 1);
    ItemStack howliteBlockStack = new ItemStack(ModBlocks.howliteBlock, 1);
    ItemStack mountainCrystalBlockStack = new ItemStack(ModBlocks.mountainCrystalBlock, 1);
    ItemStack onyxBlockStack = new ItemStack(ModBlocks.onyxBlock, 1);
    ItemStack opalBlockStack = new ItemStack(ModBlocks.opalBlock, 1);
    ItemStack peridotBlockStack = new ItemStack(ModBlocks.peridotBlock, 1);
    ItemStack rhodochrositeBlockStack = new ItemStack(ModBlocks.rhodochrositeBlock, 1);
    ItemStack spheneBlockStack = new ItemStack(ModBlocks.spheneBlock, 1);
    ItemStack spinelBlockStack = new ItemStack(ModBlocks.spinelBlock, 1);
    ItemStack tigersEyeBlockStack = new ItemStack(ModBlocks.tigersEyeBlock, 1);
    ItemStack topazBlockStack = new ItemStack(ModBlocks.topazBlock, 1);
    ItemStack tourmalineBlockStack = new ItemStack(ModBlocks.tourmalineBlock, 1);
    
    
    ItemStack amethystStack = new ItemStack(ModGems.amethystGem, 1);
    ItemStack aquamarineStack = new ItemStack(ModGems.aquamarineGem, 1);
    ItemStack carnelianStack = new ItemStack(ModGems.carnelianGem, 1);
    ItemStack garnetStack = new ItemStack(ModGems.garnetGem, 1);
    ItemStack hematiteStack = new ItemStack(ModGems.hematiteGem, 1);
    ItemStack howliteStack = new ItemStack(ModGems.howliteGem, 1);
    ItemStack mountainCrystalStack = new ItemStack(ModGems.mountainCrystalGem, 1);
    ItemStack onyxStack = new ItemStack(ModGems.onyxGem, 1);
    ItemStack opalStack = new ItemStack(ModGems.opalGem, 1);
    ItemStack peridotStack = new ItemStack(ModGems.peridotGem, 1);
    ItemStack rhodochrositeStack = new ItemStack(ModGems.rhodochrositeGem, 1);
    ItemStack spheneStack = new ItemStack(ModGems.spheneGem, 1);
    ItemStack spinelStack = new ItemStack(ModGems.spinelGem, 1);
    ItemStack tigersEyeStack = new ItemStack(ModGems.tigersEyeGem, 1);
    ItemStack topazStack = new ItemStack(ModGems.topazGem, 1);
    ItemStack tourmalineStack = new ItemStack(ModGems.tourmalineGem, 1);
    
    public void addRecipes(){
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.amethystGem, 9), amethystBlockStack);
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.aquamarineGem, 9), aquamarineBlockStack);
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.carnelianGem, 9), carnelianBlockStack);
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.garnetGem, 9), garnetBlockStack);
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.hematiteGem, 9), hematiteBlockStack);
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.howliteGem, 9), howliteBlockStack);
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.mountainCrystalGem, 9), mountainCrystalBlockStack);
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.onyxGem, 9), onyxBlockStack);    
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.opalGem, 9), opalBlockStack);    
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.peridotGem, 9), peridotBlockStack);       
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.rhodochrositeGem, 9), rhodochrositeBlockStack);    
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.spheneGem, 9), spheneBlockStack);    
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.spinelGem, 9), spinelBlockStack);      
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.tigersEyeGem, 9), tigersEyeBlockStack);    
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.topazGem, 9), topazBlockStack);    
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.tourmalineGem, 9), tourmalineBlockStack);    
        
        
        GameRegistry.addRecipe(amethystBlockStack, "xxx", "xxx", "xxx", 'x', amethystStack);
        GameRegistry.addRecipe(aquamarineBlockStack, "xxx", "xxx", "xxx", 'x', aquamarineStack);
        GameRegistry.addRecipe(carnelianBlockStack, "xxx", "xxx", "xxx", 'x', carnelianStack);
        GameRegistry.addRecipe(garnetBlockStack, "xxx", "xxx", "xxx", 'x', garnetStack);
        GameRegistry.addRecipe(hematiteBlockStack, "xxx", "xxx", "xxx", 'x', hematiteStack);
        GameRegistry.addRecipe(howliteBlockStack, "xxx", "xxx", "xxx", 'x', howliteStack);
        GameRegistry.addRecipe(mountainCrystalBlockStack, "xxx", "xxx", "xxx", 'x', mountainCrystalStack);
        GameRegistry.addRecipe(onyxBlockStack, "xxx", "xxx", "xxx", 'x', onyxStack);
        GameRegistry.addRecipe(opalBlockStack, "xxx", "xxx", "xxx", 'x', opalStack);
        GameRegistry.addRecipe(peridotBlockStack, "xxx", "xxx", "xxx", 'x', peridotStack);
        GameRegistry.addRecipe(rhodochrositeBlockStack, "xxx", "xxx", "xxx", 'x', rhodochrositeStack);
        GameRegistry.addRecipe(spheneBlockStack, "xxx", "xxx", "xxx", 'x', spheneStack);
        GameRegistry.addRecipe(spinelBlockStack, "xxx", "xxx", "xxx", 'x', spinelStack);
        GameRegistry.addRecipe(tigersEyeBlockStack, "xxx", "xxx", "xxx", 'x', tigersEyeStack);
        GameRegistry.addRecipe(topazBlockStack, "xxx", "xxx", "xxx", 'x', topazStack);
        GameRegistry.addRecipe(tourmalineBlockStack, "xxx", "xxx", "xxx", 'x', tourmalineStack);
    }
}
