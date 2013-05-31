package chista.EI.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import chista.EI.EI;
import chista.EI.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraftforge.common.MinecraftForge;

public class BlockGemStorage extends Block {
	public BlockGemStorage(int id) {
		super(id, Material.rock);
		this.setCreativeTab(EI.creativeTabEI);
		this.setHardness(5.0F);
		MinecraftForge.setBlockHarvestLevel(this, "pickaxe", 2);
	}
	
	@Override
	public int idDropped(int par1, Random rand, int enchantLevel) {
		return blockID;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}
}