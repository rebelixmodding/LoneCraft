package com.github.rebelixmodding.lonecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSaphirOre extends Block{
	//@author mhoefling
	//add Textures !!!
	public BlockSaphirOre(int par1, Material par2Material) {
		super(par1, par2Material);
	setHardness(1.5F);
	setStepSound(soundStoneFootstep);
	setResistance(10.0F);
	setUnlocalizedName("Saphire Ore");
	setCreativeTab(LoneCraftMain.tabLoneCraft);
	}

}
