package com.orangeysnicket.investiture.block;

import com.orangeysnicket.investiture.init.ModBlocks;
import com.orangeysnicket.investiture.Investiture;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;

public class BronzeStairs extends BlockStairs{

	static IBlockState modelState = ModBlocks.BRONZE_BLOCK.getDefaultState();
	
	public BronzeStairs() {
		super(modelState);
		setCreativeTab(Investiture.investitureTab);
		setSoundType(SoundType.METAL);
		this.useNeighborBrightness = true;
	}
	
}