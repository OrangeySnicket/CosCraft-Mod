package com.orangeysnicket.investiture.tabs;

import com.orangeysnicket.investiture.init.ModBlocks;
import com.orangeysnicket.investiture.investiture.Investiture;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class InvestitureTab extends CreativeTabs{

	public InvestitureTab() {
		super(Investiture.MODID);
		System.out.println("InvestitureTab initialised");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack createIcon() {
		return new ItemStack(Item.getItemFromBlock(ModBlocks.LERASIUM_BLOCK));
	}
}
