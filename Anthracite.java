package Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Anthracite extends Item {
	
	public Anthracite(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabMaterials);
		setMaxStackSize(64);
		setUnlocalizedName(Iteminfo.Anthracite_UNLOCALIZED_NAME);
	}


	 @Override
	  public void registerIcons(IconRegister iconRegister)
	  {
	    itemIcon = iconRegister.registerIcon("lotsofcoals:anthracite");


}
}
