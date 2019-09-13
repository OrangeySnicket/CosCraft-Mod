package item;

import investiture.Investiture;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ZincIngot extends Item {

	public ZincIngot(String registryName, String unlocalizedName) {
		setTranslationKey(Investiture.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.MISC);
	}
}
