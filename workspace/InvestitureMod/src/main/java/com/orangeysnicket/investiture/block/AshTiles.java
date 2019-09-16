package com.orangeysnicket.investiture.block;

import com.orangeysnicket.investiture.Investiture;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AshTiles extends Block{
	
	public AshTiles() {
		super(Material.ROCK);
		setCreativeTab(Investiture.investitureTab);
		setSoundType(SoundType.STONE);
	}
	
}