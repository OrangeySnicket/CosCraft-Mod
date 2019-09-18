package com.orangeysnicket.investiture.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import com.orangeysnicket.investiture.Investiture;

public class AluminumBlock extends Block{
	
	public AluminumBlock() {
		super(Material.IRON);
		setCreativeTab(Investiture.INVESTITURE_TAB);
		setSoundType(SoundType.METAL);
	}
	
}
