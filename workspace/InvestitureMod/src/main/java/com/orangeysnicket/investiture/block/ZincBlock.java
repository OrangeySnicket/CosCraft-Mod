package com.orangeysnicket.investiture.block;

import com.orangeysnicket.investiture.Investiture;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ZincBlock extends Block{
	
	public ZincBlock() {
		super(Material.IRON);
		setCreativeTab(Investiture.INVESTITURE_TAB);
		setSoundType(SoundType.METAL);
	}
	
}