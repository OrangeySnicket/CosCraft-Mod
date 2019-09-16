package com.orangeysnicket.investiture.item;

import com.orangeysnicket.investiture.investiture.Investiture;
import net.minecraft.item.ItemSword;

public class ObsidianDagger extends ItemSword {

	public ObsidianDagger(ToolMaterial material, String registryName, String unlocalizedName) {
		super(material);
		setTranslationKey(Investiture.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(Investiture.INVESTITURE_TAB);
	}

}
