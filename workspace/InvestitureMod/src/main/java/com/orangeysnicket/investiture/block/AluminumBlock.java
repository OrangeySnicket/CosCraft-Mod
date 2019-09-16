package com.orangeysnicket.investiture.block;

import com.orangeysnicket.investiture.Investiture;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AluminumBlock extends Block{
	
	public AluminumBlock() {
		super(Material.IRON);
		setCreativeTab(Investiture.metalTab);
		setSoundType(SoundType.METAL);
	}
	
}
