package net.acethefox.randommod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = RandomMod.MODID, name = RandomMod.NAME, version = RandomMod.VERSION)
public class RandomMod {
	//constants 
	public static final String MODID = "random_mod";
	public static final String NAME = "RandomMod";
	public static final String VERSION = "1.0.0";
	
	//variables
	
	//main entry point
	@Instance(MODID)
	public static RandomMod instance;
	
	@SidedProxy(clientSide = "net.acethefox.randommod.ClientProxy", serverSide = "net.acethefox.randommod.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent evt) {
		proxy.preInit(evt);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent evt) {
		proxy.init(evt);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent evt) {
		proxy.postInit(evt);
	}
}
