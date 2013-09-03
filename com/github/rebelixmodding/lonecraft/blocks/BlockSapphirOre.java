package com.github.rebelixmodding.lonecraft.blocks;

import java.util.ArrayList;
import java.util.Random;

import com.github.rebelixmodding.lonecraft.LoneCraftMain;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockSapphirOre extends Block{
	/*@author mhoefling
	*add textures to mcp/src/minecraft/assets/lonecraft/blocks/blockSaphirOre
	*How often and where should it spawn ?
	*/
	
	public BlockSapphirOre(int id, Material material) {
		super(id, material);
	setHardness(1.5F);
	setStepSound(soundStoneFootstep);
	setUnlocalizedName("blockSapphireOre");
	setCreativeTab(LoneCraftMain.tabLoneCraft);
	}
	@Override
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("lonecraft:blockSapphirOre");
		
	}
	public int idDropped(int metadata,Random random, int fortune){
		return LoneCraftMain.ItemSapphir.itemID;
	}
	public int quantityDropped(Random par1Random)
    {
		return 1+par1Random.nextInt(2);
    }
}
