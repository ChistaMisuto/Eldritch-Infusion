package chista.EI.block;

import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraftforge.common.IPlantable;
import chista.EI.EI;
import chista.EI.lib.Reference;
import chista.EI.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGravusbloom extends BlockFlower implements IPlantable {
	public BlockGravusbloom() {
		super(0);//? might be growth stages but unknown
		this.setBlockName(Strings.GRAVUSBLOOM_NAME);
		this.setCreativeTab(EI.creativeTabEI);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		blockIcon = icon.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}
}
