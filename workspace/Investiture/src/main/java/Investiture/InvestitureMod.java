package Investiture;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = InvestitureMod.MODID, name = InvestitureMod.NAME, version = InvestitureMod.VERSION, acceptedMinecraftVersions = InvestitureMod.MC_VERSION)
public class InvestitureMod {

	public static final String MODID = "investituremod";
	public static final String NAME = "Investiture Mod";
	public static final String VERSION = "0.0.1";
	public static final String MC_VERSION = "[1.12.2]";

	public static final Logger LOGGER = LogManager.getLogger(InvestitureMod.MODID);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
        
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info(InvestitureMod.NAME + " says hi!");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
        
	}

}