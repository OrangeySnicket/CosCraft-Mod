package com.orangeysnicket.investiture.block;

import com.orangeysnicket.investiture.investiture.Investiture;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
//import net.minecraft.util.AxisAlignedBB;


public class AshBlock extends Block{
	
	public AshBlock() {
		super(Material.WEB);
		setCreativeTab(Investiture.INVESTITURE_TAB);
		setSoundType(SoundType.GROUND);
	}
	
	/*@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
		return null;
	}*/
	
}