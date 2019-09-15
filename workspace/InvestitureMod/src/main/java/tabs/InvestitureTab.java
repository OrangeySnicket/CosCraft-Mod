package tabs;

import investiture.Investiture;
import init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class InvestitureTab extends CreativeTabs{

	public InvestitureTab() {
		super(Investiture.MODID);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack createIcon() {
		return new ItemStack(Item.getItemFromBlock(ModBlocks.LERASIUM_BLOCK));
	}
}
