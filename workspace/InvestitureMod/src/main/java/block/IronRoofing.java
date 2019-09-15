package block;

import investiture.Investiture;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class IronRoofing extends Block{
	
	public IronRoofing() {
		super(Material.IRON);
		setCreativeTab(Investiture.INVESTITURE_TAB);
		setSoundType(SoundType.METAL);
	}
	
}