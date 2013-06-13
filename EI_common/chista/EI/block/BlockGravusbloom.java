package chista.EI.block;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraftforge.common.IPlantable;
import chista.EI.EI;
import chista.EI.lib.Reference;
import chista.EI.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGravusbloom extends BlockFlower implements IPlantable {
	public BlockGravusbloom(int id) {
		super(id, Material.plants);
		this.setUnlocalizedName(Strings.GRAVUSBLOOM_NAME);
		this.setCreativeTab(EI.creativeTabEI);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}
}
