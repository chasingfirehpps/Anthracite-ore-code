package Blocks;

import java.util.Random;

import Items.Cfitems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Anthracite_ore extends Block{
	
	public Anthracite_ore(int id) {
		super(id, Material.rock);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(4F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName(Blockinfo.Anthracite_ore_UNLOCALIZED_NAME);
	}
	private Icon topIcon;
	private Icon botIcon;
	private Icon sideIcon;
	
	@Override
	public void registerIcons(IconRegister register){
		topIcon = register.registerIcon(Blockinfo.TEXTURE_LOCATION + ":" + Blockinfo.Anthracite_ore_TOP);
		botIcon = register.registerIcon(Blockinfo.TEXTURE_LOCATION + ":" + Blockinfo.Anthracite_ore_BOT);
		sideIcon = register.registerIcon(Blockinfo.TEXTURE_LOCATION + ":" + Blockinfo.Anthracite_ore_SIDE);
		
	}
	@Override
	public Icon getIcon(int side, int meta) {
		if (side == 0) {
			return botIcon;
		}else if (side == 1) {
			return topIcon;
		} else {
			return sideIcon;
					
		}
	}


public int idDropped(int par1, Random par2Random, int par3){
	return Cfitems.Anthracite.itemID;

}
}

