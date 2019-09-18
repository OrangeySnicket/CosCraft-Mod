package com.orangeysnicket.investiture.tabs;

import com.orangeysnicket.investiture.init.ModBlocks;
import com.orangeysnicket.investiture.Investiture;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class InvestitureTab extends CreativeTabs{

	public InvestitureTab() {
		super(Investiture.MODID + ".investiture");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack createIcon() {
		return new ItemStack(Item.getItemFromBlock(ModBlocks.LERASIUM_BLOCK));
	}
}
