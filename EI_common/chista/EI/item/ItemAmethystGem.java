package chista.EI.item;

import chista.EI.lib.Reference;
import chista.EI.lib.Strings;

import net.minecraft.client.renderer.texture.IconRegister;
import chista.EI.EI;
import net.minecraft.item.Item;

public class ItemAmethystGem extends Item {
	public ItemAmethystGem(int id) {
		super(id);
		this.setUnlocalizedName(Strings.amethystGem);
		
		this.setCreativeTab(EI.creativeTabEI);
	}

	@Override
	public void registerIcons(IconRegister icon) {
		this.itemIcon = icon.registerIcon(Reference.MOD_ID+":"+this.getUnlocalizedName().substring(5));
	}
}
