package chista.EI.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import chista.EI.EI;
import chista.EI.block.BlockDreamBed;
import chista.EI.block.ModBlocks;
import chista.EI.lib.Reference;
import chista.EI.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDreamBed extends Item {

	public ItemDreamBed(int id) {
		super(id);
		this.setUnlocalizedName(Strings.DREAMBED_ITEM_NAME);
		this.setCreativeTab(EI.creativeTabEI);
	}

	/**
	 * Callback for item usage. If the item does something special on right
	 * clicking, he will have one of those. Return True if something happen and
	 * false if it don't. This is for ITEMS, not BLOCKS
	 */
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		if (par3World.isRemote) {
			return true;
		} else if (par7 != 1) {
			return false;
		} else {
			++par5;
			BlockDreamBed blockbed = (BlockDreamBed) ModBlocks.dreamBed;
			int i1 = MathHelper.floor_double((double) (par2EntityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
			byte b0 = 0;
			byte b1 = 0;

			if (i1 == 0) {
				b1 = 1;
			}

			if (i1 == 1) {
				b0 = -1;
			}

			if (i1 == 2) {
				b1 = -1;
			}

			if (i1 == 3) {
				b0 = 1;
			}

			if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.canPlayerEdit(par4 + b0, par5, par6 + b1, par7, par1ItemStack)) {
				if (par3World.isAirBlock(par4, par5, par6) && par3World.isAirBlock(par4 + b0, par5, par6 + b1) && par3World.doesBlockHaveSolidTopSurface(par4, par5 - 1, par6) && par3World.doesBlockHaveSolidTopSurface(par4 + b0, par5 - 1, par6 + b1)) {
					par3World.setBlock(par4, par5, par6, blockbed.blockID, i1, 3);

					if (par3World.getBlockId(par4, par5, par6) == blockbed.blockID) {
						par3World.setBlock(par4 + b0, par5, par6 + b1, blockbed.blockID, i1 + 8, 3);
					}

					--par1ItemStack.stackSize;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}
}