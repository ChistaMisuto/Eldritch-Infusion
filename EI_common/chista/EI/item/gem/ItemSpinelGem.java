package chista.EI.item.gem;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import chista.EI.EI;
import chista.EI.lib.Reference;
import chista.EI.lib.Strings;

public class ItemSpinelGem extends Item {
	public ItemSpinelGem() {
		super();
		this.setUnlocalizedName(Strings.SPINELGEM_NAME);

		this.setCreativeTab(EI.creativeTabEI);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister icon) {
		itemIcon = icon.registerIcon(Reference.MOD_ID + ":"
				+ this.getUnlocalizedName().substring(5));
	}
}
