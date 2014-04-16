package chista.EI.block;

import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraftforge.common.IPlantable;
import chista.EI.EI;
import chista.EI.lib.Reference;
import chista.EI.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFairyCap extends BlockFlower implements IPlantable {
	public BlockFairyCap() {
		super(0);//? might be amount of growth stages but unknown to me
		this.setBlockName(Strings.FAIRYCAP_NAME);
		this.setCreativeTab(EI.creativeTabEI);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		blockIcon = icon.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}
}
