package block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlackMetalBlock extends Block{
	
	public BlackMetalBlock() {
		super(Material.IRON);
		setCreativeTab(CreativeTabs.MISC);
		setSoundType(SoundType.METAL);
	}
	
}