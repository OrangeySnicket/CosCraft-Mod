package block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PewterBlock extends Block{
	
	public PewterBlock() {
		super(Material.IRON);
		setCreativeTab(CreativeTabs.MISC);
		setSoundType(SoundType.METAL);
	}
	
}