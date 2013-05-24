package chista.EI.item;

import chista.EI.lib.Reference;
import chista.EI.lib.Strings;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPeridotGem extends Item {
	public ItemPeridotGem(int id) {
		super(id);
		this.setUnlocalizedName(Strings.peridotGem);
		
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}

	@Override
	public void registerIcons(IconRegister icon) {
		this.itemIcon = icon.registerIcon(Reference.MOD_ID+":"+this.getUnlocalizedName().substring(5));
	}
}
