package Blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Cfblocks {
	
	public static Block Anthracite_ore;
	
	public static void init() {
		Anthracite_ore = new Anthracite_ore(Blockinfo.Anthracite_ore_ID);
		GameRegistry.registerBlock(Anthracite_ore, Blockinfo.Anthracite_ore_KEY);
		
		
	}
		
		
		public static void addNames() {
			LanguageRegistry.addName(Anthracite_ore, Blockinfo.Anthracite_ore_NAME);
			}
			
		//Bituminous
			
			public static Block Bituminous_ore;
			
			public static void init1() {
				Bituminous_ore = new Bituminous_ore(Blockinfo.Bituminous_ore_ID);
				GameRegistry.registerBlock(Bituminous_ore, Blockinfo.Bituminous_ore_KEY);
				
				
			}
				
				
				public static void addNames1() {
					LanguageRegistry.addName(Bituminous_ore, Blockinfo.Bituminous_ore_NAME);
			
		
		
		

}
}

