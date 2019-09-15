package item;

import investiture.Investiture;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class BendalloyIngot extends Item {

	public BendalloyIngot(String registryName, String unlocalizedName) {
		setTranslationKey(Investiture.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(Investiture.INVESTITURE_TAB);
	}
}

