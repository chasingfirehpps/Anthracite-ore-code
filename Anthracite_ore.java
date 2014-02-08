package Blocks;

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
	@SideOnly(Side.CLIENT)
	private Icon anthracite_ore;
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register){
		this.blockIcon = register.registerIcon("anthracite_ore"); 
}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta) {
		return anthracite_ore;
}
}
