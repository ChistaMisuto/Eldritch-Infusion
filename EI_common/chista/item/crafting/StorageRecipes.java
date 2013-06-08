package chista.item.crafting;

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
    
    
    ItemStack amethystStack = new ItemStack(ModGems.amethystGem, 1);
    ItemStack aquamarineStack = new ItemStack(ModGems.aquamarineGem, 1);
    ItemStack carnelianStack = new ItemStack(ModGems.carnelianGem, 1);
    ItemStack garnetStack = new ItemStack(ModGems.garnetGem, 1);
    ItemStack hematiteStack = new ItemStack(ModGems.hematiteGem, 1);
    ItemStack howliteStack = new ItemStack(ModGems.howliteGem, 1);
    ItemStack mountainCrystalStack = new ItemStack(ModGems.mountainCrystalGem, 1);
    ItemStack onyxStack = new ItemStack(ModGems.onyxGem, 1);
    
    public void addRecipes(){
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.amethystGem, 9), amethystBlockStack);
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.aquamarineGem, 9), aquamarineBlockStack);
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.carnelianGem, 9), carnelianBlockStack);
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.garnetGem, 9), garnetBlockStack);
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.hematiteGem, 9), hematiteBlockStack);
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.howliteGem, 9), howliteBlockStack);
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.mountainCrystalGem, 9), mountainCrystalBlockStack);
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.onyxGem, 9), onyxBlockStack);      
        
        
        GameRegistry.addRecipe(amethystBlockStack, "xxx", "xxx", "xxx", 'x', amethystStack);
        GameRegistry.addRecipe(aquamarineBlockStack, "xxx", "xxx", "xxx", 'x', aquamarineStack);
        GameRegistry.addRecipe(carnelianBlockStack, "xxx", "xxx", "xxx", 'x', carnelianStack);
        GameRegistry.addRecipe(garnetBlockStack, "xxx", "xxx", "xxx", 'x', garnetStack);
        GameRegistry.addRecipe(hematiteBlockStack, "xxx", "xxx", "xxx", 'x', hematiteStack);
        GameRegistry.addRecipe(howliteBlockStack, "xxx", "xxx", "xxx", 'x', howliteStack);
        GameRegistry.addRecipe(mountainCrystalBlockStack, "xxx", "xxx", "xxx", 'x', mountainCrystalStack);
        GameRegistry.addRecipe(onyxBlockStack, "xxx", "xxx", "xxx", 'x', onyxStack);
    }
}
