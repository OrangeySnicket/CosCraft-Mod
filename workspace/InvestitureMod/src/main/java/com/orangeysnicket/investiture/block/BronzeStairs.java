package com.orangeysnicket.investiture.block;

import com.orangeysnicket.investiture.Investiture;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import com.orangeysnicket.investiture.init.ModBlocks;

public class BronzeStairs extends BlockStairs{

	
	public BronzeStairs(IBlockState modelState) {
		super(modelState);
		setCreativeTab(Investiture.INVESTITURE_TAB);
		setSoundType(SoundType.METAL);
		this.useNeighborBrightness = true;
	}
	
}