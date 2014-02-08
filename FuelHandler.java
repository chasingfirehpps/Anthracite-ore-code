package CF.LotsofCoals;

import Items.Cfitems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.itemID == Cfitems.Anthracite.itemID) return 2000;
		
		return 0;
	}
	}
