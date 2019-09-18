package com.orangeysnicket.investiture.item;

import com.orangeysnicket.investiture.Investiture;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;


public class GlassDagger extends ItemSword {

	public GlassDagger(ToolMaterial material, String registryName, String unlocalizedName) {
		super(material);
		setTranslationKey(Investiture.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(Investiture.INVESTITURE_TAB);
	}
}
