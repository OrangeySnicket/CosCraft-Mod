package com.orangeysnicket.investiture.block;

import com.orangeysnicket.investiture.Investiture;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ChiseledBrass extends Block{
	
	public ChiseledBrass() {
		super(Material.IRON);
		setCreativeTab(Investiture.investitureTab);
		setSoundType(SoundType.METAL);
	}
	
}