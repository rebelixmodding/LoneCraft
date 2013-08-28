package com.github.rebelixmodding.lonecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSaphirOre extends Block{
	/*@author mhoefling
	*add textures to mcp/src/assets/lonecraft/blocks/blockSaphirOre
	*How often and where should it spawn ?
	*/
	
	public BlockSaphirOre(int id, Material material) {
		super(id, material);
	setHardness(1.5F);
	setStepSound(soundStoneFootstep);
	setResistance(10.0F);
	setUnlocalizedName("blockSaphireOre");
	setCreativeTab(LoneCraftMain.tabLoneCraft);
	}
	@Override
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("lonecraft:blockSaphirOre");
		
	}
}
