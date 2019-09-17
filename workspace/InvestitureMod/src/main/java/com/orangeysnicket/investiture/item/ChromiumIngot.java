package com.orangeysnicket.investiture.item;

import com.orangeysnicket.investiture.Investiture;
import net.minecraft.item.Item;


public class ChromiumIngot extends Item {

	public ChromiumIngot(String registryName, String unlocalizedName) {
		setTranslationKey(Investiture.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(Investiture.investitureTab);
	}
}
