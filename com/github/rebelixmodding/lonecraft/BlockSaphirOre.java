package com.github.rebelixmodding.lonecraft;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockSaphirOre extends Block{
	/*@author mhoefling
	*add textures to mcp/src/minecraft/assets/lonecraft/blocks/blockSaphirOre
	*How often and where should it spawn ?
	*/
	
	public BlockSaphirOre(int id, Material material) {
		super(id, material);
	setHardness(1.5F);
	setStepSound(soundStoneFootstep);
	setUnlocalizedName("blockSaphireOre");
	setCreativeTab(LoneCraftMain.tabLoneCraft);
	}
	@Override
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("lonecraft:blockSaphirOre");
		
	}
	public int idDropped(int metadata,Random random, int fortune){
		return LoneCraftMain.ItemSaphir.itemID;
	}
	public int quantityDropped(Random par1Random)
    {
            return 1 + par1Random.nextInt(2);
    }
}
