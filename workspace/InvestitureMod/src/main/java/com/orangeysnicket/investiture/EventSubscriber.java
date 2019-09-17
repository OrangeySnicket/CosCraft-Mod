package com.orangeysnicket.investiture;

import com.orangeysnicket.investiture.block.*;
import com.orangeysnicket.investiture.item.*;
import com.orangeysnicket.investiture.material.InvestitureMaterials;
import com.orangeysnicket.investiture.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Investiture.MODID)
public final class EventSubscriber {
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
				new AluminumBlock().setRegistryName("aluminum_block").setTranslationKey(Investiture.MODID + "." + "aluminum_block"),
				new AshBlock().setRegistryName("ash_block").setTranslationKey(Investiture.MODID + "." + "ash_block"),
				new AshTiles().setRegistryName("ash_tiles").setTranslationKey(Investiture.MODID + "." + "ash_tiles"),
				new AtiumBlock().setRegistryName("atium_block").setTranslationKey(Investiture.MODID + "." + "atium_block"),
				new BlackMetalBlock().setRegistryName("black_metal_block").setTranslationKey(Investiture.MODID + "." + "black_metal_block"),
				new BrassBlock().setRegistryName("brass_block").setTranslationKey(Investiture.MODID + "." + "brass_block"),
				new BronzeBlock().setRegistryName("bronze_block").setTranslationKey(Investiture.MODID + "." + "bronze_block"),
				// new BronzeStairs().setRegistryName("bronze_stairs").setTranslationKey(Investiture.MODID + "." + "bronze_stairs"),
				new ChiseledBlackMetalBlock().setRegistryName("chiseled_black_metal_block").setTranslationKey(Investiture.MODID + "." + "chiseled_black_metal_block"),
				new ChiseledBrass().setRegistryName("chiseled_brass").setTranslationKey(Investiture.MODID + "." + "chiseled_brass"),
				new ChiseledBronze().setRegistryName("chiseled_bronze").setTranslationKey(Investiture.MODID + "." + "chiseled_bronze"),
				new ChiseledCopper().setRegistryName("chiseled_copper").setTranslationKey(Investiture.MODID + "." + "chiseled_copper"),
				new ChiseledGold().setRegistryName("chiseled_gold").setTranslationKey(Investiture.MODID + "." + "chiseled_gold"),
				new ChiseledIron().setRegistryName("chiseled_iron").setTranslationKey(Investiture.MODID + "." + "chiseled_iron"),
				new ChiseledPewter().setRegistryName("chiseled_pewter").setTranslationKey(Investiture.MODID + "." + "chiseled_pewter"),
				new ChiseledSteel().setRegistryName("chiseled_steel").setTranslationKey(Investiture.MODID + "." + "chiseled_steel"),
				new ChiseledTin().setRegistryName("chiseled_tin").setTranslationKey(Investiture.MODID + "." + "chiseled_tin"),
				new ChiseledZinc().setRegistryName("chiseled_zinc").setTranslationKey(Investiture.MODID + "." + "chiseled_zinc"),
				new CopperBlock().setRegistryName("copper_block").setTranslationKey(Investiture.MODID + "." + "copper_block"),
				new CopperStairs().setRegistryName("copper_stairs").setTranslationKey(Investiture.MODID + "." + "copper_stairs"),
				new DarkSteelBlock().setRegistryName("dark_steel_block").setTranslationKey(Investiture.MODID + "." + "dark_steel_block"),
				new IronRoofing().setRegistryName("iron_roofing").setTranslationKey(Investiture.MODID + "." + "iron_roofing"),
				new IronStairs().setRegistryName("iron_stairs").setTranslationKey(Investiture.MODID + "." + "iron_stairs"),
				new LeadBlock().setRegistryName("lead_block").setTranslationKey(Investiture.MODID + "." + "lead_block"),
				new LerasiumBlock().setRegistryName("lerasium_block").setTranslationKey(Investiture.MODID + "." + "lerasium_block"),
				new PewterBlock().setRegistryName("pewter_block").setTranslationKey(Investiture.MODID + "." + "pewter_block"),
				new PewterStairs().setRegistryName("pewter_stairs").setTranslationKey(Investiture.MODID + "." + "pewter_stairs"),
				new SilverBlock().setRegistryName("silver_block").setTranslationKey(Investiture.MODID + "." + "silver_block"),
				new SteelBlock().setRegistryName("steel_block").setTranslationKey(Investiture.MODID + "." + "steel_block"),
				new Tiles().setRegistryName("tiles").setTranslationKey(Investiture.MODID + "." + "tiles"),
				new TinBlock().setRegistryName("tin_block").setTranslationKey(Investiture.MODID + "." + "tin_block"),
				new TinStairs().setRegistryName("tin_stairs").setTranslationKey(Investiture.MODID + "." + "tin_stairs"),
				new ZincBlock().setRegistryName("zinc_block").setTranslationKey(Investiture.MODID + "." + "zinc_block"),
				
		};

		event.getRegistry().registerAll(blocks);		
	}
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				new AluminumIngot("aluminum_ingot", "aluminum_ingot"),
				new AtiumBead("atium_bead", "atium_bead"),
				new BendalloyIngot("bendalloy_ingot", "bendalloy_ingot"),
				new BrassIngot("brass_ingot", "brass_ingot"),
				new BronzeIngot("bronze_ingot", "bronze_ingot"),
				new CadmiumIngot("cadmium_ingot", "cadmium_ingot"),
				new ChromiumIngot("chromium_ingot", "chromium_ingot"),
				new CopperIngot("copper_ingot", "copper_ingot"),
				new DuraluminIngot("duralumin_ingot", "duralumin_ingot"),
				new ElectrumIngot("electrum_ingot", "electrum_ingot"),
				new GlassDagger(InvestitureMaterials.MATERIAL_GLASS, "glass_dagger", "glass_dagger"),
				new LerasiumBead("lerasium_bead", "lerasium_bead"),
				new NicrosilIngot("nicrosil_ingot", "nicrosil_ingot"),
				new ObsidianDagger(InvestitureMaterials.MATERIAL_OBSIDIAN, "obsidian_dagger", "obsidian_dagger"),
				new ObsidianAxe(InvestitureMaterials.MATERIAL_OBSIDIAN, "obsidian_axe", "obsidian_axe"),
				new PewterIngot("pewter_ingot", "pewter_ingot"),
				new SteelIngot("steel_ingot", "steel_ingot"),
				new TinIngot("tin_ingot", "tin_ingot"),
				new ZincIngot("zinc_ingot", "zinc_ingot"),
		};

		final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.ALUMINUM_BLOCK).setRegistryName(ModBlocks.ALUMINUM_BLOCK.getRegistryName()),
                new ItemBlock(ModBlocks.ASH_BLOCK).setRegistryName(ModBlocks.ASH_BLOCK.getRegistryName()),
                new ItemBlock(ModBlocks.ASH_TILES).setRegistryName(ModBlocks.ASH_TILES.getRegistryName()),
                new ItemBlock(ModBlocks.ATIUM_BLOCK).setRegistryName(ModBlocks.ATIUM_BLOCK.getRegistryName()),
                new ItemBlock(ModBlocks.BLACK_METAL_BLOCK).setRegistryName(ModBlocks.BLACK_METAL_BLOCK.getRegistryName()),
                new ItemBlock(ModBlocks.BRASS_BLOCK).setRegistryName(ModBlocks.BRASS_BLOCK.getRegistryName()),
                new ItemBlock(ModBlocks.BRONZE_BLOCK).setRegistryName(ModBlocks.BRONZE_BLOCK.getRegistryName()),
                // new ItemBlock(ModBlocks.BRONZE_STAIRS).setRegistryName(ModBlocks.BRONZE_STAIRS.getRegistryName()),
                new ItemBlock(ModBlocks.CHISELED_BLACK_METAL_BLOCK).setRegistryName(ModBlocks.CHISELED_BLACK_METAL_BLOCK.getRegistryName()),
                new ItemBlock(ModBlocks.CHISELED_BRASS).setRegistryName(ModBlocks.CHISELED_BRASS.getRegistryName()),
                new ItemBlock(ModBlocks.CHISELED_BRONZE).setRegistryName(ModBlocks.CHISELED_BRONZE.getRegistryName()),
                new ItemBlock(ModBlocks.CHISELED_COPPER).setRegistryName(ModBlocks.CHISELED_COPPER.getRegistryName()),
                new ItemBlock(ModBlocks.CHISELED_GOLD).setRegistryName(ModBlocks.CHISELED_GOLD.getRegistryName()),
                new ItemBlock(ModBlocks.CHISELED_IRON).setRegistryName(ModBlocks.CHISELED_IRON.getRegistryName()),
                new ItemBlock(ModBlocks.CHISELED_PEWTER).setRegistryName(ModBlocks.CHISELED_PEWTER.getRegistryName()),
                new ItemBlock(ModBlocks.CHISELED_STEEL).setRegistryName(ModBlocks.CHISELED_STEEL.getRegistryName()),
                new ItemBlock(ModBlocks.CHISELED_TIN).setRegistryName(ModBlocks.CHISELED_TIN.getRegistryName()),
                new ItemBlock(ModBlocks.CHISELED_ZINC).setRegistryName(ModBlocks.CHISELED_ZINC.getRegistryName()),
                new ItemBlock(ModBlocks.COPPER_BLOCK).setRegistryName(ModBlocks.COPPER_BLOCK.getRegistryName()),
                new ItemBlock(ModBlocks.COPPER_STAIRS).setRegistryName(ModBlocks.COPPER_STAIRS.getRegistryName()),
                new ItemBlock(ModBlocks.DARK_STEEL_BLOCK).setRegistryName(ModBlocks.DARK_STEEL_BLOCK.getRegistryName()),
                new ItemBlock(ModBlocks.IRON_ROOFING).setRegistryName(ModBlocks.IRON_ROOFING.getRegistryName()),
                new ItemBlock(ModBlocks.IRON_STAIRS).setRegistryName(ModBlocks.IRON_STAIRS.getRegistryName()),
                new ItemBlock(ModBlocks.LEAD_BLOCK).setRegistryName(ModBlocks.LEAD_BLOCK.getRegistryName()),
                new ItemBlock(ModBlocks.LERASIUM_BLOCK).setRegistryName(ModBlocks.LERASIUM_BLOCK.getRegistryName()),
                new ItemBlock(ModBlocks.PEWTER_BLOCK).setRegistryName(ModBlocks.PEWTER_BLOCK.getRegistryName()),
                new ItemBlock(ModBlocks.PEWTER_STAIRS).setRegistryName(ModBlocks.PEWTER_STAIRS.getRegistryName()),
                new ItemBlock(ModBlocks.SILVER_BLOCK).setRegistryName(ModBlocks.SILVER_BLOCK.getRegistryName()),
                new ItemBlock(ModBlocks.STEEL_BLOCK).setRegistryName(ModBlocks.STEEL_BLOCK.getRegistryName()),
                new ItemBlock(ModBlocks.TILES).setRegistryName(ModBlocks.TILES.getRegistryName()),
                new ItemBlock(ModBlocks.TIN_BLOCK).setRegistryName(ModBlocks.TIN_BLOCK.getRegistryName()),
                new ItemBlock(ModBlocks.TIN_STAIRS).setRegistryName(ModBlocks.TIN_STAIRS.getRegistryName()),
                new ItemBlock(ModBlocks.ZINC_BLOCK).setRegistryName(ModBlocks.ZINC_BLOCK.getRegistryName()),
                
        };

		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}
}
