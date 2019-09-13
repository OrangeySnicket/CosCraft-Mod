package block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CopperBlock extends Block{
	
	public CopperBlock() {
		super(Material.IRON);
		setCreativeTab(CreativeTabs.MISC);
		setSoundType(SoundType.METAL);
	}
	
}