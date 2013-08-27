package com.github.rebelixmodding.lonecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSaphirOre extends Block{
	//@author mhoefling
	//add textures
	
	public BlockSaphirOre(int id, Material material) {
		super(id, material);
	setHardness(1.5F);
	setStepSound(soundStoneFootstep);
	setResistance(10.0F);
	setUnlocalizedName("blockSaphireOre");
	setCreativeTab(LoneCraftMain.tabLoneCraft);
	}
	
}
