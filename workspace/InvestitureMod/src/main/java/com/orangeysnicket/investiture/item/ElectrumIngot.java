package com.orangeysnicket.investiture.item;

import com.orangeysnicket.investiture.Investiture;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ElectrumIngot extends Item {

	public ElectrumIngot(String registryName, String unlocalizedName) {
		setTranslationKey(Investiture.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(Investiture.INVESTITURE_TAB);
	}
}
