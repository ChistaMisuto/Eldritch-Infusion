package chista.EI.item.gem;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import chista.EI.lib.Reference;
import chista.EI.lib.Strings;

import net.minecraft.client.renderer.texture.IIconRegister;
import chista.EI.EI;
import net.minecraft.item.Item;

public class ItemAmethystGem extends Item {
	public ItemAmethystGem() {
		super();
		this.setUnlocalizedName(Strings.AMETHYSTGEM_NAME);
		
		this.setCreativeTab(EI.creativeTabEI);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister icon) {
		this.itemIcon = icon.registerIcon(Reference.MOD_ID+":"+this.getUnlocalizedName().substring(5));
	}
}
