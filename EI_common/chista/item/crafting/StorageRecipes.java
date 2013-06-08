package chista.item.crafting;

import net.minecraft.item.ItemStack;
import chista.EI.block.ModBlocks;
import chista.EI.item.gem.ModGems;
import cpw.mods.fml.common.registry.GameRegistry;

public class StorageRecipes
{
    ItemStack amethystBlockStack = new ItemStack(ModBlocks.amethystBlock, 1);
    ItemStack aquamarineBlockStack = new ItemStack(ModBlocks.aquamarineBlock, 1);
    
    ItemStack amethystStack = new ItemStack(ModGems.amethystGem, 1);
    ItemStack aquamarineStack = new ItemStack(ModGems.aquamarineGem, 1);
    
    public void addRecipes(){
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.amethystGem, 9), amethystBlockStack);
        GameRegistry.addShapelessRecipe(new ItemStack(ModGems.aquamarineGem, 9), aquamarineBlockStack);
        
        
        
        GameRegistry.addRecipe(amethystBlockStack, "xxx", "xxx", "xxx", 'x', amethystStack);
        GameRegistry.addRecipe(aquamarineBlockStack, "xxx", "xxx", "xxx", 'x', aquamarineStack);
    }
}
