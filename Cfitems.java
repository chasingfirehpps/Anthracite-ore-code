package Items;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Cfitems {

	//Anthracite
	public static Item Anthracite;
	public static Item MinersPickAxe;
	
	public static void init() {
		Anthracite = new Anthracite(Iteminfo.Anthracite_ID);}
		public static void addNames() {
			LanguageRegistry.addName(Anthracite, Iteminfo.Anthracite_NAME);}
			
	//Miner's Pickaxe
	
			//public static void init1() {
				//MinersPickAxe = new Item(Iteminfo.Anthracie_ID);}
			//public static void addNames1() {
				//LanguageRegistry.addName(MinersPickAxe, Iteminfo.MinersPickAxe_NAME);
	}
//}

