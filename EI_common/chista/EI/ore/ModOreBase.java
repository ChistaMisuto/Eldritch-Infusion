package chista.EI.ore;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import chista.EI.EI;
import chista.EI.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModOreBase extends Block {
	public ModOreBase(Material material) {
		super(material);
		this.setCreativeTab(EI.creativeTabEI);

		this.setHardness(5.0F);
		this.setHarvestLevel("pickaxe", 2);
	}

	@Override
	public Item getItemDropped(int par1, Random rand, int enchantLevel) {
		return Item.getItemFromBlock(this);
	}
	
	@Override
    public int quantityDroppedWithBonus(int enchantLevel, Random random) {
        if (enchantLevel > 0 && Item.getItemFromBlock(this)!= this.getItemDropped(0, random, enchantLevel)) {
            int j = random.nextInt(enchantLevel + 2) - 1;

            if (j < 0) {
                j = 0;
            }

            return this.quantityDropped(random) * (j + 1);
        }
        else {
            return this.quantityDropped(random);
        }
    }

	@Override
	 public int quantityDropped(Random random) {
       return  4 + random.nextInt(5);
   }

	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
		this.dropXpOnBlockBreak(world, x, y, z, 2);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		blockIcon = icon.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}
}