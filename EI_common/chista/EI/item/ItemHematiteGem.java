package chista.EI.item;

import chista.EI.lib.Reference;
import chista.EI.lib.Strings;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemHematiteGem extends Item {
	public ItemHematiteGem(int id) {
		super(id);
		this.setUnlocalizedName(Strings.hematiteGem);
		
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}

	@Override
	public void registerIcons(IconRegister icon) {
		this.itemIcon = icon.registerIcon(Reference.MOD_ID+":"+this.getUnlocalizedName().substring(5));
	}
}
