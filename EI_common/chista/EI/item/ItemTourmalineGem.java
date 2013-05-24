package chista.EI.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import chista.EI.EI;
import chista.EI.lib.Reference;
import chista.EI.lib.Strings;

public class ItemTourmalineGem extends Item {
	public ItemTourmalineGem(int id) {
		super(id);
		this.setUnlocalizedName(Strings.tourmalineGem);

		this.setCreativeTab(EI.creativeTabEI);
	}

	@Override
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(Reference.MOD_ID + ":"
				+ this.getUnlocalizedName().substring(5));
	}
}
