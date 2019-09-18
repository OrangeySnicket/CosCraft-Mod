package com.orangeysnicket.investiture.client;

import com.orangeysnicket.investiture.Investiture;
import com.orangeysnicket.investiture.init.ModItems;
import com.orangeysnicket.investiture.init.ModBlocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = Investiture.MODID)
public class ModelRegistrationHandler {
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(ModItems.ALUMINUM_INGOT, 0);
		registerModel(ModItems.ATIUM_BEAD, 0);
		registerModel(ModItems.BENDALLOY_INGOT, 0);
		registerModel(ModItems.BRASS_INGOT, 0);
		registerModel(ModItems.BRONZE_INGOT, 0);
		registerModel(ModItems.CADMIUM_INGOT, 0);
		registerModel(ModItems.CHROMIUM_INGOT, 0);
		registerModel(ModItems.COPPER_INGOT, 0);
		registerModel(ModItems.DURALUMIN_INGOT, 0);
		registerModel(ModItems.ELECTRUM_INGOT, 0);
		registerModel(ModItems.GLASS_DAGGER, 0);
		registerModel(ModItems.LERASIUM_BEAD, 0);
		registerModel(ModItems.NICROSIL_INGOT, 0);
		registerModel(ModItems.OBSIDIAN_AXE, 0);
		registerModel(ModItems.OBSIDIAN_DAGGER, 0);
		registerModel(ModItems.PEWTER_INGOT, 0);
		registerModel(ModItems.STEEL_INGOT, 0);
		registerModel(ModItems.TIN_INGOT, 0);
		registerModel(ModItems.ZINC_INGOT, 0);
		
		
		registerModel(Item.getItemFromBlock(ModBlocks.ALUMINUM_BLOCK), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.ASH_BLOCK), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.ASH_TILES), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.ATIUM_BLOCK), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.BLACK_METAL_BLOCK), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.BRASS_BLOCK), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.BRONZE_BLOCK), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.BRONZE_STAIRS), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.CHISELED_BLACK_METAL_BLOCK), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.CHISELED_BRASS), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.CHISELED_BRONZE), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.CHISELED_COPPER), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.CHISELED_GOLD), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.CHISELED_IRON), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.CHISELED_PEWTER), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.CHISELED_STEEL), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.CHISELED_TIN), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.CHISELED_ZINC), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.COPPER_BLOCK), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.COPPER_STAIRS), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.DARK_STEEL_BLOCK), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.IRON_ROOFING), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.IRON_STAIRS), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.LEAD_BLOCK), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.LERASIUM_BLOCK), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.PEWTER_BLOCK), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.PEWTER_STAIRS), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.SILVER_BLOCK), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.STEEL_BLOCK), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.TILES), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.TIN_BLOCK), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.TIN_STAIRS), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.ZINC_BLOCK), 0);
	}
	
	public static void registerModel(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta, 
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
