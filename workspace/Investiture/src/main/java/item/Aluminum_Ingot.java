package item;

import Investiture.InvestitureMod;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class Aluminum_Ingot extends Item {

	public Aluminum_Ingot(String unlocalizedName, String registryName) {
		setTranslationKey(InvestitureMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.MISC);
	}
	
}
