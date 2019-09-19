package com.orangeysnicket.investiture.block;

import java.util.Random;

import com.orangeysnicket.investiture.Investiture;
import com.orangeysnicket.investiture.init.ModBlocks;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class Tiles extends BlockSlab {

	public static final PropertyEnum<Variant> VARIANT = PropertyEnum.<Variant>create("variant", Variant.class);
	
	public Tiles(String name) {
		super(Material.ROCK);
		this.setRegistryName(name);
		this.setTranslationKey(Investiture.MODID + "." + name);
		this.setCreativeTab(Investiture.INVESTITURE_TAB);
		
		IBlockState iblockstate = this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);
		
		if(!this.isDouble()) {
			iblockstate.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
		}
		
		this.setDefaultState(iblockstate);
		this.useNeighborBrightness = !this.isDouble();
	}

	@Override
	public IProperty<?> getVariantProperty() {
		return VARIANT;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return Variant.DEFAULT;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(ModBlocks.TILES_HALF);
	}
	
	
	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(ModBlocks.TILES_HALF);
	}
	
	@Override
	public final IBlockState getStateFromMeta(final int meta) {
		IBlockState blockstate = this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);
		
		if(!this.isDouble()) {
			blockstate = blockstate.withProperty(HALF, ((meta&8)!=0)?EnumBlockHalf.TOP:EnumBlockHalf.BOTTOM);
		}
		
		return blockstate;
	}
	
	@Override
	public final int getMetaFromState(final IBlockState state) {
		int meta = 0;
		
		if(!this.isDouble()&& state.getValue(HALF)==EnumBlockHalf.TOP) {
			meta |= 8;
		}
		
		return meta;
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		if(!this.isDouble()){
			return new BlockStateContainer(this, new IProperty[] {VARIANT, HALF});
		}
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}
	
	public static class Double extends Tiles
	{

		public Double(String name) {
			super(name);
		}

		@Override
		public boolean isDouble() {
			return true;
		}

		@Override
		public String getTranslationKey(int meta) {
			// TODO Auto-generated method stub
			return null;
		}

	}

	public static class Half extends Tiles
	{

		public Half(String name) {
			super(name);
		}

		@Override
		public boolean isDouble() {
			return false;
		}

		@Override
		public String getTranslationKey(int meta) {
			// TODO Auto-generated method stub
			return null;
		}

	}
	
	public static enum Variant implements IStringSerializable
	{
		DEFAULT;

		@Override
		public String getName() {
			return "default";
		}
	
	}
}