package com.github.rebelixmodding.lonecraft;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemSaphir extends Item{
	//@author mhoefling
	
	public ItemSaphir(int id) {
		super(id);
		this.setCreativeTab(LoneCraftMain.tabLoneCraft);
		this.setUnlocalizedName("itemSaphir");
		this.setMaxStackSize(64);
		this.canItemEditBlocks();
		
		
	}
	@Override
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon("lonecraft:itemSaphir");
		
	}
	
}
