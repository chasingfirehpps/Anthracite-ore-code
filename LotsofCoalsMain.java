package CF.LotsofCoals;

import net.minecraft.block.Block;
import Blocks.Cfblocks;
import Items.Cfitems;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "LotsofCoals", name = "Lots of Coals", version = "1.0.0")
public class LotsofCoalsMain {

	@Instance("LotsofCoals")
	public static LotsofCoalsMain instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	Cfitems.init();
	Cfblocks.init();
	GameRegistry.registerFuelHandler(new FuelHandler());
	GameRegistry.registerWorldGenerator(eventmanager());
	}
	
	
	private IWorldGenerator eventmanager() {
		// TODO Auto-generated method stub
		return eventmanager();
	}


	@EventHandler
	public void load(FMLInitializationEvent event) {
		Cfitems.addNames();
		Cfblocks.addNames();
	}
	
	@EventHandler
	public void modsLoadded(FMLPostInitializationEvent event) {
		
		
	EventManager eventmanager = new EventManager();
		{
	}
	}
	}


