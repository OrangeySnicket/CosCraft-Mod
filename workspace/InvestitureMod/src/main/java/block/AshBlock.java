package block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AshBlock extends Block{
	
	public AshBlock() {
		super(Material.WEB);
		setCreativeTab(CreativeTabs.MISC);
		setSoundType(SoundType.GROUND);
	}
	
}