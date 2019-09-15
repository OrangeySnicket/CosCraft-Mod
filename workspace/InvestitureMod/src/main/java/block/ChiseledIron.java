package block;

import investiture.Investiture;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ChiseledIron extends Block{
	
	public ChiseledIron() {
		super(Material.IRON);
		setCreativeTab(Investiture.INVESTITURE_TAB);
		setSoundType(SoundType.METAL);
	}
	
}