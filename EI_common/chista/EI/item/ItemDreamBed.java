package chista.EI.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import chista.EI.EI;
import chista.EI.block.BlockDreamBed;
import chista.EI.block.ModBlocks;
import chista.EI.lib.Reference;
import chista.EI.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDreamBed extends Item {

	public ItemDreamBed() {
		super();
		this.setUnlocalizedName(Strings.DREAMBED_ITEM_NAME);
		this.setCreativeTab(EI.creativeTabEI);
	}

	/**
	 * Callback for item usage. If the item does something special on right
	 * clicking, he will have one of those. Return True if something happen and
	 * false if it don't. This is for ITEMS, not BLOCKS
	 */
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
		if (world.isRemote) {
			return true;
		} else if (par7 != 1) {
			return false;
		} else {
			++y;
			BlockDreamBed blockbed = (BlockDreamBed) ModBlocks.dreamBed;
			int i1 = MathHelper.floor_double((double) (player.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
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

			if (player.canPlayerEdit(x, y, z, par7, stack) && player.canPlayerEdit(x + b0, y, z + b1, par7, stack)) {
				if (world.isAirBlock(x, y, z) && world.isAirBlock(x + b0, y, z + b1) && world.isSideSolid(x, y -1, z, ForgeDirection.UP) && world.isSideSolid(x + b0, y - 1, z + b1, ForgeDirection.UP)) {
					world.setBlock(x, y, z, blockbed, i1, 3);

					if (world.getBlock(x, y, z) == blockbed) {
						world.setBlock(x + b0, y, z + b1, blockbed, i1 + 8, 3);
					}

					--stack.stackSize;
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
	public void registerIcons(IIconRegister icon) {
		itemIcon = icon.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}
}
