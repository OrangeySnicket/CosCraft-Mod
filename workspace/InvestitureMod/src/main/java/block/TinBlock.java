package block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TinBlock extends Block{
	
	public TinBlock() {
		super(Material.IRON);
		setCreativeTab(CreativeTabs.MISC);
		setSoundType(SoundType.METAL);
	}
	
}