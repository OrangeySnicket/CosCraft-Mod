package com.orangeysnicket.investiture;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import com.orangeysnicket.investiture.tabs.InvestitureTab;

@Mod(modid = Investiture.MODID, name = Investiture.NAME, version = Investiture.VERSION, acceptedMinecraftVersions = Investiture.MC_VERSION)

public class Investiture {

	public static final String MODID = "investiture";
	public static final String NAME = "Investiture";
	public static final String VERSION = "0.0.4";
	public static final String MC_VERSION = "[1.12.2]";
	public static final CreativeTabs INVESTITURE_TAB = new InvestitureTab();
		
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
        
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
        
	}
	
}
